package com.mevur.dev.ekserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author mevur
 * @date 2018/1/25
 */

@SpringBootApplication
@EnableEurekaServer
public class EkServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EkServerApplication.class, args);
	}
}
