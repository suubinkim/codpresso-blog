package com.codepresso.codpressoblog.controller;

import com.codepresso.codpressoblog.service.PostService;
import com.codepresso.codpressoblog.vo.Post;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class IndexController {

    private final PostService postService;

    //포스트 리스트를 모델에 추가하여 인덱스로 전달
    //처음에는 첫 페이지이기 때문에 세개의 포스트만 전달
    @RequestMapping(value = "/")
    public String index(Model model) {
        List<Post> allPost = postService.getPostByPage(1,3);
        model.addAttribute("posts", allPost);
        return "index";
    }
}
