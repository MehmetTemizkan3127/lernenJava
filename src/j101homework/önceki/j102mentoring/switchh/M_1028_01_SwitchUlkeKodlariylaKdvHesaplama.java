package j101homework.önceki.j102mentoring.switchh;

import java.util.Scanner;

public class M_1028_01_SwitchUlkeKodlariylaKdvHesaplama {
    public static void main(String[] args) {

        // Kullanıcı, ülke kodunu ve ürün fiyatını girerek, ilgili ülkenin KDV oranına göre hesaplanmış fiyatı öğrenir.
        // System.out.println("Ülke kodunu girin (TR, US, DE, FR, UK): ");
        // Ülkeler ve KDV oranları

        Scanner input = new Scanner(System.in);
        System.out.println("Ülke kodunu giriniz : ");
        String ulkekodlari = input.nextLine().toUpperCase();

        System.out.println("Ürünün fiyationi giriniz : ");
        double fiyat = input.nextDouble();
        switch (ulkekodlari) {
        case "TR":
        System.out.println("KDV dahil toplam fiyat: " + (fiyat + (fiyat * 0.18)));
        break;

         case "US":
         System.out.println("KDV dahil toplam fiyat: " + (fiyat + (fiyat * 0.00)));
         break;

         case "DE":
                System.out.println("KDV dahil toplam fiyat: " + (fiyat + (fiyat * 0.19)));
                break;

            case "FR":
                System.out.println("KDV dahil toplam fiyat: " + fiyat + ((fiyat * 0.19)));
                break;

            case "UK":
                System.out.println("KDV dahil toplam fiyat: " + fiyat + ((fiyat * 0.20)));
                break;

            default:
                System.out.println("Geçersiz ülke kodu girdiniz.");
                break;
        }
    }
}
