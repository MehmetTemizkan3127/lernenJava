package j102mentoring.metod;

import java.util.Scanner;

public class Metod02KelimeyiUcKereYazdirma {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir kelime giriniz : ");
        String kelime = scanner.nextLine();

        kelime3KereYazdir(kelime);

    }
        // Kelimeyi 3 kez yazdıran metodu
        public static void kelime3KereYazdir(String kelime) {
        for (int i = 0; i < 3; i++) {
            System.out.println(kelime);
        }
    }
}
