#直接创建py文件，运行即可，其中括号内问爬虫文件名称
from scrapy.crawler import CrawlerProcess
from scrapy.utils.project import get_project_settings
process = CrawlerProcess(get_project_settings())

process.crawl('anbo')
process.crawl('Auction')
process.crawl('esr')
process.crawl('fengshu')
process.crawl('firstprio')
process.crawl('gigacre')
process.crawl('jiamin')
process.crawl('puluosi')
process.crawl('toodc')
process.crawl('wanwei')
process.crawl('weilong')

process.start()