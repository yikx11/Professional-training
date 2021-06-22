package com.controller;

import com.service.userCenterService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
public class userCenterController {
    @Resource
    private userCenterService userCenterService;

    @RequestMapping("/updatename")//这个里面的值绝对不要和别人的重复
    public String updatename(@RequestParam Map<String,String> map){ //不管删除什么，在前台传过来的数据都可以用Map封装起来
        String msg="修改失败";
        boolean flag=userCenterService.updatename(map);
        if(flag){
            msg="修改成功";
        }
        return msg;
    }

    @RequestMapping("/updatesafe_q")//这个里面的值绝对不要和别人的重复
    public String updatesafe_q(@RequestParam Map<String,String> map){ //不管删除什么，在前台传过来的数据都可以用Map封装起来
        String msg="修改失败";
        boolean flag=userCenterService.updatesafe_q(map);
        if(flag){
            msg="修改成功";
        }
        return msg;
    }

    @RequestMapping("/updatesafe_a")//这个里面的值绝对不要和别人的重复
    public String updatesafe_a(@RequestParam Map<String,String> map){ //不管删除什么，在前台传过来的数据都可以用Map封装起来
        String msg="修改失败";
        boolean flag=userCenterService.updatesafe_a(map);
        if(flag){
            msg="修改成功";
        }
        return msg;
    }

    @RequestMapping("/findbeforepwd")
    public String findbeforepwd(@RequestParam Map<String,String> map){
        String info=userCenterService.findbeforepwd(map);
        return info;
    }

    @RequestMapping("/updatepwd")//这个里面的值绝对不要和别人的重复
    public String updatepwd(@RequestParam Map<String,String> map){ //不管删除什么，在前台传过来的数据都可以用Map封装起来
        String msg="修改失败";
        boolean flag=userCenterService.updatepwd(map);
        if(flag){
            msg="修改成功";
        }
        return msg;
    }

    @RequestMapping("/findbyusername")
    public Map<String,Object> findByUsername(@RequestParam Map<String,String> map) {

        String username=map.get("username");
        Map<String,Object> list=userCenterService.doFindByUsername(username);
        return list;
    }

    @RequestMapping("/findbyuserid")
    public Map<String,Object> findByUser_id(@RequestParam Map<String,String> map) {

        int user_id=Integer.valueOf(map.get("user_id"));
        Map<String,Object> list=userCenterService.doFindByUserId(user_id);
        return list;
    }
}
