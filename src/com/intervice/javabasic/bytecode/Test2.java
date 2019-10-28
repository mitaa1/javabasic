package com.intervice.javabasic.bytecode;

public class Test2 {
    public static void main(String[] args) {
        String str1 = "精彩";
        String str2 = "笔记";
        System. out. println(String. format("str1：%d | str2：%d", str1. hashCode(),str2. hashCode()));
                System. out. println(str1. equals(str2)) ;
    }
}
