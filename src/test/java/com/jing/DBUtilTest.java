package com.jing;

import com.jing.pojo.User;
import com.jing.utils.DBUtil;
import org.apache.ibatis.cursor.Cursor;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @ClassName:DBUtilTest
 * @Description TODO
 * @author:RanMoAnRan
 * @Date:2019/5/12 15:39
 * @Version 1.0
 */
public class DBUtilTest {

    @Test
    public void test(){
        //获取sqlSession
        SqlSession sqlSession = DBUtil.getSqlSession();

        //根据id查询一个用户
        User user = sqlSession.selectOne("UserMapper.queryUserById", 1l);
        System.out.println(user);
        System.out.println("--------------");
        //查询所有用户
        List<User> userlist = sqlSession.selectList("UserMapper.queryall");
        for (User user1 : userlist) {
            System.out.println(user1);
        }
    }
}
