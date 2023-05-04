package org.example.lesson8;

public class lesson81 {
    public static void main(String[] args) {
        Son son = new Son();
        Uncle uncle = new Uncle();
son.vork();
        test(uncle);
        Baby baby = new Baby();
        Father father = new Son();
        father.getMoney();
        test(baby);
        System.out.println(baby.getIndex());
    }

    public static void test(Father sonMother) {
        sonMother.getMoney();

    }
}
