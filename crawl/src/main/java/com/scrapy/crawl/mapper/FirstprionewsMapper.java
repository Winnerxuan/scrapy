package com.scrapy.crawl.mapper;

import com.scrapy.crawl.entity.Firstprionews;
import com.scrapy.crawl.entity.FirstprionewsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FirstprionewsMapper {
    int countByExample(FirstprionewsExample example);

    int deleteByExample(FirstprionewsExample example);

    int deleteByPrimaryKey(String newstitle);

    int insert(Firstprionews record);

    int insertSelective(Firstprionews record);

    List<Firstprionews> selectByExample(FirstprionewsExample example);

    Firstprionews selectByPrimaryKey(String newstitle);

    int updateByExampleSelective(@Param("record") Firstprionews record, @Param("example") FirstprionewsExample example);

    int updateByExample(@Param("record") Firstprionews record, @Param("example") FirstprionewsExample example);

    int updateByPrimaryKeySelective(Firstprionews record);

    int updateByPrimaryKey(Firstprionews record);
}