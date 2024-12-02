package benimcalismalarim.metodlar;

import java.util.Scanner;

public class Met_Yasli_Yetiskin_Cocuk_If {
    public static void main(String[] args) {
        /*Yaş Kontrolü:
        Kullanıcının yaşını girdiği bir program yazın. Eğer yaş 18 veya daha büyükse
        "Reşitsiniz." yazdırın, aksi takdirde "Reşit değilsiniz." yazdırın.
*/
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen yasinizi giriniz : ");
        int yas = input.nextInt();

        if (yas >= 18) {
            System.out.println("Resitsiniz ve Oyunuzu Kullanabilirsiniz. Tebrikler :) ");
        } else if (yas <= 17 && yas >= 0) {
            System.out.println("Maalesef yasiniz tutmuyor ve 18 yasiniza  " + (18 - yas) + " yil var. :( ");

        } else {
            System.out.println("Lütfen yasinizi pozitif bir deger olarak giriniz");
        }
    }
}
