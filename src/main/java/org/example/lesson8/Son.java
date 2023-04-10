package org.example.lesson8;

public class Son implements Mother, Father{
    @Override
    public void love() {
        
    }

    @Override
    public void care() {
        System.out.println("hello");
    }

    @Override
    public void work() {
        
    }

    @Override
    public int getMoney() {
        return 0;
    }
    public String info(){
        return "someText";
    }
}
