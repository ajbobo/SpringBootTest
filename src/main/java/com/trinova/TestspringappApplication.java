package com.trinova;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@SpringBootApplication
public class TestspringappApplication {

	@RequestMapping("/hello")
	@ResponseBody
	public String hello() {
		return "Hello out there in TV Land!";
	}

	@RequestMapping("/testing")
	public String stuff() {
		return "stuff.html";
	}

	public static void main(String[] args) {
		SpringApplication.run(TestspringappApplication.class, args);
	}
}
