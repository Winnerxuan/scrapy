import json
from items import VxItem,VxNewsItem
import re
from urllib.parse import urljoin
import scrapy
from textRankChinese import deal

headers = {
    "Accept": "*/*",
    "Accept-Encoding": "gzip, deflate",
    "Accept-Language": "zh-CN,zh;q=0.9",
    "Cache-Control": "no-cache",
    "Connection": "keep-alive",
    "Content-Type": "application/x-www-form-urlencoded; charset=UTF-8",
    "Host": "www.vxlogisticproperties.com",
    "Origin": "http://www.vxlogisticproperties.com",
    "Pragma": "no-cache",
    "Referer": "http://www.vxlogisticproperties.com/project.aspx",
    "User-Agent": "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/71.0.3578.98 Safari/537.36",
    "X-Requested-With": "XMLHttpRequest"
}

class mySpider(scrapy.Spider):
    name = "wanwei"
    allowed_domains = ["vxlogisticproperties.com"]
    # start_urls = ["https://www.vxlogisticproperties.com/WebUserControl/project/Getimg.ashx"]

    def start_requests(self):
        # yield scrapy.Request("https://www.vxlogisticproperties.com/WebUserControl/project/Getimg.ashx",self.parse_case)
        yield scrapy.Request("https://www.vxlogisticproperties.com/WebUserControl/news/GetList.ashx",self.parse_news)

    def parse_case(self,response):
        url = response.url
        params = {
            "pageSize": '100'
        }
        for i in range(1, 2):
            params["pageIndex"] = str(i)
            yield scrapy.FormRequest(url, headers=headers, formdata=params, callback=self.case_parse)
    def parse_news(self,response):
        url = response.url
        params = {
            "pageSize": '100'
        }
        for i in range(1, 2):
            params["pageIndex"] = str(i)
            yield scrapy.FormRequest(url, headers=headers, formdata=params, callback=self.news_parse)

    def news_parse(self,response):
        rs = json.loads(response.text)
        linkList = re.findall('href="(news.aspx.*?)"', rs['list'])
        print(linkList)

        project_header = {
            "Accept": " text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8",
            "Accept-Encoding": " gzip, deflate",
            "Accept-Language": " zh-CN,zh;q=0.9",
            "Cache-Control": " no-cache",
            "Connection": " keep-alive",
            "Host": " www.vxlogisticproperties.com",
            "Pragma": " no-cache",
            "Referer": " http://www.vxlogisticproperties.com",
            "Upgrade-Insecure-Requests": " 1",
            "User-Agent": "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/71.0.3578.98 Safari/537.36"
        }

        for link in linkList:
            detail_link = urljoin('http://www.vxlogisticproperties.com', link)
            yield scrapy.Request(detail_link, headers=project_header, callback=self.page_parse_news)

    def case_parse(self, response):
        rs = json.loads(response.text)
        linkList = re.findall('href="(project.aspx.*?)"', rs['list'])
        print(linkList)

        project_header = {
            "Accept": " text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8",
            "Accept-Encoding": " gzip, deflate",
            "Accept-Language": " zh-CN,zh;q=0.9",
            "Cache-Control": " no-cache",
            "Connection": " keep-alive",
            "Host": " www.vxlogisticproperties.com",
            "Pragma": " no-cache",
            "Referer": " http://www.vxlogisticproperties.com",
            "Upgrade-Insecure-Requests": " 1",
            "User-Agent": "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/71.0.3578.98 Safari/537.36"
        }

        for link in linkList:
            detail_link = urljoin('http://www.vxlogisticproperties.com', link)
            yield scrapy.Request(detail_link, headers=project_header, callback=self.page_parse_case)

    def page_parse_news(self,response):
        item = VxNewsItem()
        item['newstitle'] = response.xpath('//div[@class="tits"]//h2[@class="newsTitle"]/text()').extract_first()
        item['newstime'] = response.xpath('//div[@class="tits"]//div[@class="time"]/text()').extract_first()
        item['newslink'] = response.url
        a=""
        b=""
        content = response.xpath('//div[@class="det"]//p//text()').extract()
        for i in content:
            a+=i
        sentences = deal.cutParagraph(a)
        word_sent = deal.getWords(sentences)
        board = deal.creatGraph(word_sent)
        scores = deal.weightedPagerank(board)
        zhaiyaoList = deal.getSolution(3, scores, sentences)
        for zhaiyao in zhaiyaoList:
            b += zhaiyao
        b = re.sub("\xa0", '', b)
        item['newszhaiyao'] = re.sub(r'\s+','',b)
        yield item


    def page_parse_case(self,response):
        reg=':'
        item = VxItem()
        item['name'] = response.xpath("/html/body/section[2]/div/div[1]/div[2]/div/text()").extract_first()
        location = response.xpath("/html/body/section[2]/div/div[1]/div[2]/p[1]/text()").extract_first()
        # location = re.sub(reg,'',location)
        if location:
            item['location'] = re.sub('位置：','',location)
        else:
            item['location'] = None
        area = response.xpath("/html/body/section[2]/div/div[1]/div[2]/p[2]/text()").extract_first()
        if area:
            area = area.replace('(','').replace(')','')
            item['area'] = re.sub('建筑面积m² ：','',area)
            item['area'] = re.sub(',','',item['area'])
            print(item['area'])
        else:
            item['area'] = None
        warehouseType = response.xpath("/html/body/section[2]/div/div[1]/div[2]/p[3]/text()").extract_first()
        if warehouseType:
            item['warehouseType'] = re.sub('仓库类型：','',warehouseType)
            print(item['warehouseType'])
        else:
            item['warehouseType'] = None
        item['feature'] = response.xpath("/html/body/section[2]/div/div[2]/div[2]/div[2]/p/text()").extract_first()
        item['transportNet_air'] = response.xpath("/html/body/section[2]/div/div[2]/div[1]/ul/li[1]/p/text()").extract_first()
        item['transportNet_road'] = response.xpath("/html/body/section[2]/div/div[2]/div[1]/ul/li[2]/p/text()").extract_first()

        yield item