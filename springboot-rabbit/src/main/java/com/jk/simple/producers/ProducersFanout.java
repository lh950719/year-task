package com.jk.simple.producers;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @ProjectName: year-task
 * @Package: com.jk.simple.producers
 * @ClassName: ProducersFanout
 * @Author: 梁浩
 * @Description: 订阅模式
 * @Date: 2020/6/4 23:23
 * @Version: 1.0
 */
@Component
public class ProducersFanout {

    @Autowired
    private AmqpTemplate amqpTemplate;

    /*
    *
     *功能描述 订阅模式下生产者发送消息 faout模式下routingKey为空即可
     * @author LiangHao
     * @Email  18335951573@163.com
     * @date 2020/6/4
     * @param null
     * @return
     */


    public void send(){
        String msg = "这是订阅模式的消息";
        System.out.println("订阅模式发送消息 ："+msg);
        this.amqpTemplate.convertAndSend("fanoutExchange","",msg);
    }
}
