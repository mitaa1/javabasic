package com.intervice.javabasic.bytecode;

public class Test6 {
    private static void demo1() {
        Thread A = new Thread(new Runnable() {
            @Override
            public void run() {
                printNumber("A");
            }
        });

        Thread B = new Thread(new Runnable() {
            @Override
            public void run() {
                printNumber("B");
            }
        });

        A.start();
        B.start();
    }
    private static void demo2() {
        Thread A = new Thread(new Runnable() {
            @Override
            public void run() {
                printNumber("A"); } });
        Thread B = new Thread(new Runnable() {
        @Override
        public void run() {
            System.out.println("B 开始等待 A");
        try {
            A.join(); }
        catch (InterruptedException e)
        { e.printStackTrace(); }
        printNumber("B"); } });
        B.start();
        A.start();
    }
    private static void demo3() {
        Object lock = new Object();

        Thread A = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock) {
                    System.out.println("A 1");
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("A 2");
                    System.out.println("A 3");
                }

            }
        });

        Thread B = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (lock) {
                    System.out.println("B 1");
                    System.out.println("B 2");
                    System.out.println("B 3");

                    lock.notify();
                }
            }
        });

        A.start();
        B.start();
    }
    private static void printNumber(String threadName) {
        int i = 0;
        while (i++ < 3) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(threadName + " print: " + i);
        }

    }

    public static void main(String[] args) {
        Test6 t=new Test6();
        //Test6.demo1();
        //Test6.demo2();
        Test6.demo3();
    }
}