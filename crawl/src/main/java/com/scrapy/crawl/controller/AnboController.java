package com.scrapy.crawl.controller;

import com.scrapy.crawl.entity.Anbo;
import com.scrapy.crawl.entity.AnboExample;
import com.scrapy.crawl.entity.AnboNews;
import com.scrapy.crawl.entity.AnboNewsExample;
import com.scrapy.crawl.mapper.AnboMapper;
import com.scrapy.crawl.mapper.AnboNewsMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@Api(value = "安博园区数据接口",description = "安博园区数据接口")
@RequestMapping("/")
public class AnboController {

    @Resource
    private AnboMapper anboMapper;
    @Resource
    private AnboNewsMapper anboNewsMapper;

    //园区
    @RequestMapping(value = "/getAnbo",method = RequestMethod.POST)
    @ApiOperation(value = "安博园区信息",notes = "安博园区信息")
    @ResponseBody
    public List<Anbo> getAnbo() {
        AnboExample anboExample = new AnboExample();
        return anboMapper.selectByExample(anboExample);
    }
    @RequestMapping(value = "/SelectAnboAsset",method = RequestMethod.POST)
    @ApiOperation(value = "按主键查询")
    @ResponseBody
    public Anbo selectbyassetid(String name){
        return anboMapper.selectByPrimaryKey(name);
    }

    //大事件
    @RequestMapping(value = "/getAnboNews",method = RequestMethod.POST)
    @ApiOperation(value = "安博大事件信息",notes = "安博大事件信息")
    @ResponseBody
    public List<AnboNews> Anbonews() {
        AnboNewsExample anbonewsExample = new AnboNewsExample();
        return anboNewsMapper.selectByExample(anbonewsExample);
    }

}
