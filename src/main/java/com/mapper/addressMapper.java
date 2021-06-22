package com.mapper;

import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

//映射类，用来操作数据库
@Mapper //用这个知道他是映射类，自动产生对象，执行相关操作
public interface addressMapper {
    //表里面的数据有很多行，用list来做
    //用map以列表作为对，列表作为value
    //数据库相关语言从那个软件设计好后直接复制过来就好 不用硬写
    @Select("select * from address_info")
    public List<Map<String,Object>> findAll();

    /**
     * #{n} 表示一个占位符，用于通过变量赋值
     * @param id
     * @return
     *
     */
    @Select("select * from address_info where address_id=#{n}")
    public Map<String,Object> findById(int id);

    @Select("select * from address_info where user_id=#{n}")
    public List<Map<String,Object>> findByuser_Id(int id);

    //插入数据 有什么内容就要插什么
    //从上面的变成下面的,传递一个map,map里用string是因为从页面传过来的数据都是string类型的
    //public void insert(String name,String sex,int id)
    @Insert("insert into address_info(user_id,province,city,detail,receiver,phonenumber)" +
            "value(#{add.user_id},#{add.province},#{add.city},#{add.detail},#{add.receiver},#{add.phonenumber})")
    public int insert(@Param("add") Map<String, String> address);//@Param("tea") 表示参数的别名，在sql语句中使用

    /**
     * 根据订单号来改数量
     *
     * 只要传递多个参数的都可以使用map集合进行封装，可以减少方法的参数个数
     */
    //修改密码
    @Update("update address_info" +
            " set province=#{a.province},city=#{a.city},detail=#{a.detail},receiver=#{a.receiver},phonenumber=#{a.phonenumber}" +
            " where address_id=#{a.address_id}")
    public int update(@Param("a") Map<String, String> map);


    //如果想通过传入表名来找到表中信息，可用${table}来赋值给table
    //通过id删除地址
    @Delete("delete from address_info where address_id=#{id}")
    public int delete(int id);
}
