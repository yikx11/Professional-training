package com.example.demo.controller.kexin;

import com.example.demo.service.kexin.findPasswordService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

@RestController
public class findPasswordController {
    @Resource
    private findPasswordService findPasswordService;
    @RequestMapping("/findPassword")
    public String findPassword(@RequestParam Map<String,String> map){
        String msg="密保问题回答错误!";
        int info=findPasswordService.checkAnswer(map);
        if(info!=0){
            msg="密码修改成功！";
        }
        return msg;
    }

    @RequestMapping("/getQuestion")
    public String getQuestion(@RequestParam Map<String,String> map){
        String info=findPasswordService.getQuestion(map);
        return info;
    }

    @RequestMapping("/confirmAnswer")
    public String confirmAnswer(@RequestParam Map<String,String> map){
        String info=findPasswordService.confirmAnswer(map);
        return info;
    }
}
