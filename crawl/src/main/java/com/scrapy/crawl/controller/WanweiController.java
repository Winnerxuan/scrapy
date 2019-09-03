package com.scrapy.crawl.controller;

import com.scrapy.crawl.entity.WanweiNews;
import com.scrapy.crawl.entity.WanweiNewsExample;
import com.scrapy.crawl.entity.WanweiYuanqu;
import com.scrapy.crawl.entity.WanweiYuanquExample;
import com.scrapy.crawl.mapper.WanweiNewsMapper;
import com.scrapy.crawl.mapper.WanweiYuanquMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@Api(value = "万维园区信息",description = "万维园区信息")
@RequestMapping("")
public class WanweiController {
    @Resource
    private WanweiYuanquMapper wanweiYuanquMapper;
    @Resource
    private WanweiNewsMapper wanweiNewsMapper;

    //园区
    @RequestMapping(value = "/getWanweiYuanqu",method = RequestMethod.POST)
    @ApiOperation(value = "万维园区信息",notes = "万维园区信息")
    @ResponseBody
    public List<WanweiYuanqu> WanweiYuanqu(){
        WanweiYuanquExample wanweiYuanquExample = new WanweiYuanquExample();
        return wanweiYuanquMapper.selectByExample(wanweiYuanquExample);
    }

    @RequestMapping(value = "/selectWanweiYuanqu",method = RequestMethod.POST)
    @ApiOperation(value = "查询万维园区信息",notes = "万维园区信息")
    @ResponseBody
    public WanweiYuanqu selectbyyuanquid(String name){
        return wanweiYuanquMapper.selectByPrimaryKey(name);
    }

    //新闻大事件
    @RequestMapping(value = "/getWanweiNews",method = RequestMethod.POST)
    @ApiOperation(value = "万维园区信息",notes = "万维园区信息")
    @ResponseBody
    public List<WanweiNews> selectbynewsid(){
        WanweiNewsExample wanweiYuanquExample = new WanweiNewsExample();
        return wanweiNewsMapper.selectByExample(wanweiYuanquExample);
    }

}
