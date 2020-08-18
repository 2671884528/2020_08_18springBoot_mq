package com.gyg.service;

import com.gyg.mq.MqApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.jms.JMSException;
import javax.jms.Queue;
import javax.jms.TextMessage;

/**
 * @auther 郭永钢
 * @data 2020/8/18 1:50
 * @desc:
 */
@SpringBootTest(classes = MqApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class TestCustomer {

//    @JmsListener(destination = "${myqueue}")
//    @Test
//    public void customer(TextMessage message) throws JMSException {
//        System.out.println(message.getText());
//    }
}
