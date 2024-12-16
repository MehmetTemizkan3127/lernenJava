package benimcalismalarim.homework;

public class Hw_1031_04_For_Bölünebilme {
    public static void main(String[] args) {

        //task->  0 ile 100 arasındaki hem 5'e, hem de 4'e tam bölünebilen  sayıları print eden code create edinz.

        System.out.println("0 ile 100 arasindaki sadece 4'e bölünebilen sayilar : ");
        for (int i = 0; i <= 100; i++) {
            if (i % 4 == 0 && i % 5 != 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\n\n0 ile 100 arasindaki sadece 5'e bölünebilen sayilar:");
        for (int i = 0; i <= 100; i++) {
            if (i % 5 == 0 && i % 4 != 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\n\n0 ile 100 arasindaki hem 4'e hem de 5'e bölünebilen sayilar:");
        for (int i = 0; i <= 100; i++) {
            if (i % 4 == 0 && i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}

