package Excep;

/**
 * 将num值包装在Num类中
 */
public class Tryest4 {
    public static void main(String[] args){
        System.out.println(new Tryest4(). test().num);
    }

    private  Num test(){
        Num number = new Num();
        try{
            System.out.println("try");
            return number;
        }catch(Exception e){
            System.out.println("error");
        }finally{
            if (number.num > 20){
                System.out.println("number.num>20 : " + number.num);
            }
            System.out.println("finally");
            number.num = 100;
        }
        return number;
    }


class Num{
    public int num = 10;
}
}
/**
 try
 finally
 100
*/