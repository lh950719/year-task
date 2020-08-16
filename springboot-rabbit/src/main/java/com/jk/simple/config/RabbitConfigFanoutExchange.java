package com.jk.simple.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * @ProjectName: year-task
 * @Package: com.jk.simple.config
 * @ClassName: RabbitCOnfigFaoutExchange
 * @Author: 梁浩
 * @Description: rabbit订阅模式
 * @Date: 2020/6/4 22:56
 * @Version: 1.0
 */
@Configuration
public class RabbitConfigFanoutExchange {

   //配置两个队列名称
    public static final String queueA = "queue_fanout_A";

    public static final String queueB = "queue_fanout_B";

    //交换机名称
    public static final String exchange = "fanoutExchange";

    @Bean
    public Queue queueFanoutA(){
        return new Queue(queueA);
    }

    @Bean
    public Queue queueFanoutB(){
        return new Queue(queueB);
    }

    //声明一个fanout类型的交换机
    @Bean
    public FanoutExchange fanoutExchange(){
        return new FanoutExchange(exchange);
    }


    //绑定queue队列到交换机，并且指定routingKey(路由钥匙)

    /*
    *
     *功能描述 绑定queue队列到交换机，并且指定routingKey(路由钥匙)
     * @author LiangHao
     * @Email  18335951573@163.com
     * @date 2020/6/4
     * @param queueFanoutA 对应注入queueFanoutA()方法
     * @param fanoutExchange 对应fanoutExchange()
     * @return
     */


    @Bean
    public Binding bindingFanoutExchangeA(Queue queueFanoutA,FanoutExchange fanoutExchange){
        return BindingBuilder.bind(queueFanoutA).to(fanoutExchange);    }

    @Bean
    public Binding bindingFanoutExchangeB(Queue queueFanoutB, FanoutExchange  fanoutExchange) {
        return BindingBuilder.bind(queueFanoutB).to(fanoutExchange);
    }

}
