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
     * @return void
     * @Description //TODO 新增用户
     * @Date 16:54 2019/5/12
     * @Param [user]
     **/
    public void insertUser(User user);

    /**
     * @return void
     * @Description //TODO 修改用户
     * @Date 16:56 2019/5/12
     * @Param [user]
     **/
    public void updateUser(User user);

    /**
     * @return void
     * @Description //TODO 根据id删除用户
     * @Date 16:57 2019/5/12
     * @Param [id]
     **/
    public void deleteUserById(Long id);

    /**
     * @param userName
     * @return java.util.List<com.jing.pojo.User>
     * @Description //TODO 通过用户名进行模糊查询,如果没有用户名，查询所有男性用户
     * @Date 15:05 2019/5/15
     **/
    public List<User> queryUsersLikeUserName(@Param("userName") String userName);


    /**
     * @param userName
     * @param age
     * @return java.util.List<com.jing.pojo.User>
     * @Description //TODO 根据用户名或者年龄查找男性用户，如果有用户名就按用户名查找，否则按年龄查找，如果都没有，就查询名字是zhangsan的男性用户
     * @Date 15:27 2019/5/15
     **/
    public List<User> queryUserListByUserNameOrAge(@Param("userName") String userName, @Param("age") Integer age);


    /**
     * @Description //TODO 根据用户名和年龄查找用户
     * @Date 15:50 2019/5/15
     * @param userName
     * @param age
     * @return java.util.List<com.jing.pojo.User>
     **/
    public List<User> queryUserListByUserNameAndAge(@Param("userName") String userName, @Param("age") Integer age);

    /**
     * @Description //TODO 修改用户
     * @Date 15:51 2019/5/15
     * @param user
     * @return void
     **/
    public void updateUserSelective(User user);

    /**
     * @Description //TODO 根据多个id查询用户信息
     * @Date 16:12 2019/5/15
     * @param ids
     * @return java.util.List<com.jing.pojo.User>
     **/
    public List<User> queryUserListByIds(@Param("ids") Long[] ids);
}
