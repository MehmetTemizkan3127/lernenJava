package benimcalismalarim.Mentoring;

import java.util.Scanner;

public class M_1020_01_ {
    public static void main(String[] args) {
       /*  Task->
    Kullanıcıdan a,b ve c sayılarını okuyarak aşağıdaki işlemi yapan kodu yazınız
    a'nın karesinden b'nin karesini cikarip c nin 3 katina bolunuz. Cıkan sonucu
    tam sayı olarak yazdırınız

    Örnek Ekran Çıktısı
    a sayısını giriniz: 5
    b sayısını giriniz: 3
    c sayısını giriniz: 1
    sonuç : 5.333333333333333
    */
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen a'nin degerini giriniz : ");
        int a = input.nextInt();
        System.out.println("Lütfen b'nin degerini giriniz : ");
        int b = input.nextInt();
        System.out.println("Lütfen c'nin degerini giriniz : ");
        int c = input.nextInt();
        double sonuc = (double) ((a * a) - (b * b)) / (c * 3);

        System.out.println("Sonuç: " + sonuc);
    }
}
