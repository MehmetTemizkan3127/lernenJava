package j03_scannerclass_typecasting;

import java.util.Scanner;

public class Hw_09KullanicidanSayiAlipHesaplama {
    public static void main(String[] args) {

         /*  Task->
        Kullanıcıdan a,b ve c sayılarını okuyarak aşağıdaki işlemi yapan kodu yazınız
        a'nın karesinden b'nin karesini cikarip c nin 3 katina bolunuz
        Örnek Ekran Çıktısı
        a sayısını giriniz: 5
        b sayısını giriniz: 3
        c sayısını giriniz: 1
        sonuç : 5.333333333333333
        */

        Scanner scn = new Scanner(System.in);

        System.out.print("Lütfen a sayisini giriniz: ");
        double aSayisi = scn.nextDouble();

        System.out.print("Lütfen b sayisini giriniz: ");
        double bSayisi= scn.nextDouble();

        System.out.print("Lütfen c sayisini giriniz: ");
        double cSayisi= scn.nextDouble();

        double sonuc = (aSayisi * aSayisi - bSayisi * bSayisi) / (3 * cSayisi);

        System.out.printf("Sonuç: %.1f%n", sonuc);





    }
}
