package niukewang;

public class Main {
    public Main(){
        System.out.println("B");
    }
    {
        System.out.println("C");
    }
    static {
        System.out.println("D");
    }

    public static void main(String[] args) {
        System.out.println("A");
        new Main();
        new Main();
    }
}
/**
 * D
 * A
 * C
 * B
 * C
 * B
 */