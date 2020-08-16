package com.jk.lh.rabble;

/**
 * @ProjectName: year-task
 * @Package: com.jk.lh.rabble
 * @ClassName: TestThread
 * @Author: 梁浩
 * @Description: 1
 * @Date: 2020/6/2 9:52
 * @Version: 1.0
 */
public class TestThread {

    public static void main(String[] args) {

        RunnableDemo r1 = new RunnableDemo("线程一");
        r1.start();

        RunnableDemo r2 = new RunnableDemo("线程二");
        r2.start();

    }
}
