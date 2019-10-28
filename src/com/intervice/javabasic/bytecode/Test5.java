package com.intervice.javabasic.bytecode;
//如果是++count就是22 22；如果是count++就是21 21
public class Test5 {
    int count = 21;
    public void count() {
        System.out.println(count++);
    }
    public static void main(String args[]) {
        new Test5().count();
        new Test5().count();
    }
}
