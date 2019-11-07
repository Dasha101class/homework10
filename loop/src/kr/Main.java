package kr;

// Dasha Shevchuk 22.10.2019 10.55

public class Main {
    public static void main(String[] args) {

        int row = 1, column = 1;

        for (int j = 0; j < row; j++) {
            for (int k = 0; k < column; k++) {
                for (int i = 1; i < 11; i++) {
                    for (int b = 1; b <= 10; b++) {
                        int l = i * b;
                        System.out.print(l + "   ");
                    }
                    System.out.println();
                }
            }
        }

    }
}
