package com.cn.haowei.repository;

import com.cn.haowei.entity.PostsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

@SuppressWarnings("unused")
public interface PostsRepository extends JpaRepository<PostsEntity, Integer> {
}
