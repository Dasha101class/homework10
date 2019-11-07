package lesson16;

public class Main {
    public static void main(String[] args) {
        //byte b1 = 14; //0000 1110
        //byte b2 = 1;  //0000 0001
        //byte b0 = 16; //0001 0000

        //byte b3 = (byte)~b1;
        //System.out.println(b3); //1111 0001, -15 / operation not

        //byte b4 = (byte) (b1 & b2); //0000 0000, 0 / operation and
        //System.out.println(b4);

        //byte b5 = (byte) (b1 | b2); //0000 1111, 15 / operation or
        //System.out.println(b5);

        //byte b6 = (byte) (b1 | b2 | b0); //0000 1111, 31 / operation or
        //System.out.println(b6);

        //byte b7 = (byte) (b1 ^ b2); //0000 1110, 14 / operation xor
        //System.out.println(b7);

        //byte b8 = 0b0010_1110; //32+8+4+2=46
        //System.out.println(b8);
        //byte b9 = (byte) (b8<<1); //0b0101_1100, 92 / здвиг разряда
        //System.out.println(b9);

        //byte b10 = (byte) (b8>>2); //0b0000_1011, 11
        //System.out.println(b10);


    }
}
