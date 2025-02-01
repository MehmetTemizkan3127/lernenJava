package j33lambdaexpressions.dammy.stream;

import java.util.Arrays;
import java.util.List;

public class C08Filter {
    public static void main(String[] args) {
        List<Integer> sayiList = Arrays.asList(7, 58, 17, 54, 33, 3, 13, 35, 65, 18, 61, 46, 25, 16, 6);

        System.out.println("\n      ************** Task01 **************");
        printEvenNumbersStructured(sayiList);

        System.out.println("\n      ************** Task02 **************");
        printEvenNumbersFunctional(sayiList);

        System.out.println("\n      ************** Task03 **************");
        printEvenNumbersLessThan35(sayiList);

        System.out.println("\n      ************** Task04 **************");
        printGreaterThan34OrOdd(sayiList);
    }

    // Task01: Structured Programming (Amele Yöntemi)
    public static void printEvenNumbersStructured(List<Integer> numbers) {
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }

    // Task02: Functional Programming (Cincix Yöntemi)
    public static void printEvenNumbersFunctional(List<Integer> numbers) {
        numbers.stream()
                .filter(num -> num % 2 == 0) // Çift sayıları filtrele
                .forEach(num -> System.out.print(num + " "));
        System.out.println();
    }

    // Task03: 35'ten küçük çift sayıları yazdır
    public static void printEvenNumbersLessThan35(List<Integer> numbers) {
        numbers.stream()
                .filter(num -> num % 2 == 0 && num < 35) // Hem çift hem de 35'ten küçük
                .forEach(num -> System.out.print(num + " "));
        System.out.println();
    }

    // Task04: 34'ten büyük veya tek sayıları yazdır
    public static void printGreaterThan34OrOdd(List<Integer> numbers) {
        numbers.stream()
                .filter(num -> num > 34 || num % 2 != 0) // 34'ten büyük Veya tek sayı
                .forEach(num -> System.out.print(num + " "));
        System.out.println();
    }
}