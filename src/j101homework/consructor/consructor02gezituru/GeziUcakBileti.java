package j101homework.consructor.consructor02gezituru;

import java.util.*;

public class GeziUcakBileti {

    // Bilet fiyatları için tablo
    private static final Map<String, Double> fiyatTablosu = Map.ofEntries(
            Map.entry("Berlin → Roma", 120.0), Map.entry("Berlin → Paris", 100.0),
            Map.entry("Berlin → Londra", 130.0), Map.entry("Berlin → Barcelona", 150.0),
            Map.entry("Berlin → Amsterdam", 110.0),
            Map.entry("Köln → Roma", 100.0), Map.entry("Köln → Paris", 90.0),
            Map.entry("Köln → Londra", 120.0), Map.entry("Köln → Barcelona", 140.0),
            Map.entry("Köln → Amsterdam", 100.0),
            Map.entry("Hamburg → Roma", 110.0), Map.entry("Hamburg → Paris", 90.0),
            Map.entry("Hamburg → Londra", 140.0), Map.entry("Hamburg → Barcelona", 130.0),
            Map.entry("Hamburg → Amsterdam", 100.0),
            Map.entry("Frankfurt → Roma", 105.0), Map.entry("Frankfurt → Paris", 95.0),
            Map.entry("Frankfurt → Londra", 125.0), Map.entry("Frankfurt → Barcelona", 135.0),
            Map.entry("Frankfurt → Amsterdam", 115.0),
            Map.entry("Münih → Roma", 115.0), Map.entry("Münih → Paris", 100.0),
            Map.entry("Münih → Londra", 130.0), Map.entry("Münih → Barcelona", 140.0),
            Map.entry("Münih → Amsterdam", 120.0),
            Map.entry("Roma → Paris", 90.0), Map.entry("Roma → Londra", 130.0),
            Map.entry("Roma → Barcelona", 100.0), Map.entry("Roma → Amsterdam", 100.0),
            Map.entry("Paris → Londra", 70.0), Map.entry("Paris → Barcelona", 90.0),
            Map.entry("Paris → Amsterdam", 80.0), Map.entry("Londra → Barcelona", 140.0),
            Map.entry("Londra → Amsterdam", 100.0), Map.entry("Barcelona → Amsterdam", 90.0)
    );

    // İndirim oranları
    private static final double COCUK_INDIRIM = 0.5; // %50
    private static final double YASLI_INDIRIM = 0.3; // %30
    private static final double YETISKIN_INDIRIM = 0.1; // %10 (ilk bilet hariç)

    // Kalkış noktası listesi
    private static final List<String> kalkisSehirleri = List.of("Berlin", "Köln", "Hamburg", "Frankfurt", "Münih");

    // Gezi noktası listesi
    private static final List<String> geziSehirleri = List.of("Roma", "Paris", "Londra", "Barcelona", "Amsterdam");

    // Kullanıcıdan seçim alma metodu
    public static int secimAl(List<String> secenekler) {
        Scanner input = new Scanner(System.in);
        int secim;
        while (true) {
            System.out.print("Lütfen listeden bir seçim yapınız (1-" + secenekler.size() + "): ");
            if (input.hasNextInt()) {
                secim = input.nextInt();
                if (secim >= 1 && secim <= secenekler.size()) {
                    return secim - 1; // 0 tabanlı indeks
                } else {
                    System.out.println("Geçersiz seçim. Lütfen tekrar deneyiniz.");
                }
            } else {
                System.out.println("Geçersiz giriş. Lütfen bir sayı giriniz.");
                input.next(); // Hatalı giriş sonrası geçersiz input'u atla
            }
        }
    }

