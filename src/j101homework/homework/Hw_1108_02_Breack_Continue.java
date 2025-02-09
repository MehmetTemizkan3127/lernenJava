package j101homework.homework;

import java.util.Scanner;

public class Hw_1108_02_Breack_Continue {
    public static void main(String[] args) {
        /*
Task:  Kullanıcıdan sayılar alarak pozitif sayıların toplamını hesapla.
    Eğer kullanıcı negatif bir sayı girerse o sayıyı atla (continue kullan)
    ve toplamaya devam et. Toplam 100’e ulaştığında döngüyü sonlandır (break kullan).
 */
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int sayac = 1;

        while (sum < 100) {
            System.out.println("Lütfen sifirdan büyük pozitif sayilar giriniz. " + sayac + ". sayi :");
            int sayi = input.nextInt();
            int kalan = 100 - sum;

            if (sayi <= 0) {
                System.out.println(+sayi + " girdiniz. ");
                continue;
            }

            if (sum + sayi > 100) {
                System.out.println(+sayi + " Girdiniz. Sayilarinizin toplami 100'ü geçiyor! En fazla " + kalan + " daha girebilirsiniz.");
                continue;
            }

            sum += sayi;
            System.out.println("Ara toplam: " + sum);
            System.out.println();

            if (sum == 100) {
                System.out.println("Tebrikler! 100'e ulastiniz. Program sanlandirildi. ");
                break;
            }

            sayac++;
        }
    }
}
