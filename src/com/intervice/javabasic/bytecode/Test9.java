package com.intervice.javabasic.bytecode;

public class Test9 {
    int func1()
    {
        System.out.println("func1");
        return 1;
    }
    int func2()
    {
        System.out.println("func2");
        return 2;
    }
    int test(){
        try
        {
            return func1();
        }
        finally
        {
            return func2();
        }

    }
    public static void main(String[] args) {
        System.out.println(new Test9().test());
    }
}
