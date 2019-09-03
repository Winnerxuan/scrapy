# -*- coding: utf-8 -*-
import scrapy,re,json
from items import PuluosiNewsItem,PuluosiItem

import re

class PuluosiSpider(scrapy.Spider):
    name = 'puluosi'
    allowed_domains = ['glprop.com.cn']
    # start_urls = ['https://www.glprop.com.cn/press-releases.html']

    def start_requests(self):
        yield scrapy.Request('https://www.glprop.com.cn/press-releases.html', self.parse1)
        yield scrapy.Request('https://www.glprop.com.cn/in-the-news.html', self.parse2)
        yield scrapy.Request('https://www.glprop.com.cn/proposed-privatization.html', self.parse3)
        yield scrapy.Request('https://www.glprop.com.cn/our-network/network-detail.html', self.parse4)

    def parse1(self, response):
        print('此时启动的爬虫为：puluosi' )
        item=PuluosiNewsItem()
        web=response.xpath('//tbody/tr')
        web.pop(0)
        for node in  web:
            item['newstitle'] = node.xpath('.//a/text()').extract()[0].strip()
            print("item['newstitle']:",item['newstitle'])
            item['newtiems'] = node.xpath('.//td/text()').extract()[0].strip()
            print("item['newtiems']",item['newtiems'])
            # # urljoin创建绝对的links路径，始用于网页中的href值为相对路径的连接
            item['newslink'] = response.urljoin(web.xpath('.//a/@href').extract()[0])
            print("item['newslink']:",item['newslink'])
            print("----")
            yield item
        #加入try 来判断当前年份的新闻是否有下一页出现
        try:
            next_url_tmp = response.xpath('//div[@class="page"]/a[contains(text(),"下一页")]/@href').extract()[0]
            if next_url_tmp:
                next_url = "https://www.glprop.com.cn" + next_url_tmp
                yield scrapy.Request(next_url,callback=self.parse1)
        except Exception as e:
            print("当前页面没有下一页")
        href=response.xpath('//ul[@class="timeList"]/li/a/@href')
        for nexturl in href:
            url1 =nexturl.extract()
            if url1:
                url="https://www.glprop.com.cn"+url1
                yield scrapy.Request(url,callback=self.parse1)

    def parse2(self,response):
        item = PuluosiNewsItem()
        web = response.xpath('//tbody/tr')
        web.pop(0)
        for node in  web:
            item['newstitle'] = node.xpath('.//a/text()').extract()[0].strip()
            # print(item['newstitle'])
            item['newtiems'] = node.xpath('.//td/text()').extract()[0].strip()
            # print(item['newtiems'])
            # urljoin创建绝对的links路径，始用于网页中的href值为相对路径的连接
            item['newslink'] = response.urljoin(web.xpath('.//a/@href').extract()[0])

            # print(item['newslink'])
            yield item
        #加入try 来判断当前年份的新闻是否有下一页出现
        try:
            next_url_tmp = response.xpath('//div[@class="page"]/a[contains(text(),"下一页")]/@href').extract()[0]
            if next_url_tmp:
                next_url = "https://www.glprop.com.cn" + next_url_tmp
                yield scrapy.Request(next_url,callback=self.parse2)
        except Exception as e:
            print("当前页面没有下一页")
        href=response.xpath('//ul[@class="timeList"]/li/a/@href')
        for nexturl in href:
            url1 =nexturl.extract()
            if url1:
                url="https://www.glprop.com.cn"+url1
                yield scrapy.Request(url,callback=self.parse2)

    def parse3(self,response):
        item=PuluosiNewsItem()
        web=response.xpath('//tbody/tr')
        web.pop()
        for node in  web:
            item['newstitle'] = node.xpath('.//a/text()').extract()[0].strip()
            # print(item['newstitle'])
            item['newtiems'] = node.xpath('.//td/text()').extract()[0].strip()
            # print(item['newtiems'])
            # urljoin创建绝对的links路径，始用于网页中的href值为相对路径的连接
            item['newslink'] = response.urljoin(web.xpath('.//a/@href').extract()[0])
            # print(item['newslink'])
            yield item



    def parse4(self, response):
        item = PuluosiItem()
        citycode=re.findall('var cities =(.*);',response.text )
        citycodejson=json.loads(("".join(citycode)))
        #把每个城市的id和name取出来放到一个字典
        dictcity={}
        reg = ':'
        for i in citycodejson:
            citycodename=i['name']
            citycodenm=i['id']
            dictcity[citycodenm]=citycodename
        detail=re.findall('var parks =(.*);',response.text )
        jsonBody = json.loads(("".join(detail)))
        list = []
        for key1 in jsonBody:
            for key2  in jsonBody[key1]:
                tmp=jsonBody[key1][key2]
                list.append(jsonBody[key1][key2])
        for node in list:
            assetaddress = node['city_id']
            item['assetaddress'] = dictcity[assetaddress]
            # print(item['assetaddress'])
            item['assetstitle'] = node['name']
            # print(item['assetstitle'])
            item['assetgaikuang'] = node['detail_single'].strip().replace('&nbsp;', '').replace(' ', '')
            # print(item['assetgaikuang'])
            assetpeople = node['description']
            item['assetpeople'] = re.sub(r'<.*?>', '', (assetpeople.strip())).replace('&nbsp;', '')
            if re.search("建筑面积.*?\d+平方米",item['assetpeople']):
                a=re.search("建筑面积.*?\d+平方米",item['assetpeople']).group()
                a=re.sub(reg,'',a)
                a=re.sub(',','',a)
                item['assetmianji']=re.sub('[\u4e00-\u9fa5]','',a)
                print(item['assetmianji'])

            elif re.search("占地面积.*?\d+平方米",item['assetgaikuang']):
                a=re.search("占地面积.*?\d+平方米",item['assetgaikuang']).group()
                a=re.sub(',','',a)
                item['assetmianji']= re.sub('[\u4e00-\u9fa5]','',a)

            elif re.search("租赁面积.*?\d+平方米", item['assetgaikuang']):
                a = re.search("租赁面积.*?\d+平方米", item['assetgaikuang']).group()
                a = re.sub(',','',a)
                item['assetmianji'] = re.sub('[\u4e00-\u9fa5]','',a)

            else:
                item['assetmianji'] =" "
            item['asseturl']='https://www.glprop.com.cn/network-city-detail.html?city='+item['assetaddress']
            # print(item['assetpeople'])
            yield item