package j102mentoring.ikincibölüm;

import java.util.Scanner;

public class M_1027_06_VucutKitleIndeksi {
    public static void main(String[] args) {

 /*
          TASK ->
         * Kullanicidan boyunu cm olarak, kilosunu kilogram olarak alin
         * ve vucut kutle endeksini bulun.
         * Sonucu tamsayi ve ondalikli sayi olarak yazdirin */

        Scanner scn = new Scanner(System.in);

        System.out.print("Boyunuzu cm olarak girin: ");
        double boyCm = scn.nextDouble();

        System.out.print("Kilonuzu kg olarak girin: ");
        double kilo = scn.nextDouble();

        double boyM = boyCm / 100;

        double vki = kilo / (boyM * boyM);

        System.out.printf("Vücut Kütle İndeksiniz (ondalık): %.2f\n", vki);
        System.out.printf("Vücut Kütle İndeksiniz (tamsayı): %d\n", (int) vki);

    }
}
