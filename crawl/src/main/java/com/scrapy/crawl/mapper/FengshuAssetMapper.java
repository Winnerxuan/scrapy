package com.scrapy.crawl.mapper;

import com.scrapy.crawl.entity.FengshuAsset;
import com.scrapy.crawl.entity.FengshuAssetExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FengshuAssetMapper {
    int countByExample(FengshuAssetExample example);

    int deleteByExample(FengshuAssetExample example);

    int deleteByPrimaryKey(String assettitle);

    int insert(FengshuAsset record);

    int insertSelective(FengshuAsset record);

    List<FengshuAsset> selectByExample(FengshuAssetExample example);

    FengshuAsset selectByPrimaryKey(String assettitle);

    int updateByExampleSelective(@Param("record") FengshuAsset record, @Param("example") FengshuAssetExample example);

    int updateByExample(@Param("record") FengshuAsset record, @Param("example") FengshuAssetExample example);

    int updateByPrimaryKeySelective(FengshuAsset record);

    int updateByPrimaryKey(FengshuAsset record);

    double areasum();
}