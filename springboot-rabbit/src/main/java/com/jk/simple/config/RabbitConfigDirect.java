package com.jk.simple.config;


import org.springframework.amqp.core.Binding;

import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;



/**
 * @ProjectName: year-task
 * @Package: com.jk.simple.config
 * @ClassName: RabbitConfigDirect
 * @Author: 梁浩
 * @Description: 路由模式
 * @Date: 2020/6/4 23:40
 * @Version: 1.0
 */
@Configuration
public class RabbitConfigDirect {

    /**
     * 两个消息队列名称
     */
    final static String queueA = "queue_direct_a";
    final static String queueB = "queue_direct_b";

    /**
     *	 交换机名称
     */
    final static String exchange = "directExchange";


    @Bean
    public Queue queueDirectA() {
        return new Queue(RabbitConfigDirect.queueA);
    }

    @Bean
    public Queue queueDirectB() {
        return new Queue(RabbitConfigDirect.queueB);
    }

    /**
     *
     * @method 声明一个direct类型的交换机
     * @author Mr yi
     * @time 2019年6月19日
     * @return
     */
    @Bean
    DirectExchange directExchange() {
        return new DirectExchange(RabbitConfigDirect.exchange);
    }

    /**
     *
     * @method 绑定Queue队列到交换机,并且指定routingKey
     * @author Mr yi
     * @time 2019年6月19日
     * @param queueDirectA 对应注入queueDirectA()方法
     * @param directExchange 对应directExchange()
     * @return
     */
    @Bean
    Binding bindingDirectExchangeA(Queue queueDirectA, DirectExchange  directExchange) {
        return BindingBuilder.bind(queueDirectA).to(directExchange).with("directKeyA");
    }

    @Bean
    Binding bindingDirectExchangeB(Queue queueDirectB, DirectExchange  directExchange) {
        return BindingBuilder.bind(queueDirectB).to(directExchange).with("directKeyB");
    }

}
