package com.codepresso.codpressoblog.controller.dto;

import com.codepresso.codpressoblog.vo.Post;
import lombok.Setter;

@Setter
public class PostRequestDto {
    Integer id;
    String title;
    String content;
    String username;

    public Post getPost() {
        return new Post(this.id, this.title, this.content, this.username);
    }
}
