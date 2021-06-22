package com.service;

import com.mapper.indexMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class indexService {

    @Resource
    private indexMapper indexMapper;

    public List<Map<String,Object>> dofindByGoodId(int good_id){
        List<Map<String,Object>> list=null;
        try {
            list=indexMapper.findByGoodId(good_id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

}
