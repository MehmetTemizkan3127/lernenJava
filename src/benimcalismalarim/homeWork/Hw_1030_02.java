package benimcalismalarim.homeWork;

import java.util.Scanner;

public class Hw_1030_02 {
    public static void main(String[] args) {
// Task->  Girilen  bir stringde boşluk karakterinin olup olmadığını kontrol eden code create ediniz

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir cümle veya kelime giriniz : ");
        String kelime = input.nextLine();

        if (kelime.contains(" ")) {
            System.out.println("Girilen stringde boşluk karakteri var.");
        } else {
            System.out.println("Girilen stringde boşluk karakteri yok.");
        }
    }
}
