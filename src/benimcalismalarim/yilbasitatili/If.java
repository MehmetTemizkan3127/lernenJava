package benimcalismalarim.yilbasitatili;

import java.util.Scanner;

public class If {
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

        //İndirim Uygulaması:
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
        }

        //Sıcaklık Durumu:
        //Kullanıcıdan hava sıcaklığını girin. Eğer sıcaklık 30 dereceden fazlaysa "Hava çok sıcak.", 10 dereceden azsa "Hava çok soğuk.", diğer durumlarda "Hava normal." yazdırın.

        //Kimlik Kontrolü:
        //Bir etkinlik için katılımcının yaşı ve kimliği olup olmadığını kontrol edin. Yaşı 18’den büyük ve kimliği varsa "Etkinliğe katılabilirsiniz." yazdırın. Diğer durumlarda uygun açıklamalar yapın.

        //Hesap Makinesi (Basit):
        //Kullanıcıdan iki sayı ve bir işlem türü (+, -, *, /) alın. Eğer işlem geçerliyse sonucu yazdırın. Geçersiz bir işlem türü girilirse "Geçersiz işlem." yazdırın.

        //Bankamatik Para Çekme:
        //Kullanıcıdan banka hesabındaki bakiyeyi ve çekmek istediği tutarı alın. Eğer tutar, bakiyeden büyükse "Yetersiz bakiye." yazdırın. Aksi takdirde yeni bakiyeyi yazdırın.

        //Şifre Doğrulama:
        //Bir giriş ekranı tasarlayın. Kullanıcıdan şifreyi alın ve doğru şifreyle karşılaştırın. Eğer doğruysa "Giriş başarılı.", değilse "Hatalı şifre." yazdırın.

        //Saat Kontrolü:
        //Kullanıcıdan günün saatini (0-24 arası) alın. Saat 6-12 arasındaysa "Günaydın", 12-18 arasındaysa "İyi günler", 18-24 arasındaysa "İyi akşamlar", diğer saatlerde "İyi geceler." yazdırın.


    }
}
