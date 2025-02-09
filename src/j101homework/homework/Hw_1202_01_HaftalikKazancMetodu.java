package j101homework.homework;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Hw_1202_01_HaftalikKazancMetodu {
    public static void main(String[] args) {
        // 1. Adım: Günleri içeren bir ArrayList oluşturun
        ArrayList<String> gunler = new ArrayList<>();
        gunler.add("23 Kasım");
        gunler.add("24 Kasım");
        gunler.add("25 Kasım");
        gunler.add("26 Kasım");
        gunler.add("27 Kasım");
        gunler.add("28 Kasım");
        gunler.add("29 Kasım");

        // 2. Adım: Günlük kazançları ekleyeceğimiz bir ArrayList oluşturun
        ArrayList<Double> gunlukKazanclar = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // 3. Adım: Kullanıcıdan 7 günlük kazançları al
        for (String gun : gunler) {
            System.out.print(gun + " günü kazancınızı girin: ");
            double kazanc = scanner.nextDouble();
            gunlukKazanclar.add(kazanc);
        }

        // 4. Adım: Ortalama kazancı hesaplayıp yazdır
        double ortalamaKazanc = getOrtalamaKazanc(gunlukKazanclar);
        System.out.println("Ortalama Kazanç: " + formatla(ortalamaKazanc));

        // 5. Adım: Ortalamanın üstünde kazanç günlerini yazdır
        ArrayList<String> ustundeKazancGunleri = getOrtalamaninUstundeKazancGunleri(gunler, gunlukKazanclar, ortalamaKazanc);
        System.out.println("Ortalamanın üstünde kazanç olan günler: " + ustundeKazancGunleri);

        // 6. Adım: Ortalamanın altında kazanç günlerini yazdır
        ArrayList<String> altindaKazancGunleri = getOrtalamaninAltindaKazancGunleri(gunler, gunlukKazanclar, ortalamaKazanc);
        System.out.println("Ortalamanın altında kazanç olan günler: " + altindaKazancGunleri);

        scanner.close();
    }

    // Ortalama kazancı hesaplayan method
    public static double getOrtalamaKazanc(ArrayList<Double> gunlukKazanclar) {
        double toplam = 0;
        for (double kazanc : gunlukKazanclar) {
            toplam += kazanc;
        }
        return toplam / gunlukKazanclar.size();
    }

    // Ortalamanın üstünde kazanç günlerini bulan method
    public static ArrayList<String> getOrtalamaninUstundeKazancGunleri(ArrayList<String> gunler, ArrayList<Double> gunlukKazanclar, double ortalama) {
        ArrayList<String> ustundeKazancGunleri = new ArrayList<>();
        for (int i = 0; i < gunlukKazanclar.size(); i++) {
            if (gunlukKazanclar.get(i) > ortalama) {
                ustundeKazancGunleri.add(gunler.get(i));
            }
        }
        return ustundeKazancGunleri;
    }

    // Ortalamanın altında kazanç günlerini bulan method
    public static ArrayList<String> getOrtalamaninAltindaKazancGunleri(ArrayList<String> gunler, ArrayList<Double> gunlukKazanclar, double ortalama) {
        ArrayList<String> altindaKazancGunleri = new ArrayList<>();
        for (int i = 0; i < gunlukKazanclar.size(); i++) {
            if (gunlukKazanclar.get(i) < ortalama) {
                altindaKazancGunleri.add(gunler.get(i));
            }
        }
        return altindaKazancGunleri;
    }

    // Sayıyı iki basamaklı formata çeviren method
    public static String formatla(double sayi) {
        DecimalFormat df = new DecimalFormat("0.00");
        return df.format(sayi);
    }
}