package niukewang;

public class testException {
    public int test(){
        int i=0;
        try {
            i++;
            throw new Exception("error");
        }catch (Exception e){
            return i++;
        }finally {
            {
                i++;
            }
        }
    }

    public static void main(String[] args) {
        testException t=new testException();
        t.test();
    }
}
