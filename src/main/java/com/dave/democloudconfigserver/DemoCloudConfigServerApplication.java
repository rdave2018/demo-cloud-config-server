package com.dave.democloudconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class DemoCloudConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoCloudConfigServerApplication.class, args);
	}
}
