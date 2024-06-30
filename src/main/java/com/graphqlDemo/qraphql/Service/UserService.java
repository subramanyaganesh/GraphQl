package com.graphqlDemo.qraphql.Service;

import com.graphqlDemo.qraphql.Model.Post;
import com.graphqlDemo.qraphql.Model.User;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UserService {


    private Map<String, User> users = new HashMap<>();
    private int idCounter = 1;

    public User getUserById(String id) {
        return users.get(id);
    }

    public List<User> userList() {
        return users.values().stream().toList();
    }

    public User createUser(String name, String email,Post post) {
        String id = String.valueOf(idCounter++);
        User user = new User();
        user.setId(id);
        user.setName(name);
        user.setEmail(email);
        user.setPosts(Collections.singletonList(post));
        users.put(id, user);
        return user;
    }
    public User updateUser(String id,String name){
        users.get(id).setName(name);
        return users.get(id);
    }
}
