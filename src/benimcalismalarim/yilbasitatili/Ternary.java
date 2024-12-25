package benimcalismalarim.yilbasitatili;

import java.util.Scanner;

public class Ternary {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Pozitif veya Negatif Kontrolü
        //Kullanıcıdan bir sayı alın. Sayı pozitifse "Pozitif", negatifse "Negatif" yazdıran bir program yazın.


       /* //Çift veya Tek Sayı Kontrolü
        //Kullanıcıdan bir tam sayı alın. Sayı çiftse "Çift", tekse "Tek" yazdıran bir program yazın.
        System.out.println("Lütfen bir sayi giriniz = ");
        if (scan.hasNextInt()){
            int sayi1 = scan.nextInt();
            scan.nextLine();

            String sonuc = (sayi1%2==0) ? "cift" : "tek";
            System.out.println("Sonuc = "+sonuc);
        }else {
            System.out.println("Hata: Lütfen sayisal deger giriniz!");
        }*/


        /*//Sınav Sonucu Geçme Durumu
        //Kullanıcının bir sınavdan aldığı puanı alın. Eğer puan 50 veya daha büyükse
        // "Geçti", aksi takdirde "Kaldı" yazdıran bir program yazın.
        System.out.println("Lütfen notunuzu giriniz = ");
        if (scan.hasNextInt()) {
            int not = scan.nextInt();
            scan.nextLine();
            if (not < 0 || not > 100) {
                System.out.println("Hata: Lütfen 0-100 araliginda not giriniz!");
            } else {
                String sonuc = (not >= 50) ? "Gecti" : "Kaldi";
                System.out.println("Sonuc = "+sonuc);
            }

        } else {
            System.out.println("Hata: Lütfen sayisal degerde bir not giriniz!");
        }*/


        /*//Büyük Sayıyı Bulma
        //Kullanıcıdan iki tam sayı alın. Hangi sayının daha büyük olduğunu yazdıran bir program yazın.
        System.out.println("Lütfen birinci sayiyi giriniz = ");
        if (scan.hasNextInt()) {
            int sayi1 = scan.nextInt();
            scan.nextLine();

            System.out.println("Lütfen ikici sayiyi giriniz = ");
            if (scan.hasNextInt()) {
                int sayi2 = scan.nextInt();
                scan.nextLine();

                String sonuc = (sayi1 == sayi2) ?
                        "İki sayı eşit." :
                        "Büyük sayı: " + Math.max(sayi1, sayi2);
                System.out.println("Büyük sayi = " + sonuc);
            }else {
                System.out.println("Hata: Lütfen ikinci sayi icin sayisal deger giriniz!");
            }
        } else {
            System.out.println("Hata: Lütfen birinci sayi icin sayisal deger giriniz!");
        }*/


        /*//Oy Kullanma Durumu
        //Kullanıcının yaşını alın. Eğer yaşı 18 veya daha büyükse "Oy kullanabilir",
        // aksi takdirde "Oy kullanamaz" yazdıran bir program yazın.
        System.out.println("Lütfen yasinizi giriniz = ");
        if (scan.hasNextInt()) {
            int yas = scan.nextInt();
            scan.nextLine();

            if (yas < 0) {
                System.out.println("Hata : Lütfen negativ sayi girmeyiniz! ");
            }
            String sonuc = (yas >= 18) ? "Oy kullanabilir" : "Oy kullanamaz";
            System.out.println("Sonuc = " + sonuc);
        }else {
            System.out.println("Hata: Lütfen yas icin sayisal deger giriniz!");
        }*/

        //İndirim Kontrolü
        //Kullanıcıdan alışveriş tutarını alın.
        // Eğer tutar 100 veya daha fazlaysa "İndirimli fiyat: tutar x 0.9",
        // aksi takdirde "İndirim uygulanmaz" yazdıran bir program yazın.
        System.out.println("Lütfen alisveris tutarinizi giriniz = ");
        if (scan.hasNextDouble()) {
            double tutar = scan.nextInt();
            scan.nextLine();

            if (tutar < 0) {
                System.out.println("Hata : Lütfen negativ sayi girmeyiniz! ");
            return;}
            String sonuc = (tutar >= 100) ? "İndirimli fiyat: tutar x 0.9" : "İndirim uygulanmaz";
            System.out.println("Sonuc = " + sonuc);
        }else {
            System.out.println("Hata: Lütfen tutar icin sayisal deger giriniz!");
        }
    }
}
