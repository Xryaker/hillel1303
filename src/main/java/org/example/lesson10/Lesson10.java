package org.example.lesson10;

import java.util.Arrays;
import java.util.Locale;

public class Lesson10 {
    public static void main(String[] args) {
        String string = "animals";
        System.out.println(string.substring(3)); // mals
        String result = string.substring(3);
        System.out.println(string.substring(string.indexOf('m'))); // mals
        System.out.println("----");
        System.out.println(string.substring(3, 5)); // m
        System.out.println(string.substring(3, 7)); // mals
        System.out.println(string);
        System.out.println(result);
        System.out.println("abc".equalsIgnoreCase("ABC"));
        System.out.println("abc".toLowerCase().startsWith("A"));
        System.out.println(string.length() < 0 ?
                "Vasiliy"
                : "Igor");
        if(string.contains(result)){
            System.out.println("OK");
        }else {
            System.out.println("All bad");
        }
        System.out.println("abcabc".replace('a', 'A'));
        String sentence = "Hello";
        String [] word={sentence.substring(0,3),sentence.substring(3)};
        System.out.println(Arrays.toString(word));
        String[] words = sentence.split("l");
        System.out.println(Arrays.toString(words));
        String result1 = "AniMaL ".trim().toLowerCase().replace("a", "A");
        System.out.println(result1);
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("Vasiliy");
        stringBuilder.append(" Shevchanko");
        stringBuilder.append(" ");
        stringBuilder.append(33);
        System.out.println(stringBuilder);
        for(char current = 'a'; current <= 'z'; current++) {
            System.out.println(current);
        }
    }
}
