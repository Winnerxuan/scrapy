# -*- coding: utf-8 -*-
import scrapy
from scrapy.http import FormRequest
from items import GigaceItem
import json
import re


class MyspiderSpider(scrapy.Spider):
    name = 'gigacre'
    allowed_domains = ['gigacre.com']

    def start_requests(self):
        url="http://www.gigacre.com/home/Property/index.html"
        formdata={"type": "0","province": "","city": "","area": "", "can_leasable_area": "","rent_min": "0.00","rent_max": "17900.00","decorate": "","recom_all": "","structure": "","property_status": "","title": "","tag": "","page": "1","sw": "", "isbottom": "false","ne": "","order": ""}
        yield FormRequest(url, callback=self.parse_max_page, method="POST",formdata=formdata)


    def parse_max_page(self,response):
        jsonBody=json.loads(response.body)
        models=jsonBody['page']
        url = "http://www.gigacre.com/home/Property/index.html"
        requests = []
        for i in range(1,models+1):
            formdata={"type": "0","province": "","city": "","area": "", "can_leasable_area": "","rent_min": "0.00","rent_max": "17900.00","decorate": "","recom_all": "","structure": "","property_status": "","title": "","tag": "","page": str(i),"sw": "", "isbottom": "false","ne": "","order": ""}
            request = FormRequest(url, callback=self.parse_model, method="POST",formdata=formdata)
            #创建61次的请求然后调用回调函数parse_model
            requests.append(request)
        return requests


    def parse_model(self,response):
        jsonBody=json.loads(response.body)
        models=jsonBody['data']
        print(type(models))
        item = GigaceItem()
        for dict in models:
            item['title'] = dict['title']
            item['address'] = dict['province']
            item['detailaddress']=dict['address']
            area = dict['can_leasable_area']
            item['area'] = re.sub(',','',area)
            print(item['area'])
            item['jiage'] = dict['rent']
            item['tags'] = str(dict['tags'])
            item['tags'] = ' '.join(dict['tags'])
            yield item
