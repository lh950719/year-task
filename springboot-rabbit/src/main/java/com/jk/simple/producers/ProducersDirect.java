package com.jk.simple.producers;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Component;

/**
 * @ProjectName: year-task
 * @Package: com.jk.simple.producers
 * @ClassName: ProducersDirect
 * @Author: 梁浩
 * @Description: 路由模式生产者
 * @Date: 2020/6/4 23:54
 * @Version: 1.0
 */
@Component
public class ProducersDirect {
    @Autowired
    private AmqpTemplate amqpTemplate;

    /**
     *
     * @method 生产者发送消息,direct模式下需要传递一个routingKey
     * @author Mr yi
     * @time 2019年6月19日
     * @throws Exception
     */
    public void sendA() throws Exception {
        String context = "direct message";
        System.out.println("Producers sends messageA: " + context);
        this.amqpTemplate.convertAndSend("directExchange", "directKeyA", context);
    }

    /**
     *
     * @method 生产者发送消息,direct模式下需要传递一个routingKey
     * @author Mr yi
     * @time 2019年6月19日
     * @throws Exception
     */
    public void sendB() throws Exception {
        String context = "direct message";
        System.out.println("Producers sends messageB: " + context);
        this.amqpTemplate.convertAndSend("directExchange", "directKeyB", context);
    }

}
