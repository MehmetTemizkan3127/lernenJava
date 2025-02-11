package j102mentoring.javatemel;

import java.util.Scanner;

public class JavaTemel09DörtIslem {
    public static void main(String[] args) {

        // Task-> kullanicidan 2 tam sayinın  dort islem sonucunu print eden code create ediniz.

        Scanner scn = new Scanner(System.in);
        System.out.println("Lütfen birinci sayiyi giriniz : ");
        int sayi1 = scn.nextInt();

        System.out.println("Lütfen ikinci sayiyi giriniz : ");
        int sayi2 = scn.nextInt();

        int toplama = sayi1 + sayi2;
        int cikarma = sayi1 - sayi2;
        int carpma = sayi1 * sayi2;
        double bölme = (sayi1 / sayi2);

        System.out.println("toplama = " + toplama);
        System.out.println("cikarma = " + cikarma);
        System.out.println("carpma = " + carpma);
        System.out.println("bölme = " + bölme);

    }
}
