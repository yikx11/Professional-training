package com.example.demo.service.kexin;
import com.example.demo.mapper.kexin.findPasswordMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;

@Service
public class findPasswordService {
    @Resource
    private findPasswordMapper findPasswordMapper;

    public int checkAnswer(Map<String,String> map){
       int info=0;
        try{
            info=findPasswordMapper.findPWDByAnswer(map);
        }catch (Exception ex){

        }

        return info;
    }

    public String getQuestion(Map<String,String> map){
        String info=null;
        try{
            info=findPasswordMapper.getQuestion(map);
        }catch (Exception ex){

        }

        return info;
    }

    public String confirmAnswer(Map<String,String> map){
        String info=null;
        try{
            info=findPasswordMapper.confirmAnswer(map);
        }catch (Exception ex){

        }

        return info;
    }

}
