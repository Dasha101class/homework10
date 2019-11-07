package lesson25;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int first = in.nextInt();
        int second = first;
        int next = 0;
        for(int i = 0; i<20; i++){
            next = in.nextInt();

            if (first < next) {
                first = next;  //save maximum
            }
            if (second > next){
                second = next;  //save minimum
            }
            System.out.println("first: " + first + " second:" + second);
        }
        //System.out.println(first);
    }
}
