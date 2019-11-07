package pr201;
//Dasha Shevchuk 10.10.19 13.50
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int n;
        int sum_fib;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        System.out.print("0 1 1");
        for (int i = 0; i < n - 3; i++) {
            sum_fib = a + b;
            a = b;
            b = sum_fib;
            System.out.print(sum_fib + " ");
        }
    }
}
