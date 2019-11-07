package lesson21;

public class Main {
    public static void main(String[] args) {
        int r = 10;
        boolean isHungry = true;
        while(isHungry){
            System.out.println("Eat");
        }
        //while(r > 0){ //true
            //System.out.println(r);
            r--;
            if (r<0){
                isHungry = false;
            //}
        }
    }
}
