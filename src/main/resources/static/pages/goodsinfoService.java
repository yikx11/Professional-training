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
}
