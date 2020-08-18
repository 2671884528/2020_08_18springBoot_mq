package com.gyg.mq.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import javax.jms.Queue;
import java.util.UUID;

/**
 * @auther 郭永钢
 * @data 2020/8/17 23:48
 * @desc:
 */
@Service
public class QueueProduceService {
    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;
    @Autowired
    private Queue queue;

    public void productQueue(){
        jmsMessagingTemplate.convertAndSend(queue, UUID.randomUUID().toString().substring(0,6));
    }
//    @Scheduled(cron = "0/3 * * * * *")
//    public void timingTask(){
//        jmsMessagingTemplate.convertAndSend(queue, UUID.randomUUID().toString().substring(0,6));
//        System.out.println("scheduled:************");
//    }
}
