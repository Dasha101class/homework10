package pr24;

// Dasha Shevchuk 17.10.2019 13.55

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int space = n-1;

        for (int i = 0; i < n; i++){
            for (int j = 0; j < i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 0; i < n; i++){
            for (int j = 0; j < n-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
