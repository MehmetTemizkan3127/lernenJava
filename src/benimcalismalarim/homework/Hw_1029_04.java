package benimcalismalarim.homework;

import java.util.Scanner;

public class Hw_1029_04 {
    public static void main(String[] args) {
        //Girilen String'in son karakterini silen code create ediniz...

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir metin giriniz: ");
        String input = scanner.nextLine();

        String sonuc = input.replaceAll(".$", "");
        System.out.println("Son karakter silindikten sonra: " + sonuc);
    }
}
