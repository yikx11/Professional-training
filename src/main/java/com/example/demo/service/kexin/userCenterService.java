package com.example.demo.service.kexin;

import com.example.demo.mapper.kexin.userCenterMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;

@Service
public class userCenterService {

    @Resource
    private userCenterMapper userCenterMapper;

    public boolean updatename(Map<String,String> map){
        boolean flag=false;
        try {
            int r=userCenterMapper.updatename(map);
            //System.out.println(r);
            if(r>0){
                flag=true;
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return flag;
    }

    public boolean updatesafe_q(Map<String,String> map){
        boolean flag=false;
        try {
            int r=userCenterMapper.updatesafe_q(map);
            //System.out.println(r);
            if(r>0){
                flag=true;
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return flag;
    }

    public boolean updatesafe_a(Map<String,String> map){
        boolean flag=false;
        try {
            int r=userCenterMapper.updatesafe_a(map);
            //System.out.println(r);
            if(r>0){
                flag=true;
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return flag;
    }

    public String findbeforepwd(Map<String,String> map){
        String info=null;
        try{
            info=userCenterMapper.findbeforepwd(map);
        }catch (Exception ex){

        }

        return info;
    }

    public boolean updatepwd(Map<String,String> map){
        boolean flag=false;
        try {
            int r=userCenterMapper.updatepwd(map);
            //System.out.println(r);
            if(r>0){
                flag=true;
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return flag;
    }

    public Map<String,Object> doFindByUsername(String username){

        Map<String,Object> map=null;
        try {
            map=userCenterMapper.findByusername(username);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }

    public Map<String,Object> doFindByUserId(int user_id){

        Map<String,Object> map=null;
        try {
            map=userCenterMapper.findByuserid(user_id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return map;
    }
}
