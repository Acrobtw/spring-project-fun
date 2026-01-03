package com.example.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.store.registration.UserService;
import com.example.store.service.OrderService;

@SpringBootApplication
public class StoreApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(StoreApplication.class, args);
		var userService = context.getBean(UserService.class);

		userService.registerUser(new User(1L, "acrobtw@gmail.com", "12341234", "Nick"));
	}

}
