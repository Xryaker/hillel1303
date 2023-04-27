package org.example.lessone11;

import java.util.*;

public class Lesson111 {
    public static void main(String[] args) {
        Map<String,String> stringMap=new HashMap<>();
        stringMap.put("name","Vasiliy");
        stringMap.put("phone","56415545");

        stringMap.remove("phone");

        System.out.println(stringMap.get("name"));

        System.out.println(stringMap);

        stringMap.clear();

        System.out.println(stringMap);

        stringMap.put("ss","sdf");

        System.out.println(stringMap);

        System.out.println("isEmpty = "+stringMap.isEmpty());

        System.out.println(stringMap.size());

        System.out.println(stringMap.containsKey("ss"));

        System.out.println(stringMap.containsValue("sdf"));



//        Map<String, List<String>> map=new HashMap<>();
//        map.put("tel",new ArrayList<String>(Arrays.asList("4556","45555")));
//        System.out.println(Arrays.toString(map.get("tel").toArray()));
    }
}
