package j03_scannerclass_typecasting;

import java.util.Scanner;

public class Hw_08VizeFinalKullanici {
    public static void main(String[] args) {

        /*Task->
         * Kullanicidan alacaginiz vize1 vize2 ve final notlarini
         * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
         */
        Scanner scn = new Scanner(System.in);

        System.out.print("Vize 1 notunu girin: ");
        double vize1 = scn.nextDouble();

        System.out.print("Vize 2 notunu girin: ");
        double vize2 = scn.nextDouble();

        System.out.print("Final notunu girin: ");
        double finalNotu = scn.nextDouble();

        double vizeOrtalama = (vize1 + vize2) / 2;
        double gecmeNotu = (vizeOrtalama * 0.30) + (finalNotu * 0.70);

        System.out.println("Geçme notu: " + gecmeNotu);


    }
}
