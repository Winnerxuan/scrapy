package com.scrapy.crawl.mapper;

import com.scrapy.crawl.entity.WeilongNews;
import com.scrapy.crawl.entity.WeilongNewsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WeilongNewsMapper {
    int countByExample(WeilongNewsExample example);

    int deleteByExample(WeilongNewsExample example);

    int deleteByPrimaryKey(String url);

    int insert(WeilongNews record);

    int insertSelective(WeilongNews record);

    List<WeilongNews> selectByExample(WeilongNewsExample example);

    WeilongNews selectByPrimaryKey(String url);

    int updateByExampleSelective(@Param("record") WeilongNews record, @Param("example") WeilongNewsExample example);

    int updateByExample(@Param("record") WeilongNews record, @Param("example") WeilongNewsExample example);

    int updateByPrimaryKeySelective(WeilongNews record);

    int updateByPrimaryKey(WeilongNews record);

    List<WeilongNews> selectByDesc();
}