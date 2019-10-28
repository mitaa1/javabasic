package niukewang;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashMapSample {
    public static void main(String[] args) {
        Map<Key,String> map=new HashMap<>();
        map.put(new Key("订阅号名称"),"果汁简历");
        map.put(new Key("号主"),"果哥");
        map.put(new Key("方向"),"求职");
        map.put(new Key("粉丝"),"1w");
        map.put(new Key("粉丝方向"),"java");


    }
    static class Key{
        private String name;

        public Key(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o){ return true;}
            if (o == null || getClass() != o.getClass()) {return false;}
            Key key = (Key) o;
            return Objects.equals(name, key.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }

        @Override
        public String toString() {
            return "Key{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
}
