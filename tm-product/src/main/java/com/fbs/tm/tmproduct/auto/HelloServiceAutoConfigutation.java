package com.fbs.tm.tmproduct.auto;

import com.fbs.tm.tmproduct.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 需在spring.factories加入内容
 * org.springframework.boot.autoconfigure.EnableAutoConfiguration=\
 * com.fbs.tm.tmproduct.auto.HelloServiceAutoConfigutation
 * 功能：实现对HelloService不存在时的自动配置和注入，且在application.xml时能配置参数
 */
@Configuration
@EnableConfigurationProperties(HelloServiceProperties.class)
@ConditionalOnClass(HelloService.class)//HelloService存在时才有效
@ConditionalOnProperty(prefix = "hello", value = "enabled", matchIfMissing = true)//配置时才起效
public class HelloServiceAutoConfigutation {

    @Autowired
    private HelloServiceProperties helloServiceProperties;

    /**
     * bean未创建时创建
     * @return
     */
    @Bean
    @ConditionalOnMissingBean(HelloService.class)
    public HelloService helloService(){
        HelloService helloService = new HelloService();
        helloService.setMsg(helloServiceProperties.getMsg());
        return helloService;
    }

}
