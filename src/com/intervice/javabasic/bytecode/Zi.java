package com.intervice.javabasic.bytecode;

public class Zi extends Fu {
    public int num = 1000;
    public int num2 = 200;

    @Override
    public void show() {
        System.out.println("show Zi");
    }

    public void method() {
        System.out.println("method zi");
    }

    public static void function() {
        System.out.println("function Zi");
    }
}
