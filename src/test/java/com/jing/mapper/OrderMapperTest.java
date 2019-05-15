package com.jing.mapper;

import com.jing.pojo.Order;
import com.jing.utils.DBUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Before;
import org.junit.Test;


public class OrderMapperTest {
    private OrderMapper orderMapper;

    @Before
    public void setUp() throws Exception {
        SqlSession sqlSession = DBUtil.getSqlSession();
        orderMapper = sqlSession.getMapper(OrderMapper.class);
    }

    @Test
    public void queryOrderAndUserByOrderNumber() {
        Order order = orderMapper.queryOrderAndUserByOrderNumber("20140921003");
        System.out.println(order);
    }

    @Test
    public void queryOrderAndUserAndOrderdetailByOrderNumber(){
        Order order = orderMapper.queryOrderAndUserAndOrderdetailByOrderNumber("20140921001");
        System.out.println(order);
    }

    @Test
    public void queryOrderAndUserAndOrderdetailAndUserByOrderNumber(){
        Order order = orderMapper.queryOrderAndUserAndOrderdetailAndItemByOrderNumber("20140921001");
        System.out.println(order);
    }

    @Test
    public void queryOrderUserLazy(){
        Order order = orderMapper.queryOrderUserLazy("20140921001");
        System.out.println(order.getId()+"--------------"+order.getOrderNumber());
        System.out.println(order.getUser());
    }

}