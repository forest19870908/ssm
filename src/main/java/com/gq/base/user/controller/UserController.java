package com.gq.base.user.controller;

import com.gq.base.user.model.User;
import com.gq.base.user.service.IUserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created by ZSL on 2017/7/14.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Resource(name="userService")
    private IUserService userService;
    @RequestMapping("/showUser")
    public String toIndex(ModelMap model, Long id){
        User user=userService.getUserByID(id);
        model.addAttribute("user",user);
        return "user";
    }
}
