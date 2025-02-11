package j101homework.string;

import java.util.Scanner;

public class Strıng03ReplaceAll {
    public static void main(String[] args) {
        //Girilen String'in son karakterini silen code create ediniz...

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir metin giriniz: ");
        String input = scanner.nextLine();

        String sonuc = input.replaceAll(".$", "");
        System.out.println("Son karakter silindikten sonra: " + sonuc);
    }
}
