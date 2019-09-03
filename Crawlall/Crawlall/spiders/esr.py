# -*- coding: utf-8 -*-
import scrapy
from items import EsrItem,EsrnewsItem
import re

class EsrSpider(scrapy.Spider):
    name = 'esr'
    allowed_domains = ['esr.com']

    def start_requests(self):
        yield scrapy.Request('https://www.esr.com/sc/map_china.php',self.parse1)
        yield scrapy.Request('https://www.esr.com/sc/media_news.php',self.parse3)

    def parse1(self, response):
        for web in response.xpath('//div[@class="earth_hide_ul"]/ul/li'):
            url_tmp=web.xpath('.//a/@href').extract()[0]
            urlquest="https://www.esr.com/sc/"+url_tmp
            yield scrapy.Request(url=urlquest,callback=self.parse2)

    def parse2(self, response):
        item=EsrItem()
        item['assetstitle']=response.xpath('//div[@class="flex justify_between_center"]/h3/text()').extract()[0]
        item ['assetaddress'] = response.xpath("//ul[@class='map_item_ul'][1]/li/b/text()").extract()[0]
        tmp =response.xpath("//ul[@class='map_item_ul'][2]")
        item['assettedian']=tmp.xpath("string(.)").extract()[0].strip()
        item['assetjiagou']=response.xpath("//ul[@class='map_store_ul']/li[1]/div/span/text()").extract()[0]

        assettudimianji=response.xpath("//ul[@class='map_store_ul']/li[2]/div/span/text()").extract()[0].strip()
        item['assettudimianji'] = re.sub(',', '', assettudimianji)
        print(item['assettudimianji'])

        assetjianzhumianji = response.xpath("//ul[@class='map_store_ul']/li[3]/div/span/text()").extract()[
            0].strip()
        item['assetjianzhumianji'] = re.sub(',', '', assetjianzhumianji)
        print(item['assetjianzhumianji'])

        item['assetjungongtime'] = response.xpath("//ul[@class='map_store_ul']/li[4]/div/span/text()").extract()[
            0].strip()
        assetpeople = response.xpath("//ul[@class='map_store_ul']/li[5]/div/span/a/text()").extract()[
            0].strip()
        #如下面注释，邮箱是以mailto:开头的链接，所以assetpeople_mail后面字符串取[6:]取6位以后的字符串获取邮箱全名
        #<a href="mailto:aaron.shan@esr.com" class="xh-highlight">单俊</a>
        assetpeople_mail=response.xpath("//ul[@class='map_store_ul']/li[5]/div/span/a/@href").extract()[
            0][6:]
        item['assetpeople']=assetpeople+assetpeople_mail
        print(item['assetpeople'])
        yield item



    def parse3(self, response):
        web=response.xpath('//ol[@class="sub-year-box"]/li')
        for node in web:
            baseurl='https://www.esr.com/sc/media_news.php'
            url=baseurl+node.xpath('./a/@href').extract()[0]
            yield scrapy.Request(url=url,callback=self.parse4)


    def parse4(self, response):
        item = EsrnewsItem()
        web=response.xpath("//ul[@class='data_ul']/li")
        web.pop(0)#去掉标题第一行
        for i in web:
            item['newstitle'] = i.xpath('.//a/text()').extract()[0].strip()
            item['newtiems'] =i.xpath('.//dt/text()').extract()[0].strip()
            item['newslink'] = i.xpath('.//a/@href').extract()[0].strip()
            yield item