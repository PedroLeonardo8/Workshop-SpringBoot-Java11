package com.example.workshopspring.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.example.workshopspring.entities.Order;
import com.example.workshopspring.entities.User;
import com.example.workshopspring.repositories.OrderRepository;
import com.example.workshopspring.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private OrderRepository orderRepository;

	@Override
	public void run(String... args) throws Exception {

		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		
		Order o1= new Order(null, Instant.parse("2020-02-16T16:00:09Z"), u1);
		Order o2= new Order(null, Instant.parse("2020-03-20T22:14:09Z"), u2);
		Order o3= new Order(null, Instant.parse("2020-02-16T06:39:20Z"), u1);

		userRepository.saveAll(Arrays.asList(u1, u2));
		orderRepository.saveAll(Arrays.asList(o1,o2,o3));
	}
}