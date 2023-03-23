package org.example;

import java.util.Arrays;
import java.util.Random;

public class lesson4 {

    public static void main(String[] args) {
        int m = 10;
        int[] mass = new int[m];
        char[] arrayChars = new char[5];
        Random rand = new Random();
        //create random numbers
        for (int t = 0; t < mass.length; t++) {
            mass[t] = rand.nextInt(50);
        }

        //System.out.println(mass[3]);
        //sout massive
        System.out.println("length massive = " + mass.length);
        for (int t = 0; t < mass.length; t++) {
            System.out.print(mass[t] + " ");
        }
        System.out.println("");
        int[] sort = new int[mass.length];



        for (int i = 0; i < mass.length; i++)
        {
            for (int j = i + 1; j < mass.length; j++)
            {
                int tmp = 0;
                if (mass[i] < mass[j])
                {
                    tmp = mass[i];
                    mass[i] = mass[j];
                    mass[j] = tmp;
                }
            }
//prints the sorted element of the array

        }

        System.out.println(Arrays.toString(mass));


        for (int t = 0; t < mass.length; t++) {
            if (mass[t] % 2 == 0 && mass[t] != 0) {
                System.out.print(mass[t] + " ");
            }
        }
        System.out.println("");
        for (int t = (mass.length - 1) / 2; t >= 0; t--) {
            System.out.print(mass[t] + " ");
        }

        for (int t : mass) {
            System.out.println(t);
            if (t == 4) {
                System.out.println("break");
                break;
            }
        }
        System.out.println(Arrays.toString(mass));
        int[] mas = new int[]{1, 2, 3, 4, 5, 6};
        int[][] matrix = new int[][]{
                {1, 2, 3, 4},
                {4, 5, 6, 5}
                , {7, 8, 9, 4, 4, 4}
        };
        System.out.println(matrix[1][2]);
        System.out.println(matrix.length);
        for (int t = 0; t < matrix.length; t++) {
            System.out.println("");
            for (int n = 0; n < matrix[t].length; n++) {
                System.out.print(matrix[t][n] + " ");
            }
        }
        int r=0;
        while (r<10){
            System.out.println("r="+r);
            r++;
        }

        r=0;
        do{
            System.out.println("R="+r);
            r++;
        }while (r<10);
    }
}
