package benimcalismalarim.homeWork;

import java.util.Scanner;

public class Hw_1029_02 {
    public static void main(String[] args) {
     /*ask 02
    // ekrandan isim ve soy ismi tek boşluk ile okutunuz,
    // ve büyük harf kısaltma olarak yazınız
    // input "kahraman can"
    // output "K.C." */

    Scanner input = new Scanner(System.in);
    System.out.println(" Lütfen adinizi giriniz : ");
    String adi = input.nextLine().toLowerCase();

        System.out.println(" Lütfen soyadinizi giriniz : ");
        String soyadi = input.nextLine().toLowerCase();

        System.out.println("Adiniz ve Soyadiniz : " + adi + " " +"" + soyadi);


    }
}
