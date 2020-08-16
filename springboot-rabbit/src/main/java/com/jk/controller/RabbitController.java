package com.jk.controller;

import com.jk.simple.producers.ProducersDirect;
import com.jk.simple.producers.ProducersFanout;
import com.jk.simple.producers.ProducersSimple;
import com.jk.simple.producers.ProducersWork;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ProjectName: year-task
 * @Package: com.jk.controller
 * @ClassName: RabbitController
 * @Author: 梁浩
 * @Description: 测试rabbit
 * @Date: 2020/6/4 21:25
 * @Version: 1.0
 */
@Controller
@RequestMapping("rabbit")
public class RabbitController {


    //简单模式
    @Autowired
    private ProducersSimple producersSimple;

    @RequestMapping("send")
    public void send() throws Exception{
        System.out.println("11111111111111");
        producersSimple.send();
    }


    //work模式
    @Autowired
    private ProducersWork producersWork;

    @RequestMapping("sendWork")
    public void sendWork() throws Exception{
        System.out.println("work模式");
        producersWork.send();
    }


    //订阅模式
    @Autowired
    private ProducersFanout producersFanout;

    @RequestMapping("fanout")
    public void sendFanout(){
        System.out.println("订阅模式");
        producersFanout.send();
    }

    //路由模式
    private ProducersDirect producersDirect;

    @RequestMapping("directA")
    public void sendDirectA() throws Exception{
        System.out.println("路由模式A");
        producersDirect.sendA();
        System.out.println("路由模式Aaaaaas");

    }

    @RequestMapping("directB")
    public void sendDirectB() throws Exception{
        System.out.println("路由模式B");
        producersDirect.sendB();
        System.out.println("路由模式bbbb");

    }






}
