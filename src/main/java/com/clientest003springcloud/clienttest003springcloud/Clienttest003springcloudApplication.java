package com.clientest003springcloud.clienttest003springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class Clienttest003springcloudApplication {

    public static void main(String[] args) {
        SpringApplication.run(Clienttest003springcloudApplication.class, args);
    }

}
