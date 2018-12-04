package com.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigDemo {
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    public TestConfig testConfig() {
        return new TestConfig();
    }
}
