package com.cn.haowei.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "posts")
@SuppressWarnings("unused")

public class PostsEntity {

    @Id
    @Column(name = "posts_id")
    private long posts_id;

    private String posts_title;

    private String posts_body;

    private long publish_time;

    private long modify_time;

    private long create_time;
}
