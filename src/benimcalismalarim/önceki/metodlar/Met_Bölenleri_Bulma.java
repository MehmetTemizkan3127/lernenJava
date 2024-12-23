package benimcalismalarim.önceki.metodlar;

import java.util.Scanner;

public class Met_Bölenleri_Bulma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir tamsayı giriniz : ");
        int sayi = scanner.nextInt();

        int i = 1;
        int bolenSayisi = 0;

        System.out.print("Girilen " + sayi + " sayisinin tam bölenleri : ");

        while (i <= sayi) {
            if (sayi % i == 0) {
                System.out.print(i + (i < sayi ? ", " : "")); // Son bölen için virgül eklememe
                bolenSayisi++;
            }
            i++;
        }

        System.out.println("\n" + sayi + "'nin " + bolenSayisi + " tane tam böleni var.");
        scanner.close();
    }
}
