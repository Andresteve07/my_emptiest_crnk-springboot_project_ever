package com.steve.sbootandcrnkbasic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(CorsConfig.class)

public class SbootandcrnkbasicApplication {

    public static void main(String[] args) {
        SpringApplication.run(SbootandcrnkbasicApplication.class, args);
    }

}
