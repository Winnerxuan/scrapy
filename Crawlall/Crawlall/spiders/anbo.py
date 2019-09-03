import scrapy
from items import PortfolioItem,AnboNewsItem
import re
import requests

headers={
"Accept": "text/html,application/xhtml+xml,application/xml;q=0.9,image/webp,image/apng,*/*;q=0.8",
    "Accept-Encoding": "gzip,deflate,br",
    "Accept-Language": "zh-CN,zh;q=0.9",
    "Cache-Control": "no-cache",
    "Connection": "keep-alive",
    "Host": "www.prologis.cn",
    "User-Agent": "Mozilla/5.0(WindowsNT10.0;Win64;x64)AppleWebKit/537.36(KHTML,likeGecko)Chrome/71.0.3578.98Safari/537.36"
}

class prologis_spider(scrapy.Spider):
    name = "anbo"
    allowed_domains = ['prologis.cn']
    def start_requests(self):
        yield scrapy.Request('https://www.prologis.cn/about/features?title=&page=1',self.news_parse,dont_filter=True)
        yield scrapy.Request('https://www.prologis.cn/portfolio?country_name=All&locality=All&market=All&page=%s&prl_property_property_type_status_combined=All&title=',self.parse_case)

    def parse_case(self, response):
        linkList = response.xpath('//*[@id="block-views-blockproperties-portfolio-faceted-search-block"]/div/div//div//div/div/h3/a/@href').extract()
        print(linkList)
        for link in linkList:
            link = link.lstrip(" /")
            link = link.replace("\n","")
            detail_link= response.urljoin(link)
            yield scrapy.Request(detail_link, headers=headers,callback=self.page_parse)
        next_link=response.xpath('//li[@class="pager__item"]//a/@href').extract()
        if next_link:
            yield scrapy.Request(response.urljoin(next_link[0]), callback=self.parse_case)

    # def parse_news(self,response):
    #     print(response.url)
    #     next_link=response.xpath('//li[@class="pager__item"]//a/@href').extract()
    #     if next_link:
    #         yield scrapy.Request(response.urljoin(next_link[0]),callback=self.parse_news)
    #     yield scrapy.Request(response.url,headers=headers,callback=self.news_parse)

    def news_parse(self,response):
        html = requests.get(response.url).text
        newstitle = response.xpath('//*[@id="block-views-blockfeatures-features-block"]/div/div/div/div/div/h3/a/text()').extract()
        newslink = response.xpath('//div[@class="media__content js-media-content"]/h3/a/@href').extract()
        newszhaiyao = re.findall("<p>(.*?)</p>", html, re.S)


        for i in range(len(newstitle)):
            item = AnboNewsItem()
            item['newstitle'] = re.sub(r'\s+','',newstitle[i])
            item['newslink'] = response.urljoin(newslink[i])
            item['newszhaiyao'] = re.sub("<.*?>",'',newszhaiyao[i])
            item['newszhaiyao']=re.sub(r'\s+','',item['newszhaiyao'])
            item['newszhaiyao']=re.sub('\xa0','',item['newszhaiyao'])
            yield item

        next_link = response.xpath('//li[@class="pager__item"]//a/@href').extract()
        if next_link:
            print(next_link)
            print(response.urljoin(next_link[0]))
            yield scrapy.Request(response.urljoin(next_link[0]), callback=self.news_parse)

    def page_parse(self,response):
        item = PortfolioItem()
        name= response.xpath("/html/body/div/main/article/div[1]/div[2]/h1/text()").extract_first()
        name = name.strip()
        name = name.replace("\n","")
        item['name']=name
        print(item['name'])
        # item['description'] = respons e.xpath('/html/body/div/main/article/div[2]/div/div[1]/div[1]/text()').extract_first()
        item['location'] = response.xpath('/html/body/div/main/article/div[2]/div/div[2]/div/div/div[1]/p/span[2]/text()').extract_first() + response.xpath('/html/body/div/main/article/div[2]/div/div[2]/div/div/div[1]/p/span[3]/text()').extract_first()
        area = response.xpath('/html/body/div/main/article/div[2]/div/div[2]/div/div/div[2]/dl/dt[1]/text()').extract_first()
        item['area'] =  re.sub(',','',area)
        item['warehouseType'] = response.xpath('/html/body/div/main/article/div[2]/div/div[2]/div/div/div[2]/dl/dt[2]/text()').extract_first()+response.xpath('/html/body/div/main/article/div[2]/div/div[2]/div/div/div[2]/dl/dd[2]/text()').extract_first()
        # delete = ["</p>","<p>","<span>","</span>"]
        # for i in range(len(delete)):
        #     if delete[i] in item['description']:
        #         item['description'].replace(delete[i],"")
        yield item
