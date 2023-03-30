package org.example.lesson6;

import java.sql.PseudoColumnUsage;

public class Lesson62 {
    public static void main(String[] args) {
        Passport passport=new Passport("Vasiliy",16000);
        Passport human=new Passport();
//        passport.setAge(50);
        System.out.println(passport.getName());
        System.out.println(passport.getAge());
        System.out.println(passport.getString());
        System.out.println(human.getString());
        human.setString("Dog");
        System.out.println(passport.getString());
        System.out.println(human.getString());

    }
}
