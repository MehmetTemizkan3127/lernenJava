package benimcalismalarim.mentoring.ikincibölüm;

import java.util.Scanner;

public class M_1027_07_UykuProblemi {
    public static void main(String[] args) {

        /*
         * TASK->
         *
         * Kullaniciya gunde kac saat uyudugunu sorun,
         * ayda yilda ve 40 yilda kac gununun uykuda gectigini yazdirin
         *
         * Ornek : Input : 8
         *         Output : Ayda 10, yilda 121, 40 yilda 4866 gununuz uykuda geciyor
         */

        Scanner scn = new Scanner(System.in);
        System.out.println("Günde kac saat uyuyorsun : ");
        int gunlukUyku = 8;
        int aylikUyku = (gunlukUyku*30)/24;
        int yillikUyku = (gunlukUyku*365)/24;
        int kirkYillikUyku = (gunlukUyku*365*40)/24;

        System.out.println("gunlukUyuma = " + gunlukUyku);
        System.out.println("aylikUyku = " + aylikUyku);
        System.out.println("yillikUyku = " + yillikUyku);
        System.out.println("kirkYillikUyku = " + kirkYillikUyku);
















    }
}
