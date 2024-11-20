package benimcalismalarim.homeWork;

public class Hw_1104_02_NestedForLoop {
    public static void main(String[] args) {

       /*
        A
        B B
        C C C
        D D D D
        E E E E E
        F F F F F F
        şekli print eden code create ediniz..
        */

        int satirSayisi = 6;

        for (int i =0; i <= satirSayisi; i++){
            for (int j = 0; j < i; j++){
                System.out.print((char) (65+i-1)+ " ");
            }
            System.out.println();
        }
    }
}
