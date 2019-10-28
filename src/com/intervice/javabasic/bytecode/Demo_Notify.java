package com.intervice.javabasic.bytecode;

public class Demo_Notify {
    public static void main(String[] args) {
        final Printer p = new Printer();

        new Thread() {
            //线程1
            @Override
            public void run() {
                while(true) {
                    try {
                        p.print1();
                    } catch (InterruptedException e) {

                        e.printStackTrace();
                    }
                }
            }
        }.start();

        new Thread() {   //线程2
            @Override
            public void run() {
                while(true) {
                    try {
                        p.print2();
                    } catch (InterruptedException e) {

                        e.printStackTrace();
                    }
                }
            }
        }.start();
    }
}

//等待唤醒机制
class Printer {
    private int flag = 1;
    public void print1() throws InterruptedException {
        synchronized(this) {
            if(flag != 1) {
                this.wait(); //当前线程等待，直到被唤醒
            }
            System.out.print("黑");
            System.out.print("马");
            System.out.print("程");
            System.out.print("序");
            System.out.print("员");
            System.out.print("\r\n");
            flag = 2;
            this.notify();  //随机唤醒单个等待的线程，此时仍然具有执行权，上面使得线程进入等待
        }
    }

    public void print2() throws InterruptedException {



        synchronized(this) {
            if(flag != 2) {
                this.wait();
            }
            System.out.print("传");
            System.out.print("智");
            System.out.print("播");
            System.out.print("客");
            System.out.print("\r\n");
            flag = 1;
            this.notify();
        }
    }
}

