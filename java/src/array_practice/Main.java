package array_practice;

public class Main {
    public static void main(String[] args) {
         double[] array1 = {};
         double sum = 0;
        for (int i = 0, n = array1.length; i < n; i++) {
            sum = sum + array1[i];
        }
        System.out.println(sum);
    }
}
