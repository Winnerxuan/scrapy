package com.scrapy.crawl.mapper;

import com.scrapy.crawl.entity.PuluosiNews;
import com.scrapy.crawl.entity.PuluosiNewsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PuluosiNewsMapper {
    int countByExample(PuluosiNewsExample example);

    int deleteByExample(PuluosiNewsExample example);

    int deleteByPrimaryKey(String newslink);

    int insert(PuluosiNews record);

    int insertSelective(PuluosiNews record);

    List<PuluosiNews> selectByExample(PuluosiNewsExample example);

    PuluosiNews selectByPrimaryKey(String newslink);

    int updateByExampleSelective(@Param("record") PuluosiNews record, @Param("example") PuluosiNewsExample example);

    int updateByExample(@Param("record") PuluosiNews record, @Param("example") PuluosiNewsExample example);

    int updateByPrimaryKeySelective(PuluosiNews record);

    int updateByPrimaryKey(PuluosiNews record);
}