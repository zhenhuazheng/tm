package com.fbs.tm.tmproduct;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("mapper")
@SpringBootApplication
public class TmProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(TmProductApplication.class, args);
    }

}
