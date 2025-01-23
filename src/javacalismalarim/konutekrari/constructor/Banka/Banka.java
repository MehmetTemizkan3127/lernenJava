package javacalismalarim.konutekrari.constructor.Banka;

public class Banka {
    /*
    Soru 1: Banka Hesap Sistemi

    Senaryo: Bir banka için basit bir hesap yönetim sistemi oluşturmanız isteniyor.
    Banka müşterilerinin hesapları üzerinde işlem yapabileceği bir sistem tasarlayacaksınız.

            Gereksinimler:
    Musteri sınıfını oluşturun:

    ad (String) – Müşterinin adı.
    soyad (String) – Müşterinin soyadı.
    hesapNo (int) – Müşterinin hesap numarası.
            bakiye (double) – Hesabın bakiyesi.
    Constructor:

    Boş constructor ile bir müşteri oluşturulabilmeli.
    Parametreli constructor ile müşteri adı, soyadı, hesap numarası ve bakiyesi belirlenebilmeli.
            Metotlar:

    paraYatir(double miktar) – Müşterinin hesabına para yatırma işlemi yapabilmeli.
    paraCek(double miktar) – Müşterinin hesabından para çekme işlemi yapılabilmeli (bakiye kontrolü ile).
    bilgileriGoster() – Müşterinin hesap bilgilerini (ad, soyad, hesap numarası, bakiye) ekrana yazdırmalı.
    Ana programda:

    Banka müşterilerini oluşturun.
    Bir müşteri hesabına para yatırma ve çekme işlemleri yapın.
    Müşterinin hesap bilgilerini yazdırın.
    Soru 2: Kitap Takip Sistemi
    Senaryo: Bir kütüphane kitaplarını takip etmek için bir sistem tasarlıyorsunuz.
    Kitapların bilgilerini saklayacak bir sınıf ve bir kütüphane sınıfı oluşturulacak.

    Gereksinimler:
    Kitap sınıfını oluşturun:

    ad (String) – Kitabın adı.
    yazar (String) – Kitabın yazarı.
    yayınYili (int) – Kitabın yayın yılı.
            isbn (String) – Kitabın ISBN numarası.
            durum (boolean) – Kitabın mevcut durumu (kirada mı veya mevcut mu).
    Kütüphane sınıfını oluşturun:

    kitaplar (ArrayList<Kitap>) – Kütüphanede bulunan kitaplar.
            kitapEkle(Kitap kitap) – Yeni bir kitap kütüphaneye eklenmeli.
            kitapSil(String isbn) – ISBN'ye göre bir kitap kütüphaneden silinmeli.
    kitapBul(String isbn) – ISBN'ye göre kitap arama yapılabilmeli.
    kitaplariListele() – Kütüphanedeki tüm kitaplar listelenmeli.
    Ana programda:

    Kütüphane nesnesi oluşturulmalı ve birkaç kitap eklenmeli.
    Bir kitap silinmeli ve kitap listesi ekrana yazdırılmalı.
    ISBN numarasına göre bir kitap araması yapılmalı.
            Soru 3: Araba Kiralama Sistemi
    Senaryo: Bir araba kiralama firması için araç kiralama sistemini tasarlamanız isteniyor.
    Bu sistemde araçları kiralayan ve araçları yöneten sınıflar olacak.

            Gereksinimler:
    Araba sınıfını oluşturun:

    marka (String) – Arabanın markası.
    model (String) – Arabanın modeli.
    yil (int) – Arabanın üretim yılı.
            kiraUcreti (double) – Günlük kira ücreti.
            kiradaMi (boolean) – Araba kirada mı.
    ArabaKirala metodu:

    Araba kiralandığında kiradaMi durumu değişmeli ve kiralanan tarihten itibaren günlük ücretle kira hesaplanmalı.
    Ana programda:

    Birkaç araç nesnesi oluşturulmalı.
    Araç kiralanmalı ve kiralama ücreti hesaplanmalı.
    Soru 4: Çalışan Takip Sistemi
    Senaryo: Bir şirketteki çalışanları takip etmek için bir sistem tasarlıyorsunuz.
    Çalışanlar hakkında bilgi almak ve maaş hesaplamak için bir sınıf oluşturulacak.

            Gereksinimler:
    Calisan sınıfını oluşturun:

    ad (String) – Çalışanın adı.
    soyad (String) – Çalışanın soyadı.
    pozisyon (String) – Çalışanın pozisyonu.
    maas (double) – Çalışanın maaşı.
    yil (int) – Çalışanın şirketteki çalışma yılı.
    Maaş Hesaplama Metodu:

    Çalışanın maaşı, pozisyonuna göre farklı ek ödemelerle hesaplanmalı (örneğin, yöneticilere %15 zam).
    Ana programda:

    Çalışanlar eklenmeli, maaşları hesaplanmalı ve ekrana yazdırılmalı.
    Soru 5: Seyahat Rezervasyon Sistemi
    Senaryo: Bir seyahat acentesi için bir sistem tasarlıyorsunuz.
    Müşterilerin seyahat rezervasyonları üzerinde işlem yapabileceği bir sistem oluşturulacak.

            Gereksinimler:
    Musteri sınıfını oluşturun:

    ad (String) – Müşterinin adı.
    soyad (String) – Müşterinin soyadı.
    telefon (String) – Müşterinin telefon numarası.
            email (String) – Müşterinin e-posta adresi.
    Seyahat sınıfını oluşturun:

    yer (String) – Seyahatin gideceği yer.
            fiyat (double) – Seyahatin fiyatı.
    tarih (String) – Seyahatin tarihi.
    Rezervasyon sınıfını oluşturun:

    rezervasyonNo (String) – Rezervasyon numarası.
    musteri (Musteri) – Seyahati rezerve eden müşteri.
    seyahat (Seyahat) – Yapılacak seyahat.
    Metotlar:

    rezervasyonYap(Musteri musteri, Seyahat seyahat) – Seyahat rezervasyonu yapılmalı.
            rezervasyonBilgisi() – Yapılan rezervasyonun bilgileri ekrana yazdırılmalı.
*/
}
