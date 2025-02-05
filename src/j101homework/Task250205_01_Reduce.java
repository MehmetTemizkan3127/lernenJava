package j101homework;

import java.util.List;

public class Task250205_01_Reduce {
    public static void main(String[] args) {
        // reduce()
        // List<String> words = List.of("Java", "Lambda", "Stream", "Reduce");
        // liste içindeki kelimeleri aralarında virgül olacak şekilde birleştirerek tek bir String haline getir.
        // Çıktı:
        // "Java, Lambda, Stream, Reduce"
        List<String> words = List.of("Java", "Lambda", "Stream", "Reduce");
        String yeniDeger = words.stream()
                .reduce((w1, w2) -> w1 + ", " + w2)
                .orElse("");

        System.out.println("Birlestirilmis String = "+yeniDeger);



    }
}
