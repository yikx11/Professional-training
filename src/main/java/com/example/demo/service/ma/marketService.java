package com.example.demo.service.ma;



import com.example.demo.mapper.ma.marketMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service //有了这个我们spring框架就知道，在BeanFactory中要管理该类
public class marketService {

    @Resource
    private marketMapper marketMapper;
    public int getcartid(Map<String,String> map){
        int info=0;
        try{
            info=marketMapper.getcartid(map);
        }catch (Exception ex){

        }

        return info;
    }

    public Map<String,Object> doFindById(int cart_id){

        Map<String,Object> list=null;
        try {
            list=marketMapper.findById(cart_id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public Map<String,Object> doFindByGoodsId(int goods_id){

        Map<String,Object> list=null;
        try {
            list=marketMapper.findByGoodId(goods_id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
