package benimcalismalarim.Mentoring.ikincibölüm;

import java.util.Scanner;

public class M_1027_04_HizSüre {
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

        double mesafe = 400;
        double ortalamaHiz = 120;
        double sure = (mesafe) / (ortalamaHiz);

        System.out.printf("ortalamaSure = %.2f", sure);
    }
}
