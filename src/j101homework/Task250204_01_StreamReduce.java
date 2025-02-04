package j101homework;

import methods.SeedMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Task250204_01_StreamReduce {
    public static void main(String[] args) {
        // reduce()
        // List<Integer> sayi = new ArrayList<>(Arrays.asList(10,18,20,32,40,55));
        // Listedeki 8 e bölünebilen sayıların carpımını bulalım

        List<Integer> sayi = new ArrayList<>(Arrays.asList(10, 18, 20, 32, 40, 55));
        int sonuc = sayi.stream().filter(T -> T % 8 == 0)
                .reduce(SeedMethods::bolunenleriCarp)
                .orElse(0);
        SeedMethods.println("Islem sonucu = "+sonuc);
    }
}
