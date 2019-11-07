package test1;

public class Main {
    public static void main(String[] args) {
    int i = 20;
    boolean x = true;
    boolean y = true;
    if (x!=y) { //true not = true. false
        i+=10;
    }else if (x^y) {  //true ^ true. false
        i+=100;
    }else if (x^y) { //not true == true. false
        i+=200;
    }
    //System.out.println(i); //исходное значение
        // System.out.println(!(x!=y)==(!x!=y));
    // ! - not  != - not equel  == - equel
        int k = 100;
        //System.out.println(++k==100 ? 10 : 11); // ? and : разделители

        int q, w = 100;
        boolean a1 = false, b1 = true;
        q = b1 || !a1? w-30 : w-9; //сокращенная форма - проверяется только первая часть
        System.out.println(q);
    }
}
