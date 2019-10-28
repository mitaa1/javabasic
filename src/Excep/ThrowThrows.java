package Excep;

/**
 * 运行时异常的抛出 throw
 */
public class ThrowThrows {
    public static void main(String[] args) {
        Person p=new Person();
        p.setAge(-1);
        System.out.println(p.getAge());

    }

    static class Person {
        private String name;
        private int age;

        public Person() {
        }

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            if (age > 0 && age < 120) {
                this.age = age;
            } else {
                throw new RuntimeException("年龄有误");
            }


        }
    }
}

