package com.example.demo.controller.ma;


import com.example.demo.service.ma.marketService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
public class marketController {

    @Resource
    private marketService marketService;
    @RequestMapping("/getcartid")
    public int getcartid(@RequestParam Map<String,String> map){
        int info=marketService.getcartid(map);
        return info;
    }

    @RequestMapping("/goodsfind")
    public Map<String,Object> findByUser_id(@RequestParam Map<String,String> map) {
        int cart_id=Integer.valueOf(map.get("cart_id"));
        Map<String,Object> map2=marketService.doFindById(cart_id);
        return map2;
    }

    @RequestMapping("/goodsdetailfind")
    public Map<String,Object> findByGoods_id(@RequestParam Map<String,String> map) {
        int cart_id=Integer.valueOf(map.get("goods_id"));
        Map<String,Object> map2=marketService.doFindByGoodsId(cart_id);
        return map2;
    }
}
