package com.jk.simple.config;
import org.springframework.amqp.core.Queue;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;



/**
 * @ProjectName: year-task
 * @Package: com.jk.simple.config
 * @ClassName: RabbitConfigWork
 * @Author: 梁浩
 * @Description: Work模式
 * @Date: 2020/6/4 22:18
 * @Version: 1.0
 */
@Component
public class RabbitConfigWork {
    private static final String queue_work="work1111";

    @Bean
    public Queue queueWork(){
        return new Queue("queue_work");
    }
}
