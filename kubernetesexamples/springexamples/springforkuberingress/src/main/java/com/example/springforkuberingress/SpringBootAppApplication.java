package com.example.springforkuberingress;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@RestController
@RequestMapping("/kuber")
public class SpringBootAppApplication {

	@RequestMapping("/hello")
	public String home() {
		return "Hello Kubernetes for Ingress:2.0!";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAppApplication.class, args);
	}

}