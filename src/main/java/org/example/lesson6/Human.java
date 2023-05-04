package org.example.lesson6;

public class Human {
    String name, family;
    int age;

    public void setAge(int age) {
        if (age > 0 && age < 99) {
            this.age = age;
        } else {
            this.age = 18;
        }
    }

    String sex;

    public Human(String name, int age) {
        this.name = name;
        setAge(age);
        this.sex = "male";
        this.family = "Dou";
    }

    public Human(String name, int age, String family, String sex) {
        this.name = name;
        this.family = family;
        setAge(age);
        this.sex = sex;
    }

    public Human() {
        this.name = "Ivanov";
        this.family = "Ivanov";
        setAge(15);
        this.sex = "male";
    }
}
