package j30maps.tasks01;

import java.util.LinkedHashMap;
import java.util.Map;

public class Task4 {
    public static void main(String[] args) {
        /*

        Bir map deki anahtarları ve değerleri takas ederek yeni bir harita oluşturun.
        Map<String, String> countryCapital = new HashMap<>();
        countryCapital.put("Turkey", "Ankara");
        countryCapital.put("Germany", "Berlin");
        countryCapital.put("France", "Paris");

         */

        LinkedHashMap<String, String> countryCapital = new LinkedHashMap<>();
        countryCapital.put("Turkey", "Ankara");
        countryCapital.put("Germany", "Berlin");
        countryCapital.put("France", "Paris");

        LinkedHashMap<String, String> capitalCountry = new LinkedHashMap<>();

        for (Map.Entry<String, String> entry : countryCapital.entrySet()) {
            capitalCountry.put(entry.getValue(), entry.getKey());
        }
        System.out.println("Orijinal Map        = " + countryCapital);
        System.out.println("Takas edilmis Map   = " + capitalCountry);

    }
}
