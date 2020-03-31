package com.example.cj.mybatis.spring.dao.impl;

import com.example.cj.mybatis.spring.dao.UserDao;
import com.example.cj.mybatis.spring.po.User;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {
    @Override
    public User findUserById(int id) throws Exception {
        //继承SqlSessionDaoSupport，通过this.getSqlSession()得到sqlSessoin
        SqlSession sqlSession = this.getSqlSession();
        return sqlSession.selectOne("test.findUserById",id);
    }
}
