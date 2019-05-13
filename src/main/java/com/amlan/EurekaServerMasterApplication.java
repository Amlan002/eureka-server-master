package com.amlan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
@ConfigurationProperties("localconfig")
public class EurekaServerMasterApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerMasterApplication.class, args);
	}

}
