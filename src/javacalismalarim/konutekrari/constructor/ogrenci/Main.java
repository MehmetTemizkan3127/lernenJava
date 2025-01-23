package javacalismalarim.konutekrari.constructor.ogrenci;

public class Main {
    public static void main(String[] args) {

        // Parametreli constructor kullanılarak öğrenci oluşturuluyor
        Ogrenci ogrenci1 = new Ogrenci(8, 255, "Salih", "Mathe", 80, true);

        // Öğrencilerin bilgilerini ekrana yazdırıyoruz
        System.out.println(ogrenci1);

        ogrenci1.notGuncelle(-51);
        System.out.println("ogrenci1 = " + ogrenci1);

    }
}