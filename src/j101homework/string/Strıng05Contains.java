package j101homework.string;

import java.util.Scanner;

public class Strıng05Contains {
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
