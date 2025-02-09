package j101homework.önceki.j102mentoring.ikincibölüm;

import java.util.Scanner;

public class M_1027_13_KareCikarmaBölme {
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
        System.out.println("Lütfen a sayisini giriniz : ");
        double aSayisi = scn.nextDouble();

        System.out.println("Lütfen b sayisini giriniz : ");
        double bSayisi = scn.nextDouble();

        System.out.println("Lütfen c sayisini giriniz : ");
        int cSayisi = scn.nextInt();

        double sonuc = ((aSayisi*aSayisi) - (bSayisi*bSayisi)) / (cSayisi*3);
        System.out.printf("Sonuc =  %.3f", sonuc);

    }
}
