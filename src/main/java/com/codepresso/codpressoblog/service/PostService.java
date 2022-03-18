package com.codepresso.codpressoblog.service;

import com.codepresso.codpressoblog.controller.dto.PostRequestDto;
import com.codepresso.codpressoblog.mapper.PostMapper;
import com.codepresso.codpressoblog.vo.Post;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostMapper postMapper;

    public List<Post> getAllPost() {
        return postMapper.findAll();
    }

    public List<Post> getPostByPage(Integer page, Integer size) {
        return postMapper.findByPage(size, (page - 1) * size);
    }

    public Post getPostById(Integer id) {
        return postMapper.findOne(id);
    }

    public boolean savePost(Post post) {
        Integer result = postMapper.save(post);
        return result == 1;
    }
}
