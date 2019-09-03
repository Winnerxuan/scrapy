package com.scrapy.crawl.mapper;

import com.scrapy.crawl.entity.WanweiYuanqu;
import com.scrapy.crawl.entity.WanweiYuanquExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WanweiYuanquMapper {
    int countByExample(WanweiYuanquExample example);

    int deleteByExample(WanweiYuanquExample example);

    int deleteByPrimaryKey(String name);

    int insert(WanweiYuanqu record);

    int insertSelective(WanweiYuanqu record);

    List<WanweiYuanqu> selectByExample(WanweiYuanquExample example);

    WanweiYuanqu selectByPrimaryKey(String name);

    int updateByExampleSelective(@Param("record") WanweiYuanqu record, @Param("example") WanweiYuanquExample example);

    int updateByExample(@Param("record") WanweiYuanqu record, @Param("example") WanweiYuanquExample example);

    int updateByPrimaryKeySelective(WanweiYuanqu record);

    int updateByPrimaryKey(WanweiYuanqu record);

    double areasum();
}