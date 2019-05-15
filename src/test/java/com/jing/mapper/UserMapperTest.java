package com.jing.mapper;


import com.jing.pojo.User;
import com.jing.utils.DBUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.InputStream;
import java.util.Date;
import java.util.List;


public class UserMapperTest {
    private UserMapper userMapper;

    @Before
    public void setUp() throws Exception {
        SqlSession sqlSession = DBUtil.getSqlSession();
        userMapper = sqlSession.getMapper(UserMapper.class);
    }

    @Test
    public void queryUserById() {
        User user = userMapper.queryUserById(1l);
        System.out.println(user);
    }

    @Test
    public void queryUserList() {
        List<User> userList = userMapper.queryUserList();
        for (User user : userList) {
            System.out.println(user);
        }
    }

    @Test
    public void insertUser() {
        User user = new User();
        user.setAge(16);
        user.setBirthday(new Date());
        user.setName("靖哥");
        user.setPassword("123");
        user.setSex(1);
        user.setUserName("哈哈");
        userMapper.insertUser(user);

    }

    @Test
    public void updateUser() {
        User user = userMapper.queryUserById(8l);
        user.setName("丫头");
        userMapper.updateUser(user);
    }

    @Test
    public void deleteUserById() {
        userMapper.deleteUserById(7l);
    }
}