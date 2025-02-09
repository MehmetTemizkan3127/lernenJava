package javacalismalarim.konutekrari.string_metodlari;

public class Contains {
    public static void main(String[] args) {
        String email = "mehmettemizkanabs@gmail.com";
       // System.out.println(email.contains("examil"));
       // System.out.println(email.contains("temiz"));

        if (email.contains("@") && email.contains(".")) {
            System.out.println("Bu bir gecerli mail adresidir");
        } else {
            System.out.println("Gecersiz bir mail adresidir");

        }

        String s = "Merhaba Dünya";

        // contains kullanımı
        boolean contains1 = s.contains("Dünya");
        System.out.println(contains1); // true

        // indexOf ile
        boolean contains2 = s.indexOf("Dünya") >= 0;
        System.out.println(contains2); // true





    }
}