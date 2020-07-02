package com.example.demo.service.ma;


import com.example.demo.mapper.ma.addressMapper;
import com.example.demo.mapper.ma.orderMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service //有了这个我们spring框架就知道，在BeanFactory中要管理该类
public class addressService {

    @Resource
    private addressMapper addressMapper;
    public boolean doInsert(Map<String,String> map) {
        boolean flag = false;
        //选择要添加监控的代码
        //ctrl+alt+t 打开 surround with窗口 选择 try catch
        try {
            int r=addressMapper.insert(map);
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
            int id=Integer.parseInt(map.get("address_id"));
            int r=addressMapper.delete(id);
            if(r>0){
                flag=true;
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return flag;
    }

    public boolean doUpdate(Map<String,String> map){
        boolean flag=false;
        try {
            int r=addressMapper.update(map);
            if(r>0){
                flag=true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }
    public List<Map<String,Object>> doFindByUser(int user_id){

        List<Map<String,Object>> list=null;
        try {
            list=addressMapper.findByuser_Id(user_id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
