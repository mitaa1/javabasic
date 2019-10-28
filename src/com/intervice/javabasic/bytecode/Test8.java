package com.intervice.javabasic.bytecode;

public class Test8 {
    public int get()
    {
        try
        {
            return 1 ;
        }
        finally
        {
            return 2 ;
        }
    }

    public static void main(String[] args) {
        Test8 t = new Test8();
        int b = t.get();
        System.out.println(b);

    }
}
