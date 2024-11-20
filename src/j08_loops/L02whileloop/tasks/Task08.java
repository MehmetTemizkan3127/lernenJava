package j08_loops.L02whileloop.tasks;

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        // task-> girilen şifrenin asagidaki sartlari kontrol edin
        // ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
        // eger tum sartlari saglarsa, "sifre basariyla kaydedildi" print edin
        // - ilk harf kucuk harf olmali
        // - son karakter rakam olmali
        // - sifre bosluk icermemeli
        // - uzunlugu en az 10 karakter olmali

        Scanner scanner = new Scanner(System.in);
        boolean sifreGecerli = false;

        while (!sifreGecerli) {
            System.out.print("Lütfen bir şifre girin: ");
            String sifre = scanner.nextLine();

            // Şifre kontrol koşullarını belirten değişkenler
            boolean ilkHarfKucuk = !sifre.isEmpty() && Character.isLowerCase(sifre.charAt(0));
            boolean sonKarakterRakam = !sifre.isEmpty() && Character.isDigit(sifre.charAt(sifre.length() - 1));
            boolean boslukIcermez = !sifre.contains(" ");
            boolean uzunlukYeterli = sifre.length() >= 10;

            StringBuilder hataMesajlari = new StringBuilder();
            sifreGecerli = true; // Şifrenin geçerli olduğunu varsayıyoruz; koşullardan biri sağlanmazsa false olacak

            // Her koşulu kontrol eden if blokları
            if (!ilkHarfKucuk) {
                hataMesajlari.append("- Şifrenin ilk harfi küçük harf olmalı.\n");
                sifreGecerli = false;
            }

            if (!sonKarakterRakam) {
                hataMesajlari.append("- Şifrenin son karakteri bir rakam olmalı.\n");
                sifreGecerli = false;
            }

            if (!boslukIcermez) {
                hataMesajlari.append("- Şifre boşluk içermemeli.\n");
                sifreGecerli = false;
            }

            if (!uzunlukYeterli) {
                hataMesajlari.append("- Şifre en az 10 karakter uzunluğunda olmalı.\n");
                sifreGecerli = false;
            }

            // Sonuç
            if (sifreGecerli) {
                System.out.println("Şifre başarıyla kaydedildi.");
            } else {
                System.out.println("Şifrenizde düzeltmeniz gereken eksikler:");
                System.out.println(hataMesajlari.toString());
            }
        }


    }
}
