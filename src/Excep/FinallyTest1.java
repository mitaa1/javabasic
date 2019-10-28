
package Excep;

public class FinallyTest1 {
    public static int query() {
        int i = 0;
        try {
            System.out.print("try\n");
            return i += 10;
        } catch (Exception e) {
            System.out.print("catch\n");
            i += 20;
        } finally {
            System.out.print("finally-i:"+i + "\n");
            i += 10;
            System.out.print("finally\n");
            return i;
        }


    }

    public static void main(String[] args) {
        int j = query();
        System.out.println(j);

    }
}
