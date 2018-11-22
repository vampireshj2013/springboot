package com.mybatis.test;

import java.util.List;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import hello.Application;
import hello.domain.user.User;
import hello.domain.user.UserMapper;

/**
 * @author hzwanghaijiang
 * @version 2018/11/22.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class MyBatisPlusTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        List<User> userList = userMapper.selectList(null);
        Assert.assertEquals(5, userList.size());
        userList.forEach(System.out::println);
    }
}
