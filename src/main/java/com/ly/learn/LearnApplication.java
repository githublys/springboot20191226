package com.ly.learn;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class LearnApplication {

    public static void main(String[] args) {
        try {
            SpringApplication.run(LearnApplication.class, args);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}
