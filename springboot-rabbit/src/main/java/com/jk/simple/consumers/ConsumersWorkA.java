package com.jk.simple.consumers;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @ProjectName: year-task
 * @Package: com.jk.simple.consumers
 * @ClassName: ConsumersWorkA
 * @Author: 梁浩
 * @Description: 消费者A
 * @Date: 2020/6/4 22:32
 * @Version: 1.0
 */
@Component
@RabbitListener(queues = "queue_work")
public class ConsumersWorkA {

    @RabbitHandler
    public void press(String message){
        System.out.println("消费者A接受消息"+message);
    }
}
