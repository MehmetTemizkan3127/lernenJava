package benimcalismalarim.homework;

import java.util.Scanner;

public class Hw_1030_04 {
    public static void main(String[] args) {
    /*
        Task-> Girilen string içindeki istenen index'deki karakteri print eden code create ediniz
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir String giriniz : ");
        String kelime = input.nextLine();

        System.out.println("Lütfen bir indeks giriniz : ");
        int index = input.nextInt();

        if (index >= 0 && index < kelime.length()) {

            char character = kelime.charAt(index);
            System.out.println("String içindeki " + index + ". index'teki karakter: " + character);
        } else {
            System.out.println("Geçersiz index! Lütfen 0 ile " + (kelime.length() - 1) + " arasında bir değer girin.");
        }
    }
}
