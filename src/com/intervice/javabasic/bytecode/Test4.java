package com.intervice.javabasic.bytecode;

public class Test4 {
    public static void main(String[] args) {
        String str=null;
        str.concat("abc");
        str.concat("123");
        System.out.println(str);
    }
}
