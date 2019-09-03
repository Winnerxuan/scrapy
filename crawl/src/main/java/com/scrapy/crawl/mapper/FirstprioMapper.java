package com.scrapy.crawl.mapper;

import com.scrapy.crawl.entity.Firstprio;
import com.scrapy.crawl.entity.FirstprioExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FirstprioMapper {
    int countByExample(FirstprioExample example);

    int deleteByExample(FirstprioExample example);

    int deleteByPrimaryKey(String assettitle);

    int insert(Firstprio record);

    int insertSelective(Firstprio record);

    List<Firstprio> selectByExample(FirstprioExample example);

    Firstprio selectByPrimaryKey(String assettitle);

    int updateByExampleSelective(@Param("record") Firstprio record, @Param("example") FirstprioExample example);

    int updateByExample(@Param("record") Firstprio record, @Param("example") FirstprioExample example);

    int updateByPrimaryKeySelective(Firstprio record);

    int updateByPrimaryKey(Firstprio record);

    double areasum();
}