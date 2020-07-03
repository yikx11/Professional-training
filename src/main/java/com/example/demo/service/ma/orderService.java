package com.example.demo.service.ma;


import com.example.demo.mapper.ma.orderMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service //有了这个我们spring框架就知道，在BeanFactory中要管理该类
public class orderService {

    @Resource
    private orderMapper orderMapper;
    public boolean doInsert(Map<String,String> map) {
        boolean flag = false;
        //选择要添加监控的代码
        //ctrl+alt+t 打开 surround with窗口 选择 try catch
        try {
            int r=orderMapper.insert(map);
            if(r>0){
                flag=true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }

    public boolean doDelete(Map<String,String> map){
        boolean flag=false;
        try {
            int id=Integer.parseInt(map.get("id"));
            int r=orderMapper.delete(id);
            if(r>0){
                flag=true;
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return flag;
    }

    public List<Map<String,Object>> doFindByUser(int user_id){

        List<Map<String,Object>> list=null;
        try {
            list=orderMapper.findByuser_Id(user_id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public Map<String,Object> doFindByOrderId(int order_id){

        Map<String,Object> map=null;
        try {
            map=orderMapper.findById(order_id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }

}
