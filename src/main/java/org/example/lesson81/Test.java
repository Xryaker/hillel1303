package org.example.lesson81;

public class Test {
    public static void main(String[] args) {
        Dog dog=new Dog("Sharick");
        dog.greeds();
        Dog dog1=new Dog("Spyke");
        dog.greeds(dog1);
        Cat cat=new Cat("Vaska");
        ss(cat);
        ss(dog);
        inter(dog1);
        System.out.println(Params.CHROME);
    }
    public static void ss(Animal animal){
        System.out.println(animal.getName()+" hello");
    }
    public static void inter(Pet pet){
        pet.feed();
    }
}
