package com.rahul.discoveryserver1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class DiscoveryServer1Application {

	public static void main(String[] args) {
		SpringApplication.run(DiscoveryServer1Application.class, args);
	}

}
