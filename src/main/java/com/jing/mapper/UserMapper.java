package com.jing.mapper;

import com.jing.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ClassName:UserDao
 * @Description TODO   通过接口使mybaties自动创建代理Mapper实现增删该查，不用自己写实现类
 * @author:RanMoAnRan
 * @Date:2019/5/12 15:53
 * @Version 1.0
 */
public interface UserMapper {
    /**
     * @return com.jing.pojo.User
     * @Description //TODO 根据id获取用户信息
     * @Date 16:13 2019/5/12
     * @Param [id]
     **/
    public User queryUserById(@Param("id") Long id);

    /**
     * @return java.util.List<com.jing.pojo.User>
     * @Description //TODO 查询所有用户信息
     * @Date 16:16 2019/5/12
     * @Param []
     **/
    public List<User> queryUserList();

    /**
     * @Description //TODO 新增用户
     * @Date 16:54 2019/5/12
     * @Param [user]
     * @return void
     **/
    public void insertUser(User user);

    /**
     * @Description //TODO 修改用户
     * @Date 16:56 2019/5/12
     * @Param [user]
     * @return void
     **/
    public void updateUser(User user);

    /**
     * @Description //TODO 根据id删除用户
     * @Date 16:57 2019/5/12
     * @Param [id]
     * @return void
     **/

    public void deleteUserById(Long id);
}
