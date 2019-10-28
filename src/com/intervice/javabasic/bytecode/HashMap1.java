package com.intervice.javabasic.bytecode;

import java.util.HashMap;

public class HashMap1 {
    public static void main(String[] args) {
        HashMap map=new HashMap();
        map.put("name","hellol");
        map.put("name","jack");
        map.put("wang","李四");
        map.put("wang","lao四");

        System.out.println(map.size());
        System.out.println(map);

    }

}
