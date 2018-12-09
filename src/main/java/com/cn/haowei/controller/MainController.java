package com.cn.haowei.controller;

import com.cn.haowei.BaseController;

import com.cn.haowei.repository.PostsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;


@RestController
@SuppressWarnings({"unused", "unchecked"})
public class MainController extends BaseController {

    @Autowired
    PostsRepository postsRepository;

    @RequestMapping(value = "/")
    public Response index(HttpServletRequest request) {

        return end(0, "请求成功", postsRepository.findAll());
    }


}
