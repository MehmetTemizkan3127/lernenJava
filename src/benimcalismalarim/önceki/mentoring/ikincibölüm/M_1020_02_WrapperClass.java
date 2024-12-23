package benimcalismalarim.önceki.mentoring.ikincibölüm;

import java.util.Scanner;

public class M_1020_02_WrapperClass {
    public static void main(String[] args) {
        /* Task->
         * Kullanicidan bir character girmesini isteyin ve
         * girilen karakteri ve ascii degerini yazin
         *
         * Ornek : Input  : a
         *         Output : Girdiginiz 'a' karakterinin ascii degeri : 95
         *
         *
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir karekter giriniz : ");
        char karekter = input.next().charAt(0);
        int asciiDeger = ( int)karekter;
        System.out.println("asciiDeger = " + asciiDeger);




    }
}
