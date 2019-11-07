package lesson20;

public class Main {
    public static void main(String[] args) {
        int k = 0, h = 0;
        for (int i = 1; i<=100; i++){
            if(i % 7 == 0 | i % 11 == 0) {
                k++;
            }
            if(i % 11 == 0){
                h ++;
            }
        }
        System.out.println("Количество чисел которые делятся на 7 или на 11: " + k);
    }
}
