package machugaoxiao;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class EqualsObject {
    public EqualsObject(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int id;
    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (o == null || getClass() != o.getClass()){ return false;}
        EqualsObject that = (EqualsObject) o;
        return id == that.id &&
                Objects.equals(name, that.name);
    }

    public static void main(String[] args) {
        Set<EqualsObject> hashset=new HashSet<>();
        EqualsObject a=new EqualsObject(1,"one");
        EqualsObject b=new EqualsObject(1,"one");
        EqualsObject c=new EqualsObject(1,"one");
        hashset.add(a);
        hashset.add(b);
        hashset.add(c);
        System.out.println(hashset.size()
        );
    }

}
