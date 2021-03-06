package com;

import com.config.MyConfig;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.core.env.Environment;


@SpringBootApplication
@EnableConfigurationProperties(MyConfig.class)
public class Application {
    public static final Log log = LogFactory.getLog(Application.class);

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Application.class, args);
        Environment environment = ctx.getEnvironment();
        System.out.println(environment.getProperty("username"));
        System.out.println(environment.getProperty("server.address1"));
        System.out.println(((MyConfig)ctx.getBean("myConfig")).getAddress1());
        System.out.println();
        System.out.println(ctx.getBean("testConfig"));
//        System.out.println(1/0);
//        log.info("iterator all context bean");
//        for (String name : ctx.getBeanDefinitionNames()) {
//            log.info(String.format("%s:%s",name,ctx.getBean(name)));
//        }
    }
}