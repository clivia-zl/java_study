package com.zhl.chapter2;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.breath();
        //jdk8新的静态方法调用
        Animal.isAlive();
    }
}
