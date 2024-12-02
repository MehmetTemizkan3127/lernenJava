package benimcalismalarim.metodlar;

import java.util.Scanner;

public class Met_Cift_Tek_Sayi_If {
    public static void main(String[] args) {
        /*Çift veya Tek Kontrolü:
        Kullanıcıdan bir tam sayı alıp, bu sayının çift mi yoksa tek mi olduğunu kontrol eden bir program yazın.
        "Çift" veya "Tek" yazdırın.
        */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz : ");
        int sayi = input.nextInt();

        if (sayi % 2 == 0) {
            System.out.println("Girdiginiz sayi cifttir");

        } else {
            System.out.println("Girdiginiz sayi tektir");
        }
    }
}
