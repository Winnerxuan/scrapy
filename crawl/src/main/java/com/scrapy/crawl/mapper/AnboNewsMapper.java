package com.scrapy.crawl.mapper;

import com.scrapy.crawl.entity.AnboNews;
import com.scrapy.crawl.entity.AnboNewsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AnboNewsMapper {
    int countByExample(AnboNewsExample example);

    int deleteByExample(AnboNewsExample example);

    int deleteByPrimaryKey(String newstitle);

    int insert(AnboNews record);

    int insertSelective(AnboNews record);

    List<AnboNews> selectByExample(AnboNewsExample example);

    AnboNews selectByPrimaryKey(String newstitle);

    int updateByExampleSelective(@Param("record") AnboNews record, @Param("example") AnboNewsExample example);

    int updateByExample(@Param("record") AnboNews record, @Param("example") AnboNewsExample example);

    int updateByPrimaryKeySelective(AnboNews record);

    int updateByPrimaryKey(AnboNews record);

    List<AnboNews> selectByDesc();
}