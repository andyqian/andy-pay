package org.andy.pay.controller;

import org.andy.pay.basic.BasicController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

/**
 * @description:
 * @author: Andy
 * @date: 2017-02-21
 * @blog: www.andyqian.com
 */
@Controller
@RequestMapping("/user")
public class UserController extends BasicController{

    /**
     * 正常用户列表
     * @param request
     * http://localhost:8080/pay-web/user/list
     */
    @RequestMapping(value = "list",method = {RequestMethod.GET})
    public ModelAndView list(HttpServletRequest request){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/user/list");
        return modelAndView;
    }

    /**
     * 正常用户列表
     * @param request
     * http://localhost:8080/pay-web/user/lockuser
     */
    @RequestMapping(value = "lockuser",method = {RequestMethod.GET})
    public ModelAndView lockuser(HttpServletRequest request){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/user/lockuser");
        return modelAndView;
    }


    /**
     * 添加用户
     * @param request
     */
    @RequestMapping(value ="adduser",method = {RequestMethod.GET})
    public void addUser(HttpServletRequest request){

    }

}
