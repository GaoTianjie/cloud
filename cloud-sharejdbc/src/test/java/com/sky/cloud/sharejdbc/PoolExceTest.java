package com.sky.cloud.sharejdbc;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class PoolExceTest {

    public static void main(String[] args) {
        ThreadPoolExecutor poolExecutor = new ThreadPoolExecutor(1, 1, 0, TimeUnit.SECONDS, new ArrayBlockingQueue<>(1),
                new ThreadPoolExecutor.CallerRunsPolicy());

        for (int i = 0; i < 10; i++ ) {
            try {
                Runnable run = new MyRunnable("task-" + i) ;

                poolExecutor.execute(run);
            } catch (Exception e) {

            }

        }

        poolExecutor.shutdown();

    }
}

class MyRunnable implements Runnable {
    private String name;

    public MyRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("this name : " + this.name + " is running");
    }
}
