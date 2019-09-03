package com.scrapy.crawl.mapper;

import com.scrapy.crawl.entity.WeilongYuanqu;
import com.scrapy.crawl.entity.WeilongYuanquExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WeilongYuanquMapper {
    int countByExample(WeilongYuanquExample example);

    int deleteByExample(WeilongYuanquExample example);

    int deleteByPrimaryKey(String name);

    int insert(WeilongYuanqu record);

    int insertSelective(WeilongYuanqu record);

    List<WeilongYuanqu> selectByExample(WeilongYuanquExample example);

    WeilongYuanqu selectByPrimaryKey(String name);

    int updateByExampleSelective(@Param("record") WeilongYuanqu record, @Param("example") WeilongYuanquExample example);

    int updateByExample(@Param("record") WeilongYuanqu record, @Param("example") WeilongYuanquExample example);

    int updateByPrimaryKeySelective(WeilongYuanqu record);

    int updateByPrimaryKey(WeilongYuanqu record);

    double areasum();
}