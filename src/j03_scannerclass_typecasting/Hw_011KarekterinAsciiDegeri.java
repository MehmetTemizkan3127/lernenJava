package j03_scannerclass_typecasting;

import java.util.Scanner;

public class Hw_011KarekterinAsciiDegeri {
    public static void main(String[] args) {
        // ************************** Task 11 ***********************************
        /* Task->
         * Kullanicidan bir character girmesini isteyin ve
         * girilen karakteri ve ascii degerini yazin
         *
         * Ornek : Input  : a
         *         Output : Girdiginiz ‘a’ karakterinin ascii degeri : 95
         *
         *
         */

        Scanner scn = new Scanner(System.in);

        System.out.print("Bir karakter girin: ");
        char karakter = scn.next().charAt(0);

        System.out.println("Girdiginiz '" + karakter + "' karakterinin ASCII degeri: " + (int) karakter);

    }
}
