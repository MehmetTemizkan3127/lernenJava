package j103methods;

import java.util.*;
import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.stream.Collectors;

public class UtilityMethods {

    // 📌 1. MATHEMATİKSEL METODLAR

    // ========================================================
    /**
     * Girilen sayıların en küçüğünü bulur.
     * Findet die kleinste Zahl aus den gegebenen Zahlen.
     * Finds the minimum of the given numbers.
     */
    public static int findMin(int... numbers) {
        return Arrays.stream(numbers).min().orElseThrow();
    }
    // ========================================================

    // ========================================================
    /**
     * Girilen sayıların en büyüğünü bulur.
     * Findet die größte Zahl aus den gegebenen Zahlen.
     * Finds the maximum of the given numbers.
     */
    public static int findMax(int... numbers) {
        return Arrays.stream(numbers).max().orElseThrow();
    }
    // ========================================================

    // ========================================================
    /**
     * Verilen sayının karesini hesaplar.
     * Berechnet das Quadrat der gegebenen Zahl.
     * Calculates the square of the given number.
     */
    public static int square(int num) {
        return num * num;
    }
    // ========================================================

    // ========================================================
    /**
     * Verilen sayının karekökünü hesaplar.
     * Berechnet die Quadratwurzel der gegebenen Zahl.
     * Calculates the square root of the given number.
     */
    public static double squareRoot(double num) {
        return Math.sqrt(num);
    }
    // ========================================================

    // ========================================================
    /**
     * Belirtilen aralıkta rastgele bir sayı üretir.
     * Generiert eine Zufallszahl im angegebenen Bereich.
     * Generates a random number within the specified range.
     */
    public static int generateRandom(int min, int max) {
        return new Random().nextInt(max - min + 1) + min;
    }
    // ========================================================

    // ========================================================
    /**
     * Verilen sayının faktöriyelini hesaplar.
     * Berechnet die Fakultät der gegebenen Zahl.
     * Calculates the factorial of the given number.
     */
    public static long factorial(int num) {
        if (num < 0) return -1;
        return (num == 0) ? 1 : num * factorial(num - 1);
    }
    // ========================================================

    // ========================================================
    /**
     * Fibonacci serisini belirtilen eleman sayısı kadar üretir.
     * Erzeugt die Fibonacci-Serie für die angegebene Anzahl an Elementen.
     * Generates the Fibonacci series for the given number of elements.
     */
    public static List<Integer> fibonacciSeries(int count) {
        List<Integer> series = new ArrayList<>();
        int a = 0, b = 1;
        for (int i = 0; i < count; i++) {
            series.add(a);
            int temp = a + b;
            a = b;
            b = temp;
        }
        return series;
    }
    // ========================================================

    // 📌 2. STRING METHODEN

    // ========================================================
    /**
     * Verilen metnin ilk harfini büyük yapar, geri kalanını küçük yapar.
     * Macht den ersten Buchstaben des gegebenen Textes groß und den Rest klein.
     * Capitalizes the first letter of the given string and makes the rest lowercase.
     */
    public static String capitalize(String text) {
        if (text == null || text.isEmpty()) return text;
        return text.substring(0, 1).toUpperCase() + text.substring(1).toLowerCase();
    }
    // ========================================================

    // ========================================================
    /**
     * Verilen metni ters çevirir.
     * Kehrt den gegebenen Text um.
     * Reverses the given text.
     */
    public static String reverseString(String text) {
        return new StringBuilder(text).reverse().toString();
    }
    // ========================================================

    // ========================================================
    /**
     * Cümledeki kelimelerin sırasını tersine çevirir.
     * Kehrt die Reihenfolge der Wörter im Satz um.
     * Reverses the order of the words in the sentence.
     */
    public static String reverseWords(String text) {
        List<String> words = Arrays.asList(text.split(" "));
        Collections.reverse(words);
        return String.join(" ", words);
    }
    // ========================================================

    // 📌 3. DİZİ VE KOLEKSİYON METHODEN

    // ========================================================
    /**
     * Bir listedeki tekrar eden öğeleri kaldırır.
     * Entfernt doppelte Elemente aus einer Liste.
     * Removes duplicate elements from a list.
     */
    public static <T> List<T> removeDuplicates(List<T> list) {
        return new ArrayList<>(new HashSet<>(list));
    }
    // ========================================================

    // ========================================================
    /**
     * Bir dizinin tüm elemanlarını toplar.
     * Summiert alle Elemente eines Arrays.
     * Sums all the elements of an array.
     */
    public static int sumArray(int[] array) {
        return Arrays.stream(array).sum();
    }
    // ========================================================

    // ========================================================
    /**
     * Anahtar-değer çifti ile bir Map oluşturur.
     * Erstellt eine Map mit einem Schlüssel-Wert-Paar.
     * Creates a map with a key-value pair.
     */
    public static <K, V> Map<K, V> createMap(K key, V value) {
        Map<K, V> map = new HashMap<>();
        map.put(key, value);
        return map;
    }
    // ========================================================

    // ========================================================
    /**
     * Girilen elemanları bir Set (küme) içine koyar.
     * Fügt die eingegebenen Elemente in ein Set ein.
     * Adds the given elements to a Set.
     */
    public static <T> Set<T> convertToSet(T... elements) {
        return new HashSet<>(Arrays.asList(elements));
    }
    // ========================================================

    // ========================================================
    /**
     * Bir Enum sınıfındaki tüm isimleri liste olarak döndürür.
     * Gibt alle Namen eines Enum-Typs als Liste zurück.
     * Returns all names of an enum class as a list.
     */
    public static <E extends Enum<E>> List<String> getEnumNames(Class<E> enumClass) {
        return Arrays.stream(enumClass.getEnumConstants()).map(Enum::name).collect(Collectors.toList());
    }
    // ========================================================

