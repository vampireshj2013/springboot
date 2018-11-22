package com.mybatis.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.alibaba.fastjson.JSON;

import hello.Application;
import hello.domain.book.BookMapper;
import hello.domain.user.UserMapper;

/**
 * @author hzwanghaijiang
 * @version 2018/11/22.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class MyBatisPlusTest {

    @Autowired
    private BookMapper bookMapper;
    @Autowired
    private UserMapper userMapper;

    @Test
    public void test() {
        System.out.println(JSON.toJSONString(bookMapper.queryBookById(1)));
        System.out.println(JSON.toJSONString(userMapper.queryUserById(1)));
    }
}
