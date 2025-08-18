package com.hn.tgu.hospital.api.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(
    exclude = {
        org.springframework.boot.actuate.autoconfigure.metrics.SystemMetricsAutoConfiguration.class
    }
)
public class ApiGatewayApplication {
    public static void main(String[] args) {
        String profile = System.getenv("PROFILE");
        if (profile != null) {
            System.setProperty("spring.profiles.active", profile);
        }
        SpringApplication.run(ApiGatewayApplication.class, args);
    }
}
