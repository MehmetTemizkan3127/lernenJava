package benimcalismalarim.homework.hwgezituru;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GeziTuru {

    // 1. Metod, mevcut gezi turlarını liste halinde kullanıcıya gösterir.
    public static void yazdirGeziTuruSecenekleri(List<String> turlar) {
        System.out.println("========== MEVCUT GEZİ TURLARI ===========");
        for (int i = 0; i < turlar.size(); i++) {
            System.out.println((i + 1) + ". " + turlar.get(i));
        }
    }

    // 2. Metod, kullanıcıdan bir gezi turu seçmesini ister ve geçerli bir seçim alana kadar tekrar eder.
    public static int turSec(List<String> turlar) {
        Scanner input = new Scanner(System.in);
        int secim;
        while (true) {
            System.out.print("Lütfen listeden bir gezi turu seçiniz (1-" + turlar.size() + "): ");
            if (input.hasNextInt()) {
                secim = input.nextInt();
                if (secim >= 1 && secim <= turlar.size()) {
                    return secim - 1;  // Geçerli seçim, 1 ile başlar ama indeks 0'dan başlar
                } else {
                    System.out.println("Geçersiz seçim. Lütfen tekrar deneyiniz.");
                }
            } else {
                System.out.println("Geçersiz giriş. Lütfen bir sayı giriniz.");
                input.next();  // Hatalı giriş sonrasında geçersiz input'u atla
            }
        }
    }

    // 3. Metod, kullanıcıdan kaç kişinin katılacağını alır ve geçerli bir sayı girene kadar tekrar eder.
    public static int kisiSayisiAl() {
        Scanner input = new Scanner(System.in);
        int kisiSayisi;
        while (true) {
            System.out.print("Kaç kişi katılacak? : ");
            if (input.hasNextInt()) {
                kisiSayisi = input.nextInt();
                if (kisiSayisi > 0) {
                    break;  // Geçerli bir sayı, çıkabiliriz
                } else {
                    System.out.println("Lütfen geçerli bir pozitif sayı giriniz.");
                }
            } else {
                System.out.println("Geçersiz giriş. Lütfen bir sayı giriniz.");
                input.next();  // Hatalı giriş sonrasında geçersiz input'u atla
            }
        }
        return kisiSayisi;
    }

    // 4. Metod, kullanıcıdan kaç çocuk olduğunu alır ve geçerli bir sayı girene kadar tekrar eder.
    public static int cocukSayisiAl() {
        Scanner input = new Scanner(System.in);
        int cocukSayisi;
        while (true) {
            System.out.print("Kaç çocuk var? : ");
            if (input.hasNextInt()) {
                cocukSayisi = input.nextInt();
                if (cocukSayisi >= 0) {
                    break;  // Geçerli bir sayı
                } else {
                    System.out.println("Çocuk sayısı negatif olamaz, lütfen geçerli bir sayı giriniz.");
                }
            } else {
                System.out.println("Geçersiz giriş. Lütfen bir sayı giriniz.");
                input.next();  // Hatalı giriş sonrasında geçersiz input'u atla
            }
        }
        return cocukSayisi;
    }

    // 5. Metod, kullanıcıdan kaç yaşlı olduğunu alır ve geçerli bir sayı girene kadar tekrar eder.
    public static int yasliSayisiAl() {
        Scanner input = new Scanner(System.in);
        int yasliSayisi;
        while (true) {
            System.out.print("Kaç yaşlı var? : ");
            if (input.hasNextInt()) {
                yasliSayisi = input.nextInt();
                if (yasliSayisi >= 0) {
                    break;  // Geçerli bir sayı
                } else {
                    System.out.println("Yaşlı sayısı negatif olamaz, lütfen geçerli bir sayı giriniz.");
                }
            } else {
                System.out.println("Geçersiz giriş. Lütfen bir sayı giriniz.");
                input.next();  // Hatalı giriş sonrasında geçersiz input'u atla
            }
        }
        return yasliSayisi;
    }

    // 6. Metod, gezi turunun toplam fiyatını hesaplar; çocuklar, yaşlılar ve yetişkinler için indirimleri uygular.
    public static double geziTuruFiyati(int kisiSayisi, double turFiyati, int cocukSayisi, int yasliSayisi) {
        Scanner input = new Scanner(System.in);

        double toplamFiyat = 0.0;

        // Çocukların indirim hesaplaması
        for (int i = 1; i <= cocukSayisi; i++) {
            int yas;
            while (true) {
                System.out.print("Çocuk " + i + " yaşı nedir? : ");
                if (input.hasNextInt()) {
                    yas = input.nextInt();
                    if (yas >= 0) {  // Yaş negatif olamaz
                        break;
                    } else {
                        System.out.println("Geçersiz yaş. Yaş negatif olamaz, lütfen geçerli bir yaş giriniz.");
                    }
                } else {
                    System.out.println("Geçersiz yaş. Lütfen bir sayı giriniz.");
                    input.next();  // Hatalı giriş sonrasında geçersiz input'u atla
                }
            }

            double indirimOrani = 0.0;

            if (yas <= 6) {
                indirimOrani = 1.0;  // Tam indirim
            } else if (yas <= 12) {
                indirimOrani = 0.5;  // %50 indirim
            } else if (yas <= 18) {
                indirimOrani = 0.25; // %25 indirim
            }

            double indirimliFiyat = turFiyati * (1 - indirimOrani);
            toplamFiyat += indirimliFiyat;
            System.out.printf("Çocuk %d: %,.2f EUR (indirim oranı: %.0f%%, indirimli fiyat: %,.2f EUR)\n",
                    i, turFiyati, indirimOrani * 100, indirimliFiyat);
        }

        // Yaşlıların indirim hesaplaması
        for (int i = 1; i <= yasliSayisi; i++) {
            double indirimliFiyat = turFiyati * 0.5;
            toplamFiyat += indirimliFiyat;
            System.out.printf("Yaşlı %d: %,.2f EUR (indirim oranı: 50%%, indirimli fiyat: %,.2f EUR)\n",
                    i, turFiyati, indirimliFiyat);
        }

        // Yetişkinlerin indirim hesaplaması
        int yetiskinSayisi = kisiSayisi - cocukSayisi - yasliSayisi;
        for (int i = 1; i <= yetiskinSayisi; i++) {
            double indirimOrani = 0.03 * (i - 1);
            double indirimliFiyat = turFiyati * (1 - indirimOrani);
            toplamFiyat += indirimliFiyat;
            System.out.printf("Yetişkin %d: %,.2f EUR (indirim oranı: %.0f%%, indirimli fiyat: %,.2f EUR)\n",
                    i, turFiyati, indirimOrani * 100, indirimliFiyat);
        }

        return toplamFiyat;
    }

    // 7. Metod, kullanıcı ile etkileşimi sağlar, gezi turlarını seçmesini, kişi sayısını ve toplam fiyatı hesaplar.
    public static void main(String[] args) {
        System.out.println("CLARUSWAY GEZI AJANSINA HOSGELDINIZ!");
        System.out.println();

        List<String> turlar = new ArrayList<>();
        turlar.add("Roma (İtalya) - 4 gün - 3 gece - 280 EUR");
        turlar.add("Paris (Fransa) - 3 gün - 2 gece - 250 EUR");
        turlar.add("Londra (İngiltere) - 4 gün - 3 gece - 270 EUR");
        turlar.add("Barcelona (İspanya) - 3 gün - 2 gece - 240 EUR");
        turlar.add("Amsterdam (Hollanda) - 3 gün - 2 gece - 220 EUR");

        double[] fiyatlar = {280, 250, 270, 240, 220};
        List<String> secilenTurlar = new ArrayList<>();
        List<Double> secilenFiyatlar = new ArrayList<>();
        double genelToplam = 0.0;

        while (true) {
            yazdirGeziTuruSecenekleri(turlar);

            int secilenTurIndex = turSec(turlar);
            String secilenTur = turlar.get(secilenTurIndex);
            turlar.remove(secilenTurIndex);

            double turFiyati = fiyatlar[secilenTurIndex];
            secilenTurlar.add(secilenTur);

            System.out.printf("\nSeçilen Tur: %s\n", secilenTur);

            int kisiSayisi = kisiSayisiAl();
            int cocukSayisi = cocukSayisiAl();
            int yasliSayisi = yasliSayisiAl();

            double toplamFiyat = geziTuruFiyati(kisiSayisi, turFiyati, cocukSayisi, yasliSayisi);
            secilenFiyatlar.add(toplamFiyat);
            genelToplam += toplamFiyat;

            // Ekstra tur ekleme işlemi için doğru karakter girilmesi sağlanıyor
            char cevap;
            while (true) {
                System.out.print("Ekstra bir tur eklemek ister misiniz? (Evet için 'E', Hayır için 'H'): ");
                Scanner input = new Scanner(System.in);
                String cevapStr = input.next().toUpperCase(); // 'E' veya 'H' olması sağlanıyor
                if (cevapStr.equals("E") || cevapStr.equals("H")) {
                    cevap = cevapStr.charAt(0);
                    break;
                } else {
                    System.out.println("Geçersiz giriş. Lütfen 'E' veya 'H' giriniz.");
                }
            }

            if (cevap == 'H') {
                System.out.println("\n========== SEÇİLEN TURLAR ==========");
                for (int i = 0; i < secilenTurlar.size(); i++) {
                    System.out.printf("- %s (Toplam maliyet: %,.2f EUR)\n", secilenTurlar.get(i), secilenFiyatlar.get(i));
                }
                System.out.printf("\nGenel Toplam Tutar: %,.2f EUR\n", genelToplam);
                System.out.println("Ödemenizi gerçekleştirdikten sonra tur kaydi tamamlanacaktir. \nAnlayisiniz icin eşekkür ederiz!");
                break;
            }
        }
    }
}