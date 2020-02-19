package com.scrapy.crawl.mapper;

import com.scrapy.crawl.entity.Anbo;
import com.scrapy.crawl.entity.AnboExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AnboMapper {
    int countByExample(AnboExample example);

    int deleteByExample(AnboExample example);

    int deleteByPrimaryKey(String assetstitle);

    int insert(Anbo record);

    int insertSelective(Anbo record);

    List<Anbo> selectByExample(AnboExample example);

    Anbo selectByPrimaryKey(String assetstitle);

    int updateByExampleSelective(@Param("record") Anbo record, @Param("example") AnboExample example);

    int updateByExample(@Param("record") Anbo record, @Param("example") AnboExample example);

    int updateByPrimaryKeySelective(Anbo record);

    int updateByPrimaryKey(Anbo record);

    double areasum();
}