package com.practice.service.impl;

import com.practice.entity.Post;
import com.practice.payload.PostDto;
import com.practice.repository.PostRepository;
import com.practice.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl  implements PostService {
    @Autowired
    private PostRepository postRepository;


    @Override
    public PostDto savePost(PostDto postdto) {
        Post post = new Post();
        post.setTitle(postdto.getTitle());
        post.setDescription(post.getDescription());
        post.setContent(postdto.getContent());
        Post savePost = postRepository.save(post);

        PostDto dto = new PostDto();
      dto.setId(savePost.getId());
        dto.setDescription(savePost.getDescription());
        dto.setTitle(savePost.getTitle());
        dto.setContent(savePost.getContent());
        return dto;
    }
}
