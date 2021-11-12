package com.cx.mq.topic;

import com.alibaba.fastjson.JSONObject;
import com.cx.mq.model.OrderReceivedRecord;
import com.rabbitmq.tools.json.JSONUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.Date;

/**
 *  生产者
 * @author: chenxin
 * @date: 2019/12/18 14:46
 */
@Component
@Slf4j
public class TopicProducer {

    @Resource
    private AmqpTemplate rabbitTemplate;

    public void send() {
        String message = "I am topic.message,time:"+System.currentTimeMillis();
        // Topic是通配符模式，第二个参数就是routingKey
        this.rabbitTemplate.convertAndSend(TopicConfig.EXCHANGE, "receivedTopic.routingKey1", message);
    }


    public void sendReceivedData() {
        OrderReceivedRecord data = new OrderReceivedRecord();
        data.setAmazonOrderNo("亚马逊订单号12456");
        data.setActualCtns(1000);
        data.setActualGw(new BigDecimal("10.4"));
        data.setActualCbm(new BigDecimal("9.9"));
        data.setActualCw(new BigDecimal("5.0"));
        data.setCreateTime(new Date());
        // 等等其他属性
        // Topic是通配符模式，第二个参数就是routingKey
        this.rabbitTemplate.convertAndSend(TopicConfig.EXCHANGE, "receivedTopic.maersk", JSONObject.toJSONString(data).getBytes());
    }
}
