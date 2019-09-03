package com.scrapy.crawl.mapper;

import com.scrapy.crawl.entity.EsrAsset;
import com.scrapy.crawl.entity.EsrAssetExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EsrAssetMapper {
    int countByExample(EsrAssetExample example);

    int deleteByExample(EsrAssetExample example);

    int deleteByPrimaryKey(String assetstitle);

    int insert(EsrAsset record);

    int insertSelective(EsrAsset record);

    List<EsrAsset> selectByExample(EsrAssetExample example);

    EsrAsset selectByPrimaryKey(String assetstitle);

    int updateByExampleSelective(@Param("record") EsrAsset record, @Param("example") EsrAssetExample example);

    int updateByExample(@Param("record") EsrAsset record, @Param("example") EsrAssetExample example);

    int updateByPrimaryKeySelective(EsrAsset record);

    int updateByPrimaryKey(EsrAsset record);

    double areasum();
}