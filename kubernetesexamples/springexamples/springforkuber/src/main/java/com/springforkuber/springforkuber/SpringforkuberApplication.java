package com.springforkuber.springforkuber;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Date;

@SpringBootApplication
@RestController
@RequestMapping("/kuber")
public class SpringforkuberApplication {

	@GetMapping("/hello")
	public String sayHello() {
		return "Hello World for Kuber on " +   new Date();
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringforkuberApplication.class, args);
	}

}
