package benimcalismalarim.Mentoring.soncalismalarim;

import java.util.Scanner;

public class M_1029_03_ConcatLength {
    public static void main(String[] args) {
        // Soru: Bir mağaza, yeni bir ürünün adıyla seri numarasını birleştirerek stok etiketi oluşturmak istiyor.
        // Kullanıcıdan ürün adı ve seri numarasını alarak bu iki değeri concat() ile birleştirin ve
        // uzunluğunu length() ile kontrol edin. Eğer stok etiketi
        // uzunluğu 25 karakterden fazla ise, "Stok etiketi çok uzun." mesajını gösterin.
        // Ayrıca, ürün adı en az 5 karakter değilse, "Ürün adı çok kısa, geçerli bir ürün adı girin." mesajını verin.

        Scanner input = new Scanner(System.in);

        System.out.println("Ürünün adini giriniz : ");
        String urunAdi = input.next();

        if (urunAdi.length() < 5) {
            System.out.println("Ürün adı çok kısa, geçerli bir ürün adı girin.");
        } else {
            // Ürün adı yeterli uzunluktaysa seri numarasını alıyoruz
            System.out.println("Ürünün seri numarasını giriniz:");
            String urunSeriNumarasi = input.next(); // Seri numarasını String olarak alıyoruz

            // concat() ile ürün adı ve seri numarasını birleştiriyoruz
            String stokEtiketi = urunAdi.concat(" ").concat(urunSeriNumarasi);

            // Stok etiketinin uzunluğunu length() ile kontrol ediyoruz
            if (stokEtiketi.length() > 25) {
                System.out.println("Stok etiketi çok uzun.");
            } else {
                System.out.println("Oluşturulan Stok Etiketi: " + stokEtiketi);
            }
        }

    }
}
