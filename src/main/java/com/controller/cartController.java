package com.controller;

import com.service.cartService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

@RestController
public class cartController {
    @Resource
    private cartService cartService;

    @RequestMapping("/getcartidykx")
    public int getcartid(@RequestParam Map<String,String> map){
        int info=cartService.getcartid(map);
        return info;
    }

    @RequestMapping("/finduserID")
    public int finduserID(@RequestParam Map<String,String> map){
        int info=cartService.finduserID(map);
        return info;
    }

//    @RequestMapping("/getgoods")
//    public Map<String,Object> getgoods(@RequestParam Map<String,String> map){
//        Map<String,Object> info=cartService.getgoods(map);
//        return info;
//    }

    @RequestMapping("/getgoods_id1")
    public int getgoods_id1(@RequestParam Map<String,String> map){
        int info=cartService.getgoods_id1(map);
        return info;
    }

    @RequestMapping("/getgoodsdetail1")
    public Map<String,Object> getgoodsdetail1(@RequestParam Map<String,String> map){
        Map<String,Object> info=cartService.getgoodsdetail1(map);
        return info;
    }

    @RequestMapping("/delete1")//这个里面的值绝对不要和别人的重复
    public String delete1(@RequestParam Map<String,String> map){ //不管删除什么，在前台传过来的数据都可以用Map封装起来
        String msg="删除失败";
        boolean flag=cartService.delete1(map);
        if(flag){
            msg="删除成功";
        }
        return msg;
    }

    @RequestMapping("/delete2")//这个里面的值绝对不要和别人的重复
    public String delete2(@RequestParam Map<String,String> map){ //不管删除什么，在前台传过来的数据都可以用Map封装起来
        String msg="删除失败";
        boolean flag=cartService.delete2(map);
        if(flag){
            msg="删除成功";
        }
        return msg;
    }

    @RequestMapping("/delete3")//这个里面的值绝对不要和别人的重复
    public String delete3(@RequestParam Map<String,String> map){ //不管删除什么，在前台传过来的数据都可以用Map封装起来
        String msg="删除失败";
        boolean flag=cartService.delete3(map);
        if(flag){
            msg="删除成功";
        }
        return msg;
    }

    @RequestMapping("/delete4")//这个里面的值绝对不要和别人的重复
    public String delete4(@RequestParam Map<String,String> map){ //不管删除什么，在前台传过来的数据都可以用Map封装起来
        String msg="删除失败";
        boolean flag=cartService.delete4(map);
        if(flag){
            msg="删除成功";
        }
        return msg;
    }

    @RequestMapping("/delete5")//这个里面的值绝对不要和别人的重复
    public String delete5(@RequestParam Map<String,String> map){ //不管删除什么，在前台传过来的数据都可以用Map封装起来
        String msg="删除失败";
        boolean flag=cartService.delete5(map);
        if(flag){
            msg="删除成功";
        }
        return msg;
    }

    @RequestMapping("/count1")//这个里面的值绝对不要和别人的重复
    public String count1(@RequestParam Map<String,String> map){ //不管删除什么，在前台传过来的数据都可以用Map封装起来
        String msg="修改1失败";
        boolean flag=cartService.count1(map);
        if(flag){
            msg="修改1成功";
        }
        return msg;
    }

    @RequestMapping("/count2")//这个里面的值绝对不要和别人的重复
    public String count2(@RequestParam Map<String,String> map){ //不管删除什么，在前台传过来的数据都可以用Map封装起来
        String msg="修改2失败";
        boolean flag=cartService.count2(map);
        if(flag){
            msg="修改2成功";
        }
        return msg;
    }

    @RequestMapping("/count3")//这个里面的值绝对不要和别人的重复
    public String count3(@RequestParam Map<String,String> map){ //不管删除什么，在前台传过来的数据都可以用Map封装起来
        String msg="修改3失败";
        boolean flag=cartService.count3(map);
        if(flag){
            msg="修改3成功";
        }
        return msg;
    }

    @RequestMapping("/count4")//这个里面的值绝对不要和别人的重复
    public String count4(@RequestParam Map<String,String> map){ //不管删除什么，在前台传过来的数据都可以用Map封装起来
        String msg="修改4失败";
        boolean flag=cartService.count4(map);
        if(flag){
            msg="修改4成功";
        }
        return msg;
    }

    @RequestMapping("/count5")//这个里面的值绝对不要和别人的重复
    public String count5(@RequestParam Map<String,String> map){ //不管删除什么，在前台传过来的数据都可以用Map封装起来
        String msg="修改5失败";
        boolean flag=cartService.count5(map);
        if(flag){
            msg="修改5成功";
        }
        return msg;
    }

    @RequestMapping("/totalcount")//这个里面的值绝对不要和别人的重复
    public String totalcount(@RequestParam Map<String,String> map){ //不管删除什么，在前台传过来的数据都可以用Map封装起来
        String msg="修改z失败";
        boolean flag=cartService.totalcount(map);
        if(flag){
            msg="修改z成功";
        }
        return msg;
    }


    //马写的要删
    @RequestMapping("/goodsfind2")
    public Map<String,Object> findByUser_id2(@RequestParam Map<String,String> map) {
        int cart_id=Integer.valueOf(map.get("cart_id"));
        Map<String,Object> map2=cartService.doFindById2(cart_id);
        return map2;
    }


    //马写的要删
    @RequestMapping("/goodsdetailfind2")
    public Map<String,Object> findByGoods_id2(@RequestParam Map<String,String> map) {
        int cart_id=Integer.valueOf(map.get("goods_id"));
        Map<String,Object> map2=cartService.doFindByGoodsId2(cart_id);
        return map2;
    }

    @RequestMapping("/deleteid")//这个里面的值绝对不要和别人的重复
    public String deleteid(@RequestParam Map<String,String> map){ //不管删除什么，在前台传过来的数据都可以用Map封装起来
        String msg="删除失败";
        boolean flag=cartService.deleteid(map);
        if(flag){
            msg="删除成功";
        }
        return msg;
    }
}
