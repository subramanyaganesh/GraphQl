package com.graphqlDemo.qraphql.Service;



import com.graphqlDemo.qraphql.Model.Post;
import com.graphqlDemo.qraphql.Model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class PostService {

    @Autowired
    private UserService userService;

    private Map<String, Post> posts = new HashMap<>();
    private int idCounter = 1;

    public List<Post> getAllPosts() {
        return new ArrayList<>(posts.values());
    }

    public Post createPost(String title, String content, String userId) {
        String id = String.valueOf(idCounter++);
        Post post = new Post();
        post.setId(id);
        post.setTitle(title);
        post.setContent(content);

        User user = userService.getUserById(userId);
        if (user != null) {
            if (user.getPosts() == null) {
                user.setPosts(new ArrayList<>());
            }
            user.getPosts().add(post);
        }

        posts.put(id, post);
        return post;
    }
}
