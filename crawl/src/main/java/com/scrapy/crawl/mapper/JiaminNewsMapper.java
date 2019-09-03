package com.scrapy.crawl.mapper;

import com.scrapy.crawl.entity.JiaminNews;
import com.scrapy.crawl.entity.JiaminNewsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

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
}