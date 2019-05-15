package com.jing.dao.impl;

import com.jing.dao.UserDao;
import com.jing.pojo.User;
import com.jing.utils.DBUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * @ClassName:UserDaoImpl
 * @Description TODO
 * @author:RanMoAnRan
 * @Date:2019/5/12 15:54
 * @Version 1.0
 */
public class UserDaoImpl implements UserDao {
    private SqlSession sqlSession = DBUtil.getSqlSession();
    

    /**
     * @Description //TODO 
     * @Date 23:09 2019/5/13
     * @param id
     * @return com.jing.pojo.User
     **/
    @Override
    public User queryUserById(Long id) {
        return sqlSession.selectOne("UserDaoMapper.queryUserById", id);
    }

    /**
     * @Description //TODO 
     * @Date 23:09 2019/5/13
     * @param 
     * @return java.util.List<com.jing.pojo.User>
     **/
    @Override
    public List<User> queryUserList() {
        return sqlSession.selectList("UserDaoMapper.queryall");
    }

    /**
     * @Description //TODO 
     * @Date 23:09 2019/5/13
     * @param user
     * @return void
     **/
    @Override
    public void insertUser(User user) {
        sqlSession.insert("UserDaoMapper.insertUser", user);
        //sqlSession.commit();
    }

    /**
     * @Description //TODO 
     * @Date 23:09 2019/5/13
     * @param user
     * @return void
     **/
    @Override
    public void updateUser(User user) {
        sqlSession.update("UserDaoMapper.updateUser", user);
        // sqlSession.commit();
    }

    /**
     * @Description //TODO 
     * @Date 23:09 2019/5/13
     * @param id
     * @return void
     **/
    @Override
    public void deleteUserById(Long id) {
        sqlSession.delete("UserDaoMapper.deleteUserById", id);
        //提交事务
        // sqlSession.commit();
    }
}
