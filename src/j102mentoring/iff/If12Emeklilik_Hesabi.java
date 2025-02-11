package j102mentoring.iff;

import java.util.Scanner;

public class If12Emeklilik_Hesabi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen cinsiyetinizi giriniz. : ");
        String cinsiyet = input.next();

        System.out.println("Lütfen yasinizi giriniz. : ");
        int yas = input.nextInt();

        System.out.println("Lütfen prim gün sayinizi giriniz. : ");
        int primGunSayisi = input.nextInt();

        if (cinsiyet.equalsIgnoreCase("Erkek")) {
            if (yas >= 65 && primGunSayisi >= 7000) {
                System.out.println("Tebrikler emeklilige hak kazandiniz");
            } else {
                if (yas < 65 && primGunSayisi < 7000) {
                    System.out.println("Yas ve prim günü icin gerekli sartlari maalesef karsilayamadiniz " + (65 - yas) + " yas eksiginiz var. Ayrica " + (7000 - primGunSayisi) + " gün prim günü eksiginiz var");
                } else if (primGunSayisi < 7000) {
                    System.out.println("Prim günü icin gerekli sarti maalesef karsilayamadiniz ve " + (7000 - primGunSayisi) + " prim günü eksiginiz var.");
                } else {
                    System.out.println("Yas siniri icin gerekli sarti maalesef karsilayamadiniz. ve yas siniri icin " + (65 - yas) + " yasa daha ihtiyaciniz var.");
                }
            }
        } else if (cinsiyet.equalsIgnoreCase("Kadin")) {
            if (yas >= 60 && primGunSayisi >= 6000) {
                System.out.println("Tebrikler emeklilige hak kazandiniz");
            } else {
                if (yas < 60 && primGunSayisi < 6000) {
                    System.out.println("Yas ve prim günü icin gerekli sartlari maalesef karsilayamadiniz " + (60 - yas) + " yas eksiginiz var. Ayrica " + (6000 - primGunSayisi) + " gün prim günü eksiginiz var");
                } else if (primGunSayisi < 6000) {
                    System.out.println("Prim günü icin gerekli sarti maalesef karsilayamadiniz ve " + (6000 - primGunSayisi) + " prim günü eksiginiz var.");
                } else {
                    System.out.println("Yas siniri icin gerekli sarti maalesef karsilayamadiniz. ve yas siniri icin " + (60 - yas) + " yasa daha ihtiyaciniz var.");
                }
            }
        } else {
            System.out.println("Gecersiz cinsiyet girdiniz. Lütfen cinsiyeti ERKEK veya KADIN olarak giriniz");
        }
    }
}
