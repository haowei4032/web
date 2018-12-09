package com.cn.haowei.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "posts")
@JsonIgnoreProperties(value = {"hibernateLazyInitializer", "handler"})
public class PostsEntity {

    @Id
    @GeneratedValue
    private long posts_id;
    private String posts_title;
    private String posts_body;
    private long publish_time;
    private long modify_time;
    private long create_time;
}
