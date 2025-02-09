package j102mentoring.replace;

import java.util.Scanner;

public class M_1030_07_ReplaceAll {
    public static void main(String[] args) {
// E-posta metninden tüm HTML etiketlerini kaldırın.
// Kullanıcıdan alınan bir e-posta içeriğini ekranda
// düzgün görünmesi için sadece yazı olarak göstermek istiyorsunuz.
// Örneğin, <p>Merhaba <b>Ali</b>, nasılsın?</p> metnini temizleyin.
// Merhaba Ali , nasılsın? çıktısına ulaşın.

        Scanner scanner = new Scanner(System.in);
        System.out.print("E-posta içeriğini girin: ");
        String emailContent = scanner.nextLine();

        String cleanedContent = emailContent.replaceAll("<[^>]*>", "").strip(); // + isareti ilede oluyor.
        System.out.println("Temizlenmiş metin: " + cleanedContent);
    }
}
