package javacalismalarim.dummy;

public class PassByValue {

    public static void main(String[] args) {
        int ogrenciNotu = 70;
        notuArtir(ogrenciNotu);  // Pass by Value
        System.out.println("Main'de metod cagrildiginda öğrenci notu: " + ogrenciNotu); // 70

        System.out.println();

        int sayi = 10;
        sayiyiArtir(sayi);  // Pass by Value
        System.out.println("Main'de metod cagrildiginda sayi: " + sayi); // 10
    }

    public static void notuArtir(int not) {
        not = not + 10;  // Kopyalanan değeri artırıyoruz
        System.out.println("Metod içindeki öğrenci notu: " + not); // 80
    }

    public static void sayiyiArtir(int numara) {
        numara = numara + 5;
        System.out.println("Metod içindeki numara: " + numara); // 15
    }
}