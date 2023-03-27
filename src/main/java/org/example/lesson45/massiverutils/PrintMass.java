package org.example.lesson45.massiverutils;

public class PrintMass {
    public static String currentYear="2023";
    public static void printMassive(int[][] mass){
        for (int t = 0; t < mass.length; t++) {
            System.out.println("");
            for (int n = 0; n < mass[t].length; n++) {
                System.out.print(mass[t][n] + " ");
            }
        }
    }

    public static void printMassive(int[] mass){
        for (int t = 0; t < mass.length; t++) {
            if (mass[t] % 2 == 0 && mass[t] != 0) {
                System.out.print(mass[t] + " ");
            }
        }
    }
}
