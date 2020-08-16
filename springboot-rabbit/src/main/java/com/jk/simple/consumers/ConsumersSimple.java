package com.jk.simple.consumers;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @ProjectName: year-task
 * @Package: com.jk.simple.consumers
 * @ClassName: ConsumersSimple
 * @Author: 梁浩
 * @Description: 消费者
 * @Date: 2020/6/4 21:20
 * @Version: 1.0
 */
@Component
@RabbitListener(queues = "queue_simple")
public class ConsumersSimple {

    @RabbitHandler
    public void process(String message){
        System.out.println("消费者消费消息 ："+message);
    }
}
