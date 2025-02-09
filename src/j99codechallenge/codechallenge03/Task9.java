package j99codechallenge.codechallenge03;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {

        /* Task->
         * girilen String icinde "xyz" dizimi var ise true degilse false return eden code create ediniz.
         *
         * input      output
         * axyzm  ==   true
         * xyz    ==   true
         * x.yz   ==   false
         * xyaz   ==   false
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir kelime girin: ");
        String input = scanner.nextLine();

        System.out.println(containsXYZ(input));
    }

    public static boolean containsXYZ(String input) {

        if (input.indexOf("xyz") != -1) {
            return true;
        } else {
            return false;
        }
    }
}
