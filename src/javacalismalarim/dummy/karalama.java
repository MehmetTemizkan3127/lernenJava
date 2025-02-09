package javacalismalarim.dummy;

import java.util.Scanner;

public class karalama {
    public static void main(String[] args) {

       /* int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};


        System.out.print("Tek Sayılar: ");
        for (int num : array) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }

        System.out.println(); // Satır sonu

        System.out.print("Çift Sayılar: ");
        for (int num : array) {
            if (num % 2 == 0) {
                System.out.print(num + " "); 
            }
        }*/

        Scanner input = new Scanner(System.in);
       System.out.println("Lütfen bir sayi giriniz : ");

        int gun = input.nextInt();

        /*
        IF YAPISINA ÖRNEK
        if (yas>=18){
            System.out.println("Yasiniz :" +yas+ " ve Resitsniz");
        }else if (yas<18&&yas>0){
            System.out.println("Yasiniz :" +yas+ " ve Resit degilsiniz");
        }else {
            System.out.println("lütfen pozitif bir sayi giriniz");
        }*/

        /*//TERNARY OPERATÖRÜNE ÖRNEK

        String sonuc = (yas>18)? "Resitsiniz" : "Resit degilsiniz";
        System.out.println("Sonuc = " + sonuc);

        String sonuc = (sayi%2==0)? "Sayi cift" : "Sayi Tektir";
        System.out.println("Sayi = " + sonuc);
        */
/*
        //SWITCH'E ÖRNEK

        //int gun = 3;
        String gunAdi;

        switch (gun) {
            case 1:
                gunAdi = "Pazartesi";
                break;
            case 2:
                gunAdi = "Sali";
                break;
            case 3:
                gunAdi = "Carsamba";
                break;
            case 4:
                gunAdi = "Persembe";
                break;
            case 5:
                gunAdi = "Cuma";
                break;
            case 6:
                gunAdi = "Cumartesi";
                break;
            case 7:
                gunAdi = "Pazar";
                break;
            default:
                gunAdi = "Gecersiz Gün";

        }
        System.out.println("gunAdi = " + gunAdi);
        */




    }
}