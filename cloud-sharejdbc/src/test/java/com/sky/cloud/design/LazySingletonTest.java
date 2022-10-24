package com.sky.cloud.design;

/**
 * 单例设计模式的实现
 */
public class LazySingletonTest {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println("实力对象" + LazySingleton.getInstance().toString());
                }
            }).start();
        }
    }
}

class LazySingleton {
    private static volatile LazySingleton instance;

    private LazySingleton() {

    }

    public static LazySingleton getInstance() {
        if (null == instance) {
            synchronized (LazySingleton.class) {
                if (null == instance) {
                    instance = new LazySingleton();
                }
            }
        }

        return instance;
    }
}
