package com.example.demo4.dao;


import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
public interface TestMapper {
    String getOne();
}
