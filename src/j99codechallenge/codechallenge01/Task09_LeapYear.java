package j99codechallenge.codechallenge01;

import java.util.Scanner;

public class Task09_LeapYear {
    public static void main(String[] args) {

 /* Task->
   girilen bir yılın artık (LEAP YEAR) olmasını kontrol eden code create ediniz..
    artık yıl:
    Kural1: 4 ile bölünemeyen yıllar artık yıl değildir.
    Kural2: 4 ile bölünüp 100 ile bölünemeyen yıllar artık yıldır.
    Kural3: 4’ün katı olmasına rağmen 100 ile bölünebilen yıllardan sadece  400’ün katı olan yıllar artık yıldır.
 */


        Scanner input = new Scanner(System.in);

        int yil = input.nextInt();

        if (yil % 4 != 0) {
            System.out.println(yil + " artık yıl değildir.");
        } else if (yil % 100 != 0) {
            System.out.println(yil + " artık yıldır.");
        } else if (yil % 400 == 0) {
            System.out.println(yil + " artık yıldır.");
        } else {
            System.out.println(yil + " artık yıl değildir.");
        }



    }
}
