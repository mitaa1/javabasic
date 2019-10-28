package com.intervice.javabasic.bytecode;

public class child extends Peron {
    public String grade;

    public static void main(String[] args) {
        Peron p=new child();
        System.out.println(p.age);
    }

}
