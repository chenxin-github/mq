package com.cx.mq.topic;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 *  启动器发送数据，只是为了取代controller层来测试
 * @author: chenxin
 * @date: 2019/12/18 14:46
 */
@Component
public class TopicSchedule {
    @Autowired
    TopicProducer topicProducer;

//    @Scheduled(fixedDelay = 50000,initialDelay = 3000)
//    public void test(){
//        this.topicProducer.send();
//    }


    @Scheduled(fixedDelay = 50000,initialDelay = 3000)
    public void testDate(){
        this.topicProducer.sendReceivedData();
    }
}
