package org.example.lessone11;

import java.util.*;

public class Lesson112 {
    public static void main(String[] args) {
        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("name", "Vasiliy");
        stringMap.put("phone", "56415545");
        stringMap.put("h", "1655");

        for (Map.Entry<String, String> l : stringMap.entrySet()) {
            System.out.println(l.getValue());
            System.out.println(l.getKey());
        }

        Set<String> setkey = stringMap.keySet();
        System.out.println(setkey);
        List<String> listValues = new ArrayList<>(stringMap.values());
        System.out.println(listValues);

        for (String l : stringMap.keySet()) {

        }
        int[] ints = new int[]{1, 2, 3, 4, 5, 6, 8};
        for (int anInt : ints) {

        }
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
        for (int l : ints) {
            System.out.println(l);
        }

    }
}
