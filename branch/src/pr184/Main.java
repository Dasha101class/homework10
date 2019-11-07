package pr184;

// Dasha Shevchuk 03.10.2019 13.45


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("X ");
        Scanner sc  = new Scanner(System.in);
        int x = sc.nextByte();

        System.out.println("Y ");
        Scanner sc1  = new Scanner(System.in);
        int y = sc1.nextByte();

        if (x > 0 & y > 0) {
            System.out.println("1 координатный угол ");
        } else if(x > 0 & y < 0) {
            System.out.println("4 координатный угол ");
        } else if(x < 0 & y < 0) {
            System.out.println("3 координатный угол ");
        } else if(x < 0 & y > 0) {
            System.out.println("2 координатный угол ");
        } else {
            System.out.println("=p");
        }
    }
}
