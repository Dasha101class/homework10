package increment;

public class Main {
    public static void main(String[] args) {
        int x = 6;
        int y = 5;
        int z = x++ + y++ + ++x;
        System.out.println(z);

        x++;
        System.out.println("Операція інкреиенту - збільшення на 1:");
        System.out.println(x);

        x--;
        System.out.println("Операція декременту - зменшення на 1:");
        System.out.println(x);

        y = x++;
        System.out.println("Операція '=' виконалась раніше за '++', постфіксна форма інкременту:");
        System.out.println(y);

        y = ++x;
        System.out.println("Постфіксна форма інкременту:");
        System.out.println(x);
    }
}
