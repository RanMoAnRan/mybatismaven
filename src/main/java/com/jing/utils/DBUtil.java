package com.jing.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @ClassName:DBUtil
 * @Description TODO
 * @author:RanMoAnRan
 * @Date:2019/5/12 15:35
 * @Version 1.0
 */
public class DBUtil {
    private static InputStream inputStream ;
    private static SqlSessionFactory sqlSessionFactory;
    public static SqlSession getSqlSession() {
        //获取全局配置文件输入流

        try {
            inputStream = Resources.getResourceAsStream("mybatis-config.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        //加载全局配置文件
         sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        //获取sqlSession 设置自动提交
        return sqlSessionFactory.openSession(true);
    }
}
