package j101homework;

import methods.SeedMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task250203_02_StreamMap {
    public static void main(String[] args) {
        // map()
        // List<Integer> sayi = new ArrayList<>(Arrays.asList(1,4,9,16,25,36,49,64,81,100,121,144));
        // Listedeki elemanlardan karekokü çift olanları aralarında boşluk olacak şekilde yazdıralım

        List<Integer> sayi = new ArrayList<>(Arrays.asList(1, 4, 9, 16, 25, 36, 49, 64, 81, 100, 121, 144));
        System.out.print("Karekokü çift olanların listesi = ");
        sayi.stream()
                .map(Math::sqrt)
                .filter(SeedMethods::ciftMi)
                .forEach(SeedMethods::println);
    }
}

