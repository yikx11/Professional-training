package com.example.demo.mapper.kexin;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.*;

import java.util.Map;

@Mapper
public interface userCenterMapper {

    @Update("update user_info" +
            " set username=#{t.username}" +
            " where user_id=#{t.user_id}")
    public int updatename(@Param("t") Map<String,String> tea);

    @Update("update user_info" +
            " set safe_q=#{t.safe_q}" +
            " where user_id=#{t.user_id}")
    public int updatesafe_q(@Param("t") Map<String,String> tea);

    @Update("update user_info" +
            " set safe_a=#{t.safe_a}" +
            " where user_id=#{t.user_id}")
    public int updatesafe_a(@Param("t") Map<String,String> tea);

    @Select("select password from user_info where user_id=#{t.user_id}")
    public String findbeforepwd(@Param("t") Map<String,String> tea);

    @Update("update user_info" +
            " set password=#{t.password}" +
            " where user_id=#{t.user_id}")
    public int updatepwd(@Param("t") Map<String,String> tea);
}
