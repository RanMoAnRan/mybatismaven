package com.jing.mapper;

import com.jing.pojo.Order;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName:OrderMapper
 * @Description TODO 订单表接口
 * @author:RanMoAnRan
 * @Date:2019/5/15 16:42
 * @Version 1.0
 */
public interface OrderMapper {
    /**
     * @param orderNumber 订单编号
     * @return com.jing.pojo.Order
     * @Description //TODO 通过订单编号查询订单和用户
     * @Date 16:44 2019/5/15
     **/
    public Order queryOrderAndUserByOrderNumber(@Param("orderNumber") String orderNumber);


    /**
     * @param orderNumber
     * @return com.jing.pojo.Order
     * @Description //TODO 过订单编号查询订单、用户和订单详情
     * @Date 18:35 2019/5/15
     **/
    public Order queryOrderAndUserAndOrderdetailByOrderNumber(@Param("orderNumber") String orderNumber);

    /**
     * @param orderNumber
     * @return com.jing.pojo.Order
     * @Description //TODO 通过订单编号查询订单、用户和订单详情以及商品
     * @Date 19:30 2019/5/15
     **/
    public Order queryOrderAndUserAndOrderdetailAndItemByOrderNumber(@Param("orderNumber") String orderNumber);

    /**
     * @param orderNumber
     * @return com.jing.pojo.Order
     * @Description //TODO 延迟加载
     * @Date 19:44 2019/5/15
     **/
    public Order queryOrderUserLazy(@Param("orderNumber") String orderNumber);

}
