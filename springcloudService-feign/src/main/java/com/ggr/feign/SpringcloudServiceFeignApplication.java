package com.ggr.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableHystrixDashboard//开启hystrix仪表盘
@EnableHystrix//断路由器注解
public class SpringcloudServiceFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudServiceFeignApplication.class, args);
	}
}
