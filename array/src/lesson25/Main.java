package lesson25;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String name = "Andrey";
        String name1 = "Serg";
        String name2 = "Stasik";
        String name3 = "Bogdan";

        String[] names = {"Andrey","Serg","Stasik","Bogdan"};

        int[] numbers = new int[5]; // 4 is the last number
        numbers[0] = 5;
        numbers[1] = -9;
        numbers[4] = 8;
        //System.out.println(numbers[4]);
        //System.out.println(numbers.length); // количество переменных

        for (int i = 0; i < names.length;  i++) {
            //System.out.println(names[i]);
        }

        Scanner in = new Scanner(System.in);
        double array[] = new double[8];
        //double[] array
        for (int i = 0, n = array.length; i<n; i++) {
            array[i] = in.nextDouble();
        }
        for(int i = 0, n = array.length; i<n; i++) {
            //System.out.println(array[i]);
        }

        int[] x = {1,2,3};
        int y[] = x;
        //System.out.println(y[2]);


    }
}
