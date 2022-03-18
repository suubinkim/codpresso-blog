package com.codepresso.codpressoblog.controller.dto;

import com.codepresso.codpressoblog.vo.Post;

public class PostResponseDto {
    Integer id;
    String title;
    String content;
    String username;

    public PostResponseDto(Post post) {
        this.id = post.getId();
        this.title = post.getTitle();
        this.content = post.getContent();
        this.username = post.getUsername();
    }
}
