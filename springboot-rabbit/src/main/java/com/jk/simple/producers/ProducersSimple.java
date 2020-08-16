package com.jk.simple.producers;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @ProjectName: year-task
 * @Package: com.jk.simple.producers
 * @ClassName: ProducersSimple
 * @Author: 梁浩
 * @Description: 生产者
 * @Date: 2020/6/4 21:13
 * @Version: 1.0
 */
@Component
public class ProducersSimple {
    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send(){
        String msg = "hello word";
        System.out.println("生产者发送消息"+msg);
        this.amqpTemplate.convertAndSend("queue_simple",msg);
    }


}
