package com.scrapy.crawl.controller;

import com.scrapy.crawl.mapper.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.*;
@Controller
@Api(value = "面积加和")
public class SumController {
    @Resource
    private AnboMapper anboMapper;
    @Resource
    private EsrAssetMapper esrAssetMapper;
    @Resource
    private FengshuAssetMapper fengshuAssetMapper;
    @Resource
    private JiaminAssetMapper jiaminAssetMapper;
    @Resource
    private PuluosiAssetsMapper puluosiAssetsMapper;
    @Resource
    private WanweiYuanquMapper wanweiYuanquMapper;
    @Resource
    private WeilongYuanquMapper weilongYuanquMapper;

    @RequestMapping(value = "/area",method = RequestMethod.POST)
    @ApiOperation(value = "面积加和",notes = "面积加和")
    @ResponseBody
    public List<LinkedHashMap> sumarea(){
        List<LinkedHashMap> areaList = new LinkedList();
        LinkedHashMap<String, Object> map1 = new LinkedHashMap<>();
        LinkedHashMap<String, Object> map2 = new LinkedHashMap<>();
        LinkedHashMap<String, Object> map3 = new LinkedHashMap<>();
        LinkedHashMap<String, Object> map4 = new LinkedHashMap<>();
        LinkedHashMap<String, Object> map5 = new LinkedHashMap<>();
        LinkedHashMap<String, Object> map6 = new LinkedHashMap<>();
        LinkedHashMap<String, Object> map7 = new LinkedHashMap<>();
        map1.put("name", "安博");
        map1.put("area", anboMapper.areasum());
        areaList.add(map1);
        map2.put("name","ESR");
        map2.put("area",esrAssetMapper.areasum());
        areaList.add(map2);
        map3.put("name","丰树");
        map3.put("area",fengshuAssetMapper.areasum());
        areaList.add(map3);
        map4.put("name","嘉民");
        map4.put("area",jiaminAssetMapper.areasum());
        areaList.add(map4);
        map5.put("name","普洛斯");
        map5.put("area",puluosiAssetsMapper.areasum());
        areaList.add(map5);
        map6.put("name","万玮");
        map6.put("area",wanweiYuanquMapper.areasum());
        areaList.add(map6);
        map7.put("name","维龙");
        map7.put("area",weilongYuanquMapper.areasum());
        areaList.add(map7);
        return areaList;
    }
}
