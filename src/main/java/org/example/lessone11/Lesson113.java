package org.example.lessone11;

import java.util.HashMap;
import java.util.Map;

public class Lesson113 {
    public static void main(String[] args) {
        Map<Integer,User> userMap=new HashMap<>();
        User user=new User("Valerchik","Shevchenko","pass");
        userMap.put(123,user);
        userMap.put(456,new User("Vasiliy","Shevchenko","pass"));
        System.out.println(userMap.get(123).getFamily());
        printFamily(userMap);
    }
    private static void printFamily(Map<Integer,User> integerUserMap){
        for(Map.Entry<Integer, User> l:integerUserMap.entrySet()){
            System.out.println(l.getValue().getFamily());
        }
    }
}
