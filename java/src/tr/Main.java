package tr;

import java.util.Scanner;
// Shevchuk, 18/03/19
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int space = n-1;
        for (int i = 0; i < n; i++) {
                for (int j = 0; j < space-i; j++) {
                    System.out.print(" ");
                }
            for (int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
                System.out.println();
            }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < space-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        }
    }

