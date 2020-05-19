package com.hyj.controller;

import com.hyj.pojo.Goods;
import com.hyj.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class GoodsController {

    @Autowired
    GoodsService goodsService;
    @RequestMapping("/selectAlls")
    public ModelAndView selectAlls(){
        List<Goods> goodsList =goodsService.selectAlls();
        ModelAndView mv=new ModelAndView("goods.jsp");
         mv.addObject("goodsList",goodsList);
        System.out.println(goodsList.get(0));
         return mv;
    }
    @RequestMapping("/deleteByIds")
    public ModelAndView deleteByIds(@RequestParam("id") String id){
        int count= goodsService.deleteByIds(Integer.parseInt(id));
        if(count>0) {
            return new ModelAndView("/selectAlls");
        }
        else{
            return new ModelAndView("/goods.jsp");
        }
    }
}
