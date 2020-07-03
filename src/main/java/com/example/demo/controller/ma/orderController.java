package com.example.demo.controller.ma;

import com.example.demo.service.ma.orderService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
public class orderController {

    @Resource
    private orderService orderService;
    /**
     *
     * RequestParam 就是通知服务器，前端提交的数据封装成Map集合
     *      以表单控件的name属性的值作为 map集合的key
     *      以表单控件的value属性的值作为map集合的value
     * @param map
     * @return
     */
    @RequestMapping("/orderinsert")
    public String insert(@RequestParam Map<String,String> map) {
        boolean flag=orderService.doInsert(map);
        String msg="添加订单失败！";
        if(flag) {
            msg="添加订单成功！";
        }
        return msg;
    }

    @RequestMapping("/orderfind")
    public List<Map<String,Object>> findByUser_id(@RequestParam Map<String,String> map) {
        int user_id=Integer.valueOf(map.get("user_id"));
        List<Map<String,Object>> list=orderService.doFindByUser(user_id);
        return list;
    }

    @RequestMapping("/orderIdFind")
    public Map<String,Object> findByOrderNum(@RequestParam Map<String,String> map) {
        int order_id=Integer.valueOf(map.get("order_id"));
        Map<String,Object> map2=orderService.doFindByOrderId(order_id);
        return map2;
    }
}
