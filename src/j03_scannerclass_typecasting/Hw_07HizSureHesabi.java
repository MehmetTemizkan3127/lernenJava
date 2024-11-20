package j03_scannerclass_typecasting;

import java.util.Scanner;

public class Hw_07HizSureHesabi {
    public static void main(String[] args) {

         /*  Task->
        Mesafeyi ve hızı alıp süreyi hesaplayan bir kod yazınız.
        Örneğin:İstanbul ile Ankara arası 400km olarak ölçülmektedir. Bu yolu ortalama
        120 km/saat hızla giden bir araç ne kadar sürede hedefe varır?
        Örnek Ekran Çıktısı
        Mesafeyi giriniz: 400
        Hızı giriniz: 100
        Süre 4 saattir.
     */
        Scanner scn = new Scanner(System.in);

        System.out.print("Mesafeyi giriniz (km): ");
        double mesafe = scn.nextDouble();

        System.out.print("Hızı giriniz (km/saat): ");
        double hiz = scn.nextDouble();

        double sure = mesafe / hiz;

        System.out.println("Süre: " + sure + " saattir.");












    }
}
