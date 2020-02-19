package com.scrapy.crawl.mapper;

import com.scrapy.crawl.entity.Firstprio;
import com.scrapy.crawl.entity.FirstprioExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FirstprioMapper {
    int countByExample(FirstprioExample example);

    int deleteByExample(FirstprioExample example);

    int deleteByPrimaryKey(String assetstitle);

    int insert(Firstprio record);

    int insertSelective(Firstprio record);

    List<Firstprio> selectByExample(FirstprioExample example);

    Firstprio selectByPrimaryKey(String assetstitle);

    int updateByExampleSelective(@Param("record") Firstprio record, @Param("example") FirstprioExample example);

    int updateByExample(@Param("record") Firstprio record, @Param("example") FirstprioExample example);

    int updateByPrimaryKeySelective(Firstprio record);

    int updateByPrimaryKey(Firstprio record);

    double areasum();
}