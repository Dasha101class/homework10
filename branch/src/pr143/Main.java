package pr143;
// Dasha Shevchuk 30.09.2019 15.20

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input a: ");
        double a = sc.nextInt();

        System.out.println("Input b: ");
        double b = sc.nextInt();

        System.out.println("Input c: ");
        double c = sc.nextInt();

        double d = Math.pow(b, 2) - 4*a*c;
        if (d > 0) {
            double x = -b + Math.sqrt(Math.pow(b, 2)- 4 * a * c);
            double y = -b - Math.sqrt(Math.pow(b, 2)- 4 * a *c);
            System.out.println(x);
            System.out.println(y);
        } else if (d == 0) {
            double x = -b / 2 * a;
            System.out.println(x);
        } else {
            System.out.println("Корней нет");
        }
    }
}
