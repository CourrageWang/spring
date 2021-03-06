package com.xiyou.java.mybatis.dao;

import com.xiyou.java.mybatis.bean.User;

import java.util.List;

/**
 * 用户持久层接口
 */
public interface IUserDao {

    /**
     *  查询所有用户
     * @return
     */
    List<User> findAll();
}