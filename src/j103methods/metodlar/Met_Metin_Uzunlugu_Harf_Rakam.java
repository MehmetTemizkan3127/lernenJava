package j103methods.metodlar;

import java.util.Scanner;

public class Met_Metin_Uzunlugu_Harf_Rakam {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        /* Bir Kelimenin Uzunluğunu Hesaplama
        Kullanıcının girdiği bir kelimenin uzunluğunu hesaplayan bir program oluşturun. Uzunluk hesaplama yöntemini açıklayın. */

        System.out.println(" Lütfen bir metin giriniz. ");
        String metin = scn.nextLine();

        String metinBosluksuz = metin.replace(" ", "");
        int uzunluk = metinBosluksuz.length();

        System.out.println("Metninizin uzunlugu: " + uzunluk);

        int toplamHarfSayisi = 0;
        int toplamRakamSayisi = 0;

        for (char karakter : metin.toCharArray()) {
            if (Character.isLetter(karakter)) {
                toplamHarfSayisi++;

            } else if (Character.isDigit(karakter)) {
                toplamRakamSayisi++;
            }
        }
        System.out.println("Toplam harf sayısı: " + toplamHarfSayisi);
        System.out.println("Toplam rakam sayısı: " + toplamRakamSayisi);

    }
}
