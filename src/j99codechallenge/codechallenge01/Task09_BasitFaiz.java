package j99codechallenge.codechallenge01;

import java.util.Scanner;

public class Task09_BasitFaiz {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Başlangıçtaki para miktarını girin: ");
        double baslangicMiktari = scanner.nextDouble();

        System.out.print("Yıllık faiz oranını (% olarak) girin: ");
        double faizOrani = scanner.nextDouble();

        System.out.print("Kaç yıl sonrası için hesaplama yapılacağını girin: ");
        int yilSayisi = scanner.nextInt();

        double gelecektekiMiktar = baslangicMiktari + (baslangicMiktari * faizOrani / 100 * yilSayisi);

        System.out.println("Gelecekteki para miktarı: " + gelecektekiMiktar);










    }
}
