package com.example.demo.controller.tanzhao;

import com.example.demo.service.tanzhao.goodsinfoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
public class goodsinfoController {

    @Resource
    private goodsinfoService goodsinfoService;
    /**
     *
     * RequestParam 就是通知服务器，前端提交的数据封装成Map集合
     *      以表单控件的name属性的值作为 map集合的key
     *      以表单控件的value属性的值作为map集合的value
     * @param map
     * @return
     */
    //马修改的，加了个2
    @RequestMapping("/findByGoodId2")
    public List<Map<String,Object>> findByGoodId(@RequestParam Map<String,String> map){
        int good_id=Integer.valueOf(map.get("goods_id"));
        List<Map<String,Object>> list=goodsinfoService.dofindByGoodId(good_id);
        return list;
    }
    //修改结束
    @RequestMapping("/findByUserId")
    public List<Map<String,Object>> findByUserId(@RequestParam Map<String,String> map){
        int user_id=Integer.valueOf(map.get("user_id"));
        List<Map<String,Object>> list=goodsinfoService.dofindByUserId(user_id);
        return list;
    }

    //马新增的
    @RequestMapping("/findAllGoods")
    public List<Map<String,Object>> findAll(){
        List<Map<String,Object>> list=goodsinfoService.findAll();
        return list;
    }

    @RequestMapping("/findByType1")
    public List<Map<String,Object>> findByType1(){

        List<Map<String,Object>> list=goodsinfoService.doFindByType1();
        return list;
    }

    @RequestMapping("/findByType2")
    public List<Map<String,Object>> findByType2(){

        List<Map<String,Object>> list=goodsinfoService.doFindByType2();
        return list;
    }
    @RequestMapping("/findByType3")
    public List<Map<String,Object>> findByType3(){

        List<Map<String,Object>> list=goodsinfoService.doFindByType3();
        return list;
    }
    @RequestMapping("/findByType4")
    public List<Map<String,Object>> findByType4(){

        List<Map<String,Object>> list=goodsinfoService.doFindByType4();
        return list;
    }
    @RequestMapping("/findByType5")
    public List<Map<String,Object>> findByType5(){

        List<Map<String,Object>> list=goodsinfoService.doFindByType5();
        return list;
    }
    @RequestMapping("/findByType6")
    public List<Map<String,Object>> findByType6(){

        List<Map<String,Object>> list=goodsinfoService.doFindByType6();
        return list;
    }
    @RequestMapping("/findByType7")
    public List<Map<String,Object>> findByType7(){

        List<Map<String,Object>> list=goodsinfoService.doFindByType7();
        return list;
    }
    @RequestMapping("/findByType8")
    public List<Map<String,Object>> findByType8(){

        List<Map<String,Object>> list=goodsinfoService.doFindByType8();
        return list;
    }
    @RequestMapping("/findByType9")
    public List<Map<String,Object>> findByType9(){

        List<Map<String,Object>> list=goodsinfoService.doFindByType9();
        return list;
    }
    //新增结束

}
