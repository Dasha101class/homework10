package lesson19;

public class Main {
    public static void main(String[] args) {
        //statement ; test ; expresioin
        for (int i = 0; i<10; i++) {
            //System.out.print(i + " ");
        }
        for (int n = 10; n>0; n--){
            //System.out.print(n + " ");
        }

        int i2 = 0;
        for (; i2 < 5; i2++){}

        int i3 = 6;
        for (i3 = i3 + 1; i3 < 10; i3++){}

        int k = 0, h = 0;
        for (k++, h++; k < 8 && h > 9; h++) {}

        int q = 0;
        int j;
        for (j=0; j<10; ++j) {q++;}
        //System.out.println(q + " " + j); //j=0, 0<10, q++ , ++j, 1<10

        double balance = 100;
        int goal = 1000;
        int years = 0;
        while (balance<goal) {
            balance = balance + 0.05*balance;
            years++;
        }
        //System.out.println("Через " + years + " вы получите эти копейки!");
        int g = 5;
        do{
            System.out.println(g);
            g--;
        }while(g!=0);
        System.out.println(g);
    }
}
