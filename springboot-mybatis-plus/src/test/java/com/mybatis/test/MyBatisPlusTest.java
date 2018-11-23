package com.mybatis.test;

import com.alibaba.fastjson.JSON;
import hello.Application;
import hello.domain.user.service.IUserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author hzwanghaijiang
 * @version 2018/11/22.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class MyBatisPlusTest {

    @Autowired
    private IUserService iUserService;

    @Test
    public void test() {
        System.out.println(JSON.toJSONString(iUserService.getById(1)));
    }


}