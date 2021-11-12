package com.cx.mq.topic;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *  topic exchange方式
 * @author: chenxin
 * @date: 2019/12/18 14:46
 */
@Configuration
public class TopicConfig {

    public static final String EXCHANGE = "maersk_receivedTopicExchange";
    public static final String QUEUE_NAME_ONE   = "maersk_receivedTopicQueue";
    /**
     * 声明一个名为topic.message1的队列
     */
    @Bean
    public Queue topicQueue() {
        return new Queue(QUEUE_NAME_ONE);
    }
    /**
     * 声明一个名为exchange的TopicExchange交换器
     */
    @Bean
    public TopicExchange exchange() {
        return new TopicExchange(EXCHANGE);
    }
    /**
     * 将队列绑定到exchange交换器
     * 说明：
     * 消息匹配跟交换器名和队列名无关， 取决于队列绑定交换器时配置的routingKey/叫binding key和发消息时配置的routingKey
     *  这里将队列绑定到交换器时指定的routingKey为receivedTopic.*，说明生产者往这个交换器中发数据时指定的routingKey与topic.开头后接一个词的消息都会被队列1获取到！
     *  * ：可以替代一个词
     *  #：可以替代0或者更多的词：key.#表示以key.开始的都被绑定
     */
    @Bean
    public Binding bindMessage() {
        return BindingBuilder.bind(topicQueue()).to(exchange()).with("receivedTopic.*");
    }

}
