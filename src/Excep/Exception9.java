package Excep;

import java.io.FileInputStream;
import java.io.IOException;

public class Exception9 {
    public static void arrException() throws IOException{
        FileInputStream f=new FileInputStream("不存在的文档.txt");
    }

    public static void main(String[] args) {
        try {
            arrException();
        } catch (IOException e) {
            System.out.println("异常信息"+e);
            e.printStackTrace();
        }
    }
}
