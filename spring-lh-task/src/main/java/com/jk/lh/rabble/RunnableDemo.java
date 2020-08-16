package com.jk.lh.rabble;

/**
 * @ProjectName: year-task
 * @Package: com.jk.lh.rabble
 * @ClassName: RunnableDemo
 * @Author: 梁浩
 * @Description:
 * @Date: 2020/6/2 9:46
 * @Version: 1.0
 */
public class RunnableDemo implements Runnable{

    private Thread t;
    private String threadName;

    RunnableDemo(String name){
        threadName = name;
        System.out.println("创建一个线程"+threadName);
    }
    @Override
    public void run() {
        System.out.println("运行线程" +  threadName );
        try {
            for(int i = 4; i > 0; i--) {
                System.out.println("Thread: " + threadName + ", " + i);
                // 让线程睡眠一会
                Thread.sleep(50000);
            }
        }catch (InterruptedException e) {
            System.out.println("Thread " +  threadName + " interrupted.");
        }
        System.out.println("Thread " +  threadName + " exiting.");
    }

    public void start () {
        System.out.println("Starting " +  threadName );
        if (t == null) {
            t = new Thread (this, threadName);
            t.start ();
        }
    }
}
