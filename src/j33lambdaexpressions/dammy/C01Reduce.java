package j33lambdaexpressions.dammy;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public class C01Reduce {
    public static void main(String[] args) {
        List<Integer> sayiList = Arrays.asList(7, 58, 17, 35, 34, 25, 16, 6);

        System.out.println("****Task01****");
        // Task01 -> List çift elemanlarının karelerinin en büyüğünü bul
        Optional<Integer> maxSquare = sayiList.stream()
                .filter(n -> n % 2 == 0) // Çift sayıları filtrele
                .map(n -> n * n) // Karesini al
                .reduce(Integer::max); // En büyüğünü bul

        maxSquare.ifPresent(System.out::println); // Çıktı: 3364 (58^2)

        System.out.println("\n****Task02****");
        // Task02 -> List elemanlarının toplamını bul
        int sum = sayiList.stream()
                .reduce(0, Integer::sum); // Toplamını bul

        System.out.println(sum); // Çıktı: 198

        System.out.println("\n****Task03****");
        // Task03 -> List'in çift elemanlarının çarpımını bul
        Optional<Integer> productEven = sayiList.stream()
                .filter(n -> n % 2 == 0) // Çift sayıları al
                .reduce((a, b) -> a * b); // Çarpımını al

        productEven.ifPresent(System.out::println); // Çıktı: 189056 (58*34*16*6)

        System.out.println("\n****Task04****");
        // Task04 -> List elemanlarının en küçüğünü 4 farklı şekilde bul

        // 1. Yöntem: reduce() ile
        Optional<Integer> min1 = sayiList.stream().reduce(Integer::min);
        min1.ifPresent(System.out::println); // Çıktı: 6

        // 2. Yöntem: sorted() + findFirst()
        Optional<Integer> min2 = sayiList.stream().sorted().findFirst();
        min2.ifPresent(System.out::println); // Çıktı: 6

        // 3. Yöntem: mapToInt().min()
        OptionalInt min3 = sayiList.stream().mapToInt(n -> n).min();
        min3.ifPresent(System.out::println); // Çıktı: 6

        // 4. Yöntem: reduce() ile başlangıç değeri kullanarak
        int min4 = sayiList.stream().reduce(999999, Integer::min);
        System.out.println(min4); // Çıktı: 6

        System.out.println("\n****Task05****");
        // Task05 -> List elemanlarının 25'den büyük en küçük tek elemanını bul
        Optional<Integer> minOddAbove25 = sayiList.stream()
                .filter(n -> n > 25 && n % 2 != 0) // 25'ten büyük ve tek olanları al
                .reduce(Integer::min); // En küçüğünü bul

        minOddAbove25.ifPresent(System.out::println); // Çıktı: 35
    }
}
