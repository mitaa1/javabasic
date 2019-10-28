package Excep;

/**
 * 情况1（try中有return，finally中没有return)
 */
public class TryTest1 {
    public static void main(String[] args){
        System.out.println(test());
    }

    private static int test(){
        int num = 10;
        try{
            System.out.println("try");
            return num += 80;
        }catch(Exception e){
            System.out.println("error");
        }finally{
            if (num > 20){
                System.out.println("num>20 : " + num);
            }
            System.out.println("finally");
        }
        return num;
    }
}
/**
 * try
 * num>20 : 90
 * finally
 * 90
 */
