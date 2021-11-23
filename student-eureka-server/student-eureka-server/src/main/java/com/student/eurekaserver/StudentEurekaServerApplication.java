package com.student.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class StudentEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentEurekaServerApplication.class, args);
	}

}
