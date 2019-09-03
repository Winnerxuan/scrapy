package com.scrapy.crawl.mapper;

import com.scrapy.crawl.entity.GigaceYuanqu;
import com.scrapy.crawl.entity.GigaceYuanquExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GigaceYuanquMapper {
    int countByExample(GigaceYuanquExample example);

    int deleteByExample(GigaceYuanquExample example);

    int insert(GigaceYuanqu record);

    int insertSelective(GigaceYuanqu record);

    List<GigaceYuanqu> selectByExample(GigaceYuanquExample example);

    int updateByExampleSelective(@Param("record") GigaceYuanqu record, @Param("example") GigaceYuanquExample example);

    int updateByExample(@Param("record") GigaceYuanqu record, @Param("example") GigaceYuanquExample example);
}