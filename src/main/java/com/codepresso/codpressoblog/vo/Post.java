package com.codepresso.codpressoblog.vo;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Post {
    Integer id;
    String title;
    String content;
    String username;
    Date createdAt;

    public Post(Integer id, String title, String content, String username, Date createdAt) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.username = username;
        this.createdAt = createdAt;
    }

    public Post(Integer id, String title, String content, String username) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.username = username;
    }
}
