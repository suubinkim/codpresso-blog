package com.codepresso.codpressoblog.mapper;

import com.codepresso.codpressoblog.vo.Post;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PostMapper {
    List<Post> findAll();
}
