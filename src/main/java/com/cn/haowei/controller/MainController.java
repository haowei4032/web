package com.cn.haowei.controller;

import com.cn.haowei.BaseController;
import com.cn.haowei.repository.PostsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@RestController
@SuppressWarnings("unused")
public class MainController extends BaseController {

    @Autowired
    PostsRepository postsRepository;

    @RequestMapping(value = "/")
    public Response index(HttpServletRequest request) {
        Map<String, Object> result = postsRepository.getSimple(Long.valueOf(request.getParameter("id")));
        if (result.size() == 0) return end(400, "数据为空");
        return end(0, "", result);
    }


}
