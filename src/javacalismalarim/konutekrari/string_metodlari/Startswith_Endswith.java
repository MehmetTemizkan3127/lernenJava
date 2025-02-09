package javacalismalarim.konutekrari.string_metodlari;

public class Startswith_Endswith {
    public static void main(String[] args) {

        String metin = "Merhaba Dünya";

        // startsWith kullanımı
        boolean startsWith1 = metin.startsWith("Merhaba");
        System.out.println(startsWith1); // true

        // indexOf ile
        boolean startsWith2 = metin.indexOf("Merhaba") == 0;
        System.out.println(startsWith2); // true


        // endsWith kullanımı
        boolean endsWith1 = metin.endsWith("Dünya");
        System.out.println(endsWith1); // true

// lastIndexOf ile
        boolean endsWith2 = metin.lastIndexOf("Dünya") == metin.length() - "Dünya".length();
        System.out.println(endsWith2); // true






    }
}
