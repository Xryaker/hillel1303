package org.example.lesson9;

import org.example.lesson81.Cat;
import org.example.lesson81.Dog;

public class Lesson91 {
    public static void main(String[] args) {
        Dog dog= new Dog("Spyke");
      //  System.out.println(dog);
        Cat cat=new Cat("Spyke");
      //  System.out.println(cat);
        Dog dog2=new Dog("pyke");
        System.out.println(dog==dog2);
        System.out.println(dog.equals(cat));

    }
}
