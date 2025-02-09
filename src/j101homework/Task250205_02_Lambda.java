package j101homework;

import java.util.List;
import java.util.stream.Collectors;

public class Task250205_02_Lambda {
    public static void main(String[] args) {
        // List<Integer> numbers = List.of(-5, 10, -3, 7, 0, 8);
        // T A S K 01) Pozitif Sayıları Yazdıralım
        // T A S K 02) Negatif sayıları yazdıralım

        List<Integer> numbers = List.of(-5, 10, -3, 7, 0, 8);

        String pozitif = numbers.stream()
                .filter(t -> t > 0)
                .map(String::valueOf)
                .collect(Collectors.joining(", "));

        System.out.println("Pozitif sayilar = " + pozitif);

        String negatif = numbers.stream()
        .filter(t -> t < 0)
                .map(String::valueOf)
                .collect(Collectors.joining(", "));

        System.out.println("Negatif sayilar = " + negatif);

    }
}
