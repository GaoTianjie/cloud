package com.sky.cloud.sharejdbc;

import java.util.Random;
import java.util.concurrent.CountDownLatch;

public class CountDownLatchDemo {
    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(7);
        for (int i = 1; i <= 7; i++) {
           new Thread(new SearchTask(i, latch)).start();
        }
    }
}

class SearchTask implements Runnable {

    private final static Random random = new Random();
    private Integer id;

    private CountDownLatch latch;

    @Override
    public void run() {
        System.out.println("开始寻找七龙珠;");

        int nextInt = random.nextInt(10);

        try {
            Thread.sleep(nextInt * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("寻找了 " + nextInt + "s, 找到了 " + id + "号龙珠。");

        latch.countDown();
    }

    SearchTask(Integer id, CountDownLatch latch) {
        this.id = id;
        this.latch = latch;
    }
}
