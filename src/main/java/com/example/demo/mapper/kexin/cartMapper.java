package com.example.demo.mapper.kexin;

import org.apache.ibatis.annotations.*;

import java.util.Map;

@Mapper
public interface cartMapper {
    /**
     * t.name 和t.pwd  其中name和pwd 对应页面表单控件的name属性的值
     * @param map
     * @return
     */

    @Update("update user_info" +
            " set password=#{t.password}" +
            " where username=#{t.username}" +
            " and safe_a=#{t.safe_a}" )
    public int findPWDByAnswer(@Param("t") Map<String,String> map);//试试这里的int，看如果更新不成功返回值是否是0，成功是否是有值的



    //此函数用于确认用户名和问题答案都一致，之后才能进入修改密码环节
    @Select("select safe_a from user_info where username=#{t.username}")
    public String confirmAnswer(@Param("t") Map<String,String> map);

    @Insert("insert into tea_info(tea_name,tea_sex,tea_no)" +
            "value(#{tea.name},#{tea.sex},#{tea.no})")
    public int save(@Param("tea") Map<String,String> map);




    //通过username获得cartID
    @Select("select cart_id from user_info where username=#{t.username}")
    public int getcartid(@Param("t") Map<String,String> map);

    //得到购物车商品的详情
//    @Select(" select a.price,a.name " +
//            " from goods_info a " +
//            " inner join shoppingcart b on a.goods_id=b.goods_id1 " +
//            " inner join shoppingcart c on c.cart_id=#{t.cart_id}")
//    public Map<String,Object> getgoods(@Param("t") Map<String,String> map);

    //先找到购物车对应的第一个商品
    @Select("select goods_id1 from shoppingcart where cart_id=#{t.cart_id}")
    public int getgoods_id1(@Param("t") Map<String,String> map);

    //再找到对应商品的内容信息
    //@Select("select price,name from goods_info where goods_id=#{t.goods_id}")
    @Select("select price,name from goods_info where goods_id=#{t.goods_id}")
    public Map<String,Object> getgoodsdetail1(@Param("t") Map<String,String> map);


    //马写的要删
    @Select("select * from shoppingcart where cart_id=#{n}")
    public Map<String,Object> findById2(int id);

    //马写的要删
    //  获取商品信息
    @Select("select * from goods_info where goods_id=#{n}")
    public Map<String,Object> findByGoodId2(int id);



    //删除商品1
    @Update("update shoppingcart set goods_id1=null where cart_id=#{t.cart_id}")
    public int delete1(@Param("t") Map<String,String> tea);

    //删除商品2
    @Update("update shoppingcart set goods_id2=null where cart_id=#{t.cart_id}")
    public int delete2(@Param("t") Map<String,String> tea);

    //删除商品3
    @Update("update shoppingcart set goods_id3=null where cart_id=#{t.cart_id}")
    public int delete3(@Param("t") Map<String,String> tea);

    //删除商品4
    @Update("update shoppingcart set goods_id4=null where cart_id=#{t.cart_id}")
    public int delete4(@Param("t") Map<String,String> tea);

    //删除商品5
    @Update("update shoppingcart set goods_id5=null where cart_id=#{t.cart_id}")
    public int delete5(@Param("t") Map<String,String> tea);

}