    // 📌 4. TARİH METHODEN

    // ========================================================
    /**
     * İki tarih arasındaki gün farkını hesaplar.
     * Berechnet die Anzahl der Tage zwischen zwei Daten.
     * Calculates the number of days between two dates.
     */
    public static long daysBetween(String startDate, String endDate) {
        LocalDate start = LocalDate.parse(startDate);
        LocalDate end = LocalDate.parse(endDate);
        return ChronoUnit.DAYS.between(start, end);
    }
    // ========================================================

    // ========================================================
    /**
     * Şu anki tarihi döndürür.
     * Gibt das aktuelle Datum zurück.
     * Returns the current date.
     */
    public static LocalDate getCurrentDate() {
        return LocalDate.now();
    }
    // ========================================================

    // 📌 5. GÖRSELLEŞTİRME METHODEN

    // ========================================================
    /**
     * Verilen metni kutu içerisine yazdırır.
     * Gibt den gegebenen Text in einem Kasten aus.
     * Prints the given text inside a box.
     */
    public static void printBoxedText(String text) {
        int len = text.length();
        System.out.println("+" + "-".repeat(len + 2) + "+");
        System.out.println("| " + text + " |");
        System.out.println("+" + "-".repeat(len + 2) + "+");
    }
    // ========================================================

    // ========================================================
    /**
     * Fibonacci serisini ekrana yazdırır.
     * Gibt die Fibonacci-Serie auf der Konsole aus.
     * Prints the Fibonacci series to the console.
     */
    public static void printFibonacciSeries(int count) {
        List<Integer> fib = fibonacciSeries(count);
        System.out.println(fib);
    }
    // ========================================================

    // 📌 6. YAZDIRMA METHODEN

    // ========================================================
    /**
     * Verilen elemanı bir satırda yazdırır.
     * Gibt das gegebene Element in einer Zeile aus.
     * Prints the given element in a line.
     */
    public static <T> void println(T element) {
        System.out.println(element + " ");
    }
    // ========================================================

    // ========================================================
    /**
     * Verilen elemanı satır içinde yazdırır.
     * Gibt das gegebene Element in der gleichen Zeile aus.
     * Prints the given element in the same line.
     */
    public static <T> void print(T element) {
        System.out.print(element + " ");
    }
    // ========================================================

    // ========================================================
    /**
     * Girilen iki sayıyı çarpar.
     * Multipliziert die beiden angegebenen Zahlen.
     * Multiplies the given two numbers.
     */
    public static int bolunenleriCarp(int a, int b) {
        return a * b;
    }
    // ========================================================

    // ========================================================
    /**
     * Verilen sayının çift olup olmadığını kontrol eder.
     * Überprüft, ob die gegebene Zahl gerade ist.
     * Checks if the given number is even.
     */
    public static <T> boolean ciftMi(double element) {
        return element % 1 == 0 && ((int) element) % 2 == 0;
    }
    // ========================================================

    // ========================================================
    /**
     * Verilen sayının karesini hesaplar.
     * Berechnet das Quadrat der gegebenen Zahl.
     * Calculates the square of the given number.
     */
    public static <T> int karesiniAl(int element) {
        return element * element;
    }
    // ========================================================

    // ========================================================
    /**
     * Verilen sayının karekökünü hesaplar.
     * Berechnet die Quadratwurzel der gegebenen Zahl.
     * Calculates the square root of the given number.
     */
    public static double karekokAl(double element) {
        return Math.sqrt(element);
    }
    // ========================================================

    // ========================================================
    /**
     * Girilen iki sayının maksimum değerini bulur.
     * Findet den maximalen Wert der beiden angegebenen Zahlen.
     * Finds the maximum of the two given numbers.
     */
    public static Integer maxBul(Integer a, Integer b) {
        return Math.max(a, b);
    }
    // ========================================================

    // ========================================================
    /**
     * Verilen sayıya 3 ekler.
     * Addiert 3 zur gegebenen Zahl.
     * Adds 3 to the given number.
     */
    public static int ekle(double element) {
        return (int) (element + 3);
    }
    // ========================================================

    // ========================================================
    /**
     * Verilen sayıdan 7 çıkarır.
     * Subtrahiert 7 von der gegebenen Zahl.
     * Subtracts 7 from the given number.
     */
    public static int cikar(double element) {
        return (int) (element - 7);
    }
    // ========================================================

    // ========================================================
    /**
     * Rastgele bir sayı ekler.
     * Fügt eine zufällige Zahl hinzu.
     * Adds a random number.
     */
    public static int rastgeleSayiEkle() {
        return (int) (Math.random() * 10) + 1;
    }
    // ========================================================

    // ========================================================
    /**
     * Girilen iki sayının minimum değerini bulur.
     * Findet den minimalen Wert der beiden angegebenen Zahlen.
     * Finds the minimum of the two given numbers.
     */
    public static Integer minBul(Integer integer, Integer integer1) {
        return Math.min(integer, integer1);
    }
    // ========================================================

    // ========================================================
    /**
     * Bir nesnenin son karakterini döndürür.
     * Gibt das letzte Zeichen eines Objekts zurück.
     * Returns the last character of an object.
     */
    public static <U> U getSonKaracter(Object o) {
        return null;
    }
    // ========================================================

    // 📌 TEST METODU

    public static void main(String[] args) {
        // Testler buraya gelecek
    }
}
