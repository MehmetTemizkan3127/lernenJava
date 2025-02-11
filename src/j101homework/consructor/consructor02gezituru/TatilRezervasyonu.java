package j101homework.consructor.consructor02gezituru;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TatilRezervasyonu {

    // Ana menüyü yazdıran fonksiyon
    public static void yazdirMenu() {
        System.out.println("========== CLARUSWAY TURIZM ===========");
        System.out.println("Yılbaşı Kampanyasına Hoşgeldiniz!");
        System.out.println();
        System.out.println("Yapmak istediğiniz işlem için lütfen 1 ile 5 arası bir sayı seçiniz (1-5) : ");
        System.out.println("1- Gezi Turu Hizmeti Satın Alma");
        System.out.println("2- Uçak Bileti Satın Alma");
        System.out.println("3- Otel Konaklama Rezervasyonu");
        System.out.println("4- Paket Program (Gezi Turu + Uçak + Otel)");
        System.out.println("5- Çıkış");
    }

    // Kullanıcıdan seçim almak için
    private static int alKullaniciSecimi() {
        Scanner input = new Scanner(System.in);
        int secenek = input.nextInt();
        System.out.println();
        return secenek;
    }

    // Gezi turu hizmeti metodu
    public static int yapGeziTuru() {
        Scanner input = new Scanner(System.in);
        System.out.println("========== MEVCUT TURLARIMIZ ===========");
        System.out.println("1. Viyana Turu (3 gün) - 90 EUR");
        System.out.println("2. Paris Turu (4 gün) - 120 EUR");
        System.out.println("3. Amsterdam Turu (5 gün) - 100 EUR");
        System.out.println("4. Prag Turu (3 gün) - 80 EUR");
        System.out.println("5. Zürih Turu (4 gün) - 110 EUR");
        System.out.println("Lütfen 1 ile 5 arasında bir tur seçeneği giriniz (1-5) : ");

        int turSecenegi = 0;
        while (true) {
            if (input.hasNextInt()) {
                turSecenegi = input.nextInt();
                if (turSecenegi >= 1 && turSecenegi <= 5) {
                    break; // Geçerli sayıyı girince döngüden çık
                } else {
                    System.out.println("Geçersiz seçim. Lütfen 1 ile 5 arasında bir sayı giriniz.");
                }
            } else {
                System.out.println("Lütfen geçerli bir sayı giriniz.");
                input.next(); // Geçersiz girişi atla
            }
        }

        // Seçilen turun fiyatı ve gün sayısı
        int turFiyati = 0;
        int turGunu = 0;
        switch (turSecenegi) {
            case 1:
                turFiyati = 90;
                turGunu = 3;
                break;
            case 2:
                turFiyati = 120;
                turGunu = 4;
                break;
            case 3:
                turFiyati = 100;
                turGunu = 5;
                break;
            case 4:
                turFiyati = 80;
                turGunu = 3;
                break;
            case 5:
                turFiyati = 110;
                turGunu = 4;
                break;
        }

        // Kişi sayısını alalım
        Scanner input2 = new Scanner(System.in);
        System.out.println("Kaç kişi gezi turuna katılacak?");
        int kisiSayisi = 0;
        while (true) {
            if (input2.hasNextInt()) {
                kisiSayisi = input2.nextInt();
                if (kisiSayisi <= 0) {
                    System.out.println("Lütfen geçerli bir pozitif sayı giriniz.");
                } else {
                    break;  // Geçerli sayı girildi, döngüden çık
                }
            } else {
                System.out.println("Lütfen geçerli bir sayı giriniz.");
                input2.next(); // Geçersiz girişi atla
            }
        }

        // Tur ücretini hesapla
        int toplamTurUcreti = turFiyati * kisiSayisi;
        System.out.println("Seçilen tur: " + turGunu + " gün, Toplam Ücret (Gezi Turu) : " + toplamTurUcreti + " €");

        return toplamTurUcreti; // Toplam gezi turu ücretini döndürüyoruz
    }

    // Uçak bileti rezervasyonu metodu
    public static int ayirtUcakBileti() {
        Scanner input = new Scanner(System.in);
        String kalkisNoktasi, varisNoktasi;
        int kisiSayisi = 0;

        // Kalkış noktalarını listele
        List<String> kalkisNoktalari = new ArrayList<>();
        kalkisNoktalari.add("İstanbul");
        kalkisNoktalari.add("Ankara");
        kalkisNoktalari.add("İzmir");
        kalkisNoktalari.add("Antalya");
        kalkisNoktalari.add("Bursa");

        // Kalkış noktalarını kullanıcıya sun
        System.out.println("Kalkış yapabileceğiniz şehirler:");
        for (int i = 0; i < kalkisNoktalari.size(); i++) {
            System.out.println((i + 1) + ". " + kalkisNoktalari.get(i));
        }

        // Kullanıcıdan kalkış noktası seçmesi istenir
        System.out.println("Lütfen kalkış yapmak istediğiniz şehri seçiniz (1-" + kalkisNoktalari.size() + "): ");
        int secilenKalkis = 0;
        while (secilenKalkis < 1 || secilenKalkis > kalkisNoktalari.size()) {
            if (input.hasNextInt()) {
                secilenKalkis = input.nextInt();
                if (secilenKalkis < 1 || secilenKalkis > kalkisNoktalari.size()) {
                    System.out.println("Geçersiz seçim, lütfen 1 ile " + kalkisNoktalari.size() + " arasında bir sayı girin.");
                }
            } else {
                System.out.println("Lütfen geçerli bir sayı giriniz.");
                input.next(); // Geçersiz girişi atla
            }
        }
        kalkisNoktasi = kalkisNoktalari.get(secilenKalkis - 1);  // Seçilen kalkış noktası

        // Kalkış noktasına göre varış noktalarını göster
        System.out.println("Kalkış noktanız: " + kalkisNoktasi);
        List<String> varisNoktalari = new ArrayList<>();

        // Varış noktalarını listele
        varisNoktalari.add("Viyana");
        varisNoktalari.add("Paris");
        varisNoktalari.add("Amsterdam");
        varisNoktalari.add("Prag");
        varisNoktalari.add("Zürih");

        System.out.println("Varış yapabileceğiniz şehirler:");
        for (int i = 0; i < varisNoktalari.size(); i++) {
            System.out.println((i + 1) + ". " + varisNoktalari.get(i));
        }

        // Kullanıcıdan varış noktası seçmesi istenir
        System.out.println("Lütfen varış yapmak istediğiniz şehri seçiniz (1-" + varisNoktalari.size() + "): ");
        int secilenVaris = 0;
        while (secilenVaris < 1 || secilenVaris > varisNoktalari.size()) {
            if (input.hasNextInt()) {
                secilenVaris = input.nextInt();
                if (secilenVaris < 1 || secilenVaris > varisNoktalari.size()) {
                    System.out.println("Geçersiz seçim, lütfen 1 ile " + varisNoktalari.size() + " arasında bir sayı girin.");
                }
            } else {
                System.out.println("Lütfen geçerli bir sayı giriniz.");
                input.next(); // Geçersiz girişi atla
            }
        }
        varisNoktasi = varisNoktalari.get(secilenVaris - 1);  // Seçilen varış noktası

        // Kullanıcıdan uçuş için kişi sayısı alınır
        System.out.println("Uçuşunuzu kaç kişiyle gerçekleştireceksiniz?");
        while (true) {
            if (input.hasNextInt()) {
                kisiSayisi = input.nextInt();
                if (kisiSayisi <= 0) {
                    System.out.println("Lütfen geçerli bir pozitif sayı giriniz.");
                } else {
                    break;
                }
            } else {
                System.out.println("Lütfen geçerli bir sayı giriniz.");
                input.next();
            }
        }

        // Uçak bileti ücretini hesapla
        int ucakFiyati = 150 * kisiSayisi;  // Uçak bileti fiyatı
        System.out.println("Toplam Ücret (Uçak Bileti) : " + ucakFiyati + " €");

        return ucakFiyati;
    }

    // Otel konaklama rezervasyonu metodu
    public static int ayirtOtelKonaklama() {
        Scanner input = new Scanner(System.in);

        // Konaklama seçenekleri
        List<String> otelListesi = new ArrayList<>();
        otelListesi.add("Grand Hotel (150 EUR/gün)");
        otelListesi.add("Park Inn (120 EUR/gün)");
        otelListesi.add("City Hotel (100 EUR/gün)");

        System.out.println("========== MEVCUT OTELLER ===========");
        for (int i = 0; i < otelListesi.size(); i++) {
            System.out.println((i + 1) + ". " + otelListesi.get(i));
        }

        System.out.println("Lütfen 1 ile 3 arasında bir otel seçiniz (1-3): ");
        int secilenOtel = 0;
        while (secilenOtel < 1 || secilenOtel > otelListesi.size()) {
            if (input.hasNextInt()) {
                secilenOtel = input.nextInt();
                if (secilenOtel < 1 || secilenOtel > otelListesi.size()) {
                    System.out.println("Geçersiz seçim, lütfen 1 ile 3 arasında bir sayı girin.");
                }
            } else {
                System.out.println("Lütfen geçerli bir sayı giriniz.");
                input.next(); // Geçersiz girişi atla
            }
        }

        int otelFiyati = 0;
        switch (secilenOtel) {
            case 1:
                otelFiyati = 150;
                break;
            case 2:
                otelFiyati = 120;
                break;
            case 3:
                otelFiyati = 100;
                break;
        }

        // Konaklamada kaç gün kalacak sorusu
        System.out.println("Kaç gün konaklama yapacaksınız?");
        int konaklamaGunu = 0;
        while (true) {
            if (input.hasNextInt()) {
                konaklamaGunu = input.nextInt();
                if (konaklamaGunu <= 0) {
                    System.out.println("Lütfen geçerli bir sayı giriniz.");
                } else {
                    break;
                }
            } else {
                System.out.println("Lütfen geçerli bir sayı giriniz.");
                input.next(); // Geçersiz girişi atla
            }
        }

        // Konaklama ücretini hesapla
        int toplamOtelUcreti = otelFiyati * konaklamaGunu;
        System.out.println("Toplam Ücret (Otel Konaklama) : " + toplamOtelUcreti + " €");

        return toplamOtelUcreti;
    }

    // Paket program seçimi metodu (Gezi Turu + Uçak + Otel)
    public static int paketProgram() {
        // Kullanıcıya önce gezi turu, uçak bileti ve otel seçimi sunuyoruz
        int toplamTurUcreti = yapGeziTuru();
        int toplamUcakFiyati = ayirtUcakBileti();
        int toplamOtelFiyati = ayirtOtelKonaklama();

        // Paket programın toplam ücretini hesapla
        int toplamUcret = toplamTurUcreti + toplamUcakFiyati + toplamOtelFiyati;
        System.out.println("Toplam Ücret (Paket Program) : " + toplamUcret + " €");

        return toplamUcret;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int secim = 0;

        while (true) {
            yazdirMenu();
            secim = alKullaniciSecimi();

            if (secim == 1) {
                // Gezi turu seçildi
                yapGeziTuru();
            } else if (secim == 2) {
                // Uçak bileti seçildi
                ayirtUcakBileti();
            } else if (secim == 3) {
                // Otel konaklama seçildi
                ayirtOtelKonaklama();
            } else if (secim == 4) {
                // Paket program seçildi
                paketProgram();
            } else if (secim == 5) {
                System.out.println("Çıkış yapılıyor. Hoşça kalın!");
                break;
            } else {
                System.out.println("Geçersiz seçenek, lütfen tekrar deneyin.");
            }

            // Diğer hizmetleri almak isteyip istemediğini soralım
            System.out.println("Başka bir hizmet eklemek ister misiniz? (Evet için 'E', Hayır için 'H'): ");
            char devamMi = input.next().toUpperCase().charAt(0);
            if (devamMi == 'H') {
                System.out.println("İyi günler!");
                break;
            }
        }
    }
}