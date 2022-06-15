package com.pedalo.singleton;

public class DemoMultiThread {
    public static void main(String[] args) {
        Thread oneThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Singleton.getInstance("one").value);
            }
        });
        Thread twoThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Singleton.getInstance("two").value);
            }
        });
        oneThread.start();
        twoThread.start();
    }
}
