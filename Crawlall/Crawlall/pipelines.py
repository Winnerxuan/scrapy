# -*- coding: utf-8 -*-

# Define your item pipelines here
#
# Don't forget to add your pipeline to the ITEM_PIPELINES setting
# See: https://doc.scrapy.org/en/latest/topics/item-pipeline.html

import pymysql
from items import AliauctionItem,EsrItem,EsrnewsItem,FirstprioItem,FirstprioNewsItem,GigaceItem,JiaminNewsItem,JiaminAssetsItem,maptree,PortfolioItem,AnboNewsItem,PuluosiNewsItem,PuluosiItem,ToodcItem,VailogItem,VailognewsItem,VxItem,VxNewsItem
import requests
from scrapy.exceptions import DropItem

class CrawlallPipeline(object):
    def process_item(self, item, spider):
        con = pymysql.connect(host='localhost', user='root', passwd='Cndi@1234', db='scrapy', port=3306)
        # 数据库游标
        cue = con.cursor()
        print("mysql connect succes")  # 测试语句，这在程序执行时非常有效的理解程序是否执行到这一步
        if isinstance(item,PortfolioItem):
            try:
                cue.execute(
                    "insert into anbo_yuanqu (name,location,area,warehouseType) values(%s,%s,%s,%s)",
                    [item['name'], item['location'], item['area'], item['warehouseType'],])
                print("insert success")  # 测试语句
            except Exception as e:
                print('Insert error:', e)
                con.rollback()
            else:
                con.commit()
            con.close()
        elif isinstance(item,AnboNewsItem):
            try:
                cue.execute(
                    "insert into anbo_news (newstitle,newslink,newszhaiyao) values(%s,%s,%s)",
                    [item['newstitle'], item['newslink'], item['newszhaiyao'], ])
                print("insert success")  # 测试语句
            except Exception as e:
                print('Insert error:', e)
                con.rollback()
            else:
                con.commit()
            con.close()
        elif isinstance(item,AliauctionItem):
            try:
                cue.execute(
                    "replace into aliAuction (assettitle,asseturl,assetstatus,currentPrice,consultPrice,start,end,timeToEnd) values(%s,%s,%s,%s,%s,%s,%s,%s)",
                    [item['assettitle'], item['asseturl'], item['assetstatus'], item['currentPrice'],
                     item['consultPrice'], item['start'], item['end'], item['timeToEnd']])
                print("insert success")  # 测试语句
            except Exception as e:
                print('Insert error:', e)
                con.rollback()
            else:
                con.commit()
            con.close()
        elif isinstance(item,EsrItem):
            try:
                cue.execute(
                    "replace into esr_assets (assetstitle,assetaddress,assettedian,assetjiagou,assettudimianji,assetjianzhumianji,assetjungongtime,assetpeople) values(%s,%s,%s,%s,%s,%s,%s,%s)",
                    [item['assetstitle'], item['assetaddress'], item['assettedian'], item['assetjiagou'],
                        item['assettudimianji'], item['assetjianzhumianji'], item['assetjungongtime'],
                        item['assetpeople']])
                print("insert success")  # 测试语句
            except Exception as e:
                print('Insert error:', e)
                con.rollback()
            else:
                con.commit()
            con.close()
        elif isinstance(item,EsrnewsItem):
            try:
                cue.execute(
                    "replace into esr_news (newstitle,newtiems,newslink) values(%s,%s,%s)",
                    [item['newstitle'], item['newtiems'], item['newslink']])
                print("insert success")  # 测试语句
            except Exception as e:
                print('Insert error:', e)
                con.rollback()
            else:
                con.commit()
            con.close()
        elif isinstance(item,FirstprioItem):
            try:
                cue.execute(
                    "replace into firstprio (assettitle,assetcangkujiegou,assetyongdimianji,assetjianjie,assetlocation) values(%s,%s,%s,%s,%s)",
                    [item['assetname'], item['assetJiegou'], item['assetArea'], item['assetjianjie'],
                     item['assetLocation']])
                print("insert success")  # 测试语句
            except Exception as e:
                print('Insert error:', e)
                con.rollback()
            else:
                con.commit()
            con.close()
        elif isinstance(item, FirstprioNewsItem):
            try:
                cue.execute(
                    "replace into firstprionews (newstitle,newslink,newszhaiyao,newstiems) values(%s,%s,%s,%s)",
                    [item['newstitle'], item['newslink'], item['newszhaiyao'], item['newstiems']])
                print("insert success")  # 测试语句
            except Exception as e:
                print('Insert error:', e)
                con.rollback()
            else:
                con.commit()
            con.close()
        elif isinstance(item,GigaceItem):
            try:
                cue.execute(
                    "replace into gigace_yuanqu (title,address,detailaddress,area,jiage,tags) values(%s,%s,%s,%s,%s,%s)",
                    [item['title'], item['address'], item['detailaddress'], item['area'], item['jiage'], item['tags']])
                print("insert success")  # 测试语句
            except Exception as e:
                print('Insert error:', e)
                con.rollback()
            else:
                con.commit()
            con.close()
        elif isinstance(item,JiaminAssetsItem):
            try:
                cue.execute(
                    "replace into jiamin_asset (assetstitle,assetaddress,assettedian,area,assetwuyeleibie) values(%s,%s,%s,%s,%s)",
                    [item['assetstitle'], item['assetaddress'], item['assettedian'], item['area'],
                     item['assetwuyeleibie']])
                print("insert success")  # 测试语句
            except Exception as e:
                print('Insert error:', e)
                con.rollback()
            else:
                con.commit()
            con.close()
        elif isinstance(item,JiaminNewsItem):
            tmpurl = item['newslink']
            if requests.get(tmpurl).status_code == 200:
                try:
                    cue.execute(
                        "replace into jiamin_news (newstitle,newtiems,newslink,newszhaiyao) values(%s,%s,%s,%s)",
                        [item['newstitle'], item['newtiems'], item['newslink'], item['newszhaiyao']])
                    print("insert success")  # 测试语句
                except Exception as e:
                    print('Insert error:', e)
                    con.rollback()
                else:
                    con.commit()
                con.close()
            else:
                raise DropItem("无效的URL链接 %s" % item)
            return item
        elif isinstance(item,maptree):
            try:
                cue.execute(
                    "replace into fengshu_asset (assettitle,assetjianzhumianji,assetchuzumianji,assetaddress,assetrongzi) values(%s,%s,%s,%s,%s)",
                    [item['assettitle'], item['assetjianzhumianji'], item['assetchuzumianji'], item['assetaddress'],
                     item['assetrongzi']])
                print("insert success")  # 测试语句
            except Exception as e:
                print('Insert error:', e)
                con.rollback()
            else:
                con.commit()
            con.close()
        elif isinstance(item,PuluosiNewsItem):
            try:
                cue.execute(
                    "replace into puluosi_news (newstitle,newtiems,newslink) values(%s,%s,%s)",
                    [item['newstitle'], item['newtiems'], item['newslink']])
                print("insert success")  # 测试语句
            except Exception as e:
                print('Insert error:', e)
                con.rollback()
            else:
                con.commit()
            con.close()
        elif isinstance(item,PuluosiItem):
            try:
                cue.execute(
                    "replace into puluosi_assets (assetstitle,assetaddress,assetmianji,assetgaikuang,assetpeople,asseturl) values(%s,%s,%s,%s,%s,%s)",
                    [item['assetstitle'], item['assetaddress'],item['assetmianji'] ,item['assetgaikuang'],item['assetpeople'],item['asseturl'] ])
                print("insert success")  # 测试语句
            except Exception as e:
                print('Insert error:', e)
                con.rollback()
            else:
                con.commit()
            con.close()
        elif isinstance(item,VailogItem):
            try:
                cue.execute(
                    "replace into weilong_yuanqu (name,rentArea,area,warehouseType,location,contact,phone,email,overTime) values(%s,%s,%s,%s,%s,%s,%s,%s,%s)",
                    [item['name'], item['rentArea'], item['area'], item['warehouseType'], item['location'],
                     item['contact'], item['phone'], item['email'], item['overTime'], ])
                print("insert success")  # 测试语句
            except Exception as e:
                print('Insert error:', e)
                con.rollback()
            else:
                con.commit()
            con.close()
        elif isinstance(item,VailognewsItem):
            try:
                cue.execute(
                    "replace into weilong_news (title,newstime,url,zhaiyao) values(%s,%s,%s,%s)",
                    [item['title'], item['newstime'], item['url'], item['zhaiyao']])
                print("insert success")  # 测试语句
            except Exception as e:
                print('Insert error:', e)
                con.rollback()
            else:
                con.commit()
            con.close()
        elif isinstance(item,VxItem):
            try:
                cue.execute(
                    "replace into wanwei_yuanqu (name,location,area,feature,warehouseType,transportNet_air,transportNet_road) values(%s,%s,%s,%s,%s,%s,%s)",
                    [item['name'], item['location'], item['area'], item['feature'],item['warehouseType'],item['transportNet_air'], item['transportNet_road'],
                     ])
                print("insert success")  # 测试语句
            except Exception as e:
                print('Insert error:', e)
                con.rollback()
            else:
                con.commit()
            con.close()
        elif isinstance(item,VxNewsItem):
            try:
                cue.execute(
                    "replace into wanwei_news (newstitle,newstime,newslink,newszhaiyao) values(%s,%s,%s,%s)",
                    [item['newstitle'], item['newstime'], item['newslink'], item['newszhaiyao']])
                print("insert success")  # 测试语句
            except Exception as e:
                print('Insert error:', e)
                con.rollback()
            else:
                con.commit()
            con.close()
        elif isinstance(item,ToodcItem):
            try:
                cue.execute(
                    "replace into toodc_yuanqu (title,area,city,address,tags,price,url) values(%s,%s,%s,%s,%s,%s,%s)",
                    [item['title'], item['area'], item['city'], item['address'], item['tags'], item['price'],
                     item['url']])
                print("insert success")  # 测试语句
            except Exception as e:
                print('Insert error:', e)
                con.rollback()
            else:
                con.commit()
            con.close()
