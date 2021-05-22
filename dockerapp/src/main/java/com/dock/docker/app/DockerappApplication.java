package com.dock.docker.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DockerappApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerappApplication.class, args);
		/*ApplicationContext ac = SpringApplication.run(DockerappApplication.class, args);
		String[] beans = ac.getBeanDefinitionNames();
		for (String bean : beans){
			System.out.println("bean name --> "+bean);
		}*/

		int count = Runtime.getRuntime().availableProcessors();
		System.out.println("Count of Processors in your laptop:" + count);
	}

}
