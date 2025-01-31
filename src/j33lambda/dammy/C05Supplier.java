package j33lambda.dammy;

import j33lambda.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class C05Supplier {
    public static void main(String[] args) {
        Supplier<List<Person>> initialList = () -> new ArrayList<>(List.of(new Person("Azize",25),new Person("Dilara",12)));

        List<Person> baslangicListesi = initialList.get();
        baslangicListesi.forEach(t -> System.out.println(t));



        // Supplier kullanarak rastgele sayı üret
        Supplier<Integer> rastgeleSayiSupplier = () -> new Random().nextInt(100); // 0-99 arasında rastgele sayı

        // Kullanım
        System.out.println("Rastgele Sayı: " + rastgeleSayiSupplier.get());  // Örn: 42
    }
}

