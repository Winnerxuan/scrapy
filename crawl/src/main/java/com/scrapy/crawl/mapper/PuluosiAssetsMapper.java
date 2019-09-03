package com.scrapy.crawl.mapper;

import com.scrapy.crawl.entity.PuluosiAssets;
import com.scrapy.crawl.entity.PuluosiAssetsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PuluosiAssetsMapper {
    int countByExample(PuluosiAssetsExample example);

    int deleteByExample(PuluosiAssetsExample example);

    int deleteByPrimaryKey(String asseturl);

    int insert(PuluosiAssets record);

    int insertSelective(PuluosiAssets record);

    List<PuluosiAssets> selectByExampleWithBLOBs(PuluosiAssetsExample example);

    List<PuluosiAssets> selectByExample(PuluosiAssetsExample example);

    PuluosiAssets selectByPrimaryKey(String asseturl);

    int updateByExampleSelective(@Param("record") PuluosiAssets record, @Param("example") PuluosiAssetsExample example);

    int updateByExampleWithBLOBs(@Param("record") PuluosiAssets record, @Param("example") PuluosiAssetsExample example);

    int updateByExample(@Param("record") PuluosiAssets record, @Param("example") PuluosiAssetsExample example);

    int updateByPrimaryKeySelective(PuluosiAssets record);

    int updateByPrimaryKeyWithBLOBs(PuluosiAssets record);

    int updateByPrimaryKey(PuluosiAssets record);

    double areasum();
}