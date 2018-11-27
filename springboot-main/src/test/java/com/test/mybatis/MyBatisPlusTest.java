package com.test.mybatis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.alibaba.fastjson.JSON;

import com.Application;
import com.domain.book.BookMapper;
import com.domain.user.UserMapper;

/**
 * @author hzwanghaijiang
 * @version 2018/11/22.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MyBatisPlusTest {

//    @Autowired
//    private BookMapper bookMapper;
    @Autowired
    private UserMapper userMapper;

    @Test
    public void test() {
//        System.out.println(JSON.toJSONString(bookMapper.queryBookById(1)));
        System.out.println(JSON.toJSONString(userMapper.queryUserById(1)));
    }
}
