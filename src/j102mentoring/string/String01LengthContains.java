package j102mentoring.string;

import java.util.Scanner;

public class String01LengthContains {
    public static void main(String[] args) {

        // Kullanıcıdan bir kelime girmesini isteyin. Girilen kelimenin uzunluğunu hesaplayın. Eğer kelimenin uzunluğu 5'ten büyükse,
        // kelimenin ilk ve son harfini alarak yeni bir kelime oluşturun.
        // Aksi takdirde, kelimenin uzunluğu tek sayi ise ortasındaki harfi yazdırın.
        // çiftse kelimeyi yazdırın. Oluşturulan yeni kelimeyi ekrana yazdırın.
        // Oluşturulan  kelimeyi ekrana yazdırın.

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz ; ");
        String kelime = input.nextLine();

        int uzunluk = kelime.length();
        System.out.println("Kelimenin uzunluğu: " + uzunluk);

        if (uzunluk > 5) {
            char ilkHarf = kelime.charAt(0);
            char sonHarf = kelime.charAt(uzunluk - 1);
            String yeniKelime = "" + ilkHarf + sonHarf;
            System.out.println("Yeni kelime : " + yeniKelime);
        } else if (uzunluk % 2 == 1) {
            char ortadakiHarf = kelime.charAt(uzunluk / 2);
            System.out.println("Ortadaki harf: " + ortadakiHarf);
        } else {
            System.out.println("Kelime: " + kelime);

        }
    }
}
