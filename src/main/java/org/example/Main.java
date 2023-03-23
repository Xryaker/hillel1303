package org.example;

public class Main {
    public static void main(String[] args) {
//        char c = 'a';
//        int age = 8383;
//        age = 2345667;
//        short sHort = 22222;
//        int year = 872737;
//        long lonG = 838383838;
//        boolean bool = true;
//        double value = 523.025;
//        long l = 8888888889939399393l;
//        int i = (int) l;
//        System.out.println(i);
//        year = (int) ((lonG + age) / sHort);
//        System.out.println(year);
//        int sumary = 8778;
//        sumary = (int) (age + sHort + value);
//        System.out.println("summ = "+sumary);
//        double sum = age + sHort + value;
//        System.out.println(sum);
//
//
//        int b = 100, n = 10;
//
//        String name = "Vality Shevchenko"+year;
//        String sName = "Victorovich";
//        String allMSG = name + " " + sName;
//        System.out.println(allMSG+" "+age);
//

        int a = 2 * 5 + 3 * 4 - 8;
        int b = (2 * (5 + 3) * 4)-8;
        int d = 9 / 3;
        int c = a + b - d;
        int m = 11 % 2;
        System.out.println(m);//== !=
        boolean isActive = true;
        boolean state = !isActive;
        System.out.println(state);
//        boolean graterOrEquals = d >= Integer.getInteger(args[0]);
//        System.out.println(graterOrEquals);
        boolean equals = a == c;
        boolean compare = isActive && state || equals;




        String s1 = "bunny";
        String s2 = "bunny";
        String s3 = new String("bunny");
        String s4 = "bun" + "ny";
        System.out.println(s1 == s2); // true
        System.out.println(s1 == s3); // false
        System.out.println(s4.equals(s3)); // true
        System.out.println(s4 == s1);

        System.out.println(s1.length());
        System.out.println(s1.toUpperCase());
        s1=s1.toUpperCase();
        System.out.println(s1);
        System.out.println(s1 == s2);


    }
}