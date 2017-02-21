package org.andy.pay.controller;

import org.andy.pay.basic.BasicController;
import org.andy.pay.constants.UserContant;
import org.andy.pay.model.LoginLog;
import org.andy.pay.model.User;
import org.andy.pay.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @description: 登录日志controller
 * @author: Andy
 * @date: 2017-02-14
 * @blog: www.andyqian.com
 */
@Controller
@RequestMapping("system")
public class LoginLogsController extends BasicController {

    /**
     * 日志service
     */
    @Autowired
    private LogService logService;


    /**
     * 登录日志信息
     * http://localhost:8080/pay-web/system/logs
     */
    @RequestMapping(value="/logs",method = {RequestMethod.GET})
    public ModelAndView login(HttpSession httpSession){
        ModelAndView modelAndView = new ModelAndView();
        User user = (User)httpSession.getAttribute(UserContant.SESSION_USER);
        String uid = user.getId();
        List<LoginLog> list = logService.getUserLog(uid);
        modelAndView.addObject("list",list);
        modelAndView.setViewName("/system/loginlog");
        return modelAndView;
    }

    /**
     * 登录日志的信息
     * @return
     */
    @RequestMapping(value = "/info",method ={RequestMethod.GET})
    public ModelAndView info(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/system/info");
        return modelAndView;
    }

    /**
     * 日志信息
     * @return
     */
    @RequestMapping(value = "/alllogs",method ={RequestMethod.GET})
    public ModelAndView logs(HttpSession httpSession){
        ModelAndView modelAndView = new ModelAndView();
        User user = (User)httpSession.getAttribute(UserContant.SESSION_USER);
        String uid = user.getId();
        List<LoginLog> list = logService.getUserLog(uid);
        modelAndView.addObject("list",list);
        modelAndView.setViewName("/system/logs");
        return modelAndView;
    }

}