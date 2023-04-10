package org.example.lesson81;

public abstract class Animal {
    public String getName() {
        return name;
    }

    public Animal(String name) {
        this.name = name;
    }

    private String name;
    abstract void greeds();
}
