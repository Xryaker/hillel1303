package org.example.lesson6.animals;

import org.example.lesson9.SEASON;

public class Bird extends Animal{

    public String getColor() {
        return color;
    }

    private String color;
    private int number;

    public Bird(String name, int age, String color, int number) {
        super(name, age);
        this.color = color;
        this.number = number;
    }

    public void setColor(SEASON color) {
      switch (color){
          case SPRING -> this.color="";
      }
    }
}
