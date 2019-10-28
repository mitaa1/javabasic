package com.intervice.javabasic.bytecode;

public class Test7 {
    int test()
    {
        int x = 1;
        try
        {
            return x;
        }
        finally
        {
            ++x;
        }
    }

    public static void main(String[] args) {
        System.out.println(new Test7().test());
    }
}
