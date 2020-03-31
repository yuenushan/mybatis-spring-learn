package com.example.cj.mybatis.spring.dao;

import com.example.cj.mybatis.spring.po.User;

public interface UserDao {
    //根据id查询用户信息
    public User findUserById(int id) throws Exception;
}