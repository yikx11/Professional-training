package com.controller;

import com.service.loginService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

@RestController
public class loginController {

    @Resource
    private loginService loginService;
    /**
     *
     * RequestParam 就是通知服务器，前端提交的数据封装成Map集合
     *      以表单控件的name属性的值作为 map集合的key
     *      以表单控件的value属性的值作为map集合的value
     * @param map
     * @return
     */
    @RequestMapping("/insert")
    public String insert(@RequestParam Map<String,String> map) {
        boolean flag=loginService.doInsert(map);
        String msg="注册失败！";
        if(flag) {
            msg="注册成功！";
        }
        return msg;
    }

    //通过用户注册创建与对应购物车联系的步骤2:去用刚刚的用户信息查询到用户的id
    @RequestMapping("/findIDByName")
    public int findIDByName(@RequestParam Map<String,String> map) {
        int flag=loginService.findIDByName(map);
        return flag;
    }


    //通过用户注册创建与对应购物车联系的步骤3:3.创建一个以此用户id为value值的购物车
    @RequestMapping("/createCart")
    public String createCart(@RequestParam Map<String,String> map) {
        boolean flag=loginService.createCart(map);
        String msg="创建购物车失败！";
        if(flag) {
            msg="创建购物车成功！";
        }
        return msg;
    }

    //通过用户注册创建与对应购物车联系的步骤4:通过此用户id查出购物车的id
    @RequestMapping("/findIDByID")
    public int findIDByID(@RequestParam Map<String,String> map) {
        int flag=loginService.findIDByID(map);
        return flag;
    }

    //通过用户注册创建与对应购物车联系的步骤5:将用户一列里的购物车id更新
    @RequestMapping("/updateCartID")
    public String updateCartID(@RequestParam Map<String,String> map){
        String msg="修改失败";
        boolean flag=loginService.updateCartID(map);
        if(flag){
            msg="修改成功";
        }
        return msg;
    }
}
