package benimcalismalarim.önceki.homework;

import java.util.Scanner;

public class Hw_1031_01_For {
    public static void main(String[] args) {
        // task-> girilen iki tamsayı arasındaki çift sayıları print eden code create ediniz...

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen birinci tam sayiyi giriniz : ");
        int num1 = input.nextInt();
        System.out.println("Lütfen ikinci tam sayiyi giriniz : ");
        int num2 = input.nextInt();

        int baslangic, bitis;

        if (num1 < num2) {
            baslangic = num1;
            bitis = num2;
        } else {
            baslangic = num2;
            bitis = num1;
        }
        if (num1 == num2) {
            System.out.println("iki sayi esit oldugu icin aralarinda cift sayi yoktur");

        } else if (baslangic % 2 == 0) {
            System.out.println(baslangic + " ile " + bitis + " arasindaki cift sayilar:");
            for (int i = baslangic + 2; i < bitis; i += 2) {
                System.out.print(i + " ");
            }

        } else {
            System.out.println(baslangic + " ile " + bitis + " arasindaki cift sayilar:");
            for (int i = baslangic + 1; i < bitis; i += 2) {
                System.out.print(i + " ");
            }
        }
    }
}
