package com.example.demo.service.kexin;

import com.example.demo.mapper.kexin.adminMapper;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.Map;

@Service
public class adminService {

    @Resource
    private adminMapper adminMapper;

    public Map<String,Object> checkLogin(Map<String,String> map){
        Map<String,Object> info=null;
        try{
            info=adminMapper.findByNameAndPwd(map);
        }catch (Exception ex){

        }

        return info;
    }
}