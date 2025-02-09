package j103methods.metodlar;

import java.util.Scanner;

public class Met_Not_ABCD_If {
    public static void main(String[] args) {
        /*Not Kontrolü:
        Kullanıcıdan aldığı notu kontrol eden bir program yazın.
        Eğer not 90 veya daha yüksekse "A", 80-89 arasında ise "B", 70-79 arasında ise "C",
        60-69 arasında ise "D", 60'dan düşükse "F" yazdırın.
        */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen notunuzu giriniz : ");
        int not = input.nextInt();
        if (not >= 90 && not <= 100) {
            System.out.println("Notunuz A");
        } else if (not >= 80 && not < 90) {
            System.out.println("Notunuz B");
        } else if (not >= 70 && not < 80) {
            System.out.println("Notunuz C");
        } else if (not >= 60 && not < 70) {
            System.out.println("Notunuz D");
        } else if (not >= 0 && not < 60) {
            System.out.println("Notunuz F");
        } else {
            System.out.println("Lütfen 0-100 arasi ve pozitif bir sayi giriniz");
        }
    }
}
