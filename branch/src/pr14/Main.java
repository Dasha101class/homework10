package pr14;
// Dasha Shevchuk 26.09.2019 13:45

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //System.out.println("Input n: ");
        int n = sc.nextInt();

        //System.out.println("Input m: ");
        int m = sc.nextInt();

        double a = 10d;
        double dis1 = a - m;
        double dis2 = a - n;
        if (dis1 > dis2) {
            //System.out.println(n);
        } else {
            //System.out.println(m);
        }
    }
    }

