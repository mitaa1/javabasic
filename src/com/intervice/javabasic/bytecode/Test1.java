package com.intervice.javabasic.bytecode;

public class Test1 {
    int v1;
    int v2;
    String v3;
    public void test(){
        System.out.println(v1+v2+v3);
        System.out.println(v3+v1+v2);

    }

    public static void main(String[] args) {
        Test1 t=new Test1();
        t.test();
    }
}
