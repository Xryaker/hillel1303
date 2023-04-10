package org.example.lesson81;

public class Dog extends Animal implements Pet{
        public Dog(String name) {
                super(name);
        }

        @Override
        void greeds() {
                System.out.println("dog say "+getName()+" woof");
        }
        void greeds(Dog dog) {
                System.out.println("dog say "+dog.getName()+" woooooooof");
        }

        @Override
        public void feed() {
                System.out.println("================");
        }

        @Override
        public void play() {

        }

        @Override
        public void valk() {

        }
}
