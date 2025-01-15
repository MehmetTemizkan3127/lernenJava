package j30maps.tasks;


import java.util.*;

public class Task07 {
    public static void main(String[] args) {
        //        Öğrenci ve Notlarının Map'te İşlenmesi
        //        Bir Map<String, Integer> kullanarak öğrencilerin isimlerini (anahtar) ve notlarını (değer) saklayın.
        //        Görevler:
        //        Öğrencilerin not ortalamasını hesaplayın.
        //        En yüksek notu alan öğrenciyi bulun.
        //        50'nin altındaki notları silin.

        Map<String, Integer> students = new HashMap<>();
        students.put("Ali", 45);
        students.put("Ayşe", 78);
        students.put("Mehmet", 90);
        students.put("Fatma", 65);
        students.put("Cem", 30);


        int toplam = 0;
        for (int not : students.values()) {
            toplam += not;
        }
        double ortalama = (double) toplam / students.size();
        System.out.println("Ögrencilerin not ortalamasi                                 = " + ortalama);


        String enIyiOgrenci = "";
        int enYuksekNot = 0;
        for (Map.Entry<String, Integer> entry : students.entrySet()) {
            if (entry.getValue() > enYuksekNot) {
                enYuksekNot = entry.getValue();
                enIyiOgrenci = entry.getKey();
            }
        }
        System.out.println("En yüksek notu alan ögrenci                                 = " + enIyiOgrenci);

        Iterator<Map.Entry<String, Integer>> iterator = students.entrySet().iterator();

        iterator = students.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            if (entry.getValue() < 50) {
                iterator.remove();
            }
        }
        System.out.println("50'nin altindaki notlar silindikten sonra kalan ögrenciler  = " + students);
    }
    }




