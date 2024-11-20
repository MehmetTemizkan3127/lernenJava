package j08_loops.L02whileloop.tasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        // task-> Girilen sayıların toplamı 333'ü geçtiğinde girilen sayı adetini ve toplamını print eden code create edinz

        Scanner scanner = new Scanner(System.in);

        int toplam = 0;
        int sayiAdedi = 0;

        System.out.println("Sayilari girin. Toplam 333'ü geçtiğinde duracaktir.");

        while (toplam <= 333) {
            System.out.print("Bir sayi girin: ");
            int sayi = scanner.nextInt();

            toplam += sayi;
            sayiAdedi++;
        }
        System.out.println("Girilen sayi adedi: " + sayiAdedi);
        System.out.println("Toplam: " + toplam);
    }
}
