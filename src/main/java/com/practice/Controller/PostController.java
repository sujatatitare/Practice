package com.practice.Controller;

import com.practice.payload.PostDto;
import com.practice.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Response;

@RestController
@RequestMapping("/api/post")
public class PostController {
    @Autowired
private PostService postService;

    @PostMapping
    public ResponseEntity<PostDto> savePost(@RequestBody PostDto postdto){

        PostDto dto = postService.savePost(postdto);

        return new ResponseEntity<>(dto,HttpStatus.CREATED);



    }

}
