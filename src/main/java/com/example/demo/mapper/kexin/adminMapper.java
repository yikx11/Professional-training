package com.example.demo.mapper.kexin;

import org.apache.ibatis.annotations.Mapper;
        import org.apache.ibatis.annotations.Param;
        import org.apache.ibatis.annotations.Select;

        import java.util.Map;

@Mapper
public interface adminMapper {

    /**
     * t.name 和t.pwd  其中name和pwd 对应页面表单控件的name属性的值
     * @param map
     * @return
     */
    @Select("select * from user_info " +
            " where username=#{t.username}" +
            " and password=#{t.password}")
    public Map<String,Object> findByNameAndPwd(@Param("t") Map<String,String> map);
}
