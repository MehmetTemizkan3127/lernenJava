package javacalismalarim.konutekrari.interviewquestions;

import java.util.HashMap;
import java.util.Map;

public class Task02 {
    public static void main(String[] args) {
        // String te tekrarlayan karakterleri ve tekrarlama sayılarını yazdırın
        String input = "Test Automation";
        input = input.toLowerCase();

        findDuplicates(input);
    }

    public static void findDuplicates(String metin) {

        Map<Character, Integer> karekterSayisi = new HashMap<>();

        for (char c : metin.toCharArray()) {

            karekterSayisi.put(c, karekterSayisi.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> input : karekterSayisi.entrySet()) {
            if (input.getValue() > 1) {
                System.out.println(input.getKey() + " karakteri " + input.getValue() + " kez tekrar ediyor.");
            }
        }
    }
}
