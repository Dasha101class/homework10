package first;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Как вас зовут?");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();

        System.out.println(name);

    }

}
