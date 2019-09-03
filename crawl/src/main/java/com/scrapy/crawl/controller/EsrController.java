package com.scrapy.crawl.controller;


import com.scrapy.crawl.entity.EsrAsset;
import com.scrapy.crawl.entity.EsrAssetExample;
import com.scrapy.crawl.entity.EsrNews;
import com.scrapy.crawl.entity.EsrNewsExample;
import com.scrapy.crawl.mapper.EsrAssetMapper;
import com.scrapy.crawl.mapper.EsrNewsMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@Api(value = "esr园区",description = "esr园区数据")
@RequestMapping("/")
public class EsrController {
    @Resource
    private EsrAssetMapper esrAssetMapper;
    @Resource
    private EsrNewsMapper esrNewsMapper;

    @RequestMapping(value = "/getEsrAsset",method = RequestMethod.POST)
    @ApiOperation(value = "ESR园区信息",notes = "ESR园区信息")
    @ResponseBody
    public List<EsrAsset> EsrAsset(){
        EsrAssetExample esrAssetExample =  new EsrAssetExample();
        return esrAssetMapper.selectByExample(esrAssetExample);
    }

    @RequestMapping(value = "/selectEsrAsset",method = RequestMethod.POST)
    @ApiOperation(value="esr查询")
    @ResponseBody
    public EsrAsset selectbyassetid(String name){
        return esrAssetMapper.selectByPrimaryKey(name);
    }

    @RequestMapping(value = "/getEsrNews",method = RequestMethod.POST)
    @ApiOperation(value = "ESR大事件",notes = "ESR大事件")
    @ResponseBody
    public List<EsrNews> EsrNews(){
        EsrNewsExample esrNewsExample = new EsrNewsExample();
        return esrNewsMapper.selectByExample(esrNewsExample);
    }

}
