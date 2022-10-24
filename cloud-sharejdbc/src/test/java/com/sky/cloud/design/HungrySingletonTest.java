package com.sky.cloud.design;

public class HungrySingletonTest {
    public static void main(String[] args) {

    }
}

/**
 * 饿汉模式：只有在真正主动使用对应的类时，才会出发初始化（当前类是启动类即main函数所在类，直接进行new操作，
 * 访问静态属性、访问静态方法、用反射访问类、初始化一个类的子类等）
 */
class HungrySingleton {

    private static HungrySingleton hungry = new HungrySingleton();

    static {
        System.out.println("HungrySingleton init");
    }

    public static HungrySingleton getInstance() {
        return hungry;
    }
}
