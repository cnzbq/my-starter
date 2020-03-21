package com.zbq.mydream.starter;

import com.zbq.mydream.config.MyConfig;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 自动配置类
 *
 * @author zbq
 * @since 2020/3/21
 */
@Configuration
@EnableConfigurationProperties(MyDreamProperties.class)
@ComponentScan(basePackages = "com.zbq.mydream")
public class MyDreamAutoConfiguration {
    private final MyDreamProperties properties;

    public MyDreamAutoConfiguration(MyDreamProperties properties) {
        this.properties = properties;
    }

    @Bean
    public MyConfig myConfig() {
        MyConfig myConfig = new MyConfig();
        myConfig.setUserName(properties.getUserName());
        myConfig.setAge(properties.getAge());
        myConfig.setSex(properties.getSex());
        return myConfig;
    }
}
