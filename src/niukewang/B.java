package niukewang;

public class B extends A {
    static {
        System.out.println("B");
    }
    public B(){
        System.out.println("b");
    }
    @Override
    void say(){
        System.out.println("2");
    }

}
