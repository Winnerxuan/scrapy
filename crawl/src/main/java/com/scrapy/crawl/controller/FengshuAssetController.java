package com.scrapy.crawl.controller;


import com.scrapy.crawl.entity.FengshuAsset;
import com.scrapy.crawl.entity.FengshuAssetExample;
import com.scrapy.crawl.mapper.FengshuAssetMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@Api(value = "丰树园区信息",description = "丰树园区信息")
@RequestMapping("")
public class FengshuAssetController {
    @Resource
    private FengshuAssetMapper fengshuAssetMapper;

    @RequestMapping(value = "/getFengshuAsset",method = RequestMethod.POST)
    @ApiOperation(value = "丰树园区信息",notes = "丰树园区信息")
    @ResponseBody
    public List<FengshuAsset> fengshuAssets(){
        FengshuAssetExample fengshuAssetExample = new FengshuAssetExample();
        return fengshuAssetMapper.selectByExample(fengshuAssetExample);
    }

    @RequestMapping(value = "/selectFengshuAsset",method = RequestMethod.POST)
    @ApiOperation(value = "按主键查询",notes = "丰树园区信息")
    @ResponseBody
    public FengshuAsset selectbyid(String name){
        return fengshuAssetMapper.selectByPrimaryKey(name);
    }
}
