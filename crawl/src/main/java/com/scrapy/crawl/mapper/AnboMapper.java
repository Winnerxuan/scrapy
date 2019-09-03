package com.scrapy.crawl.mapper;

import com.scrapy.crawl.entity.Anbo;
import com.scrapy.crawl.entity.AnboExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AnboMapper {
    int countByExample(AnboExample example);

    int deleteByExample(AnboExample example);

    int deleteByPrimaryKey(String name);

    int insert(Anbo record);

    int insertSelective(Anbo record);

    List<Anbo> selectByExample(AnboExample example);

    Anbo selectByPrimaryKey(String name);

    int updateByExampleSelective(@Param("record") Anbo record, @Param("example") AnboExample example);

    int updateByExample(@Param("record") Anbo record, @Param("example") AnboExample example);

    int updateByPrimaryKeySelective(Anbo record);

    int updateByPrimaryKey(Anbo record);

    double areasum();
}