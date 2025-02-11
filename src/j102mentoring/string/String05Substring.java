package j102mentoring.string;

import java.util.Scanner;

public class String05Substring {
    public static void main(String[] args) {

        // Kullanıcıdan bir cümle alın. Eğer cümlenin son karakteri "?" ise "Bu bir soru cümlesidir." yazdırın.
        // son karakteri subtring() ile bulalım.

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen anlamli bir cümle giriniz : ");
        String cumle = input.nextLine();

        String sonKarakter = cumle.substring(cumle.length() - 1);

        if (sonKarakter.equals("?")) {
            System.out.println("Bu bir soru cümlesidir.");
        } else {
            System.out.println("Bu bir soru cümlesi degildir.");

        }
    }
}
