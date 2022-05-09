package com.deqode.backend2.springpractice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringpracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringpracticeApplication.class, args);
		
	}
	
	@RequestMapping(value="/welcome")
	public String hello() {
		return "Hello World";
	}

}
