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

    public boolean doDelete(Map<String,String> map){
        boolean flag=false;
        try {
            int id=Integer.parseInt(map.get("goods_id"));
            int r=marketMapper.deleteGoods(id);
            if(r>0){
                flag=true;
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return flag;
    }

    public boolean doInsert(Map<String,String> map) {
        boolean flag = false;
        //选择要添加监控的代码
        //ctrl+alt+t 打开 surround with窗口 选择 try catch
        try {
            int r=marketMapper.insertGoods(map);
            if(r>0){
                flag=true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }

    public boolean doUpdateGoods(Map<String,String> map){
        boolean flag=false;
        try {
            int r=marketMapper.update(map);
            if(r>0){
                flag=true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }
}
