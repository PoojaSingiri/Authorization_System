package com.challenge.authorizationSystem.service;

import com.challenge.authorizationSystem.models.Post;

import java.util.List;

public interface PostService {
    public List<Post> getAllPost();
    public Post savePostDetails(Post post);
}
