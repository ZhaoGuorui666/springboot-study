package com.example.demo4.service.impl;

import com.example.demo4.dao.TestMapper;
import com.example.demo4.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TestServiceImpl implements TestService {
    @Autowired
    TestMapper testMapper;

    @Override
    public String getOne() {
        System.out.println("进来impl了!");
        return testMapper.getOne();
    }
}
