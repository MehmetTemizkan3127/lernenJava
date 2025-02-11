package j101homework.lambda;

import j103methods.SeedMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda01StreamMap {
    public static void main(String[] args) {
        //  map()
        //  List<Integer> sayi = new ArrayList<>(Arrays.asList(10,20,30,40,50));
        //  listedeki sayıların her birinin 10 a bölümünü yazdıralım
        //  Listedeki sayıların her birinin 10 a bölümlerinin 2 eksiğini yazdıralım


        //1-  listedeki sayıların her birinin 10 a bölümünü yazdıralım
        List<Integer> sayi = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        System.out.print("Sayilarin 10'a bölümü                 = ");
        sayi.stream()
                .map(T -> T / 10)
                .forEach(SeedMethods::println); // Yazdırma işlemi

        //2.  Listedeki sayıların her birinin 10 a bölümlerinin 2 eksiğini yazdıralım
        System.out.println();
        System.out.print("Sayilarin 10'a bölümünün iki eksigi   = ");
        sayi.stream()
                .map(T -> (T / 10) - 2)
                .forEach(SeedMethods::println); // Yazdırma işlemi
    }
}
