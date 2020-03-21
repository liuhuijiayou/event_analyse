package com.hui.eventanalyse;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hui.eventanalyse.dao")
public class EventanalyseApplication {

    public static void main(String[] args) {
        SpringApplication.run(EventanalyseApplication.class, args);
    }

}
