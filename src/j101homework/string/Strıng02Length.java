package j101homework.string;

import java.util.Scanner;

public class Strıng02Length {
    public static void main(String[] args) {
        //Task->  Girilen  String'deki space haric kac tane character kullanildigini print eden code create ediniz.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen bir cümle giriniz : ");
        String input = scanner.nextLine();

        int karakterSayisi = input.replace(" ", "").length();

        System.out.println("Bosluklar haric karakter sayisi : " + karakterSayisi);
    }
}
