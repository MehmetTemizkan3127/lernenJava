package benimcalismalarim.mentoring.switchh;

import java.util.Scanner;

public class M_1028_03_SwitchHesapMakinasi {
    public static void main(String[] args) {

        // Kullanıcıdan iki sayı ve bir işlem seçeneği alarak işlem sonucunu döndüren bir hesap makinesi.

        Scanner input =new Scanner(System.in);

        System.out.print("Birinci sayiyi giriniz: ");
        double sayi1 = input.nextDouble();

        System.out.print("İkinci sayiyi giriniz: ");
        double sayi2 = input.nextDouble();

        System.out.println("Yapmak istediğiniz işlemi seçin (+, -, *, /): ");
        char islem = input.next().charAt(0);

        double sonuc = 0.0;

        switch (islem) {
            case '+':
                sonuc = sayi1 + sayi2;
                break;
            case '-':
                sonuc = sayi1 - sayi2;
                break;
            case '*':
                sonuc = sayi1 * sayi2;
                break;
            case '/':
                if (sayi2 != 0) {
                    sonuc = sayi1 / sayi2;
                } else {
                    System.out.println("sayi sifira bölünemez");
                }
                break;
            default:
        }

        System.out.println("İşlem Sonucu: "+ sonuc);

        }
    }
