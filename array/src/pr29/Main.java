package pr29;
// Dasha Shevchuk 07.11.2019 15.20

public class Main {
    public static void main(String[] args) {
        int[] x = {6, -1, 5, 2, 20, 41, -12, -21}; //вводим масив

        int min = (int) Double.POSITIVE_INFINITY; //вводим минимальную переменную
        int max = (int) Double.NEGATIVE_INFINITY; //вводим максимальную переменную
        for (int i = 0, n = x.length; i < n; i++) {
            if (i%2 != 0) { //находим непарные числа
                if (x[i] < min) { //из непарных чисел находим минимальное
                    min = x[i];
                }
            }  if (i%2 == 0) { //находим парные числа
                if (max < x[i]) { //из парных чисел находим максимальное
                    max = x[i];
                }
            }
        }
            System.out.println("Min непарное: " + min + ", Max парное: " + max); //выводим эти числа
    }
}
