package org.example.lesson11;

import org.example.lesson81.Cat;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.BindException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lesson11 {

    public static void main(String[] args) {
        Cat cat;
        List<String> stringLis =new ArrayList<>(Arrays.asList("vasiliy","nikolay"));
        int integer=0;
        try {

            System.out.println(stringLis.get(3));
            cat=new Cat("ss");
        }catch (RuntimeException e){
            System.out.println(stringLis.get(stringLis.size()-1));
        }

        try {
            getSumthing();
        }catch (FileNotFoundException i){
           i.printStackTrace();
        }
        catch (IOException e) {
            System.out.println("Father try");
            e.printStackTrace();
        }


    }

    public static void getSumthing() throws IOException {
        throw new BindException("Hello Vasiliy");
    }

}
