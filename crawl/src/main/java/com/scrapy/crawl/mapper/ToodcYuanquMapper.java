package com.scrapy.crawl.mapper;

import com.scrapy.crawl.entity.ToodcYuanqu;
import com.scrapy.crawl.entity.ToodcYuanquExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ToodcYuanquMapper {
    int countByExample(ToodcYuanquExample example);

    int deleteByExample(ToodcYuanquExample example);

    int deleteByPrimaryKey(String url);

    int insert(ToodcYuanqu record);

    int insertSelective(ToodcYuanqu record);

    List<ToodcYuanqu> selectByExample(ToodcYuanquExample example);

    ToodcYuanqu selectByPrimaryKey(String url);

    int updateByExampleSelective(@Param("record") ToodcYuanqu record, @Param("example") ToodcYuanquExample example);

    int updateByExample(@Param("record") ToodcYuanqu record, @Param("example") ToodcYuanquExample example);

    int updateByPrimaryKeySelective(ToodcYuanqu record);

    int updateByPrimaryKey(ToodcYuanqu record);
}