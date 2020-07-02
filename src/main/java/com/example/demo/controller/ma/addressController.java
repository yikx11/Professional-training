package com.example.demo.controller.ma;

import com.example.demo.service.ma.addressService;
import com.example.demo.service.ma.orderService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
public class addressController {

    @Resource
    private addressService addressService;
    /**
     *
     * RequestParam 就是通知服务器，前端提交的数据封装成Map集合
     *      以表单控件的name属性的值作为 map集合的key
     *      以表单控件的value属性的值作为map集合的value
     * @param map
     * @return
     */
    @RequestMapping("/addressinsert")
    public String insert(@RequestParam Map<String,String> map) {
        boolean flag=addressService.doInsert(map);
        String msg="添加地址失败！";
        if(flag) {
            msg="添加地址成功！";
        }
        return msg;
    }

    @RequestMapping("/addresschange")
    public String change(@RequestParam Map<String,String> map) {
        boolean flag=addressService.doUpdate(map);
        String msg="修改地址失败！";
        if(flag) {
            msg="修改地址成功！";
        }
        return msg;
    }

    @RequestMapping("/addressdelete")
    public String delete(@RequestParam Map<String,String> map) {
        String msg="删除地址失败！";
        boolean flag=addressService.doDelete(map);
        if(flag){
            msg="删除成功";
        }
        return msg;
    }

    @RequestMapping("/addressfind")
    public List<Map<String,Object>> findByUser_id(@RequestParam Map<String,String> map) {
        int user_id=Integer.valueOf(map.get("user_id"));
        List<Map<String,Object>> list=addressService.doFindByUser(user_id);
        return list;
    }
}
