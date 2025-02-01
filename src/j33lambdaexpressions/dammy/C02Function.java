package j33lambdaexpressions.dammy;

import java.util.function.Function;

public class C02Function {
    public static void main(String[] args) {

// Function kullanarak sayının karesini hesapla
        Function<Integer, Integer> kareHesaplama = sayi -> sayi * sayi;

        // Kullanım
        int sayi = 5;
        System.out.println(sayi + " sayısının karesi = " + kareHesaplama.apply(sayi));  // 49


    }
}
