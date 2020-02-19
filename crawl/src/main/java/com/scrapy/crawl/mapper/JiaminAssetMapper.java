package com.scrapy.crawl.mapper;

import com.scrapy.crawl.entity.JiaminAsset;
import com.scrapy.crawl.entity.JiaminAssetExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface JiaminAssetMapper {
    int countByExample(JiaminAssetExample example);

    int deleteByExample(JiaminAssetExample example);

    int deleteByPrimaryKey(String assetstitle);

    int insert(JiaminAsset record);

    int insertSelective(JiaminAsset record);

    List<JiaminAsset> selectByExample(JiaminAssetExample example);

    JiaminAsset selectByPrimaryKey(String assetstitle);

    int updateByExampleSelective(@Param("record") JiaminAsset record, @Param("example") JiaminAssetExample example);

    int updateByExample(@Param("record") JiaminAsset record, @Param("example") JiaminAssetExample example);

    int updateByPrimaryKeySelective(JiaminAsset record);

    int updateByPrimaryKey(JiaminAsset record);

    double areasum();
}