    // Fiyat hesaplama metodu
    public static double biletFiyatiHesapla(String rota, int kisiSayisi, int cocukSayisi, int yasliSayisi, int yetiskinSayisi) {
        double tamFiyat = fiyatTablosu.getOrDefault(rota, 0.0);
        double toplamFiyat = 0.0;

        // Çocuklar için indirimli fiyat
        toplamFiyat += cocukSayisi * tamFiyat * (1 - COCUK_INDIRIM);

        // Yaşlılar için indirimli fiyat
        toplamFiyat += yasliSayisi * tamFiyat * (1 - YASLI_INDIRIM);

        // Yetişkinler için indirim
        toplamFiyat += (yetiskinSayisi > 1) ?
                (tamFiyat + (yetiskinSayisi - 1) * tamFiyat * (1 - YETISKIN_INDIRIM)) :
                yetiskinSayisi * tamFiyat;

        return toplamFiyat;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("CLARUSWAY GEZİ VE UÇAK BİLETİ REZERVASYONU!");
        System.out.println();

        // Kalkış noktası seçimi
        System.out.println("Kalkış Şehri:");
        for (int i = 0; i < kalkisSehirleri.size(); i++) {
            System.out.println((i + 1) + ". " + kalkisSehirleri.get(i));
        }
        int kalkisIndex = secimAl(kalkisSehirleri);
        String kalkisSehri = kalkisSehirleri.get(kalkisIndex);

        // İlk gezi destinasyonu seçimi
        System.out.println("\nGezi Noktalarından İlkini Seçiniz:");
        for (int i = 0; i < geziSehirleri.size(); i++) {
            System.out.println((i + 1) + ". " + geziSehirleri.get(i));
        }
        int ilkGeziIndex = secimAl(geziSehirleri);
        String ilkGezi = geziSehirleri.get(ilkGeziIndex);

        // İkinci gezi destinasyonu seçimi
        System.out.println("\nGezi Noktalarından İkincisini Seçiniz:");
        for (int i = 0; i < geziSehirleri.size(); i++) {
            if (i != ilkGeziIndex) { // İlk seçilen hariç
                System.out.println((i + 1) + ". " + geziSehirleri.get(i));
            }
        }
        int ikinciGeziIndex = secimAl(geziSehirleri);
        String ikinciGezi = geziSehirleri.get(ikinciGeziIndex);

        // Kişi sayısı alımı
        System.out.print("\nKaç çocuk? : ");
        int cocukSayisi = input.nextInt();

        System.out.print("Kaç yaşlı? : ");
        int yasliSayisi = input.nextInt();

        System.out.print("Kaç yetişkin? : ");
        int yetiskinSayisi = input.nextInt();

        // Gidiş, ara ve dönüş için fiyat hesaplama
        String rota1 = kalkisSehri + " → " + ilkGezi;
        double toplamGidis = biletFiyatiHesapla(rota1, cocukSayisi + yasliSayisi + yetiskinSayisi, cocukSayisi, yasliSayisi, yetiskinSayisi);

        String rota2 = ilkGezi + " → " + ikinciGezi;
        double toplamAra = biletFiyatiHesapla(rota2, cocukSayisi + yasliSayisi + yetiskinSayisi, cocukSayisi, yasliSayisi, yetiskinSayisi);

        String rota3 = ikinciGezi + " → " + kalkisSehri;
        double toplamDonus = biletFiyatiHesapla(rota3, cocukSayisi + yasliSayisi + yetiskinSayisi, cocukSayisi, yasliSayisi, yetiskinSayisi);

        // Genel toplam
        double genelToplam = toplamGidis + toplamAra + toplamDonus;

        // Sonuç yazdırma
        System.out.println("\n========== REZERVASYON ÖZETİ ==========");
        System.out.printf("Gidiş (%s): %.2f EUR\n", rota1, toplamGidis);
        System.out.printf("Ara Gezi (%s): %.2f EUR\n", rota2, toplamAra);
        System.out.printf("Dönüş (%s): %.2f EUR\n", rota3, toplamDonus);
        System.out.printf("Toplam Maliyet: %.2f EUR\n", genelToplam);
        System.out.println("İyi yolculuklar!");
    }
}