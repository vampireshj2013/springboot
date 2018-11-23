package com.country.test;

import com.Application;
import com.alibaba.fastjson.JSON;
import com.domain.country.entity.Country;
import com.domain.country.mapper.CountryMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import tk.mybatis.mapper.entity.Example;

/**
 * @author hzwanghaijiang
 * @version 2018/11/22.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class MyBatisPlusTest {

    @Autowired
    CountryMapper countryMapper;
    @Test
    public void test() {
        System.out.println(JSON.toJSONString(countryMapper.selectAll()));
    }
    @Test
    public void test2() {
        Country country = new Country();
        country.setCountryname("中国");
        Object o = countryMapper.select(country);
        System.out.println(JSON.toJSONString(o));
    }    @Test
    public void test3() {
        Example example = new Example(Country.class);
        example.setForUpdate(true);
        example.createCriteria().andGreaterThan("id", 100).andLessThan("id",151);
        example.or().andLessThan("id", 41);
        Object o = countryMapper.selectByExample(example);
        System.out.println(JSON.toJSONString(o));
    }


    @Test
    public void testUpdate() {
        Country country = countryMapper.selectByPrimaryKey(10011);
        country.setCountryname("China");
        countryMapper.updateByPrimaryKey(country);
    }
    @Test
    public void updateByPrimaryKeySelective() {
        Country country = new Country();
        country.setId(10011);
        country.setCountryname("China");
        countryMapper.updateByPrimaryKeySelective(country);
    }


}