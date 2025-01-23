package j30maps.tasks01;

import java.util.HashMap;
import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {

        //       Bir HashMap'de öğrenci adlarını ve notlarını saklıyoruz.
        //        Öğrenciler ve notları aşağıdaki gibidir:
        //        Ali = 85, Ayşe = 90, Mehmet = 75, Fatma = 95
        //        Öğrencinin adını kullanıcıdan alın (örneğin: "Ali").
        //        get metodunu kullanarak bu öğrencinin notunu ekrana yazdırın.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Öğrenci adini giriniz = ");
        String ogrenciAdi = scanner.nextLine().toLowerCase();

        HashMap<String, Integer> not = new HashMap<>();
        not.put("Ali", 85);
        not.put("Ayse", 90);
        not.put("Mehmet", 75);
        not.put("Fatma", 95);

        Integer ogrenciNotu = not.get(ogrenciAdi);

        if (ogrenciNotu != null) {
            System.out.println(ogrenciAdi + " adli öğrencinin notu: " + ogrenciNotu);
        } else {
            System.out.println(ogrenciAdi + " adli öğrenci bulunamadi.");
        }

    }
}
