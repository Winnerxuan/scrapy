# -*- coding: utf-8 -*-
import scrapy
from items import JiaminNewsItem,JiaminAssetsItem
import re
import js2xml
from lxml import html, etree
from bs4 import BeautifulSoup


headers={
"Accept": "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8",
    "Accept-Encoding": "gzip,deflate,br",
    "Accept-Language": "zh-CN,zh;q=0.9",
    "Cache-Control": "no-cache",
    "Connection": "keep-alive",
    "Host": "cn.goodman.com",
    "User-Agent": "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14_1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/76.0.3809.100 Safari/537.36"
}
class JiaminSpider(scrapy.Spider):
    name = 'jiamin'
    allowed_domains = ['goodman.com']

    def start_requests(self):
        yield scrapy.Request('http://cn.goodman.com/properties-for-lease',self.parse_case)
        yield scrapy.Request('http://cn.goodman.com/who-we-are/media-centre/news/',self.parse_news)


    def parse_news(self, response):
        print('此时启动的爬虫为：jiamin')
        item=JiaminNewsItem()
        for web in response.xpath('//div[contains(@class,"newsItem")]'):
            item['newstitle'] = web.xpath('.//h3/a/text()').extract()[0].strip()
            item['newtiems'] = web.xpath('.//span/text()').extract()[0].strip()
            #urljoin创建绝对的links路径，始用于网页中的href值为相对路径的连接
            item['newslink'] =response.urljoin(web.xpath('.//a/@href').extract()[0])
            newszhaiyao = web.xpath('.//p/text()').extract_first()
            if newszhaiyao:
                item['newszhaiyao'] = re.sub(r'\s+','',newszhaiyao)

            else:
                item['newszhaiyao']  = item['newstitle']
            yield item

    def parse_case(self,response):
        item = JiaminAssetsItem()
        html = response.text
        soup = BeautifulSoup(html, 'html')
        for script in soup.select('body script'):
            if  script.string:
                script_text = js2xml.parse(script.string, debug=False)
                script_tree = js2xml.pretty_print(script_text)
                # print(script_tree)
                selector = etree.HTML(script_tree)
                for obj in selector.xpath("//var[@name='defaultDataFeatureProperty']//object"):
                    # url = str(response.urljoin(obj.xpath(".//property[@name='propertyLink']/string/text()")[0]))
                    item['assetstitle'] = str(obj.xpath(".//property[@name='title']/string/text()")[0])
                    item['assetaddress'] = str(obj.xpath(".//property[@name='address']/string/text()")[0])
                    item['assettedian'] = str(obj.xpath(".//property[@name='description']/string/text()")[0])
                    item['area'] = str(obj.xpath(".//property[@name='sortMinSize']/string/text()")[0])
                    if str(obj.xpath(".//property[@name='typetext']/string/text()")[0]):
                        item['assetwuyeleibie'] = str(obj.xpath(".//property[@name='typetext']/string/text()")[0])
                for obj in selector.xpath("//var[@name='defaultData']//object"):
                    # url = str(response.urljoin(obj.xpath(".//property[@name='propertyLink']/string/text()")[0]))
                    item['assetstitle'] = str(obj.xpath(".//property[@name='title']/string/text()")[0])
                    item['assetaddress'] = str(obj.xpath(".//property[@name='address']/string/text()")[0])
                    item['assettedian'] = str(obj.xpath(".//property[@name='description']/string/text()")[0])
                    item['area'] = str(obj.xpath(".//property[@name='sortMinSize']/string/text()")[0])
                    if str(obj.xpath(".//property[@name='typetext']/string/text()")[0]):
                        item['assetwuyeleibie'] = str(obj.xpath(".//property[@name='typetext']/string/text()")[0])
                    yield item
