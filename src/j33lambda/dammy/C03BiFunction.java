package j33lambda.dammy;

import java.util.function.BiFunction;

public class C03BiFunction {
    public static void main(String[] args) {

        BiFunction<Integer, Integer, Integer> toplamaIsleme = (sayi1, sayi2)->  sayi1+sayi2;
        Integer toplam = toplamaIsleme.apply(10,20);
        System.out.println("Toplama islemi = "+toplam);
    }
}
