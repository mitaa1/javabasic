package com.intervice.javabasic.bytecode;

public class Beta extends Alpha {
    @Override
    public void foo() {
        System.out.println("Bfoo");
    }

    public static void main(String[] args) {
        Alpha a = new Beta();
        Beta b = (Beta)a;
        a.foo();
        b.foo();
    }
}
