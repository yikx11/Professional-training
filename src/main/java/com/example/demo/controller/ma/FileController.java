package com.example.demo.controller.ma;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Map;

@RestController
public class FileController {

    @RequestMapping("/uploadimg")
    public String fileUp(MultipartFile file, @RequestParam Map<String, String> user){
        String msg="上传失败";
        if(file.isEmpty()){
            return "请选择上传的文件";
        }
        String fileName=file.getOriginalFilename();


        /*int begin=fileName.lastIndexOf( str: ".");
        String ext=fileName.substring(begin);
        long time=System.currentTimeMillis();
        String newFileName=time+ext;*/

        String u_name=user.get("u_name");
        System.out.println(u_name);
//        String path= System.getProperty("user.dir")+"\\upfile";
        String path= System.getProperty("user.dir")+"\\src\\main\\resources\\static\\imgs";
        File f=new File(path+"\\"+fileName);
        if(!f.getParentFile().exists()){
            f.getParentFile().mkdir();
        }
        try {
            file.transferTo(f);
            msg="上传成功";
        } catch (IOException e) {
            e.printStackTrace();
        }
        return fileName;
    }
}
