package kr;

// Dasha Shevchuk 07.10.2019 15.30

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("Ya:");
        double ya = input.nextInt();
        System.out.println("Xa:");
        double xa = input.nextInt();

        System.out.println("Yb:");
        double yb = input.nextInt();
        System.out.println("Xb:");
        double xb = input.nextInt();

        System.out.println("Yc:");
        double yc = input.nextInt();
        System.out.println("Xc:");
        double xc = input.nextInt();

        System.out.println("Yd:");
        double yd = input.nextInt();
        System.out.println("Xd:");
        double xd = input.nextInt();

        if (xa==xc){
            if (xb==xd){
                if (ya==yc){
                    if (yb==yd){
                        System.out.println("Прямоугольники совпадают");
                    }
                }
            }
        }

        if (yb==yc){
            if (xc==xb){
                System.out.println("Пересичение в точке" +xb+" " + yb);
            }
        } else{
            if(xb>xc){
                System.out.println("Пересичение это расстояное от" + xc + " " + yc +"до" +xb + " " + yb);
            }
        }
    }
}
