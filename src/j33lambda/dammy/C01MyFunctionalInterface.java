package j33lambda.dammy;

public class C01MyFunctionalInterface {
    public static void main(String[] args) {
// Lambda ifadesi ile çarpma işlemi
        Hesaplama carpmaIslemi = (sayi1, sayi2) -> sayi1 * sayi2;

        // Kullanım
        int sonuc = carpmaIslemi.islemYap(5, 4);
        System.out.println("Çarpma Sonucu: " + sonuc);  // 20
    }
}
