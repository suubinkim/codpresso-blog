package com.codepresso.codpressoblog.controller;

import com.codepresso.codpressoblog.controller.dto.PostRequestDto;
import com.codepresso.codpressoblog.controller.dto.PostResponseDto;
import com.codepresso.codpressoblog.service.PostService;
import com.codepresso.codpressoblog.vo.Post;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class PostController {
    private final PostService postService;

    @GetMapping("/post")
    public List<PostResponseDto> getPostList(@RequestParam Integer page) {
        List<Post> postByPage = postService.getPostByPage(page, 3);

        List<PostResponseDto> dtoList = new ArrayList<>();
        for (Post post : postByPage) {
            dtoList.add(new PostResponseDto(post));
        }
        return dtoList;
    }

    @PostMapping("/post")
    public String createPost(@RequestBody PostRequestDto requestDto) {
        Post post = requestDto.getPost();
        postService.savePost(post);
        return "success";
    }
}
