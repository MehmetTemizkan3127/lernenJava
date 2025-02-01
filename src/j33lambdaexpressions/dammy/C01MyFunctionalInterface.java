package j33lambdaexpressions.dammy;

public class C01MyFunctionalInterface {
    public static void main(String[] args) {
        /*// Lambda ifadesi ile çarpma işlemi
        Hesaplama carpmaIslemi = (sayi1, sayi2) -> sayi1 * sayi2;

        // Kullanım
        int sonuc = carpmaIslemi.islemYap(5, 4);
        System.out.println("Çarpma Sonucu: " + sonuc);  // 20
        */


        //vararg
        // Toplama işlemi için lambda fonksiyonu
        Hesaplama toplama = (sayilar) -> {
            int toplam = 0;
            for (int sayi : sayilar) {
                toplam += sayi;
            }
            return toplam;
        };

        // Çıktı: 10
        System.out.println(toplama.islemYap(1, 2, 3, 4));





        // Metinleri birleştiren lambda fonksiyonu
        MetinIslemi birlestir = (metinler) -> String.join(" ", metinler);

        // Çıktı: Merhaba Dünya Java
        System.out.println(birlestir.islemYap("Merhaba", "Dünya", "Java"));
    }
}
