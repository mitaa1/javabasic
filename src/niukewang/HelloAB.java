package niukewang;

public class HelloAB {
    public static void main(String[] args) {
        A ab=new B();
        ab.say();
        ab=new B();
        ab.say();
    }
}
/**
 * A
 * B
 * a
 * b
 * 2
 * a
 * b
 * 2
 */
