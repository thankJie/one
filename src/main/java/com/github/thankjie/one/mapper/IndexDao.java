package com.github.thankjie.one.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface IndexDao {

    @Select("select * from one")
    String one();
}
