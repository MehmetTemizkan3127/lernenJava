package j33lambdaexpressions.dammy;

import java.util.function.Predicate;

public class C06Predicate {
    public static void main(String[] args) {

        // Predicate kullanarak sayının pozitif olup olmadığını kontrol et
        Predicate<Integer> pozitifMi = sayi -> sayi > 0;

        // Kullanım
        System.out.println("10 pozitif mi? " + pozitifMi.test(10));  // true
        System.out.println("-5 pozitif mi? " + pozitifMi.test(-5)); // false
        System.out.println("0 pozitif mi? " + pozitifMi.test(0)); // false



    }
}
