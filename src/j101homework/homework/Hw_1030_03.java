package j101homework.homework;

import java.util.Scanner;

public class Hw_1030_03 {
    public static void main(String[] args) {
    /*
         Task->
         Girilen iki kelimeden ilki çift sayıda karakter içeriyorsa 2. kelimeyi 1. kelimenin ortasına print eden
         ilk kelime tek sayıda karakter içeriyorsa "kelime2 kelime1 eklenemez" print eden code create ediniz
         name1= Java
         name2= Aslıhan
         Print ==> JaAslıhanva
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen birinci kelimeyi giriniz : ");
        String kelime1 = input.nextLine();

        System.out.println("Lütfen ikinci kelimeyi giriniz : ");
        String kelime2 = input.nextLine();

        if (kelime1.length() % 2 == 0) {
            int ortaIndeks = kelime1.length() / 2;
            String sonuc = kelime1.substring(0, ortaIndeks) + kelime2 + kelime1.substring(ortaIndeks);
            System.out.println("sonuc = " + sonuc);
        } else {
            System.out.println("Bu kelime tek sayılıdır ve eklenemez : " + kelime2 + " " + kelime1);
        }
    }
}
