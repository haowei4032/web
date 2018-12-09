package com.cn.haowei.controller;

import com.cn.haowei.entity.PostsEntity;
import com.cn.haowei.repository.PostsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@SuppressWarnings("unused")
public class MainController {

    @Autowired
    private PostsRepository postsRepository;

    @RequestMapping(value = "/")
    public List<PostsEntity> index() {
        //System.out.println("test");
        return postsRepository.findAll();
        //return "hello spring";
    }
}
