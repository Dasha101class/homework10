package lesson6;

public class Main {
    public static void main(String[] args) {
        byte x = 5;
        double y = 5.6; //float не подходит, потому что он на 32Гб, а double на 64Гб
        char c = '5'; //эти кавычки для символов, а те для строк
        char c2 = 71;
        System.out.println(c+" "+c2);

        int z = 5;
        int b = 7;
        System.out.println(z+b);
        System.out.println(z-b);
        System.out.println(z/b);
        System.out.println(z*b);

        int d = z+b;
        z+=5; //z = z + 5
        z-=5; //z = z - 5

        int x1 = 5;
        int y1 = 7;
        System.out.println(x1/y1);
        System.out.println(x1 % y1); //остаток

        x1 = x1 + 1;
        x1++; //postfix после
        ++x1; //prefix до

        int z1 = x1+y1++;
        System.out.println(z1+" "+y1);

    }
}
