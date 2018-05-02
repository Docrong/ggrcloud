package com.ggr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
public class SpringcloudzipkinApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudzipkinApplication.class, args);
	}
}
