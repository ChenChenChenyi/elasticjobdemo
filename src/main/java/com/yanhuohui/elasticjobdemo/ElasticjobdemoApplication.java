package com.yanhuohui.elasticjobdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import javax.sql.DataSource;

@SpringBootApplication
//@ImportResource("classpath:elasticjob.xml")
public class ElasticjobdemoApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(ElasticjobdemoApplication.class, args);
    }

}
