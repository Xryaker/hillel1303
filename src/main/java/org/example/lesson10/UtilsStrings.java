package org.example.lesson10;

import java.util.*;

public class UtilsStrings {
    public static void main(String[] args) {
        someMethod();
    }

    public static void someMethod() {
        List<String> strings=new ArrayList<>();
        System.out.println(strings.add("Nikolay"));
        System.out.println(strings.add(String.valueOf(455)));
        List<String> stringList=new ArrayList<>();
        stringList.add("vasiok");
        stringList.addAll(strings);
        System.out.println(stringList);
        System.out.println(stringList.contains("vasiok"));
        System.out.println(stringList.get(0));
        System.out.println("empty "+stringList.isEmpty());

        Map<Integer,String> stringMap=new HashMap<>();
        stringMap.put(1,"vasiliy");
        System.out.println(stringMap.put(2, "Nikolay"));
        System.out.println(stringMap.entrySet());

        for(String l:stringList){

        }
        for(int i=0;i<stringList.size();i++){
        }
    }

}
