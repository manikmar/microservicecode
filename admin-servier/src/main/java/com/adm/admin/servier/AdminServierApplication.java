package com.adm.admin.servier;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableAdminServer
@EnableEurekaClient // comments
public class AdminServierApplication {
	public static void main(String[] args) {
		SpringApplication.run(AdminServierApplication.class, args);
	}

}
