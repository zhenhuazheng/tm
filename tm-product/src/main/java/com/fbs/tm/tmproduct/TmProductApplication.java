package com.fbs.tm.tmproduct;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@MapperScan("com.fbs.tm.tmproduct.mapper")
@SpringBootApplication
@EnableAspectJAutoProxy // 开启aop
public class TmProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(TmProductApplication.class, args);
    }

}
