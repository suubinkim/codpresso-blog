package com.codepresso.codpressoblog.controller;

import com.codepresso.codpressoblog.service.PostService;
import com.codepresso.codpressoblog.vo.Post;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequiredArgsConstructor
public class PostPageController {
    private final PostService postService;

    @RequestMapping("/post/{id}")
    public String getPostDetailPage(Model model, @PathVariable Integer id) {
        Post postById = postService.getPostById(id);
        model.addAttribute("post", postById);
        return "post_detail";
    }

    @RequestMapping("/post/create")
    public String getPostCreatePage() {
        return "post_write";
    }

}
