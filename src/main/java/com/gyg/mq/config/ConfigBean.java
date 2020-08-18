package com.gyg.mq.config;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.stereotype.Component;

import javax.jms.Queue;

/**
 * @auther 郭永钢
 * @data 2020/8/17 23:46
 * @desc:
 */

@Component
@EnableJms      //开启这个注解
public class ConfigBean {

    @Value("${myqueue}")
    private String myqueue;

    @Bean
    public Queue queue() {
        return new ActiveMQQueue(myqueue);
    }
}
