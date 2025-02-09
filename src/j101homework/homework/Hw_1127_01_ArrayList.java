package j101homework.homework;

import java.util.ArrayList;
import java.util.List;

public class Hw_1127_01_ArrayList {
    public static void main(String[] args) {
/*
        ismi getCount() olan bir method oluşturun.
        Parametre olarak bir String ArayList  ve  bir tane String
        Return tipi int olmalı.
        ArrayList'teki bir değerin kaç kez tekrarlandığını belirtin ve döndürün.
        Örneğin;
        ArrayList = Orange , Kiwi , Peach , Banana , Orange
        String Orange:
        Count = 2 olmalı. (Orange 2 kez yazılmış)
         */

        List<String> meyveler = new ArrayList<>(List.of("Orange", "Kiwi", "Peach", "Banana", "Orange"));
        String arananKelime = "Orange";

        int count = getCount(meyveler, arananKelime);
        System.out.println(arananKelime + " kelimesinin tekrar sayisi: " + count);
    }

    public static int getCount(List<String> meyveler, String kelime) {
        int count = 0;

        for (int i = 0; i < meyveler.size(); i++) {
            if (meyveler.get(i).equals(kelime)) {
                count++;
            }
        }
        return count;
    }
}
