package com.scrapy.crawl.mapper;

import com.scrapy.crawl.entity.EsrNews;
import com.scrapy.crawl.entity.EsrNewsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EsrNewsMapper {
    int countByExample(EsrNewsExample example);

    int deleteByExample(EsrNewsExample example);

    int deleteByPrimaryKey(String newstitle);

    int insert(EsrNews record);

    int insertSelective(EsrNews record);

    List<EsrNews> selectByExample(EsrNewsExample example);

    EsrNews selectByPrimaryKey(String newstitle);

    int updateByExampleSelective(@Param("record") EsrNews record, @Param("example") EsrNewsExample example);

    int updateByExample(@Param("record") EsrNews record, @Param("example") EsrNewsExample example);

    int updateByPrimaryKeySelective(EsrNews record);

    int updateByPrimaryKey(EsrNews record);
}