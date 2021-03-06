package com.xinb.register;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringCloudApplication
public class ApplicationRegister {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationRegister.class,args);
    }
}
