package com.intervice.javabasic.bytecode;

public class A {
    public int func1(int a,int b){return a-b;}

}
class B extends A{
    @Override
    public int func1(int a,int b){
        return a+b;
    }
}
class ChildClass{
    public static void main(String[] args) {
        A a=new B();
        B b=new B();
        System.out.println(a.func1(100,50));
        System.out.println(b.func1(100,50
        ));
    }
}