package pr183;

// Dasha Shevchuk 03.10.2019 13.15

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Month: ");

        Scanner sc  = new Scanner(System.in);
        int x = sc.nextByte();
        switch (x) {
            case 12 :
            case 1 :
            case 2 :
                System.out.println("Winter");
                break;
            case 3 :
            case 4 :
            case 5 :
                System.out.println("Spring");
                break;
            case 6 :
            case 7 :
            case 8 :
                System.out.println("Summer");
                break;
            case 9 :
            case 10 :
            case 11 :
                System.out.println("Autumn");
                break;
            default:
                System.out.println("Nothing");
        }
    }
}
