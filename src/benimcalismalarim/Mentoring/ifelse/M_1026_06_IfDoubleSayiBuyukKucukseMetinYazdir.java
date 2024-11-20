package benimcalismalarim.Mentoring.ifelse;

import java.util.Scanner;

public class M_1026_06_IfDoubleSayiBuyukKucukseMetinYazdir {
    public static void main(String[] args) {
   /*  90.25 ve 90.25 değerinde iki double oluşturun.
    Eğer ilk double, ikinci double'dan büyükse  "Hello World" yazdırın.
    Eğer ilk double, ikinci double'dan küçükse "Not Hello World" yazdırın.
    Aksi halde (else) "I love java" yazdırın. */

        Scanner input = new Scanner(System.in);
        double num1 = 90.25;
        double num2 = 90.25;

        if(num1 > num2) {
            System.out.println("Hello World");

        } else if(num1 < num2) {
            System.out.println("Not Hello World");

        } else {
            System.out.println("I love java");
        }
    }
}
