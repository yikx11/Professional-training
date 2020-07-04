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
    public Map<String,Object> findByCart_id(@RequestParam Map<String,String> map) {
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

    @RequestMapping("/goodsdelete")
    public String delete(@RequestParam Map<String,String> map){
        String msg="删除失败";
        boolean flag=marketService.doDelete(map);
        if(flag){
            msg="删除成功";
        }
        return msg;
    }
    @RequestMapping("/goodsinsert")
    public String insert(@RequestParam Map<String,String> map) {
        boolean flag=marketService.doInsert(map);
        String msg="添加商品失败！";
        if(flag) {
            msg="添加商品成功！";
        }
        return msg;
    }

    @RequestMapping("/goodsupdate")
    public String change(@RequestParam Map<String,String> map) {
        boolean flag=marketService.doUpdateGoods(map);
        String msg="修改商品失败！";
        if(flag) {
            msg="修改商品成功！";
        }
        return msg;
    }

    @RequestMapping("/goods1update")
    public String addgood1(@RequestParam Map<String,String> map) {
        boolean flag=marketService.doUpdategood1(map);
        String msg="修改商品失败！";
        if(flag) {
            msg="修改商品成功！";
        }
        return msg;
    }
    @RequestMapping("/goods2update")
    public String addgood2(@RequestParam Map<String,String> map) {
        boolean flag=marketService.doUpdategood2(map);
        String msg="修改商品失败！";
        if(flag) {
            msg="修改商品成功！";
        }
        return msg;
    }
    @RequestMapping("/goods3update")
    public String addgood3(@RequestParam Map<String,String> map) {
        boolean flag=marketService.doUpdategood3(map);
        String msg="修改商品失败！";
        if(flag) {
            msg="修改商品成功！";
        }
        return msg;
    }
    @RequestMapping("/goods4update")
    public String addgood4(@RequestParam Map<String,String> map) {
        boolean flag=marketService.doUpdategood4(map);
        String msg="修改商品失败！";
        if(flag) {
            msg="修改商品成功！";
        }
        return msg;
    }
    @RequestMapping("/goods5update")
    public String addgood5(@RequestParam Map<String,String> map) {
        boolean flag=marketService.doUpdategood5(map);
        String msg="修改商品失败！";
        if(flag) {
            msg="修改商品成功！";
        }
        return msg;
    }
}
