package j102mentoring.javatemel;

import java.util.Scanner;

public class JavaTemel03Hipotenus {
    public static void main(String[] args) {

       /* Task->
        Bir dik üçgenin iki dik kenarını alarak hipotenüsünü hesaplayan kod yazınız.

        Örnek Ekran Çıktısı
        birinci kenar: 12
        ikinci kenar: 5
        hipotenus: 13      */

        Scanner scn = new Scanner(System.in);

        System.out.println("Hipotenusun birinci kenarini giriniz : ");
        double kenar1 = scn.nextDouble();

        System.out.println("Hipotenusun ikinci kenarini giriniz : ");
        double kenar2 = scn.nextDouble();

        double hipotenus = Math.sqrt(Math.pow(kenar1, 2) + Math.pow(kenar2, 2));
        System.out.println("hipotenus = " + hipotenus);

    }
}
