package com.graphqlDemo.qraphql.Controller;

import com.graphqlDemo.qraphql.Model.Post;
import com.graphqlDemo.qraphql.Model.User;
import com.graphqlDemo.qraphql.Service.PostService;
import com.graphqlDemo.qraphql.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class postController {

    @Autowired
    PostService postService;

    @QueryMapping
    public List<Post> getAllPosts() {
        return postService.getAllPosts();
    }


}
