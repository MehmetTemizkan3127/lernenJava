package javacalismalarim.dummy;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class KutuphaneOduncProgrami {
    // ANSI renk kodları
    public static final String ANSI_RESET = "\u001B[0m"; // Renk sıfırlama
    public static final String ANSI_RED = "\u001B[31m";  // Kırmızı renk

    public static void main(String[] args) {
        // Mevcut kitap listesi
        List<String> kitapListesi = new ArrayList<>();
        kitapListesi.add("Suç ve Ceza");
        kitapListesi.add("Sefiller");
        kitapListesi.add("Don Kişot");
        kitapListesi.add("Küçük Prens");
        kitapListesi.add("Simyacı");

        // Ödünç alınan kitapları saklamak için liste
        List<String> oduncAlinanlar = new ArrayList<>();

        // Kullanıcıdan giriş almak için Scanner nesnesi
        Scanner scanner = new Scanner(System.in);
        boolean devamEdiyor = true;

        // Kullanıcıya kitap listesi gösterme ve işlem yapma
        while (devamEdiyor) {
            // Kitap listesini göster
            System.out.println("\nMevcut Kitap Listesi:");
            boolean tumKitaplarAlindi = true;

            for (int i = 0; i < kitapListesi.size(); i++) {
                String kitap = kitapListesi.get(i);
                if (kitap.contains("(Alındı)")) {
                    System.out.println((i + 1) + ". " + ANSI_RED + kitap + ANSI_RESET);
                } else {
                    System.out.println((i + 1) + ". " + kitap);
                    tumKitaplarAlindi = false; // En az bir kitap alınmamış durumda
                }
            }

            if (tumKitaplarAlindi) {
                System.out.println("Kütüphanede başka ödünç alınabilir kitap kalmadı!");
                break;
            }

            // Kullanıcıdan bir kitap seçmesini iste
            System.out.print("Lütfen bir kitap seçmek için numarasını girin: ");

            // Doğru giriş kontrolü
            if (scanner.hasNextInt()) { // Kullanıcının geçerli bir sayı girip girmediğini kontrol et
                int secim = scanner.nextInt();

                // Seçim geçerli mi kontrol et
                if (secim > 0 && secim <= kitapListesi.size()) {
                    String secilenKitap = kitapListesi.get(secim - 1);

                    if (secilenKitap.contains("(Alındı)")) {
                        System.out.println("Bu kitap zaten ödünç alınmış. Lütfen başka bir kitap seçin.");
                    } else {
                        oduncAlinanlar.add(secilenKitap); // Ödünç alınanlar listesine ekle
                        kitapListesi.set(secim - 1, secilenKitap + " (Alındı)"); // Kitabın yanına "Alındı" ekle
                        System.out.println("Kitap ödünç alındı: " + secilenKitap);
                    }
                } else {
                    System.out.println("Geçersiz seçim! Lütfen 1 ile " + kitapListesi.size() + " arasında bir sayı girin.");
                }
            } else {
                System.out.println("Geçersiz giriş! Lütfen bir sayı girin.");
                scanner.next(); // Geçersiz girdiyi temizle
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