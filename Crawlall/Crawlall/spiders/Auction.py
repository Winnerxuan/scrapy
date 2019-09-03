# -*- coding: utf-8 -*-
import re
import json
import scrapy
from items import AliauctionItem

headers={
"Accept": "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8",
    "Accept-Encoding": "gzip,deflate,br",
    "Accept-Language": "zh-CN,zh;q=0.9",
    "Cache-Control": "no-cache",
    "Connection": "keep-alive",
    "Host": "sf.taobao.com",
    "User-Agent": "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14_1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/76.0.3809.100 Safari/537.36"
}
class AuctionSpider(scrapy.Spider):
    name = 'Auction'
    allowed_domains = ['sf.taobao.com']
    start_urls = ['https://sf.taobao.com/']

    def start_requests(self):
        yield scrapy.Request("https://sf.taobao.com/item_list.htm?spm=a213w.7398504.pagination.6.562428d92AM3Kh&category=200788003&auction_source=0&st_param=-1&auction_start_seg=-1&page=1", self.page_parse, headers=headers)

    def page_parse(self, response):
        item = AliauctionItem()
        html = response.text
        data = re.search('<script id="sf-item-list-data" type="text/json">(.*?)</script>', html, re.S).group(1)
        data = json.loads(data)['data']
        for obj in data:
            item['assettitle'] = obj['title']
            item['asseturl'] = response.urljoin(obj['itemUrl'])
            item['assetstatus'] = obj['status']
            item['currentPrice'] = obj['currentPrice']
            item['consultPrice'] = obj['consultPrice']
            item['start'] = obj['start']
            item['end'] = obj['end']
            item['timeToEnd'] = obj['timeToEnd']
            yield item
        next_link = re.sub("\t",'',response.xpath('//div[@class="pagination J_Pagination"]/a[@class="next"]/@href').extract_first())
        print("https:"+next_link.lstrip())
        if next_link:
            yield scrapy.Request("https:"+next_link.lstrip(),self.page_parse)
