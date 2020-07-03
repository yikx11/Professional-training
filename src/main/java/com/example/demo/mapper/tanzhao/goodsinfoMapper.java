package com.example.demo.mapper.tanzhao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

@Mapper
public interface goodsinfoMapper {
    //获取商品信息
    /**
     * #{n} 表示一个占位符，用于通过变量赋值
     * @param id
     * @return
     *
     */
    @Select("select * from goods_info where goods_id=#{n}")
    public List<Map<String,Object>> findByGoodId(int id);

    @Select("select * from user_info where user_id=#{n}")
    public List<Map<String,Object>> findByUserId(int id);

    //马新增的
    @Select("select * from goods_info")
    public List<Map<String,Object>> findAll();

    @Select("select * from goods_info where type1=1")
    public List<Map<String,Object>> findByType1();

    @Select("select * from goods_info where type2=1")
    public List<Map<String,Object>> findByType2();

    @Select("select * from goods_info where type3=1")
    public List<Map<String,Object>> findByType3();

    @Select("select * from goods_info where type4=1")
    public List<Map<String,Object>> findByType4();

    @Select("select * from goods_info where type5=1")
    public List<Map<String,Object>> findByType5();

    @Select("select * from goods_info where type6=1")
    public List<Map<String,Object>> findByType6();

    @Select("select * from goods_info where type7=1")
    public List<Map<String,Object>> findByType7();

    @Select("select * from goods_info where type8=1")
    public List<Map<String,Object>> findByType8();

    @Select("select * from goods_info where type9=1")
    public List<Map<String,Object>> findByType9();
    //新增结束
}
