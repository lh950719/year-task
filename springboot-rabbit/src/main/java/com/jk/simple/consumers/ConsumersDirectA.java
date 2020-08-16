package com.jk.simple.consumers;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @ProjectName: year-task
 * @Package: com.jk.simple.consumers
 * @ClassName: ConsumersDirectA
 * @Author: 梁浩
 * @Description: 消费者A
 * @Date: 2020/6/4 23:58
 * @Version: 1.0
 */
@Component
@RabbitListener(queues = "queue_direct_a")
public class ConsumersDirectA {
    @RabbitHandler
    public void process(String message){
        System.out.println("这是消费者A接收的消息    ："+message);
    }
}
