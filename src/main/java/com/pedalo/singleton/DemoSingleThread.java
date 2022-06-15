package com.pedalo.singleton;

public class DemoSingleThread {
    public static void main(String[] args) {
        Singleton singletonOne = Singleton.getInstance("one");
        Singleton singletonTwo = Singleton.getInstance("two");
        System.out.println("com.pedalo.singleton one: " + singletonOne.value);
        System.out.println("com.pedalo.singleton two: " + singletonTwo.value);
    }
}
