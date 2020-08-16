package com.jk.simple.consumers;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @ProjectName: year-task
 * @Package: com.jk.simple.consumers
 * @ClassName: ConsumersFanoutA
 * @Author: 梁浩
 * @Description: 消费者A
 * @Date: 2020/6/4 23:28
 * @Version: 1.0
 */
@Component
@RabbitListener(queues = "queue_fanout_A")
public class ConsumersFanoutA {
    @RabbitHandler
    public void process(String message){
        System.out.println("消费者A的消息  ："+message);
    }
}
