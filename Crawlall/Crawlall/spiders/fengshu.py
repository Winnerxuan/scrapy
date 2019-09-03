# -*- coding: utf-8 -*-
import scrapy
from items import maptree
import re
# import logging
# from scrapy.utils.log import configure_logging
#
# configure_logging(install_root_handler=False)
# logging.basicConfig(
#     filename='log.txt',
#     format='%(levelname)s: %(message)s',
#     level=logging.INFO
# )
class MaptreeSpider(scrapy.Spider):
    name = 'fengshu'
    allowed_domains = ['mapletree.com.cn']
    start_urls = ['http://www.mapletree.com.cn/zh-CN/Our-Portfolio/Logistics.aspx/']

    def parse(self, response):
        item=maptree()
        web=response.xpath('//*[@id="content_0_inner_content_0_divSearchResults"]/table//tr')
        web.pop(0)
        for node in  web:
            item['assettitle']=node.xpath('./td[3]/div[1]/a/text()').extract()[0].strip()
            assetjianzhumianji=node.xpath("./td[3]/div[2]/div[1]/span/text()").extract()[0].replace(' ','')
            assetjianzhumianji = assetjianzhumianji.replace("\n","").replace("\r","")
            item['assetjianzhumianji'] = re.sub('平方米','',assetjianzhumianji)
            item['assetjianzhumianji']  = re.sub(',','',item['assetjianzhumianji'])
            print(item['assetjianzhumianji'])

            assetchuzumianji=node.xpath("./td[3]/div[2]/div[2]/span/text()").extract()[0].replace(' ','')
            assetchuzumianji=assetchuzumianji.replace("\n","").replace("\r","")
            item['assetchuzumianji']=re.sub('平方米','',assetchuzumianji)
            item['assetchuzumianji'] =re.sub(',','',item['assetchuzumianji'])
            print(item['assetchuzumianji'])

            assetaddress= node.xpath("./td[3]/div[2]/div[5]/span/text()").extract()[0].replace(' ','')
            item['assetaddress'] = assetaddress.replace("\n","").replace("\r","")
            print(item['assetaddress'])

            assetrongzi = node.xpath("./td[3]/div[2]/div[6]/span/text()").extract()[0].replace(' ','')
            item['assetrongzi'] = assetrongzi.replace("\n","").replace("\r","")
            print(item['assetrongzi'])
            yield item

        # '''以下是分页代码，组合post_data结构体，
        #    POST请求要使用 yield scrapy.FormRequest(url=response.url,formdata =post_data,callback=self.parse,dont_filter=True)函数。
        # '''
        # post_data = {
        #     "content_0$inner_content_0$ScriptManager1": "content_0$inner_content_0$udp1|content_0$inner_content_0$LinkButton3",
        #     "content_0$header_0$ddlTopRight": "select",
        #     "content_0$header_0$ddlTopRight": "select",
        #     "__EVENTTARGET": "content_0$inner_content_0$LinkButton3",
        #     "__EVENTARGUMENT": "",
        #     "__VIEWSTATE": "",
        #     "__VIEWSTATEGENERATOR": "67793420",
        #     "__EVENTVALIDATION": "",
        #     "__ASYNCPOST": "true"}
        #
        # a = response.xpath('//*[@id="__VIEWSTATE"]/@value')
        # post_data['__VIEWSTATE'] = a.extract_first()
        # c = response.xpath('//*[@id="__EVENTVALIDATION"]/@value')
        # post_data['__EVENTVALIDATION'] = c.extract_first()
        # yield scrapy.FormRequest(url=response.url, formdata=post_data, callback=self.parse, dont_filter=True)

