package Excep;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo5 {
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        int a[]=new int[5];
        try {
            System.out.println("请输入元素");
            for (int i=0;i<a.length;i++){
                a[i]=read.nextInt();
            }
            System.out.println("请输入数组元素索引");
            int n=read.nextInt();
            System.out.println("a["+n+"]="+a[n]);
            int m=a[3]/a[0];
            System.out.println("m="+m);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("异常信息"+e);
        }catch (ArithmeticException e){
            System.out.println("异常信息"+e);
        }catch (InputMismatchException e){
            System.out.println("异常信息"+e);
        }
        System.out.println("程序结束");
    }
}
