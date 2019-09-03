# -*- coding: utf-8 -*-
import scrapy
import requests
import re
from items import FirstprioItem,FirstprioNewsItem

class FirstPrioSpider(scrapy.Spider):
    name = 'firstprio'
    allowed_domains = ['first-prio.com']
    start_urls = ['http://first-prio.com/']

    def start_requests(self):
        yield scrapy.Request("http://www.first-prio.com/locations-2/",self.parse_case)
        yield scrapy.Request("http://www.first-prio.com/news/",self.parse_news)

    def parse_case(self, response):
        html = requests.get(response.url).text
        section = re.findall("<section class='container-fluid'.*?>(.*?)</section>", html, re.S)
        items = []
        for item in section:
            if 'h4' in item:
                items.append(item)
        # res = []
        for item in items:
            temp = {}
            temp['name'] = re.search('<h4>(.*?)</h4>', item).group(1)
            temp['desc'] = re.search("<p.*?>(.*?)</p>", item).group(1)
            table = re.search("<table.*?>(.*?)</table>", item).group(1)
            keys = re.findall("<tr.*?td.*?>(.*?)</td>.*?</tr>", table)
            values = re.findall("<tr.*?td.*?td.*?td.*?>(.*?)</td>.*?</tr>", table)
            for k, v in zip(keys, values):
                if k == '\xa0':
                    continue
                if '>' in k:
                    k = re.search('>([^>]+)</', k).group(1)
                if '>' in v:
                    v = re.search('>([^>]+)</', v).group(1)
                temp[str(k.replace('\xa0', '').strip())] = v
            # res.append(temp)
            item = FirstprioItem()
            item['assetname'] = temp['name']
            item['assetjianjie'] = temp['desc']
            if "仓库结构：" in temp.keys():
                item['assetJiegou'] = temp['仓库结构：']
            elif "仓库结构" in temp.keys():
                item['assetJiegou'] = temp['仓库结构']
            else:
                item['assetJiegou'] = temp['1）仓库结构：'] + temp['2）仓库结构：']
            if "位置：" in temp.keys():
                item['assetLocation'] = temp['位置：']
            else:
                item['assetLocation'] = "未提供"
            if "用地面积：" in temp.keys():
                item['assetArea'] = re.sub('[\u4E00-\u9FA5\\s]+','',temp['用地面积：'])
                item['assetArea'] = re.sub(',','',item['assetArea'])
            else:
                item['assetArea'] = re.sub('[\u4E00-\u9FA5\\s]+','',temp['建筑面积'])
                item['assetArea'] = re.sub(',', '', item['assetArea'])
            yield item

    def parse_news(self,response):

        pass
