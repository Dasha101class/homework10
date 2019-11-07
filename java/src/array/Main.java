package array;

public class Main {
    // Shevchuk, 20/03/19
    public static void main(String[] args) {
        int x = 6;
        int[] array = {-5,8,3,9,0,-455};
        System.out.println(array[2]);
        System.out.println(array.length);
        for (int i = 0, n = array.length; i < n; i++){
            System.out.print(array[i]+ " ");
        }
        System.out.println();
        double[] y = new double[10];
        System.out.println(y[5]);

        int[] array1 = {5,9,-3,0};
        int[] array2 = new int[array1.length];

        for (int i = 0, n = array1.length; i < n; i++){
            array2[i]=array1[i];
        }
        for (int i = 0, n = array2.length; i < n; i++){
            System.out.print(array2[i] + " ");
        }
    }
}
