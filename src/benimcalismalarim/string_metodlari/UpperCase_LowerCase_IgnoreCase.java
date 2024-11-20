package benimcalismalarim.string_metodlari;

import java.util.Scanner;

public class UpperCase_LowerCase_IgnoreCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str1 = "Hello";
        String str2 = "hello";
        System.out.println(str1.equals(str2)); // false
        System.out.println(str1.equals("Hello")); // true

        String kayitliKullanici = "KullaniciAdi";
        String girilenKullanici = "kullaniciadi";

        // equals() büyük/küçük harf duyarlıdır
        if (kayitliKullanici.equals(girilenKullanici)) {
            System.out.println("Giriş başarılı!");
        } else {
            System.out.println("Giriş başarısız! (equals ile)");
        }

        // equalsIgnoreCase büyük/küçük harf duyarlı değildir
        if (kayitliKullanici.equalsIgnoreCase(girilenKullanici)) {
            System.out.println("Giriş başarılı! (equalsIgnoreCase ile)");
        } else {
            System.out.println("Giriş başarısız!");
        }

        String orijinalMetin = "JaVa PRogrAmLaMA";

        // Tüm harfleri büyük harfe çevirme
        String buyukHarfli = orijinalMetin.toUpperCase();
        System.out.println("Büyük Harfli: " + buyukHarfli); // JAVA PROGRAMLAMA

        // Tüm harfleri küçük harfe çevirme
        String kucukHarfli = orijinalMetin.toLowerCase();
        System.out.println("Küçük Harfli: " + kucukHarfli); // java programlama

        String dosyaAdi = "RESIM.PNG";
        String kabulEdilenUzanti = ".png";

        // toLowerCase ile karşılaştırma
        if (dosyaAdi.toLowerCase().endsWith(kabulEdilenUzanti.toLowerCase())) {
            System.out.println("Dosya uzantısı geçerli.");
        } else {
            System.out.println("Dosya uzantısı geçersiz.");
        }

        // equalsIgnoreCase ile uzantıyı direkt karşılaştırma
        String uzanti = dosyaAdi.substring(dosyaAdi.lastIndexOf("."));
        if (uzanti.equalsIgnoreCase(kabulEdilenUzanti)) {
            System.out.println("Dosya uzantısı geçerli (equalsIgnoreCase ile).");
        } else {
            System.out.println("Dosya uzantısı geçersiz.");
        }


    }
}
