package com.example.demo.mapper.kexin;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.Map;

@Mapper
public interface findPasswordMapper {

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

    //获得密码提示问题
    @Select("select safe_q from user_info where username=#{t.username}")
    public String getQuestion(@Param("t") Map<String,String> map);

    //此函数用于确认用户名和问题答案都一致，之后才能进入修改密码环节
    @Select("select safe_a from user_info where username=#{t.username}")
    public String confirmAnswer(@Param("t") Map<String,String> map);

}
