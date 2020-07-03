package com.example.demo.service.kexin;

import com.example.demo.mapper.kexin.cartMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;

@Service
public class cartService {
    @Resource
    private cartMapper cartMapper;

    public int getcartid(Map<String,String> map){
        int info=0;
        try{
            info=cartMapper.getcartid(map);
        }catch (Exception ex){

        }

        return info;
    }

//    public Map<String,Object> getgoods(Map<String,String> map){
//        Map<String,Object> tea=null;
//        tea=cartMapper.getgoods(map);
//        return tea;
//    }

    public int getgoods_id1(Map<String,String> map){
        int info=0;
        try{
            info=cartMapper.getgoods_id1(map);
        }catch (Exception ex){

        }

        return info;
    }

    public int finduserID(Map<String,String> map){
        int info=0;
        try{
            info=cartMapper.finduserID(map);
        }catch (Exception ex){

        }

        return info;
    }

    public Map<String,Object> getgoodsdetail1(Map<String,String> map){
        Map<String,Object> tea=null;
        tea=cartMapper.getgoodsdetail1(map);
        return tea;
    }

    public boolean delete1(Map<String,String> map){
        boolean flag=false;
        try {
            int r=cartMapper.delete1(map);
            //System.out.println(r);
            if(r>0){
                flag=true;
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return flag;
    }

    public boolean delete2(Map<String,String> map){
        boolean flag=false;
        try {
            int r=cartMapper.delete2(map);
            //System.out.println(r);
            if(r>0){
                flag=true;
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return flag;
    }

    public boolean delete3(Map<String,String> map){
        boolean flag=false;
        try {
            int r=cartMapper.delete3(map);
            //System.out.println(r);
            if(r>0){
                flag=true;
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return flag;
    }

    public boolean delete4(Map<String,String> map){
        boolean flag=false;
        try {
            int r=cartMapper.delete4(map);
            //System.out.println(r);
            if(r>0){
                flag=true;
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return flag;
    }

    public boolean delete5(Map<String,String> map){
        boolean flag=false;
        try {
            int r=cartMapper.delete5(map);
            //System.out.println(r);
            if(r>0){
                flag=true;
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return flag;
    }

    public boolean count1(Map<String,String> map){
        boolean flag=false;
        try {
            int r=cartMapper.count1(map);
            //System.out.println(r);
            if(r>0){
                flag=true;
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return flag;
    }

    public boolean count2(Map<String,String> map){
        boolean flag=false;
        try {
            int r=cartMapper.count2(map);
            //System.out.println(r);
            if(r>0){
                flag=true;
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return flag;
    }

    public boolean count3(Map<String,String> map){
        boolean flag=false;
        try {
            int r=cartMapper.count3(map);
            //System.out.println(r);
            if(r>0){
                flag=true;
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return flag;
    }

    public boolean count4(Map<String,String> map){
        boolean flag=false;
        try {
            int r=cartMapper.count4(map);
            //System.out.println(r);
            if(r>0){
                flag=true;
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return flag;
    }

    public boolean count5(Map<String,String> map){
        boolean flag=false;
        try {
            int r=cartMapper.count5(map);
            //System.out.println(r);
            if(r>0){
                flag=true;
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return flag;
    }

    public boolean totalcount(Map<String,String> map){
        boolean flag=false;
        try {
            int r=cartMapper.totalcount(map);
            //System.out.println(r);
            if(r>0){
                flag=true;
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return flag;
    }


    //马写的要删
    public Map<String,Object> doFindById2(int cart_id){

        Map<String,Object> list=null;
        try {
            list=cartMapper.findById2(cart_id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    //马写的要删
    public Map<String,Object> doFindByGoodsId2(int goods_id){

        Map<String,Object> list=null;
        try {
            list=cartMapper.findByGoodId2(goods_id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

}

