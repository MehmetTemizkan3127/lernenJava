package j102mentoring.ikincibölüm;

import java.util.Scanner;

public class M_1027_10_GecmeNotuVizeFinal {
    public static void main(String[] args) {
        /*Task->
         * Kullanicidan alacaginiz vize1 vize2 ve final notlarini
         * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
         */
        Scanner scn = new Scanner(System.in);
        System.out.println("Yüz üzerinden lütfen vize notunuzu giriniz : ");
        int vizeNotu = scn.nextInt();

        System.out.println("Yüz üzerinden lütfen final notunuzu giriniz : ");
        int finalNotu = scn.nextInt();

        double gecmeNotu = (vizeNotu*0.3) + (finalNotu*0.7);
        System.out.println("Gecme notunuz = " + gecmeNotu);
    }
}
