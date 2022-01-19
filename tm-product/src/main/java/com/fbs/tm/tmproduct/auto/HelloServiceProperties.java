package com.fbs.tm.tmproduct.auto;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 自动配置类 - 配置
 */
@ConfigurationProperties(prefix = "hello")
@Data
public class HelloServiceProperties {

    private static final String MSG = "world";

    private String msg = MSG;


}
