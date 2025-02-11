package j101homework.lambda;

import j103methods.SeedMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda06StreamReduceOrElse {
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
