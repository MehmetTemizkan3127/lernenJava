package mentoring.oda_rezervasyonu.paket2;

abstract class Oda {
    /*Görevler:
    Genel bir "Oda" sınıfı oluşturun.
    Bu sınıf, tüm oda türleri için ortak olan bilgileri ve işlemleri barındırır:
    Oda numarası
    Oda fiyatı
    Rezervasyon durumu
    Oda sınıfını soyut yapın (abstract class).
    Ortak bilgilerin yanı sıra, her oda türüne göre farklılık gösterebilecek bir metot tanımlayın:
    hizmetler() metodu: Her oda türünün sunduğu hizmetleri göstermek için soyut bir metot.
    Farklı oda türleri için alt sınıflar oluşturun.
    Standart Oda: Yalnızca temel hizmetler (Wi-Fi ve televizyon).
    Deluxe Oda: Temel hizmetlerin yanı sıra kahvaltı dahil.
    Suit Oda: Temel hizmetler, kahvaltı, spa ve ücretsiz mini bar.
    Bir test sınıfında şunları yapın:
    Farklı türde birkaç oda oluşturun.
    Odaların bilgilerini ve hizmetlerini ekrana yazdırın.*/

    private int odaNumarasi;
    private double fiyat;
    private boolean rezervasyonDurumu;

    public Oda(int odaNumarasi, double fiyat) {
        this.odaNumarasi = odaNumarasi;
        this.fiyat = fiyat;
        this.rezervasyonDurumu = false;
    }

    public int getOdaNumarasi() {
        return odaNumarasi;
    }

    public double getFiyat() {
        return fiyat;
    }

    public boolean getrezervasyonDurumu() {
        return rezervasyonDurumu;
    }

    public void setRezervasyonDurumu(boolean rezervasyonDurumu) {
        this.rezervasyonDurumu = rezervasyonDurumu;
    }

    public abstract String hizmetler();


    public String odaBilgileri() {
        return "Oda Numarası = " + odaNumarasi + ", Fiyat = " + fiyat + ", Rezervasyon Durumu = " + (rezervasyonDurumu ? "Dolu" : "Bos");
    }
}














