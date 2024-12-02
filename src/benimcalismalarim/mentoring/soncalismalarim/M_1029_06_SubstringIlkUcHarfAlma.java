package benimcalismalarim.mentoring.soncalismalarim;

import java.util.Scanner;

public class M_1029_06_SubstringIlkUcHarfAlma {
    public static void main(String[] args) {
        /* Soru: Bir uygulamada kullanıcı adı ve soyadı alınmaktadır.
        Kullanıcının adının ilk üç harfini ve soyadının ilk üç harfini birleştirerek bir kısa kod üretmek istiyoruz.
        substring() metodunu kullanarak kullanıcıdan alınan isim ve soyisimden kısa kodu oluşturun.
        Örneğin, kullanıcı "Ahmet" ve "Yılmaz" girdiyse "AhmYıl" şeklinde bir kısa kod üretin.
         */
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen adinizi girimiz ; ");
        String adi = input.nextLine();
        if (adi.length() < 3) {
            System.out.println("Adiniz en az 3 karakter uzunlugunda olmalidir.");return;
        }
        System.out.println("Lütfen soyadinizi giriniz: ");
        String soyadi = input.nextLine();

        if (soyadi.length() < 3) {
            System.out.println("Soyadiniz en az 3 karakter uzunlugunda olmalidir.");
        } else {
            String kisaKod = adi.substring(0, 3) + soyadi.substring(0, 3);
            System.out.println("Kisa kod: " + kisaKod);
        }
    }
}