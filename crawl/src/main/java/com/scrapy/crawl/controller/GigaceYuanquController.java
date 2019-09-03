package com.scrapy.crawl.controller;


import com.scrapy.crawl.entity.GigaceYuanqu;
import com.scrapy.crawl.entity.GigaceYuanquExample;
import com.scrapy.crawl.mapper.GigaceYuanquMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@Api(value = "极址网仓库数据",description = "极址网仓库数据")
@RequestMapping
public class GigaceYuanquController {
    @Resource
    private GigaceYuanquMapper gigaceYuanquMapper;

    @RequestMapping(value = "/getGigaceYuanqu",method = RequestMethod.POST)
    @ApiOperation(value = "极址网仓库数据",notes = "极址网仓库数据")
    @ResponseBody
    public List<GigaceYuanqu> GigaceYuanqu(){
        GigaceYuanquExample gigaceYuanquExample  = new GigaceYuanquExample();
        return gigaceYuanquMapper.selectByExample(gigaceYuanquExample);
    }

}
