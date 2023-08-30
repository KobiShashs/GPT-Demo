package com.jb.demogpt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource(value = "classpath:/secrets.properties")
public class DemoGptApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoGptApplication.class, args);
	}

}
