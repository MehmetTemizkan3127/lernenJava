package benimcalismalarim.önceki.mentoring.ifelse;

import java.util.Scanner;

public class M_1026_09_IfEls_YetiskinYasliCocuk {
    public static void main(String[] args) {
        //Soru: Bir kişinin yaşı 18 veya daha büyükse "Yetişkin" mesajı yazdıran, ancak aynı zamanda 65
        //veya daha büyükse "Yaşlı" mesajı ekleyen bir program yazın. Eğer kişi 18 yaşından küçükse, sadece "Çocuk" mesajı yazdırılsın.

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen yasinizi giriniz : ");
        int yas = input.nextInt();

        if (yas >= 18) {
            System.out.println("Yetiskin");
            if (yas >= 65) {
                System.out.println("Yasli");
            }
        } else{
            System.out.println("Cocuk");
        }
    }
}
