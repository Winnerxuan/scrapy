# -*- coding: utf-8 -*-
import scrapy,re
from items import ToodcItem
import logging,json,demjson

logging.basicConfig(filename='kuan.log',filemode='w',level=logging.WARNING,format='%(asctime)s %(message)s',datefmt='%Y/%m/%d %I:%M:%S %p')
logging.warning("warn message")
logging.error("error message")
class MySpider(scrapy.Spider):
    #蜘蛛名字
    name='toodc'
    #爬取得域范围
    allowed_domins=['toodc.cn']
    #开始爬取得初始url
    start_urls=["https://www.toodc.cn/list/c310100"]
    #获取全部的城市和所在城市的URL仓库信息
    def parse(self,response):
        web=response.xpath('//*[@id="__layout"]/div/footer/div/div[1]/div/ul[2]/li/a/@href')
        for i in web:
            url = 'https://www.toodc.cn' + i.extract()
            yield scrapy.Request(url, callback=self.get_detail, method="POST")

    def get_detail(self,response):
        # pass
        # 实例一个容器
        item = ToodcItem()
        for web in response.xpath('//li[@class="project-item clearfix"]'):
            #仓库标题简介
            item['title']=web.xpath('//*[@id="__layout"]/div/div[1]/section[2]/div[1]/main/ul/li[1]/a/div[2]/div/div[1]/h2/text()').extract_first().strip()
            # 仓库面积
            area=web.xpath('.//div[@class="right-data"]/p[@class="area"]/text()').extract()[0]
            item['area'] = area if area else None
            #城市
            item['city']=web.xpath('//span[@class="city-name"]/text()').extract()[0]
            # 仓库地理位置
            item['address']=web.xpath('//*[@id="__layout"]/div/div[1]/section[2]/div[1]/main/ul/li[1]/a/div[2]/div/div[2]/span/text()').extract()[0]
            # 仓库描述标签
            data=web.xpath('.//div[@class="mid-info"]/ul')
            tags=data.xpath('string(.)').extract()
            if len(tags)>0:
                item['tags']=data.xpath('string(.)').extract()[0]
            # 价格gh
            item['price']=web.xpath('//*[@id="__layout"]/div/div[1]/section[2]/div[1]/main/ul/li[1]/a/div[3]/p[2]/span/text()').extract()[0].strip()
            #仓库URL
            url='https://www.toodc.cn'
            item['url']=url+web.xpath('.//a/@href').extract()[0]
            #返回信息
            yield item
            # next_url = response.xpath("//div[@class='paging-wrapper clearfix']/ul/li[contains(text(),'下一页')]/@data-index").extract()
        next_url = response.xpath("//div[@class='paging-wrapper clearfix']/ul/li/@data-index").extract()
        if next_url:
            urlhref=response.xpath('//li[@class="active"]/a/@href').extract()[0]
            next_url ="https://www.toodc.cn"+urlhref+"/page" + next_url[-1]
            print("'''''''''''''''''")
            print("next_url:",next_url)
            print("'''''''''''''''''")
            yield scrapy.Request(next_url,callback=self.get_detail)


