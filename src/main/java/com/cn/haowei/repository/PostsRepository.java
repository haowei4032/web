package com.cn.haowei.repository;

import com.cn.haowei.entity.PostsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Map;

public interface PostsRepository extends JpaRepository<PostsEntity, Long> {

    @Query(value = "select posts_title, posts_body from posts where posts_id = ?1 limit 1", nativeQuery = true)
    Map getSimple(long id);

}
