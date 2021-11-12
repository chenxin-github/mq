package com.cx.mq.topic;

import com.alibaba.fastjson.JSONObject;
import com.cx.mq.model.OrderReceivedRecord;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.UUID;

/**
 * 消费方处理，提供方不需要消费
 * @author: chenxin
 * @date: 2019/12/18 14:46
 */
@Component
@Slf4j
public class TopicConsumer {

//    @RabbitListener(queues = "maersk_receivedTopicQueue")
//    public void test(String message) {
//        log.info("消费者1收到消息：{}", message);
//    }

    // 消费方处理，提供方不需要消费 测试时可打开
//    @RabbitListener(queues = "maersk_receivedTopicQueue")
//    public void testData(String msg, Message message) {
//        log.info("消费者1收到消息：{}", msg);
//        byte[] data = message.getBody();
//        if(data !=null){
//            String content = new String(data);
//            log.info("消费者收到消息：{}", content);
//            OrderReceivedRecord orderReceivedRecord = JSONObject.parseObject(content, OrderReceivedRecord.class);
//            log.info("消费者收到消息orderReceivedRecord：{}", orderReceivedRecord);
//        }
//    }
}
