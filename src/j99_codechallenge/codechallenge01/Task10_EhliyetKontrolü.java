package j99_codechallenge.codechallenge01;

import java.util.Scanner;

public class Task10_EhliyetKontrolü {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Ehliyetiniz var mı? (evet/hayır): ");
        String ehliyetVarMi = input.next();

        if (ehliyetVarMi == null || ehliyetVarMi.isEmpty() ||
                (!ehliyetVarMi.equalsIgnoreCase("evet") && !ehliyetVarMi.equalsIgnoreCase("hayır"))) {
            System.out.println("Geçersiz giriş. Lütfen 'evet' veya 'hayır' girin.");
            return;
        }

        if (ehliyetVarMi.equalsIgnoreCase("evet")) {
            System.out.print("Kaç yıllık sürücü tecrübeniz var?: ");
            if (!input.hasNextInt()) {
                System.out.println("Geçersiz tecrübe yılı. Sayı girin.");
                return;
            }
            int tecrubeYili = input.nextInt();

            // Eğer tecrübe yılı 7 yıldan azsa diğer soruya geçmiyoruz
            if (tecrubeYili < 7) {
                System.out.println("Tecrübe yılı eksik: " + (7 - tecrubeYili) + " yıl daha lazım.");
                return;
            }

            // Eğer tecrübe yılı uygunsa mesafe sorusunu soruyoruz
            System.out.print("Kaç km yol yaptınız?: ");
            if (!input.hasNextInt()) {
                System.out.println("Geçersiz mesafe. Sayı girin.");
                return;
            }
            int mesafe = input.nextInt();

            if (mesafe >= 100000) {
                System.out.println("Kontak anahtarını alabilirsiniz.");
            } else {
                System.out.println("Mesafe eksik: " + (100000 - mesafe) + " km daha yol yapmanız gerekiyor.");
            }
        } else {
            System.out.println("Ehliyetiniz yok, kontak anahtarı verilemez.");
        }










        }
}
