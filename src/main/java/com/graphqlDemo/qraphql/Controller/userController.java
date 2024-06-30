package com.graphqlDemo.qraphql.Controller;

import com.graphqlDemo.qraphql.Model.Post;
import com.graphqlDemo.qraphql.Model.User;
import com.graphqlDemo.qraphql.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.Collections;
import java.util.List;

@Controller
public class userController {

    @Autowired
    UserService userService;

    @QueryMapping
    public List<User> getUserList() {
        return userService.userList();
    }

    @QueryMapping
    public User retrieveGetUserById(@Argument String id) {
        return userService.getUserById(id);
    }

    @MutationMapping
    public User updateMakeUser(@Argument String id,@Argument String name){
        return userService.updateUser(id,name);
    }

//    the name of the variables in the argument and the schema name should be the same
//    here we have observed that the object has been converted from/to json
    @MutationMapping
    public User createMakeUser(@Argument String name, @Argument String email, @Argument Post post) {
       return userService.createUser(name, email, post);
    }



}
