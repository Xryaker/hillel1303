package org.example.lesson6;

public class Lesoon6 {
    public static void main(String[] args) {
        int[] ints=new int[]{1,2,3,4,5,6,5};
        String str= "Sharick";
        String[] strings={"hdhdhdh",str,"BLABLABLA"};
        System.out.println(strings[2].length());

        Human vasiliy = new Human("Vasiliy", 34);
        Human olga = new Human("Olga", 29);
        Human[] hum=new Human[]{
                new Human("Oleg",22)
        };

        Human[] humans = new Human[4];
        humans[0] = vasiliy;
        humans[1] = olga;

        printInfo(vasiliy);
        System.out.println("=======");
        Human man=new Human("Vasiliy",25,"Shevchenko","male");
        humans[2]=man;
        printInfo(humans);


    }

    public static void printInfo(Human human) {
        System.out.println("name = " + human.name);
        System.out.println("age = " + human.age * 365);
    }

    public static void printInfo(Human[] human) {
        for (Human l : human) {
            if (l != null) {
               printInfo(l);
            }
        }
    }
}
