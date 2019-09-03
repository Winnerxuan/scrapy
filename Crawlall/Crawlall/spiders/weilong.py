import scrapy
import requests
from items import VailogItem,VailognewsItem
import re
from textRankChinese import deal
headers={
    "Accept": "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8",
    "Accept-Encoding": "gzip,deflate,br",
    "Accept-Language": "zh-CN,zh;q=0.9",
    "Cache-Control": "no-cache",
    "Connection": "keep-alive",
    "Host": "www.vailogchina.com",
    "User-Agent": "Mozilla/5.0(WindowsNT10.0;Win64;x64)AppleWebKit/537.36(KHTML,likeGecko)Chrome/71.0.3578.98Safari/537.36"
}

class mySpider(scrapy.Spider):
    name = "weilong"
    allowed_domains = ['vailogchina.com']
    def start_requests(self):
        yield scrapy.Request('http://www.vailogchina.com/case.php',self.page_case)#  项目
        yield scrapy.Request('http://www.vailogchina.com/news.php',self.page_news)# 新闻

    def page_case(self, response):
        linkList = response.xpath('/html/body/section[4]/div/div[2]//li/a/@href').extract()
        print(linkList)
        for link in linkList:
            detail_link = response.urljoin(link)
            yield scrapy.Request(detail_link, headers=headers, callback=self.page_parse)
        nextlink = response.xpath('//div[@class="page block"]//a[@class="btn"]/@href').extract()
        if nextlink:
            yield scrapy.Request(response.urljoin(nextlink[0]), callback=self.page_case)

    def page_parse(self,response):
        reg='：'
        item = VailogItem()
        item['name'] = response.xpath("/html/body/section[3]/div/div[1]/h4/text()").extract_first()
        rentArea = response.xpath("/html/body/section[3]/div/div[1]/div/li[1]/text()").extract_first()
        rentArea = re.sub('[\u4e00-\u9fa5]','',rentArea)
        item['rentArea']=re.sub(reg,'',rentArea)
        item['rentArea']=re.sub(',','',item['rentArea'])
        area = response.xpath("/html/body/section[3]/div/div[1]/div/li[2]/text()").extract_first()
        area = re.sub(reg,'',area)
        area = re.sub('[\u4e00-\u9fa5]','',area)
        item['area'] = float(area) * 666.67
        item['warehouseType'] = response.xpath("/html/body/section[3]/div/div[1]/p[2]/text()").extract_first()
        item['location'] = response.xpath("/html/body/section[4]/div/div[1]/h4/text()").extract_first()
        item['contact'] = response.xpath("/html/body/section[4]/div/div[1]/div[2]/li[1]/text()").extract_first()
        item['phone'] = response.xpath("/html/body/section[4]/div/div[1]/div[2]/li[2]/text()").extract_first().replace(' ','')
        item['email'] = response.xpath("/html/body/section[4]/div/div[1]/div[2]/li[3]/text()").extract_first().replace(' ','')
        item['overTime'] = response.xpath("/html/body/section[3]/div/div[1]/p[3]/text()").extract_first()
        yield item

    def page_news(self,response):
        linkList = response.xpath('//div[@class="journalism block"]//a/@href').extract()
        print(linkList)
        for link in linkList:
            detail_link = response.urljoin(link)
            yield scrapy.Request(detail_link,headers=headers,callback=self.news_parse)
        nextlink = response.xpath('//div[@class="page block"]//a[@class="btn"]/@href').extract()
        if nextlink:
            yield scrapy.Request(response.urljoin(nextlink[0]), callback=self.page_news)

    def news_parse(self,response):
        item = VailognewsItem()
        title = response.xpath('//div[@class="contant-title"]/h2/text()').extract_first().strip()
        item['title'] = re.sub("[\xa0]",'',title).strip()
        item['url'] = response.request.url.strip()
        newstime =response.xpath('//div[@class="contant-title"]/span/text()').extract_first().strip()
        item['newstime'] = re.sub("'(.*)'",'',newstime)
        print(item['newstime'])
        contentList = response.xpath('//div[@class="contant-con"]/p//text()').extract()
        a = ''
        b = ''
        for content in contentList:
            a+=content
        sentences = deal.cutParagraph(a)
        word_sent = deal.getWords(sentences)
        board = deal.creatGraph(word_sent)
        scores = deal.weightedPagerank(board)
        zhaiyaoList = deal.getSolution(3, scores, sentences)
        for zhaiyao in zhaiyaoList:
            b+=zhaiyao
        b=re.sub("\xa0",'',b)
        item['zhaiyao'] = b
        yield item

