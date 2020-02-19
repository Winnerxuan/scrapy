package com.scrapy.crawl.controller;


import com.scrapy.crawl.entity.JiaminAsset;
import com.scrapy.crawl.entity.JiaminAssetExample;
import com.scrapy.crawl.entity.JiaminNews;
import com.scrapy.crawl.entity.JiaminNewsExample;
import com.scrapy.crawl.mapper.JiaminAssetMapper;
import com.scrapy.crawl.mapper.JiaminNewsMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@Api(value = "嘉民大事件",description = "嘉民大事件")
@RequestMapping("")
public class JiaminController {
    @Resource
    private JiaminAssetMapper jiaminAssetMapper;
    @Resource
    private JiaminNewsMapper jiaminNewsMapper;

    //园区
    @RequestMapping(value = "/getJiaminyuanqu",method = RequestMethod.POST)
    @ApiOperation(value = "嘉民园区",notes = "嘉民大事件")
    @ResponseBody
    public List<JiaminAsset>  jiaminAssets(){
        JiaminAssetExample jiaminAssetExample = new JiaminAssetExample();
        return jiaminAssetMapper.selectByExample(jiaminAssetExample);
    }
    @RequestMapping(value = "/selectJiaminyuanqu",method = RequestMethod.POST)
    @ApiOperation(value = "按主键查询",notes = "点击进入仓库页面")
    @ResponseBody
    public JiaminAsset  jiaminAsset(String name){
        return jiaminAssetMapper.selectByPrimaryKey(name);
    }


    //大事件
    @RequestMapping(value = "/getJiaminNews",method = RequestMethod.POST)
    @ApiOperation(value = "嘉民大事件",notes = "嘉民大事件")
    @ResponseBody
    public List<JiaminNews>  jiaminNews(){
        JiaminNewsExample jiaminNewsExample = new JiaminNewsExample();
        return jiaminNewsMapper.selectByDesc();
    }
}
