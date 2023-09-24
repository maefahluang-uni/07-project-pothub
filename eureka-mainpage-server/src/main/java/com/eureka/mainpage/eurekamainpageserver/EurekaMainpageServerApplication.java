package com.eureka.mainpage.eurekamainpageserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaMainpageServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaMainpageServerApplication.class, args);
	}

}
