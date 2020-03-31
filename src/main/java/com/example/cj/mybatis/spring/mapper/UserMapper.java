package com.example.cj.mybatis.spring.mapper;

import com.example.cj.mybatis.spring.po.User;

public interface UserMapper {
    //根据id查询用户信息
    User findUserById(int id) throws Exception;
}
