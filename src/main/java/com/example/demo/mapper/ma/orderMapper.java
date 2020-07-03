package com.example.demo.mapper.ma;

import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

//映射类，用来操作数据库
@Mapper //用这个知道他是映射类，自动产生对象，执行相关操作
public interface orderMapper {
    //表里面的数据有很多行，用list来做
    //用map以列表作为对，列表作为value
    //数据库相关语言从那个软件设计好后直接复制过来就好 不用硬写
    @Select("select * from order_info")
    public List<Map<String,Object>> findAll();

    /**
     * #{n} 表示一个占位符，用于通过变量赋值
     * @param id
     * @return
     *
     */
    @Select("select * from order_info where order_id=#{n}")
    public Map<String,Object> findById(int id);



    //插入数据 有什么内容就要插什么
    //从上面的变成下面的,传递一个map,map里用string是因为从页面传过来的数据都是string类型的
    //public void insert(String name,String sex,int id)
    @Insert("insert into order_info(order_id,address_id,cart_id,order_number,time,state,type,goods_id,user_id,amount)" +
            "value(#{order.order_id},#{order.address_id},#{order.cart_id},#{order.order_number},#{order.time},#{order.state},#{order.type},#{order.goods_id},#{order.user_id},#{order.amount})")
    public int insert(@Param("order") Map<String, String> order);//@Param("tea") 表示参数的别名，在sql语句中使用




    //如果想通过传入表名来找到表中信息，可用${table}来赋值给table
    //通过id删除订单
    @Delete("delete from order_info where order_id=#{id}")
    public int delete(int id);

    @Select("select * from order_info where user_id=#{n}")
    public List<Map<String,Object>> findByuser_Id(int id);
}
