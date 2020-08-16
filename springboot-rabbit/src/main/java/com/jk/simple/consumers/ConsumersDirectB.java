package com.jk.simple.consumers;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @ProjectName: year-task
 * @Package: com.jk.simple.consumers
 * @ClassName: ConsumersDirectB
 * @Author: 梁浩
 * @Description: 消费者B
 * @Date: 2020/6/5 0:00
 * @Version: 1.0
 */
@Component
@RabbitListener(queues = "queue_direct_b")
public class ConsumersDirectB {
    @RabbitHandler
    public void process(String message){
        System.out.println("这是消费者B接收的消息："+message);
    }
}
