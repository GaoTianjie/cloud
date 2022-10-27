package com.sky.cloud.sharejdbc;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.concurrent.atomic.AtomicInteger;

public class JavaDemo {


    public static void main(String[] args) throws InterruptedException {
        Thread thread2;
        Thread thread1;
        thread2= new Thread(() -> {
            synchronized (JavaDemo.class) {
                try {
                    System.out.println("hello world2 start");
                    JavaDemo.class.notify();
                    Thread.sleep(10000L);
                    System.out.println("hello world2 end");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        thread1 = new Thread(() -> {
            synchronized (JavaDemo.class) {
                try {
                    thread2.start();
                    System.out.println("hello world1 start");
                    JavaDemo.class.wait();
                    System.out.println("hello world1 end");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        thread1.start();

    }

}
