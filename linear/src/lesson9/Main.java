package lesson9;

public class Main {
    public static void main(String[] args) {
        int x = 17, y = 6, z = 45;
        int a = x++; //postfix increment
        int b = ++y;
        int c = --z;

        //5 y = x++ y=5 x=6
        //5 y = ++x y=6 x=6
        //5 y = x-- y=5 x=4
        //5 y = --x y=4 x=4

        int d = x/y;
        System.out.println(d);

        double w = 5.8;
        d = z/(int)w; // w = 5

        w = x/y; //x - int, y - int, w - double
        System.out.println(w);


    }
}
