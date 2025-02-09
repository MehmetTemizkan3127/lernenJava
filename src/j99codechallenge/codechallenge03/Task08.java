package j99codechallenge.codechallenge03;

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        /* Task->
         * Girilen 4 kelime  cumle haline getirip sonunda . ile print eden code create ediniz.
         *
         * Ornek : Inputs : cesaret, insana, sinirlarini, ogretir
         *         Output : Cesaret insana sinirlarini ogretir.
         *
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("4 kelime girin : ");
        String word1 = scanner.next();
        String word2 = scanner.next();
        String word3 = scanner.next();
        String word4 = scanner.next();

        System.out.println(word1.substring(0, 1).toUpperCase() + word1.substring(1) + " "
                + word2 + " " + word3 + " " + word4 + ".");

    }
}
