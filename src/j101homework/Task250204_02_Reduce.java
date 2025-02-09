package j101homework;

import java.util.*;

public class Task250204_02_Reduce {
    public static void main(String[] args) {
        // reduce()
        //  List<Integer> sayi = new ArrayList<>(Arrays.asList("Halime","Sibel","Ozcan","Huseyin","Melisa","Ahmet","Mehmet","Ayse","Fatma"));
        //  Listedeki elemanların karakter sayılarının karesinin max değerini bulunuz ve print ediniz
        //  Listedeki elemanların karakter sayılarının küplerinin min değerini bulunuz ve print ediniz

        List<String> isimler = Arrays.asList("Halime", "Sibel", "Ozcan", "Huseyin", "Melisa", "Ahmet", "Mehmet", "Ayse", "Fatma");


        Optional<Integer> maxKare = isimler.stream()
                .map(isim -> isim.length() * isim.length())
                .reduce(Integer::max);

        maxKare.ifPresent(max -> System.out.println("Maksimum kare: " + max));


        Optional<Integer> minKup = isimler.stream()
                .map(isim -> isim.length() * isim.length() * isim.length())
                .reduce(Integer::min);

        minKup.ifPresent(min -> System.out.println("Minimum küp: " + min));










    }
}
