package benimcalismalarim.homework;

import java.util.Scanner;

public class Hw_1029_01 {
    public static void main(String[] args) {
        /*     Task 01
        Kullanıcıdan bir cümle ve bir kelime girmesini isteyin.
        Girilen cümlenin, girilen kelimeyle başlayıp başlamadığını kontrol edin.
        Eğer cümle kelime ile başlıyorsa, cümlenin ilk karakteri ile kelimeyi birleştirerek yeni bir ifade oluşturun.
        Eğer cümle kelime ile başlamıyorsa, cümlenin uzunluğu kadar "!" karakteri ile bir mesaj oluşturun.
              ( ipucu : repeat() methodu kullanmayı deneyiniz )

        Sonuç olarak, hem yeni ifadeyi hem de oluşturulan mesajı ekrana yazdırın.
        */

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen bir cümle giriniz: ");
        String cumle = input.nextLine();

        System.out.println("Lütfen bir kelime giriniz: ");
        String kelime = input.nextLine();

        if (cumle.startsWith(kelime)) {
            String yeniIfade = cumle.charAt(0) + kelime;
            System.out.println("Yeni ifade: " + yeniIfade);
        } else {
            String mesaj = "!".repeat(cumle.length());
            System.out.println("Mesaj: " + mesaj);
        }
    }
}
