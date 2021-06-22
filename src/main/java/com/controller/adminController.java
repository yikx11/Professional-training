package com.controller;


import com.service.adminService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

@RestController
public class adminController {

        @Resource
        private adminService adminService;

        @RequestMapping("/login")
        public String login(@RequestParam Map<String,String> map){
            String msg="用户名或密码有误!";
            Map<String,Object> info=adminService.checkLogin(map);
            if(info!=null && map.size()>0){
                msg="登录成功！";
            }
            return msg;
        }

}
