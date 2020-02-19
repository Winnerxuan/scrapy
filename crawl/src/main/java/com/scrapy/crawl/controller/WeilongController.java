package com.scrapy.crawl.controller;

import com.scrapy.crawl.entity.WeilongNews;
import com.scrapy.crawl.entity.WeilongNewsExample;
import com.scrapy.crawl.entity.WeilongYuanqu;
import com.scrapy.crawl.entity.WeilongYuanquExample;
import com.scrapy.crawl.mapper.WeilongNewsMapper;
import com.scrapy.crawl.mapper.WeilongYuanquMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@Api(value = "维龙园区信息",description = "维龙园区信息")
@RequestMapping("")
public class WeilongController {
    @Resource
    private WeilongYuanquMapper weilongYuanquMapper;
    @Resource
    private WeilongNewsMapper weilongNewsMapper;

    //园区
    @RequestMapping(value = "/getWeilongYuanqu",method = RequestMethod.POST)
    @ApiOperation(value = "维龙园区信息",notes = "维龙园区信息")
    @ResponseBody
    public List<WeilongYuanqu> Weilongyuanqu(){
        WeilongYuanquExample weilongYuanquExample = new WeilongYuanquExample();
        return weilongYuanquMapper.selectByExample(weilongYuanquExample);
    }

    @RequestMapping(value = "/selectWeilongYuanqu",method = RequestMethod.POST)
    @ApiOperation(value = "按主键查询",notes = "维龙园区信息")
    @ResponseBody
    public WeilongYuanqu Weilongyuanqu(String name){
        return weilongYuanquMapper.selectByPrimaryKey(name);
    }

    //大事件
    @RequestMapping(value = "/getWeilongNews",method = RequestMethod.POST)
    @ApiOperation(value = "维龙大事件",notes = "维龙园区信息")
    @ResponseBody
    public List<WeilongNews> weilongNews(){
        WeilongNewsExample weilongYuanquExample = new WeilongNewsExample();
        return weilongNewsMapper.selectByDesc();
    }

}
