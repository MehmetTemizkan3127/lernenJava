package j101homework.önceki.j102mentoring.ikincibölüm;

import java.util.Scanner;

public class M_1108_ {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        int number;

        while (true) {
            {
                System.out.print("Lütfen 1 ile 10 arasinda bir sayi giriniz : ");
                number = scanner.nextInt();

                if (number >= 1 && number <= 10) {
                    System.out.println("Gecerli sayi girdiniz: " + number);
                    break;
                } else {
                    System.out.println("Hatali giris ve lütfen 1 ile 10 arasinda bir sayi giriniz.");
                }
            }*/
        Scanner scanner = new Scanner(System.in);
        int number;
        boolean gecerliGirismi = false;

        while (!gecerliGirismi) {
            System.out.print("Lütfen 1 ile 10 arasinda bir sayi giriniz : ");
            number = scanner.nextInt();

            if (number >= 1 && number <= 10) {
                System.out.println("Gecerli sayi girdiniz: " + number);
                gecerliGirismi = true;
            } else {
                System.out.println("Hatali giris! Lütfen 1 ile 10 arasinda bir sayi giriniz.");
            }
        }
    }
}
