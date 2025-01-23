package j30maps.tasks01;


import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Task3 {
    public static void main(String[] args) {
        /*
        Task 03) // Map den değeri belirli bir eşikten (60) düşük olan elemanları kaldırın.
        Map<String, Integer> scores = new HashMap<>();
        scores.put("Ali", 85);
        scores.put("Ayşe", 45);
        scores.put("Mehmet", 72);
        scores.put("Fatma", 50);

         */

        LinkedHashMap<String, Integer> scores = new LinkedHashMap<>();
        scores.put("Ali", 85);
        scores.put("Ayşe", 45);
        scores.put("Mehmet", 72);
        scores.put("Fatma", 50);

        Iterator<Map.Entry<String, Integer>> iterator = scores.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            if (entry.getValue() < 60) {
                iterator.remove();
            }
        }

        System.out.println("60 altinin remov sonrasi son hali   =  "+scores);

    }
}
