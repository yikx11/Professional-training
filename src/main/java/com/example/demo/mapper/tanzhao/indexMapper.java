package com.example.demo.mapper.tanzhao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
import java.util.Map;

//映射类，用来操作数据库
@Mapper  //用这个知道他是映射类，自动产生对象，执行相关操作
public interface indexMapper {

    //获取商品信息
    /**
     * #{n} 表示一个占位符，用于通过变量赋值
     * @param id
     * @return
     *
     */
    @Select("select * from goods_info where goods_id=#{n}")
    public List<Map<String,Object>> findByGoodId(int id);
}
