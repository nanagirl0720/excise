package com.day.excise.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Pxn
 * @date: 2019/9/17 15:32
 */
@RestController
public class HelloController {

    @RequestMapping("/hello3")
    public String hello(){
        return "hello !";
    }
}
