package j101homework.lambda;

import j103methods.SeedMethods;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda02StreamMap {
    public static void main(String[] args) {
        //  map() --> M E T H O D  R E F E R A N S  ile çözelim
        //  List<Integer> sayi = new ArrayList<>(Arrays.asList(10,20,30,40,50));
        //  listedeki sayıların her birine 3 ekleyip , karekokunu alıp 7 azaltalım
        //  her bir elemana 3 ekleme methodu olsun :: method referansı kullanacak şekilde cevaba entegra edelim
        //  her bir elemanın karekökünü alma methodu olsun :: method referansı kullanacak şekilde cevaba entegra edelim
        //  her bir elemanadan 7 azaltma methodu olsun :: method referansı kullanacak şekilde cevaba entegra edelim

        List<Integer> sayi = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        System.out.print("Islemin sonucu = ");
        sayi.stream()
                .map(T -> T)
                .map(SeedMethods::ekle)
                .map(SeedMethods::karekokAl)
                .map(SeedMethods::cikar)
                .forEach(SeedMethods::println);
    }
}
