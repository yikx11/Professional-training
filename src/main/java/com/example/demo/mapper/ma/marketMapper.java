package com.example.demo.mapper.ma;

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
}
