package javacalismalarim.konutekrari.string_metodlari;

public class Trim_Strip {
    public static void main(String[] args) {
        String metin = "   Merhaba Dünya   ";

// strip kullanımı
        String strip = metin.strip();
        System.out.println(strip); // Merhaba Dünya

// trim() ile
        String trim = metin.trim();
        System.out.println(trim); // Merhaba Dünya
    }
}
