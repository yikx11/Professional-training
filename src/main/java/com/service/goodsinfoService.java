package com.service;

import com.mapper.goodsinfoMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class goodsinfoService {
    @Resource
    private goodsinfoMapper goodsinfoMapper;
    public List<Map<String,Object>> dofindByGoodId(int good_id){
        List<Map<String,Object>> list=null;
        try {
            list=goodsinfoMapper.findByGoodId(good_id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public List<Map<String,Object>> dofindByUserId(int user_id){
        List<Map<String,Object>> list=null;
        try {
            list=goodsinfoMapper.findByUserId(user_id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    //马新增的
    public List<Map<String,Object>> findAll(){
        List<Map<String,Object>> list=null;
        try {
            list=goodsinfoMapper.findAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public List<Map<String,Object>> doFindByType1(){
        List<Map<String,Object>> list=null;
        try {
            list=goodsinfoMapper.findByType1();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public List<Map<String,Object>> doFindByType2(){
        List<Map<String,Object>> list=null;
        try {
            list=goodsinfoMapper.findByType2();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public List<Map<String,Object>> doFindByType3(){
        List<Map<String,Object>> list=null;
        try {
            list=goodsinfoMapper.findByType3();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public List<Map<String,Object>> doFindByType4(){
        List<Map<String,Object>> list=null;
        try {
            list=goodsinfoMapper.findByType4();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public List<Map<String,Object>> doFindByType5(){
        List<Map<String,Object>> list=null;
        try {
            list=goodsinfoMapper.findByType5();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public List<Map<String,Object>> doFindByType6(){
        List<Map<String,Object>> list=null;
        try {
            list=goodsinfoMapper.findByType6();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public List<Map<String,Object>> doFindByType7(){
        List<Map<String,Object>> list=null;
        try {
            list=goodsinfoMapper.findByType7();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public List<Map<String,Object>> doFindByType8(){
        List<Map<String,Object>> list=null;
        try {
            list=goodsinfoMapper.findByType8();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public List<Map<String,Object>> doFindByType9(){
        List<Map<String,Object>> list=null;
        try {
            list=goodsinfoMapper.findByType9();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
    //新增结束
}
