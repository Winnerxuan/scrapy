package com.scrapy.crawl.mapper;

import com.scrapy.crawl.entity.JiaminNews;
import com.scrapy.crawl.entity.JiaminNewsExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface JiaminNewsMapper {
    int countByExample(JiaminNewsExample example);

    int deleteByExample(JiaminNewsExample example);

    int deleteByPrimaryKey(String newslink);

    int insert(JiaminNews record);

    int insertSelective(JiaminNews record);

    List<JiaminNews> selectByExample(JiaminNewsExample example);

    JiaminNews selectByPrimaryKey(String newslink);

    int updateByExampleSelective(@Param("record") JiaminNews record, @Param("example") JiaminNewsExample example);

    int updateByExample(@Param("record") JiaminNews record, @Param("example") JiaminNewsExample example);

    int updateByPrimaryKeySelective(JiaminNews record);

    int updateByPrimaryKey(JiaminNews record);

    List<JiaminNews> selectByDesc();
}