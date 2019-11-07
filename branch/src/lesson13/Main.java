package lesson13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input first number: ");
        int firstNumber = sc.nextInt();

        System.out.println("Input second number: ");
        int secondNumber = sc.nextInt();
        System.out.println("Sum: " + (firstNumber + secondNumber));

    }
}
