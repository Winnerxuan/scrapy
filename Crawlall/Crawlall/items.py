# -*- coding: utf-8 -*-

# Define here the models for your scraped items
#
# See documentation in:
# https://doc.scrapy.org/en/latest/topics/items.html

import scrapy

class AliauctionItem(scrapy.Item):
    # define the fields for your item here like:
    # name = scrapy.Field()
    assettitle = scrapy.Field()
    asseturl = scrapy.Field()
    assetstatus = scrapy.Field()
    currentPrice = scrapy.Field()
    consultPrice = scrapy.Field()
    start=scrapy.Field()
    end=scrapy.Field()
    timeToEnd=scrapy.Field()
    assetpurpose = scrapy.Field()

class EsrItem(scrapy.Item):
    assetstitle=scrapy.Field()
    assetaddress=scrapy.Field()
    assettedian=scrapy.Field()
    assetjiagou=scrapy.Field()
    assettudimianji=scrapy.Field()
    assetjianzhumianji=scrapy.Field()
    assetjungongtime=scrapy.Field()
    assetpeople=scrapy.Field()


class EsrnewsItem(scrapy.Item):
    newstitle=scrapy.Field()
    newtiems=scrapy.Field()
    newslink=scrapy.Field()

class FirstprioItem(scrapy.Item):
    # define the fields for your item here like:
    # name = scrapy.Field()
    assetname = scrapy.Field()
    assetJiegou = scrapy.Field()
    assetArea = scrapy.Field()
    assetjianjie = scrapy.Field()
    assetLocation = scrapy.Field()

class FirstprioNewsItem(scrapy.Item):
    newstitle = scrapy.Field()
    newslink = scrapy.Field()
    newszhaiyao = scrapy.Field()
    newstiems = scrapy.Field()

class GigaceItem(scrapy.Item):
    # define the fields for your item here like:
    # name = scrapy.Field()
    title = scrapy.Field()
    address = scrapy.Field()
    detailaddress=scrapy.Field()
    area = scrapy.Field()
    jiage = scrapy.Field()
    tags = scrapy.Field()
    link =scrapy.Field()

class JiaminNewsItem(scrapy.Item):
    newstitle=scrapy.Field()
    newtiems=scrapy.Field()
    newslink=scrapy.Field()
    newszhaiyao=scrapy.Field()

class JiaminAssetsItem(scrapy.Item):
    assetstitle=scrapy.Field()
    assetaddress=scrapy.Field()
    assettedian=scrapy.Field()
    assetxijie = scrapy.Field()
    assetjiagou=scrapy.Field()
    area=scrapy.Field()
    assetwuyeleibie=scrapy.Field()

class maptree(scrapy.Item):
    assettitle=scrapy.Field()
    assetjianzhumianji=scrapy.Field()
    assetchuzumianji=scrapy.Field()
    assetaddress=scrapy.Field()
    assetrongzi=scrapy.Field()

class PortfolioItem(scrapy.Item):
    # define the fields for your item here like:
    # name = scrapy.Field()
    name = scrapy.Field()
    location = scrapy.Field()
    area = scrapy.Field()
    warehouseType = scrapy.Field()

class AnboNewsItem(scrapy.Item):
    newstitle = scrapy.Field()
    newslink = scrapy.Field()
    newszhaiyao = scrapy.Field()

class PuluosiNewsItem(scrapy.Item):
    newstitle=scrapy.Field()
    newtiems=scrapy.Field()
    newslink=scrapy.Field()
    newscontent=scrapy.Field()

class PuluosiItem(scrapy.Item):
    assetstitle = scrapy.Field()
    assetaddress=scrapy.Field()
    assetgaikuang=scrapy.Field()
    assetpeople=scrapy.Field()
    assetmianji=scrapy.Field()
    asseturl = scrapy.Field()

class ToodcItem(scrapy.Item):
    # define the fields for your item here like:
    # name = scrapy.Field()
    #仓库标题
    title=scrapy.Field()
    #仓库面积
    area=scrapy.Field()
    #城市
    city=scrapy.Field()
    #仓库地理位置
    address=scrapy.Field()
    #仓库描述标签
    tags=scrapy.Field()
    #价格
    price=scrapy.Field()
    #仓库URL
    url=scrapy.Field()

class VailogItem(scrapy.Item):
    # define the fields for your item here like:
    # name = scrapy.Field()
    name = scrapy.Field()
    rentArea = scrapy.Field()
    area = scrapy.Field()
    warehouseType = scrapy.Field()
    location = scrapy.Field()
    contact = scrapy.Field()
    phone = scrapy.Field()
    email = scrapy.Field()
    overTime = scrapy.Field()

class VailognewsItem(scrapy.Item):
    title = scrapy.Field()
    newstime = scrapy.Field()
    url = scrapy.Field()
    zhaiyao = scrapy.Field()

class VxItem(scrapy.Item):
    # define the fields for your item here like:
    # name = scrapy.Field()
    name = scrapy.Field()
    location = scrapy.Field()
    area = scrapy.Field()
    warehouseType = scrapy.Field()
    feature = scrapy.Field()
    transportNet_air = scrapy.Field()
    transportNet_road = scrapy.Field()

class VxNewsItem(scrapy.Item):
    newstitle = scrapy.Field()
    newstime = scrapy.Field()
    newslink = scrapy.Field()
    newszhaiyao = scrapy.Field()