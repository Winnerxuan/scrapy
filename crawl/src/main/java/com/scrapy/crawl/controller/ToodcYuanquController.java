package com.scrapy.crawl.controller;

import com.scrapy.crawl.entity.ToodcYuanqu;
import com.scrapy.crawl.entity.ToodcYuanquExample;
import com.scrapy.crawl.mapper.ToodcYuanquMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@Api(value = "头等仓仓库信息",description = "头等仓仓库信息")
@RequestMapping("")
public class ToodcYuanquController {
    @Resource
    private ToodcYuanquMapper toodcYuanquMapper;
    @RequestMapping(value = "/getToodc",method = RequestMethod.POST)
    @ApiOperation(value = "头等仓仓库信息",notes = "头等仓仓库信息")
    @ResponseBody
    public List<ToodcYuanqu> ToodcYuanqu(){
        ToodcYuanquExample toodcYuanquExample = new ToodcYuanquExample();
        return toodcYuanquMapper.selectByExample(toodcYuanquExample);
    }

}
