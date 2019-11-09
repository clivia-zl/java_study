package com.zhl.chapter2;

public interface Animal {

    void run();

    void eat();

    //default关键字实现了在接口中的方法实现
    default void breath(){
        System.out.println("吸入氧气，呼出二氧化碳。");
    }

    static void isAlive(){
        System.out.println("这是静态方法");
    }

}
