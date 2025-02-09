package javacalismalarim.konutekrari.string_metodlari;

import java.util.Scanner;

public class Concat {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaç kelime gireceksiniz? ");
        int kelimeSayisi = scanner.nextInt();
        scanner.nextLine();

        String result = "";

        for (int i = 0; i < kelimeSayisi; i++) {
            System.out.print("Kelime " + (i + 1) + ": ");
            String kelime = scanner.nextLine();
            result = result.concat(kelime).concat(" ");
        }

        System.out.println("Birleştirilmiş metin: " + result.trim());


}
}