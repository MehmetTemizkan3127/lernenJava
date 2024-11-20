package j08_loops.L02whileloop.tasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /*
        task-> girilen iki tamsayı arasındaki tamsayıları print eden code create ediniz.
        for loop & while lopp
         */
        Scanner scanner = new Scanner(System.in);


        System.out.print("Birinci tamsayiyi girin: ");
        int sayi1 = scanner.nextInt();

        System.out.print("İkinci tamsayiyi girin: ");
        int sayi2 = scanner.nextInt();

        int min = Math.min(sayi1, sayi2);
        int max = Math.max(sayi1, sayi2);

        System.out.println("Girilen sayilar arasindaki tam sayilar:");

        int sayi = min + 1;

        while (sayi < max) {
            System.out.print(sayi + " ");
            sayi++;
        }
    }
}
