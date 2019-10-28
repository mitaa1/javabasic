package Excep;

/**
 * finally中改变返回值num
 */
public class TryTest3 {
    public static void main(String[] args){
        System.out.println(test());
    }

    private static int test(){
        int num = 10;
        try{
            System.out.println("try");
            return num;
        }catch(Exception e){
            System.out.println("error");
        }finally{
            if (num > 20){
                System.out.println("num>20 : " + num);
            }
            System.out.println("finally");
            num = 100;
        }
        return num;
    }
}
/**
 * try
 * finally
 * 10
 */