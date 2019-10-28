package com.intervice.javabasic.bytecode;

public class Test3 {
    static int a;
    int b;
    static int c;

    public int aMethod() {
        a++;
        return a;
    }

    public int bMethod() {
        b++;
        return b;
    }

    public static int cMethod() {
        c++;
        return c;
    }

    public static void main(String args[]) {
        Test3 test1 = new Test3();
        test1.aMethod();
        System.out.println(test1.aMethod());
        Test3 test2 = new Test3();
        test2.bMethod();
        System.out.println(test2.bMethod());
        Test3 test3 = new Test3();
        test3.cMethod();
        System.out.println(test3.cMethod());
    }
}
