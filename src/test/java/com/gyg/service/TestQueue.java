package com.gyg.service;

import com.gyg.mq.MqApplication;
import com.gyg.mq.service.QueueProduceService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * @auther 郭永钢
 * @data 2020/8/17 23:50
 * @desc:
 */
@SpringBootTest(classes = MqApplication.class)
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class TestQueue {

    @Autowired
    public QueueProduceService service;

    @Test
    public void testQueue() {
        service.productQueue();
    }

}
