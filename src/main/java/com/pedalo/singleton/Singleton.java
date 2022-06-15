package com.pedalo.singleton;

final public class Singleton {
    private static Singleton INSTANCE;
    public String value;

    private Singleton(String value) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.value = value;
    }

//    public static Singleton getInstance(String value) {
//        if (INSTANCE == null) {
//            INSTANCE = new Singleton(value);
//        }
//        return INSTANCE;
//    }

//    public static synchronized Singleton getInstance(String value) {
//        if (INSTANCE == null) {
//            INSTANCE = new Singleton(value);
//        }
//        return INSTANCE;
//    }

    public static Singleton getInstance(String value) {
        if (INSTANCE != null) {
            return INSTANCE;
        }
        synchronized (Singleton.class) {
            if (INSTANCE == null) {
                INSTANCE = new Singleton(value);
            }
            return INSTANCE;
        }
    }
}
