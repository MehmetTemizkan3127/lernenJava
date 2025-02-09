package j102mentoring.ifelse;

import java.util.Scanner;

public class M_1103_01_If_Yasa_Göre_Erkek_Kadin {
    public static void main(String[] args) {
       /* Task 1->
        Kullanıcıdan cinsiyetini girmesini isteyin.
        Erkek ise yaşını kontrol edin. Yaşı 18 den küçük ise ekrana "Erkek çocuk" yazdırın.
        Yaşı 18 den büyük eşit ise ekrana "Adam" yazdırın.
        Kadin ise yasini kontrol edin. Yaşı 18 den küçük ise ekrana "Kız çocuk" yazdırın.
        Yaşı 18 den büyük eşit ise ekrana "Kadın" yazdırın.
        */
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen cinsiyetinizi giriniz : ");
        String cinsiyet = input.next();

        System.out.println("Lütfen yasinizi giriniz : ");
        int yas = input.nextInt();

        if (cinsiyet.equalsIgnoreCase("Erkek")) {
            if (yas >= 18) {
                System.out.println("Adam");
            } else {
                System.out.println("Erkek çocuk");
            }
        } else if (cinsiyet.equalsIgnoreCase("Kadin")) {
            if (yas >= 18) {
                System.out.println("Kadin");
            } else {
                System.out.println("Kız çocuk");
            }
        } else {
            System.out.println("Geçersiz cinsiyet girdiniz. Lütfen cinsiyeti ERKEK veya KADIN olarak giriniz");
        }
    }
}
