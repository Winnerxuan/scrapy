package com.scrapy.crawl.mapper;

import com.scrapy.crawl.entity.WanweiNews;
import com.scrapy.crawl.entity.WanweiNewsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface WanweiNewsMapper {
    int countByExample(WanweiNewsExample example);

    int deleteByExample(WanweiNewsExample example);

    int deleteByPrimaryKey(String newstitle);

    int insert(WanweiNews record);

    int insertSelective(WanweiNews record);

    List<WanweiNews> selectByExample(WanweiNewsExample example);

    WanweiNews selectByPrimaryKey(String newstitle);

    int updateByExampleSelective(@Param("record") WanweiNews record, @Param("example") WanweiNewsExample example);

    int updateByExample(@Param("record") WanweiNews record, @Param("example") WanweiNewsExample example);

    int updateByPrimaryKeySelective(WanweiNews record);

    int updateByPrimaryKey(WanweiNews record);

    List<WanweiNews> selectByDesc();
}