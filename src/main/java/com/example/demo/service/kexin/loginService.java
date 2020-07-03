package com.example.demo.service.kexin;

import com.example.demo.mapper.kexin.loginMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;

@Service //有了这个我们spring框架就知道，在BeanFactory中要管理该类
public class loginService {

    @Resource
    private loginMapper loginMapper;
    public boolean doInsert(Map<String,String> map) {
        boolean flag = false;
        //选择要添加监控的代码
        //ctrl+alt+t 打开 surround with窗口 选择 try catch
        try {
            int r=loginMapper.insert(map);
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
            int r=loginMapper.delete(id);
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
            int r=loginMapper.update(map);
            if(r>0){
                flag=true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }


    //通过用户注册创建与对应购物车联系的步骤2:去用刚刚的用户信息查询到用户的id
    public int findIDByName(Map<String,String> map){
            int r=loginMapper.findIDByName(map);
            return r;
    }

    //通过用户注册创建与对应购物车联系的步骤3:3.创建一个以此用户id为value值的购物车
    public boolean createCart(Map<String,String> map) {
        boolean flag = false;
        //选择要添加监控的代码
        //ctrl+alt+t 打开 surround with窗口 选择 try catch
        try {
            int r=loginMapper.createCart(map);
            if(r>0){
                flag=true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }

    //通过用户注册创建与对应购物车联系的步骤4:通过此用户id查出购物车的id
    public int findIDByID(Map<String,String> map){
        int r=loginMapper.findIDByID(map);
        return r;
    }

    //通过用户注册创建与对应购物车联系的步骤5:将用户一列里的购物车id更新
    public boolean updateCartID(Map<String,String> map){
        boolean flag=false;
        try {
            int r=loginMapper.updateCartID(map);
            if(r>0){
                flag=true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flag;
    }
}
