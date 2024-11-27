package benimcalismalarim.homeWork;

import java.util.ArrayList;
import java.util.List;

public class Hw_1127_03_ArrayList {
    public static void main(String[] args) {
        /*
            getLength() isminde bir method oluşturun.
            Parametre olarak String ArrayList
            Return tipi Integer ArrayList
            ArrayList içindeki her bir Stringin uzunluğunu bulunuz.
            Tüm elementlerin uzunluğunu döndürün
            Örneğin;
            ArrayList  :  "New jersey" ,"New york" , "Ohio" , "Florida" , "Boston"
            Tüm Stringlerin uzunluklarını yazdırın;
            cevap: 10 ,  8 , 4 , 7 , 6 olmalı
         */

        List<String> sehirler = new ArrayList<>(List.of("New jersey", "New york", "Ohio", "Florida", "Boston"));

        List<Integer> uzunluklar = getLength(sehirler);
        System.out.println(uzunluklar);
    }

    public static List<Integer> getLength(List<String> sehirler) {
        List<Integer> uzunluklar = new ArrayList<>();

        for (int i = 0; i < sehirler.size(); i++) {
            uzunluklar.add(sehirler.get(i).length());
        }

        return uzunluklar;
    }
}
