package lesson14;
// Dasha Shevchuk 26.09.2019 13:30

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input n: ");
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println("n is even");
        } else{
            System.out.println("n is odd");
        }



    }
}
