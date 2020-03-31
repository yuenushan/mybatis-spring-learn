package com.example.cj.mybatis.spring.dao.impl;

import com.example.cj.mybatis.spring.dao.UserDao;
import com.example.cj.mybatis.spring.po.User;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class UserDaoImplTest {

    private ApplicationContext applicationContext;

    //在setUp这个方法得到spring容器
    @Before
    public void setUp() throws Exception {
        applicationContext = new ClassPathXmlApplicationContext("classpath:spring/applicationContext.xml");
    }

    @Test
    public void testFindUserById() throws Exception {
        // 创建UserDao的对象
        UserDao userDao = (UserDao)applicationContext.getBean("userDao");

        // 调用UserDao的方法
        User user = userDao.findUserById(1);

        System.out.println(user);
    }
}