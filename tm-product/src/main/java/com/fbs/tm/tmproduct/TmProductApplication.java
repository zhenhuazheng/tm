package com.fbs.tm.tmproduct;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.ImportResource;

@MapperScan("com.fbs.tm.tmproduct.mapper")
@SpringBootApplication
@EnableAspectJAutoProxy // 开启aop
//@ImportResource({"classpath:spring-ext.xml"})//引入其他的配置
public class TmProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(TmProductApplication.class, args);
    }

}
