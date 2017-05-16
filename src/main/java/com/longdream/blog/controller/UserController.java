package com.longdream.blog.controller;

import com.longdream.blog.model.User;
import com.longdream.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author zhaozhihang
 * @date 2017/5/16
 */
@Controller
@RequestMapping("user")
public class UserController {



    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping("getUser")
    public User getUser() {
        return userService.getUserById(1);
    }
}
