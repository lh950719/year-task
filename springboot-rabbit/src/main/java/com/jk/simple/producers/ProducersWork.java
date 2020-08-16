package com.jk.simple.producers;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sun.util.resources.cldr.is.TimeZoneNames_is;

/**
 * @ProjectName: year-task
 * @Package: com.jk.simple.producers
 * @ClassName: ProducersWork
 * @Author: 梁浩
 * @Description: 生产者发送多个消息
 * @Date: 2020/6/4 22:25
 * @Version: 1.0
 */
@Component
public class ProducersWork {
    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send() throws InterruptedException {
        for(int i = 0;i<=10;i++){
            String msg = "work模式["+i+"]";
            System.out.println("Work模式之生产者发送消息 ："+msg);
            this.amqpTemplate.convertAndSend("queue_work",msg);
            Thread.sleep(100);
        }
    }
}
