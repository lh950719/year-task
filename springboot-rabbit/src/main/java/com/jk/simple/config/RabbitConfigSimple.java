package com.jk.simple.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * @ProjectName: year-task
 * @Package: com.jk.simple.config
 * @ClassName: RabbitConfigSimple
 * @Author: 梁浩
 * @Description: 简单队列
 * @Date: 2020/6/4 20:46
 * @Version: 1.0
 */
@Configuration
public class RabbitConfigSimple {

    public static final String queue_simple = "queue_simple";
    @Bean
    public Queue queueSimple(){

        return new Queue(queue_simple);
    }
}
