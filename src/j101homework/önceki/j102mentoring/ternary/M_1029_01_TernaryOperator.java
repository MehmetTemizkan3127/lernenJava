package j101homework.önceki.j102mentoring.ternary;

import java.util.Scanner;

public class M_1029_01_TernaryOperator {
    public static void main(String[] args) {

// Bir sayının pozitif mi, negatif mi, yoksa sıfır mı olduğunu kontrol eden bir örnek.

        int sayi = 5;

        String cevap = (sayi > 0) ? ("pozitif") : (sayi < 0 ? ("negatif") : ("sıfır"));

        System.out.println("***************************** Task1 ********************************");

        //Task 01) // İki sayının en büyüğünü bulma.
        Scanner input = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz: ");
        int sayi1 = input.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        int sayi2 = input.nextInt();

        int enBuyuk = (sayi1 > sayi2) ? sayi1 : sayi2;
        System.out.println("Girilen sayıların en büyüğü: " + enBuyuk);

        System.out.println("***************************** Task2 ********************************");

        // Task 02) // Bir kişinin yaşına göre ehliyet alıp alamayacağını kontrol ediniz
        System.out.print("Yaşınızı giriniz: ");
        int yas = input.nextInt();

        String sonuc = (yas >= 18) ? "Ehliyet alabilirsiniz." : "Ehliyet alamazsınız.";

        System.out.println("***************************** Task3 ********************************");

        // Task 03) // Maaş Zammı Hesaplama  Bir çalışanın performansına göre maaş zammı hesaplayan bir sistem. Performans 80'in üzerinde ise %10, değilse %5 zam yapılır.

        System.out.print("Mevcut maasinizi giriniz: ");
        double maas = input.nextDouble();

        System.out.print("Performans puaninizi giriniz: ");
        int performans = input.nextInt();

        double zamOrani = (performans > 80) ? 0.10 : 0.05;

        double yeniMaas = maas + (maas * zamOrani);

        System.out.println("Yeni maasiniz: " + yeniMaas);

    }
}
