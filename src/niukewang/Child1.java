package niukewang;

public class Child1 extends Person {
    public String grade;

    public static void main(String[] args) {
        Person p=new Child1();
        System.out.println(p.name);
        //编译报错

    }
}
