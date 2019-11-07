package lesson26;

public class Main {
    public static void main(String[] args) {
        int[] x = {-6, 1, 5, 2, 20, 41, -12, 8, 20};
        int sum = 0;
        for (int i = 0, n = x.length; i < n; i++){
            sum += x[i]; // sum = sum + x[i]
        }
        System.out.println("Sum = " + sum);

        int min = (int)Double.POSITIVE_INFINITY;
        int max = (int)Double.NEGATIVE_INFINITY;
        for (int i = 0, n = x.length; i < n; i++){
            if (min > x[i]) {
                min = x[i];
            }
            if (max < x[i]) {
                max = x[i];
            }
        }
        System.out.println("Min " + min + " Max " + max);

        int k = 20;
        for (int i = 0, n = x.length; i < n; i++) {
            if (k == x[i]) {

                System.out.println("Совпадение с " + "элементом № " + i);
            }
        }




    }
}
