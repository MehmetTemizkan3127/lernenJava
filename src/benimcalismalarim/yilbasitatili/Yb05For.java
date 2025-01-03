package benimcalismalarim.yilbasitatili;

import java.util.Scanner;

public class Yb05For {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //1'den 50'ye kadar olan tek sayıları ekrana yazdırın.

        /*for (int i = 1; i<=50; i+=2){
            System.out.println("i = " + i);
        }*/

        /*//1'den 10'a kadar olan sayıların çarpımını hesaplayın.
        int carpim = 1;
        for (int i = 1; i<=10; i++){
            System.out.println("1'den 10'a kadar olan sayıların çarpımı = " + carpim);
            carpim = carpim * i;
        }*/

       /* //Verilen bir sayının faktöriyelini hesaplayın.
        int sayi = 5;
        int faktoriyel = 1;
        for (int i = 1; i<=5; i++) {
            faktoriyel *= i;
        }
        System.out.println(sayi+ " sayısının faktöriyel değeri = " + faktoriyel);
        */

        /*//10 elemanlı bir dizideki en büyük elemanı bulun.
        List<Integer> sayilar = new ArrayList<>(List.of(30, 10, 40, 30, 60, 50, 80, 70, 90, 20));

        for (Integer i = 0; i<=sayilar; i++){


        }*/

        /*//1'den 20'ye kadar olan sayıların karelerini ekrana yazdırın.
        for (int i = 1; i <= 20; i++) {
            int kare = i * i;
            System.out.println(i + ". sayinin karesi = " + kare);
        }*/

        //Verilen bir tam sayıya kadar olan tüm sayıların toplamını hesaplayan bir program yazın.
        /*System.out.println("Lütfen bir tam sayi giriniz = ");
        if (scan.hasNextInt()){
            int sayi = scan.nextInt();
            scan.nextLine();
            int toplam = 0;
            for (int i = 1; i<=sayi; i++){
                toplam +=i;
            } System.out.println("Girilen sayiya kadar toplam = " + toplam);
        }else {
            System.out.println("Lütfen sayisal bir deger giriniz");
        }*/

        /*System.out.println("Lütfen bir tam sayi giriniz = ");
        if (scan.hasNextInt()){
            int sayi = scan.nextInt();
            scan.nextLine();
            int toplam = 0;
            int i = 1;

            while ( i<=sayi){
                toplam +=i;
                i++;
            } System.out.println("Girilen sayiya kadar toplam = " + toplam);
        }else {
            System.out.println("Lütfen sayisal bir deger giriniz");
        }*/
        /*System.out.println("Lütfen bir tam sayi giriniz = ");
        if (scan.hasNextInt()) {
            int sayi = scan.nextInt();
            scan.nextLine();
            int toplam = 0;
            int i = 1;
            do {
                toplam += i;
                i++;
            }
            while (i <= sayi);
            System.out.println("Girilen sayiya kadar toplam = " + toplam);
        } else {
            System.out.println("Lütfen sayisal bir deger giriniz");
        }*/


        /*//SABLONLAR
        //For
        for (int i = 0; i < 5; i++) {
            System.out.println("Sayac: " + i);
        }
/*
        //While
        int i = 0;
        while (i < 5) {
            System.out.println("Sayac: " + i);
            i++;
        }

        //Do-While
        int i = 0;
        do {
            System.out.println("Sayac: " + i);
            i++;
        } while (i < 5);
*/

    }
}
