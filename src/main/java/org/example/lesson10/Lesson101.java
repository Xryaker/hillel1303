package org.example.lesson10;

import org.example.lesson8.Baby;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lesson101 {
    int n=10;
    char t='t';
    public static void main(String[] args) {
//        List<String> arrayList=new ArrayList<>();
//        arrayList.add("vasiliy");
//        arrayList.add("56");
//        arrayList.add(new Baby().toString());
//        System.out.println(arrayList.contains("vasiliy"));
//       // arrayList.remove(0);
//        arrayList.add("vasiliy");
//        for(String e:arrayList){
//            System.out.println(e.toUpperCase());
//        }

        String str="milk, oil, oil, sousage";
        System.out.println(str.substring(0, 1).toUpperCase()+str.substring(1));
        //UtilsStrings.someMethod(str);
//        int n=5+Integer.parseInt(str);
//        System.out.println(n);
        System.out.println(Arrays.stream(Lesson101.class.getDeclaredFields()).toList());
        for(Field f:Lesson101.class.getDeclaredFields()){
//            System.out.println(f.getName()+" "+f.);
        }
    }


}
