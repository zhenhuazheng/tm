package com.fbs.tm.tmproduct.confuguration;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;

@Configuration
@EnableAsync // 开启异步功能
@EnableScheduling // 开启计划任务功能
public class Config implements AsyncConfigurer {

    /**
     * 使用：使用@Async来注解类或者方法，并且默认使用此线程池来异步执行任务
     * @return
     */
    @Override
    public Executor getAsyncExecutor(){
        ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
        taskExecutor.setCorePoolSize(5);
        taskExecutor.setMaxPoolSize(10);
        taskExecutor.setQueueCapacity(25);
        taskExecutor.initialize();
        return taskExecutor;
    }

    /**
     * 每天12点执行产品的更新任务
     * 规则：fixedRate 间隔多少时间执行任务
     */
    @Scheduled(cron = "0 0 12 ? * *")
    public void updateProductInfo(){

    }

}
