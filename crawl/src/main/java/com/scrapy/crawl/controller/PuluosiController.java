package com.scrapy.crawl.controller;


import com.scrapy.crawl.entity.PuluosiAssets;
import com.scrapy.crawl.entity.PuluosiAssetsExample;
import com.scrapy.crawl.entity.PuluosiNews;
import com.scrapy.crawl.entity.PuluosiNewsExample;
import com.scrapy.crawl.mapper.PuluosiAssetsMapper;
import com.scrapy.crawl.mapper.PuluosiNewsMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@Api(value = "普洛斯园区资产分布",description = "普洛斯园区资产分布")
@RequestMapping("")
public class PuluosiController {
    @Resource
    private PuluosiAssetsMapper puluosiAssetsMapper;
    @Resource
    private PuluosiNewsMapper puluosiNewsMapper;

    //园区
    @RequestMapping(value = "/getPuluosiAssets",method = RequestMethod.POST)
    @ApiOperation(value = "普洛斯园区资产分布",notes = "普洛斯园区资产分布")
    @ResponseBody
    public List<PuluosiAssets> PuluosiAssets(){
        PuluosiAssetsExample puluosiAssetsExample = new PuluosiAssetsExample();
        return puluosiAssetsMapper.selectByExample(puluosiAssetsExample);
    }
    @RequestMapping(value = "/selectPuluosiAsset",method = RequestMethod.POST)
    @ApiOperation(value = "按园区名字查询")
    @ResponseBody
    public PuluosiNews selectbynewsid(String name){
        return puluosiNewsMapper.selectByPrimaryKey(name);
    }

    //大事件
    @RequestMapping(value = "/getPuluosiNews",method = RequestMethod.POST)
    @ApiOperation(value = "普洛斯新闻大事件",notes = "普洛斯新闻大事件")
    @ResponseBody
    public List<PuluosiNews> PuluosiNews(){
        PuluosiNewsExample puluosiNewsExample = new PuluosiNewsExample();
        return puluosiNewsMapper.selectByDesc();
    }
}
