package com.mapper;

import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

//映射类，用来操作数据库
@Mapper //用这个知道他是映射类，自动产生对象，执行相关操作
public interface marketMapper {
    //通过username获得cartID
    @Select("select cart_id from user_info where username=#{t.username}")
    public int getcartid(@Param("t") Map<String,String> map);

    @Select("select * from shoppingcart where cart_id=#{n}")
    public Map<String,Object> findById(int id);

    //  获取商品信息
    @Select("select * from goods_info where goods_id=#{n}")
    public Map<String,Object> findByGoodId(int id);

    @Delete("delete from goods_info where goods_id=#{id}")
    public int deleteGoods(int id);

    @Insert("insert into goods_info(price,state,name,amount,type1,type2,type3,type4,type5,type6,type7,type8,type9,imgurl)" +
            "value(#{good.price},#{good.state},#{good.name},#{good.amount},#{good.type1},#{good.type2},#{good.type3},#{good.type4},#{good.type5},#{good.type6},#{good.type7},#{good.type8},#{good.type9},#{good.imgurl})")
    public int insertGoods(@Param("good") Map<String, String> goods);//@Param("tea") 表示参数的别名，在sql语句中使用

    @Update("update goods_info" +
            " set price=#{a.price},state=#{a.state},name=#{a.name},amount=#{a.amount},type1=#{a.type1},type2=#{a.type2},type3=#{a.type3},type4=#{a.type4},type5=#{a.type5},type6=#{a.type6},type7=#{a.type7},type8=#{a.type8},type9=#{a.type9},imgurl=#{a.imgurl}" +
            " where goods_id=#{a.goods_id}")
    public int update(@Param("a") Map<String, String> map);


    /*添加第一个商品有关信息*/
    @Update("update shoppingcart" +
            " set goods_id1=#{a.goods_id1},count1=#{a.count1},totalcount=#{a.totalcount}" +
            " where cart_id=#{a.cart_id}")
    public int updatecart1(@Param("a") Map<String, String> map);

    /*添加第2个商品有关信息*/
    @Update("update shoppingcart" +
            " set goods_id2=#{a.goods_id2},count2=#{a.count2},totalcount=#{a.totalcount}" +
            " where cart_id=#{a.cart_id}")
    public int updatecart2(@Param("a") Map<String, String> map);

    /*添加第3个商品有关信息*/
    @Update("update shoppingcart" +
            " set goods_id3=#{a.goods_id3},count3=#{a.count3},totalcount=#{a.totalcount}" +
            " where cart_id=#{a.cart_id}")
    public int updatecart3(@Param("a") Map<String, String> map);

    /*添加第4个商品有关信息*/
    @Update("update shoppingcart" +
            " set goods_id4=#{a.goods_id4},count4=#{a.count4},totalcount=#{a.totalcount}" +
            " where cart_id=#{a.cart_id}")
    public int updatecart4(@Param("a") Map<String, String> map);

    /*添加第5个商品有关信息*/
    @Update("update shoppingcart" +
            " set goods_id5=#{a.goods_id5},count5=#{a.count5},totalcount=#{a.totalcount}" +
            " where cart_id=#{a.cart_id}")
    public int updatecart5(@Param("a") Map<String, String> map);
}
