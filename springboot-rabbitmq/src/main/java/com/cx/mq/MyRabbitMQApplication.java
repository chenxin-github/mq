package com.cx.mq;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableRabbit // 开启基于注解的rabbit功能
@EnableScheduling // 开启基于注解的定时功能
@SpringBootApplication
public class MyRabbitMQApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyRabbitMQApplication.class, args);
    }
}
