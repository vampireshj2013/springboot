package com.domain.book;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface BookMapper {

    Book queryBookById(@Param("id") long id);
}
