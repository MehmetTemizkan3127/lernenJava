package j102mentoring.forr;

import java.util.Scanner;

public class For02CarpimTablosu {
    public static void main(String[] args) {
        // task-> girilen tamsayı için çarpım tablosu print eden code create ediniz
        // input: 8-> output :8x1=8, 8x2=16... 8x10=80

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen 1'den 10'a kadar bir tam sayi giriniz : ");
        int sayi = input.nextInt();
        int i = 1;
        System.out.println("Carpım Tablosu:");
        while (i <= 10) {
            System.out.println(sayi + "x" + i + " = " + (sayi * i));
            i++;
        }
        //System.out.println("Carpım Tablosu:");
        //for (int i = 1; i<=10; i++) {
        //System.out.println(sayi + " x " + i + " = " + (sayi * i));

    }
}

