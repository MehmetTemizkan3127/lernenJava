package benimcalismalarim.önceki.homework.tatilprogrami;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ReservationProgram {

    private static final ArrayList<String> sehirler = new ArrayList<>();
    private static final Map<String, ArrayList<String>> oteller = new HashMap<>();
    private static final ArrayList<String> turlar = new ArrayList<>();
    private static double toplamTutar = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Şehir ve hizmetlerin tanımlanması
        tanimlaSehirler();
        tanimlaOteller();
        tanimlaTurlar();

        boolean devamEtmekIstiyorMu = true;

        while (devamEtmekIstiyorMu) {
            System.out.println("\nLütfen almak istediğiniz hizmeti seçiniz:");
            System.out.println("1 - Uçak Bileti Rezervasyonu");
            System.out.println("2 - Otel Rezervasyonu");
            System.out.println("3 - Tur Hizmeti Rezervasyonu");

            int hizmetSecimi = scanner.nextInt();
            switch (hizmetSecimi) {
                case 1 -> ucakBiletiRezervasyonu(scanner);
                case 2 -> otelRezervasyonu(scanner);
                case 3 -> turHizmetiRezervasyonu(scanner);
                default -> System.out.println("Geçersiz seçim yaptınız.");
            }

            System.out.print("Başka bir hizmet eklemek ister misiniz? (Evet/Hayır): ");
            String cevap = scanner.next();
            devamEtmekIstiyorMu = cevap.equalsIgnoreCase("Evet");
        }

        rezervasyonOzetiniGoster();
        scanner.close();
    }

    private static void tanimlaSehirler() {
        sehirler.add("Paris");
        sehirler.add("Londra");
        sehirler.add("Roma");
        sehirler.add("Amsterdam");
        sehirler.add("Barselona");
    }

    private static void tanimlaOteller() {
        // Her şehre özgü otelleri belirliyoruz
        ArrayList<String> parisOtelleri = new ArrayList<>();
        parisOtelleri.add("Grand Hotel Paris");
        parisOtelleri.add("Le Meurice");
        oteller.put("Paris", parisOtelleri);

        ArrayList<String> londraOtelleri = new ArrayList<>();
        londraOtelleri.add("The London Palace");
        londraOtelleri.add("The Ritz London");
        oteller.put("Londra", londraOtelleri);

        ArrayList<String> romaOtelleri = new ArrayList<>();
        romaOtelleri.add("Rome City Resort");
        romaOtelleri.add("Hotel Quirinale");
        oteller.put("Roma", romaOtelleri);

        ArrayList<String> amsterdamOtelleri = new ArrayList<>();
        amsterdamOtelleri.add("Amsterdam Central Inn");
        amsterdamOtelleri.add("Conservatorium Hotel");
        oteller.put("Amsterdam", amsterdamOtelleri);

        ArrayList<String> barselonaOtelleri = new ArrayList<>();
        barselonaOtelleri.add("Barcelona Beach Hotel");
        barselonaOtelleri.add("Hotel Arts Barcelona");
        oteller.put("Barselona", barselonaOtelleri);
    }

    private static void tanimlaTurlar() {
        turlar.add("Paris Sanat Turu");
        turlar.add("Londra Tarih Gezisi");
        turlar.add("Roma Antik Kalıntıları Turu");
        turlar.add("Amsterdam Kanal Turu");
        turlar.add("Barselona Mimari Turu");
    }

    private static void ucakBiletiRezervasyonu(Scanner scanner) {
        System.out.println("\nLütfen gitmek istediğiniz şehri seçiniz:");
        for (int i = 0; i < sehirler.size(); i++) {
            System.out.println((i + 1) + " - " + sehirler.get(i));
        }

        int sehirSecimi = scanner.nextInt();
        if (sehirSecimi < 1 || sehirSecimi > sehirler.size()) {
            System.out.println("Geçersiz şehir seçimi.");
            return;
        }

        System.out.print("Kaç kişi için uçak bileti almak istiyorsunuz? ");
        int kisiSayisi = scanner.nextInt();
        double fiyat = 150.0 * kisiSayisi;
        toplamTutar += fiyat;

        System.out.println(sehirler.get(sehirSecimi - 1) + " için uçak bileti rezerve edildi. Toplam: $" + fiyat);
    }

    private static void otelRezervasyonu(Scanner scanner) {
        System.out.println("\nLütfen kalmak istediğiniz şehri seçiniz:");
        for (int i = 0; i < sehirler.size(); i++) {
            System.out.println((i + 1) + " - " + sehirler.get(i));
        }

        int sehirSecimi = scanner.nextInt();
        if (sehirSecimi < 1 || sehirSecimi > sehirler.size()) {
            System.out.println("Geçersiz şehir seçimi.");
            return;
        }

        String secilenSehir = sehirler.get(sehirSecimi - 1);
        System.out.println("\nLütfen otel seçiniz:");
        ArrayList<String> sehirOtelleri = oteller.get(secilenSehir);
        for (int i = 0; i < sehirOtelleri.size(); i++) {
            System.out.println((i + 1) + " - " + sehirOtelleri.get(i));
        }

        int otelSecimi = scanner.nextInt();
        if (otelSecimi < 1 || otelSecimi > sehirOtelleri.size()) {
            System.out.println("Geçersiz otel seçimi.");
            return;
        }

        System.out.print("Kaç gün konaklayacaksınız? ");
        int gunSayisi = scanner.nextInt();
        double fiyat = 100.0 * gunSayisi;
        toplamTutar += fiyat;

        System.out.println(sehirOtelleri.get(otelSecimi - 1) + " otelinde " + gunSayisi + " gün için rezervasyon yapıldı. Toplam: $" + fiyat);
    }

    private static void turHizmetiRezervasyonu(Scanner scanner) {
        System.out.println("\nLütfen tur düzenlemek istediğiniz şehri seçiniz:");
        for (int i = 0; i < sehirler.size(); i++) {
            System.out.println((i + 1) + " - " + sehirler.get(i));
        }

        int sehirSecimi = scanner.nextInt();
        if (sehirSecimi < 1 || sehirSecimi > sehirler.size()) {
            System.out.println("Geçersiz şehir seçimi.");
            return;
        }

        System.out.println("\nLütfen tur seçiniz:");
        for (int i = 0; i < turlar.size(); i++) {
            System.out.println((i + 1) + " - " + turlar.get(i));
        }

        int turSecimi = scanner.nextInt();
        if (turSecimi < 1 || turSecimi > turlar.size()) {
            System.out.println("Geçersiz tur seçimi.");
            return;
        }

        System.out.print("Kaç gün sürecek? ");
        int gunSayisi = scanner.nextInt();
        double fiyat = 120.0 * gunSayisi;
        toplamTutar += fiyat;

        System.out.println(turlar.get(turSecimi - 1) + " turu için rezervasyon yapıldı. Toplam: $" + fiyat);
    }

    private static void rezervasyonOzetiniGoster() {
        System.out.println("\nRezervasyon Özeti:");
        System.out.println("Toplam Tutar: $" + toplamTutar);
        System.out.println("Rezervasyon işleminiz tamamlandı. İyi tatiller!");
    }
}
