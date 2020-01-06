package com.ly.learn;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.ly.learn.mapper")
@Slf4j
public class LearnApplication {

    public static void main(String[] args) {
        log.info("spring boot start ....");
        SpringApplication.run(LearnApplication.class, args);
        log.info("spring boot started");
    }

}
