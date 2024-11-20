package benimcalismalarim.Sablonlar;

import java.util.Scanner;

public class StringKonusu_IstediginKarekteriBulma {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Lütfen bir metin girin: ");
        String metin = scanner.nextLine();


        if (metin.length() > 8) {
            char sekizinciHarf = metin.charAt(7);
            System.out.println("8. konumdaki harf: " + sekizinciHarf);
        } else {
            System.out.println("Metin 8 karakterden kısa.");
        }
    }
}
