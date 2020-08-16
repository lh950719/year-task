package com.jk.simple.consumers;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import javax.sound.midi.Soundbank;

/**
 * @ProjectName: year-task
 * @Package: com.jk.simple.consumers
 * @ClassName: ConsumersFanoutB
 * @Author: 梁浩
 * @Description: 消费者B
 * @Date: 2020/6/4 23:31
 * @Version: 1.0
 */
@Component
@RabbitListener(queues = "queue_fanout_B")
public class ConsumersFanoutB {
    @RabbitHandler
    public void process(String message){
        System.out.println("消费者B消费   ："+message);

    }
}
