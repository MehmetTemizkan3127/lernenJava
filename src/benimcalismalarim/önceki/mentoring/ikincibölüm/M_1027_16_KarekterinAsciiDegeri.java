package benimcalismalarim.önceki.mentoring.ikincibölüm;

import java.util.Scanner;

public class M_1027_16_KarekterinAsciiDegeri {
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
