package com.jing.dao;

import com.jing.pojo.User;

import java.util.List;

/**
 * @ClassName:UserDao
 * @Description TODO
 * @author:RanMoAnRan
 * @Date:2019/5/12 15:53
 * @Version 1.0
 */
public interface UserDao {
   /**
    * @Description //TODO 根据id获取用户信息
    * @Date 23:03 2019/5/13
    * @param id
    * @return com.jing.pojo.User
    **/
    public User queryUserById(Long id);

   /**
    * @Description //TODO
    * @Date 23:05 2019/5/13
    * @param
    * @return java.util.List<com.jing.pojo.User>
    **/
    public List<User> queryUserList();

    /**
     * @Description //TODO 新增用户
     * @Date 23:01 2019/5/13
     * @param user
     * @return void
     **/

    public void insertUser(User user);

    /**
     * @Description //TODO 修改用户
     * @Date 23:01 2019/5/13
     * @param user
     * @return void
     **/
    public void updateUser(User user);

    /**
     * @Description //TODO 删除用户
     * @Date 23:01 2019/5/13
     * @param id
     * @return void
     **/
    public void deleteUserById(Long id);
    
}
