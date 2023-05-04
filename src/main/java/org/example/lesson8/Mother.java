package org.example.lesson8;

public interface Mother {
    default void vork(){
        System.out.println("jjjj");
    }
    void love();
    void care();
}
