package org.example.lesson45;

import  org.example.lesson45.massiverutils.PrintMass;

public class Lesson5 {

    public static void main(String[] args) {
        int age = 34;
        String str = "Shevchenko Vasiliy";
        String str2 = null;
        printInfo();
        System.out.println(str2);
        printInfo(2023,age,5,555,58,45);
        System.out.println(printInfo("Vasiliy", 17));
    }
    public static void printInfo(){
        System.out.println("Hello");
        System.out.println(PrintMass.currentYear);
    }
    public static void printInfo(int number,String name,int numbe){
        int result=2023-number;
        System.out.println(name+" "+result);
    }
    public static String printInfo(int number, String name){
        int result=2023-number;
        return name+" "+result;
    }
    public static void printInfo(int year, int ... numbers){
        for(int i=0;i<numbers.length;i++){
            year=year-numbers[i];
        }
        System.out.println(year);
    }

    public static String printInfo(String name,int age){
        if (age<18){
            return "ERROR";
        }
        return name +" "+age;
    }
}
