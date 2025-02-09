package j101homework;

import java.util.List;
import java.util.stream.Collectors;

public class Task250205_03_Lambda {
    public static void main(String[] args) {
        // List<String> names = List.of("Ali", "Ahmet", "Mehmet", "Ayşe", "Veli");
        // T A S K 01) "a" Harfiyle Başlayan İsimleri Seçip Yazdırma
        // T A S K 02) "t" Harfiyle biten isimleri Seçip Yazdırma

        List<String> names = List.of("Ali", "Ahmet", "Mehmet", "Ayşe", "Veli");
        List<String> aHarfiyleBaslayan = names.stream()
                .filter(t -> t.startsWith("A") || t.startsWith("a"))
                .collect(Collectors.toList());
        System.out.println("A harfiyle başlayanlar  = " + aHarfiyleBaslayan);

        List<String> tHarfiyleBiten = names.stream()
                .filter(t -> t.endsWith("t"))
                .collect(Collectors.toList());
        System.out.println("T harfiyle bitenler     = " + tHarfiyleBiten);

    }
}
