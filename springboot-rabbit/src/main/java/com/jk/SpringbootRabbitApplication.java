package com.jk;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

@SpringBootApplication
@Component("com.jk")
public class SpringbootRabbitApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootRabbitApplication.class, args);
    }

}
