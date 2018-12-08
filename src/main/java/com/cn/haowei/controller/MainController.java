package com.cn.haowei.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SuppressWarnings("unused")
public class MainController {

    @RequestMapping(value = "/")
    public String index() {
        //System.out.println("test");
        return "hello spring";
    }
}
