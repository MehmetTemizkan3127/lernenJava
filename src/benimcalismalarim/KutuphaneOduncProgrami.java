package benimcalismalarim;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class KutuphaneOduncProgrami {
    public static void main(String[] args) {
        // Mevcut kitap listesi
        ArrayList<String> kitapListesi = new ArrayList<>();
        kitapListesi.add("Suç ve Ceza");
        kitapListesi.add("Sefiller");
        kitapListesi.add("Don Kişot");
        kitapListesi.add("Küçük Prens");
        kitapListesi.add("Simyacı");

        // Ödünç alınan kitapları saklamak için liste
        ArrayList<String> oduncAlinanlar = new ArrayList<>();

        // Kullanıcıdan giriş almak için Scanner nesnesi
        Scanner scanner = new Scanner(System.in);
        boolean devamEdiyor = true;

        // Kullanıcıya kitap listesi gösterme ve işlem yapma
        while (devamEdiyor) {
            // Kitap listesini göster
            System.out.println("\nMevcut Kitap Listesi:");
            if (kitapListesi.isEmpty()) {
                System.out.println("Kütüphanede başka kitap kalmadı!");
                break;
            }

            for (int i = 0; i < kitapListesi.size(); i++) {
                System.out.println((i + 1) + ". " + kitapListesi.get(i));
            }

            // Kullanıcıdan bir kitap seçmesini iste
            System.out.print("Lütfen bir kitap seçmek için numarasını girin: ");

            int secim;
            try {
                secim = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Geçersiz giriş! Lütfen bir sayı girin.");
                scanner.nextLine(); // Hatalı girişi temizle
                continue;
            }

            // Seçim geçerli mi kontrol et
            if (secim > 0 && secim <= kitapListesi.size()) {
                String secilenKitap = kitapListesi.get(secim - 1);
                oduncAlinanlar.add(secilenKitap); // Ödünç alınanlar listesine ekle
                kitapListesi.remove(secim - 1);   // Seçilen kitabı mevcut listeden kaldır
                System.out.println("Kitap ödünç alındı: " + secilenKitap);
            } else {
                System.out.println("Geçersiz seçim! Lütfen doğru bir numara girin.");
                continue;
            }

            // Ödünç alınan kitapları göster
            System.out.println("\nŞu ana kadar ödünç aldığınız kitaplar:");
            for (String kitap : oduncAlinanlar) {
                System.out.println("- " + kitap);
            }

            // Başka bir kitap almak isteyip istemediğini sor
            System.out.print("\nBaşka bir kitap almak istiyor musunuz? (Evet için 'E', Hayır için 'H'): ");
            String cevap = scanner.next();

            if (cevap.equalsIgnoreCase("H")) {
                devamEdiyor = false; // Döngüyü sonlandır
            }
        }

        // Ödünç alınan kitapları listele
        System.out.println("\nÖdünç Aldığınız Kitaplar:");
        for (String kitap : oduncAlinanlar) {
            System.out.println("- " + kitap);
        }

        // Programı sonlandır
        System.out.println("Teşekkürler! İyi okumalar.");
        scanner.close();
    }
}