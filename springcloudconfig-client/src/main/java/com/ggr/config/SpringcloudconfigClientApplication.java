package com.ggr.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RefreshScope
public class SpringcloudconfigClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudconfigClientApplication.class, args);
	}
	
	 @Value("${foo}")
	    String myww;
	 @Value("${democonfigclient.message}")
	 	String message;
	    @RequestMapping(value = "/hi")
	    public String hi(){
	        return myww+","+message;
	    }
}
