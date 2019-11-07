package pr291;
// Dasha Shevchuk 07.11.2019 13.20

public class Main {
    public static void main(String[] args) {
        int a[] = new int[]{1, 4, -1, 2, 5, 10, 7, 8, 9, -10 };
        int max = 0; //вводим максимальную переменную
        int min = 0; //вводим минимальную переменную
        int imax = 0; //вводим дополнительную максимальную переменную
        int imin = 0; //вводим дополнительную минимальную переменную
        for(int i=0; i<a.length; i++)
            System.out.print(a[i]+" "); //ввод изначальных чисел масива
        System.out.println(); //переход на следущую строку
        for(int i=0; i<a.length; i++){
            if(a[i]>max){ //находим max число
                max=a[i];
                imax=i;
            }
            if(a[i]<min){ //находим min число
                min=a[i];
                imin = i;
            }
        }
        a[imin] =max; a[imax] = min; //заменяем max число на min число, и наоборот
        for(int i=0; i<a.length; i++)
            System.out.print(a[i]+" "); //конечный результат со вводом чисел масива и сменой местами min и max чисел
        System.out.println(); //переход на следущую строку
        System.out.println("Max: " + max); //дополнительно ввожу информацию про максимальное число
        System.out.println("Min: " + min); //дополнительно ввожу информацию про минимальное число
    }
}
