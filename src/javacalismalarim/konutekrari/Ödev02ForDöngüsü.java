package javacalismalarim.konutekrari;

import java.util.Random;
import java.util.Scanner;

public class Ödev02ForDöngüsü {
    public static void main(String[] args) {
        /*Soru 1: for Döngüsü
        Bir for döngüsü kullanarak 1’den 10’a kadar olan sayıları ekrana yazdıran bir program yazın.
                Çıktı Örneği:
        1 2 3 4 5 6 7 8 9 10*/

        System.out.print("1- Birden 10’a kadar olan sayilar     = ");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");

        }


        /*Soru 2: while Döngüsü
        Bir while döngüsü kullanarak 5’ten geriye doğru 1’e kadar olan sayıları ekrana yazdıran bir program yazın.
                Çıktı Örneği:
        5 4 3 2 1*/
        int sayi = 5; // Başlangıç değeri
        System.out.print("\n2- 5'ten 1'e kadar olan sayilar       = ");
        while (sayi >= 1) {
            System.out.print(sayi + " ");
            sayi--;
        }


        /*Soru 3: do-while Döngüsü
        Bir do-while döngüsü kullanarak kullanıcıdan pozitif bir sayı girmesini isteyin.
        Kullanıcı pozitif bir sayı girene kadar tekrar sorun.
        Çıktı Örneği:
        Lütfen pozitif bir sayı girin: -3
        Lütfen pozitif bir sayı girin: 0
        Lütfen pozitif bir sayı girin: 5
        Teşekkürler!*/
        Scanner scanner = new Scanner(System.in);
        int sayi1;
        do {
            System.out.println("\n3- Lütfen pozitif bir sayi girin      = ");
            sayi1 = scanner.nextInt();

            if (sayi1 <= 0) {
                System.out.println("Hatali giris yaptiniz. Lütfen pozitif bir sayi girin    = ");
            }
        } while (sayi1 <= 0);
        System.out.println("Tebrikler! Pozitif bir sayi girdiniz                            =  " + sayi1);


        /*Soru 4: Toplam Hesaplama (for Döngüsü)
        Bir for döngüsü kullanarak 1’den 100’e kadar olan çift sayıların toplamını hesaplayın ve ekrana yazdırın.
        Çıktı Örneği:
        Çift sayıların toplamı: 2550*/
/*
        int sayi2 = 100;
        int toplam = 0;

        System.out.println("4- 0'dan 100'e kadar ciftli sayilar toplami                     = ");
        for (int i =2; i <= 100; i+= 2 ){
             toplam += i;
            System.out.print(+toplam+" ");
        }
*/

        /*Soru 5: Faktöriyel Hesaplama (while Döngüsü)
        Bir while döngüsü kullanarak kullanıcının girdiği bir sayının faktöriyelini hesaplayın.
        Çıktı Örneği:
        Bir sayı girin: 5
        5! = 120 */

        System.out.println("\nLütfen bir sayi giriniz = ");
        int sayi3 = scanner.nextInt();

        int faktoriyel = 1;
        int i = 1;

        while (i <= sayi3) {
            faktoriyel *= i;
            i++;
        }
        System.out.println(sayi3 + "!               = " + faktoriyel);


        /*Soru 6: Sonsuz Döngüden Çıkış
        Aşağıdaki döngü sonsuz döngüye girmektedir. Döngüyü nasıl sonlandırabileceğinizi açıklayın.
        while (true) {
            System.out.println("Merhaba!");
        }*/

        while (true) {
            System.out.println("Merhaba!");
            break;
        }


        /*Mini Proje Ödevi
        Bir sayı tahmin oyunu yapın:
        Program rastgele bir sayı (1-50 arasında) tutar.
                Kullanıcı bu sayıyı tahmin etmeye çalışır.
                Doğru tahmin edilene kadar program kullanıcıya ipuçları verir
                ("Daha büyük bir sayı girin" veya "Daha küçük bir sayı girin").
                Doğru tahmin edildiğinde kullanıcıyı tebrik eder ve tahmin sayısını ekrana yazdırır.*/
        int rastgeleSayi;
        Random random = null;
        rastgeleSayi = random.nextInt(0,51);
    }}
