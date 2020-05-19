package com.hyj.controller;


import com.hyj.pojo.User;
import com.hyj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class UserCtroller {
    @Autowired
    UserService userService;
    @RequestMapping("selectAll")
    public ModelAndView selectAll(){
        ModelAndView mv=new ModelAndView("/main.jsp");
        List<User> users=userService.selectAll();
        mv.addObject("users",users);
        System.out.println(users);
        return mv;
    }
    @RequestMapping("/findByName")
    public ModelAndView findByName(User user){
        ModelAndView mv=new ModelAndView("/main.jsp");
        List<User> users=userService.findByName(user);//得到数据
        mv.addObject("users",users);
        return mv;
    }
    @RequestMapping("/deleteById")
    public ModelAndView deleteById(@RequestParam("id") String id){
        int count= userService.deleteById(Integer.parseInt(id));
        if(count>0) {
            return new ModelAndView("/findByName");
        }
        else{
            return new ModelAndView("/main.jsp");
        }
    }
    @RequestMapping("/insertUser")
    public ModelAndView insertUser(User user){
//        ModelAndView mv=new ModelAndView();
       int count= userService.insertUser(user);
        System.out.println(count);
        if(count>0) {
            return new ModelAndView("redirect:/findByName");
        }
        else{
            return new ModelAndView("/add.jsp");
        }
    }
    @RequestMapping("/selectById")
    public ModelAndView selectById(User user){
       ModelAndView mv=new ModelAndView("main2.jsp");
     User user1=  userService.selectById(user);
       mv.addObject("user",user1);
       return mv;
    }
    @RequestMapping("/addOrUpdate")
    public String addOrUpdate(@RequestParam("sid") String sid, User user){
        //如果有id就修改没有id就新增
        if(sid.equals("")){//新增
            int count= userService.insertUser(user);
            if (count>0){
                    return "redirect:/findByName";
                }else {
                    return "main2.jsp";
                }
            }else {
                user.setId(Integer.parseInt(sid));
              int count=userService.updatById(user);
              if(count>0){
                  return "redirect:/findByName";

              }else {
                  return "main2.jsp";
              }
            }

    }
}
