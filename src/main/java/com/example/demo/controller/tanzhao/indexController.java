package com.example.demo.controller.tanzhao;

import com.example.demo.service.tanzhao.indexService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@RestController
public class indexController {

    @Resource
    private indexService indexService;
    /**
     *
     * RequestParam 就是通知服务器，前端提交的数据封装成Map集合
     *      以表单控件的name属性的值作为 map集合的key
     *      以表单控件的value属性的值作为map集合的value
     * @param map
     * @return
     */
    @RequestMapping("/findByGoodId")
    public List<Map<String,Object>> findByGoodId(@RequestParam Map<String,String> map){
        int good_id=Integer.valueOf(map.get("goods_id"));
        List<Map<String,Object>> list=indexService.dofindByGoodId(good_id);
        return list;
    }
}
