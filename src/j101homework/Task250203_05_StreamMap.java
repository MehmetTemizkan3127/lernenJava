package j101homework;

import methods.SeedMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static methods.SeedMethods.rastgeleSayiEkle;

public class Task250203_05_StreamMap {
    public static void main(String[] args) {
        //  map() --> M E T H O D  R E F E R A N S  ile çözelim
        //  List<Integer> sayi = new ArrayList<>(Arrays.asList(0,1,2,3,4,5,6,7,8,9,10));
        //  Listedeki tüm sayılara 1 ile 10 arası random bir sayı ekle ve aralarında boşluk olacak şekilde yazdır
        //  Listedeki tüm sayılardan 1 ile 10 arası random bir sayı ekle , 1 ile 10 arası random bir sayı ekle çıkar
        //  METHOD REFERANS kullanarak aralarında boşluk olacak şekilde yazdırın

        List<Integer> sayi = new ArrayList<>(Arrays.asList(0,1,2,3,4,5,6,7,8,9,10));

        System.out.print("1. Islem orjinal liste      = ");
        System.out.println(sayi);

        //Listeye rastgele sayi ekleme
        List<Integer> eklenenListe1 = sayi.stream()
                .map(T -> T + rastgeleSayiEkle())
                .toList();
        System.out.print("2. Islem eklenen liste      = ");
        eklenenListe1.forEach(SeedMethods::println);
        System.out.println();

        // Tekrar listeye rastgele sayi ekleme
        List<Integer> eklenenListe2 = eklenenListe1.stream()
                .map(T -> T + rastgeleSayiEkle())
                .toList();
        System.out.print("3. Islem yine eklenen liste = ");
        eklenenListe2.forEach(SeedMethods::println);
        System.out.println();

        // Listeden rastgele sayi çıkarma
        List<Integer> cikarilanListe = eklenenListe2.stream()
                .map(T -> T - rastgeleSayiEkle())
                .toList();
        System.out.print("4. Islem cikarilan liste    = ");
        cikarilanListe.forEach(SeedMethods::println);
        System.out.println();
    }
}


