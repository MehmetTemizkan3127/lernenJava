package j102mentoring.javatemel;

import java.util.Scanner;

public class JavaTemel16KarekterinAsciiDegeri {
    public static void main(String[] args) {

        /* Task->
         * Kullanicidan bir character girmesini isteyin ve
         * girilen karakteri ve ascii degerini yazin
         *
         * Ornek : Input  : a
         * Output : Girdiginiz ‘a’ karakterinin ascii degeri : 95
         *
         *
         */

        Scanner scn = new Scanner(System.in);
        System.out.println("Lütfen bir karekter giriniz : ");

        char karekter = scn.next().charAt(0);
        System.out.println("karekter = " + karekter);

        int asciiDegeri = karekter;
        System.out.println("asciiDegeri = " + asciiDegeri);













    }
}
