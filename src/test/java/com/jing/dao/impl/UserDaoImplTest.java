package com.jing.dao.impl;

import com.jing.dao.UserDao;
import com.jing.pojo.User;
import com.jing.utils.DBUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

public class UserDaoImplTest {
    private UserDao userDao;

    @Before
    public void setUp() throws Exception {
        userDao = new UserDaoImpl();
    }

    @Test
    public void queryUserById() {
        User user = userDao.queryUserById(1l);
        System.out.println(user);
    }

    @Test
    public void queryUserList() {
        List<User> userList = userDao.queryUserList();
        System.out.println(userList);
    }

    @Test
    public void insertUser() {
        User user = new User();
        user.setAge(16);
        user.setBirthday(new Date());
        user.setName("柳岩111");
        user.setPassword("123");
        user.setSex(1);
        user.setUserName("哈哈");
        userDao.insertUser(user);

    }

    @Test
    public void updateUser() {
        User user = userDao.queryUserById(8l);
        user.setName("丫头");
        userDao.updateUser(user);
    }

    @Test
    public void deleteUserById() {
        userDao.deleteUserById(7l);
    }
}