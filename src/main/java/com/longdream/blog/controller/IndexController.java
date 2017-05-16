package com.longdream.blog.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhaozhihang
 * @date 2017/5/11
 */
@RestController
@EnableAutoConfiguration
public class IndexController {

    @RequestMapping("/")
    public String sayHello() {
        return "Hello,World!";
    }

}
