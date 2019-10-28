package com.intervice.javabasic.bytecode;

public class Student {
    int age;
    String name;
    public Student(String name,int age){
        this.age=age;
        this.name=name;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }


}
