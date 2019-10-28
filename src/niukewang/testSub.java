package niukewang;

public class testSub extends testSuper1 {
    public static void testmethod(){}
    public void testCommonMethod(){}
    public void main1(){
        testmethod();
        testCommonMethod();
        say();
        say1();
    }

    public static void main(String[] args) {
        testmethod();
        say();
    }
}
