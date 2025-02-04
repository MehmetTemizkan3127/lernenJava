package j101homework;

import methods.SeedMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Task250204_02_Reduce {
    public static void main(String[] args) {
        // reduce()
        //  List<Integer> sayi = new ArrayList<>(Arrays.asList("Halime","Sibel","Ozcan","Huseyin","Melisa","Ahmet","Mehmet","Ayse","Fatma"));
        //  Listedeki elemanların karakter sayılarının karesinin max değerini bulunuz ve print ediniz
        //  Listedeki elemanların karakter sayılarının küplerinin min değerini bulunuz ve print ediniz

        List<String> sayi = new ArrayList<>(Arrays.asList("Halime","Sibel","Ozcan","Huseyin","Melisa","Ahmet","Mehmet","Ayse","Fatma"));
        sayi.stream()
                .sorted(Comparator.comparing(String::length))
                .forEach(SeedMethods::println);











    }
}
