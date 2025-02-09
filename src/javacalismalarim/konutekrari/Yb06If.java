package javacalismalarim.konutekrari;

import java.util.Scanner;

public class Yb06If {
    public static void main(String[] args) {
        //Yaş Kontrolü:
        //Kullanıcıdan yaşını alın. Eğer 18 yaşından büyükse "Ehliyet alabilirsiniz." yazdırın,
        // aksi takdirde "Ehliyet alamazsınız." yazdırın.

        Scanner scan = new Scanner(System.in);

        /*System.out.println("Lütfen yasinizi giriniz = ");

        // Kullanıcı girdisinin bir sayı olup olmadığını kontrol edin
        if (scan.hasNextInt()) {
            int yas = scan.nextInt(); // Girdi tamsayıysa al

            if (yas < 0) {
                System.out.println("Hata: Yaş negatif olamaz!");
            } else if (yas >= 18) {
                System.out.println("Ehliyet alabilirsiniz.");
            } else {
                System.out.println("Ehliyet alamazsınız.");
            }
        } else {
            // Kullanıcı bir sayı girmemişse
            System.out.println("Hata: Lütfen geçerli bir sayı giriniz.");
        }*/

       /* //Not Hesaplama:
        //Bir öğrencinin sınav notunu alın.
        // Eğer notu 50’den büyük veya eşitse "Geçtiniz.", küçükse "Kaldınız." yazdırın.
        System.out.println("Lütfen notunuzu giriniz: ");

        // Kullanıcı girdisini kontrol et
        if (scan.hasNextDouble()) { // Girdi sayı mı kontrol et
            double not = scan.nextDouble();

            // Negatif değer kontrolü
            if (not < 0) {
                System.out.println("Hata: Not negatif olamaz!");
            }
            // 100'den büyük değer kontrolü
            else if (not > 100) {
                System.out.println("Hata: Not 100'den büyük olamaz!");
            }
            // Geçme durumu
            else if (not >= 50) {
                System.out.println("Geçtiniz.");
            }
            // Kalma durumu
            else {
                System.out.println("Kaldınız.");
            }
        } else {
            // Girdi bir sayı değilse hata mesajı
            System.out.println("Hata: Lütfen geçerli bir sayı giriniz.");
        }*/

        /*
        //Çift veya Tek Sayı Kontrolü:
        //Kullanıcıdan bir sayı alın. Bu sayının çift mi, yoksa tek mi olduğunu kontrol edin ve sonucu ekrana yazdırın.
        System.out.println("Lütfen bir sayi giriniz = ");
        if (scan.hasNextInt()){
            int sayi = scan.nextInt();

            if (sayi<0){
                System.out.println("Hata: Lütfen negativ sayi girmeyiniz!");

            }else if (sayi%2==0){
                System.out.println("Sayiniz cifttir ");
            }else {
                System.out.println("Sayiniz tektir ");
            }
        }else {
            System.out.println("Hata: Lütfen gecerli bir sayi giriniz!");
        }*/

        /*//İndirim Uygulaması:
        //Bir mağaza indirim kampanyası düzenliyor. Kullanıcıdan satın alınan ürünün fiyatını alın.
        // Eğer fiyat 100 TL’den büyükse %10 indirim yaparak yeni fiyatı yazdırın.
        // Aksi takdirde indirimsiz fiyatı yazdırın.
        System.out.println("Lütfen ürünün fiyatini giriniz = ");

        if (scan.hasNextDouble()){
          double urununFiyati = scan.nextDouble();

            if (urununFiyati<0){
                System.out.println("Hata: Lütfen negatif fiyat girmeyiniz!");

            } else if (urununFiyati>100) {
                double indirimliFiyat = urununFiyati - (urununFiyati*0.10);
                System.out.println("Gecerli indirimli fiyat = "+indirimliFiyat+" TL");
            }else {
                System.out.println("Maalesef indirim hakki olmayan ürünün fiyati = "+urununFiyati+" TL");
            }
        } else {
            System.out.println("Hata: Lütfen gecerli bir sayi giriniz!");
        }*/

        /*//Sıcaklık Durumu:
        //Kullanıcıdan hava sıcaklığını girin. Eğer sıcaklık 30 dereceden fazlaysa "Hava çok sıcak.",
        // 10 dereceden azsa "Hava çok soğuk.", diğer durumlarda "Hava normal." yazdırın.
        System.out.println("Lütfen sicaklik derecesini giriniz = ");

        if (scan.hasNextInt()){
            int sicaklik = scan.nextInt();

            if (sicaklik>30){
                System.out.println("Hava çok sıcak.");
            }else if (sicaklik<10){
                System.out.println("Hava çok soğuk.");
            }else {
                System.out.println("Hava normal.");
            }
        }else{
            System.out.println("Hata: Lütfen gecerli bir sayi giriniz!");
        }*/


        /*//Kimlik Kontrolü:
        //Bir etkinlik için katılımcının yaşı ve kimliği olup olmadığını kontrol edin.
        // Yaşı 18’den büyük ve kimliği varsa "Etkinliğe katılabilirsiniz." yazdırın.
        // Diğer durumlarda uygun açıklamalar yapın.
        System.out.println("Lütfen yasinizi giriniz = ");

        if (scan.hasNextInt()) {
            int yas = scan.nextInt();
            scan.nextLine();

            if (yas < 0) {
                System.out.println("Hata: Lütfen negativ sayi girmeyiniz!");
            } else if (yas >= 18) {
                System.out.println("Kimliginiz var mi? Evet/Hayir = ");
                String kimlikDurumu = scan.nextLine();
                if (kimlikDurumu.equalsIgnoreCase("Evet")) {
                    System.out.println("Etkinliğe katılabilirsiniz.");
                } else {
                    System.out.println("Maalesef kimliginiz olmadigi icin etkinlige katilamiyorsunuz");
                }
            } else {
                System.out.println("Maalesef yasiniz tutmadigi icin etkinlige katilamiyorsunuz");
            }
        } else {
            System.out.println("Hata: Lütfen sayisal degerler giriniz!");
        }*/

        //Hesap Makinesi (Basit):
        //Kullanıcıdan iki sayı ve bir işlem türü (+, -, *, /) alın.
        // Eğer işlem geçerliyse sonucu yazdırın.
        // Geçersiz bir işlem türü girilirse "Geçersiz işlem." yazdırın.

        /*System.out.println("Lütfen birinci sayiyi giriniz = ");
        if (scan.hasNextDouble()) {
            double sayi1 = scan.nextDouble();
            scan.nextLine();

            System.out.println("Lütfen ikinci sayiyi giriniz = ");
            if (scan.hasNextDouble()) {
                double sayi2 = scan.nextDouble();
                scan.nextLine();

                System.out.println("Lütfen bir islem seciniz. (+, -, *, /)");
                String islem = scan.nextLine();

                if (islem.equals("+")) {
                    System.out.println("Toplama islemi sonucu = " + (sayi1 + sayi2));
                } else if (islem.equals("-")) {
                    System.out.println("Cikarma islemi sonucu = " + (sayi1 - sayi2));
                } else if (islem.equals("*")) {
                    System.out.println("Carpma islemi sonucu = " + (sayi1 * sayi2));
                } else if (islem.equals("/")) {
                    if (sayi2 != 0) {
                        System.out.println("Bölme islemi sonucu = " + (sayi1 / sayi2));
                    } else {
                        System.out.println("Hata: Lütfen bölme islemi icin ikinci sayiya sifir(0) disinda bir sayi giriniz");
                    }
                } else {
                    System.out.println("Hata: Gecersiz islem");
                }
            }else {
                System.out.println("Hata: Lütfen ikinci sayi icin sayisal bir deger giriniz");
            }
        } else {
            System.out.println("Hata: Lütfen birinci sayi icin sayisal bir deger giriniz");
        }*/

        /*//Bankamatik Para Çekme:
        //Kullanıcıdan banka hesabındaki bakiyeyi ve çekmek istediği tutarı alın.
        // Eğer tutar, bakiyeden büyükse "Yetersiz bakiye." yazdırın. Aksi takdirde yeni bakiyeyi yazdırın.
        System.out.println("Lütfen bakiyenizi giriniz = ");
        if (scan.hasNextDouble()) {
            double bakiye = scan.nextDouble();
            scan.nextLine();

            if (bakiye < 0) {
                System.out.println("Lütfen bakiye icin negativ sayi girmeyiniz");
                return;
            }

            System.out.println("Lütfen cekmek istediginiz tutari cekiniz");
            if (scan.hasNextDouble()) {
                double tutar = scan.nextDouble();
                scan.nextLine();

                if (tutar < 0) {
                    System.out.println("Lütfen tutar icin negativ sayi girmeyiniz");
                    return;
                }

                if (tutar > bakiye) {
                    System.out.println("Yetersiz bakiye.");
                } else {
                    System.out.println("Yeni bakiyeniz = " + (bakiye - tutar)+" TL");
                }
            } else {
                System.out.println("Hata: Lütfen cekmek istediginiz tutari sayisal deger olarak giriniz!");
            }
        } else {
            System.out.println("Hata: Lütfen bakiyenizi sayisal deger olarak giriniz!");
        }*/

        /*//Şifre Doğrulama:
        //Bir giriş ekranı tasarlayın. Kullanıcıdan şifreyi alın ve doğru şifreyle karşılaştırın.
        // Eğer doğruysa "Giriş başarılı.", değilse "Hatalı şifre." yazdırın.
        System.out.println("Lütfen sifrenizi giriniz = ");
        String sifre = scan.nextLine();
        String dogruSifre = "04mt02";

        if (sifre.equals(dogruSifre)){
            System.out.println("Giriş başarılı. Tebrikler");
        }else{
            System.out.println("Hatalı şifre. Yeniden deneyiniz");
        }*/

        //Saat Kontrolü:
        //Kullanıcıdan günün saatini (0-24 arası) alın.
        // Saat 6-12 arasındaysa "Günaydın",
        // 12-18 arasındaysa "İyi günler",
        // 18-24 arasındaysa "İyi akşamlar",
        // diğer saatlerde "İyi geceler." yazdırın.
        System.out.println("Lütfen saati giriniz (0-24) = ");

        if (scan.hasNextInt()) {
            int saat = scan.nextInt();
            scan.nextLine(); // Enter tuşuna basıldığında bir sonraki giriş için boşluk bırakmak

            // Saatin geçerli bir değer olup olmadığını kontrol et
            if (saat >= 0 && saat <= 24) {
                // Saat aralıklarına göre mesaj yazdırılır
                if (saat >= 6 && saat < 12) {
                    System.out.println("Günaydın");
                } else if (saat >= 12 && saat < 18) {
                    System.out.println("İyi günler");
                } else if (saat >= 18 && saat <= 24) {
                    System.out.println("İyi akşamlar");
                } else if (saat >= 0 && saat < 6) {
                    // Saat 0-6 arası "İyi geceler"
                    System.out.println("İyi geceler");
                }
            } else {
                // Geçersiz saat
                System.out.println("Hata: Lütfen 0 ile 24 arasında geçerli bir saat giriniz!");
            }
        } else {
            System.out.println("Hata: Lütfen saati sayısal değer olarak giriniz (0-24)!");
        }
    }
}

