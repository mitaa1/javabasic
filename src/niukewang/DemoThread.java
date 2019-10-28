package niukewang;

public class DemoThread extends Thread {
    public static void main(String[] args) {
        DemoThread threadone=new DemoThread();
        DemoThread threadtwo=new DemoThread();
        threadone.start();
        System.out.println("thread one.");
        threadtwo.start();
        System.out.println("thread two.");

    }
    @Override
    public void run(){
        System.out.println("Thread.");
    }
}
/**
 thread one.
 thread two.
 Thread.
 Thread.
 答案是结果不确定。不知道为啥
 */