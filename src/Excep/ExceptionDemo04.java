package Excep;

import com.sun.xml.internal.ws.api.client.SelectOptimalEncodingFeature;

public class ExceptionDemo04 {
    public static void main(String[] args) {
        int i[]={1,2,3};
        try{
            System.out.println("i[0]="+i[0]);
            System.out.println("i[3]="+i[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("异常信息"+e);
        }finally {
            System.out.println("无论是否有异常，都会执行finally");
        }
        System.out.println("i[1]="+i[1]);
    }
}
