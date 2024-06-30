package com.graphqlDemo.qraphql;

import com.graphqlDemo.qraphql.Model.Post;
import com.graphqlDemo.qraphql.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Collections;

@SpringBootApplication
public class QraphqlApplication {

	@Autowired
	UserService userService;
	public static void main(String[] args) {
		SpringApplication.run(QraphqlApplication.class, args);
	}
	@Bean
	CommandLineRunner DefaultCreator() {
		return args -> {
			userService.createUser("aaa","aaa@gmail.com", new Post("1","aa,","1234567"));
			userService.createUser("bbb","bbb@gmail.com",new Post("2","a22a,","123213e4567"));
		};
	}

}
