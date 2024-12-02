package benimcalismalarim.mentoring.soncalismalarim;

import java.util.Scanner;

public class M_1028_02_ConcatLength {
    public static void main(String[] args) {
        // Bir kullanıcıdan iki kelime girmesini isteyin.
        // Bu kelimeleri concat metodu ile birleştirin ve birleştirilmiş kelimenin uzunluğunu length metodu ile hesaplayın.
        // Sonuçları ekrana yazdırın.
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen birinci kelimeyi giriniz : ");
        System.out.println("Lütfen ikinci kelimeyi giriniz : ");

        //Birinci yol
        String metin2 = input.nextLine();
        String metin1 = input.nextLine();

        System.out.println(metin1.concat(" " + metin2));

        //Ikinci yol
        StringBuilder sb = new StringBuilder();
        sb.append (metin1);
        sb.append (" " +metin2);
        System.out.println(sb.toString());

        int uzunluk = sb.length();
        System.out.println("Metnin uzunluğu: " + uzunluk);

    }
}
