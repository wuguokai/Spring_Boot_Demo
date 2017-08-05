package com.wisely.ch5_2_3;

import jdk.internal.org.objectweb.asm.commons.Method;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController//省略控制类，直接写在入口类
@SpringBootApplication
public class Ch523Application {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(){
		return "Hello Spring Boot!";
	}

	public static void main(String[] args) {
		SpringApplication.run(Ch523Application.class, args);
	}
}
