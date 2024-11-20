package benimcalismalarim.string_metodlari;

public class Repeat {
    public static void main(String[] args) {
        String metin = "Mehmet Temizkan";

        // repeat kullanımı
        String repeat = ("\n" +metin + " ").repeat(3).trim();
        System.out.println(repeat); //
    }
}
