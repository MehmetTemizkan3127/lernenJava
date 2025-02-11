package j101homework.map;

import java.util.LinkedHashMap;

/* Task -> Ad ve soyad bulunduran iki ayrı array'i bir map'de print eden code create ediniz.
   input : {"javaCAN", "javaTAR", "javaNAZ"};  {"Ahmet", "Haluk", "İpek"};
   output:{javaCAN=Ahmet,javaTAR=Haluk,javaNAZ=İpek}
  */
public class Map03LinkedHashMap {
    public static void main(String[] args) {
        String[] adlar = {"Ahmet", "Haluk", "İpek"};
        String[] soyadlar = {"javaCAN", "javaTAR", "javaNAZ"};

        LinkedHashMap<String, String> isimMap = new LinkedHashMap<>();

        for (int i = 0; i < soyadlar.length; i++) {
            isimMap.put(soyadlar[i], adlar[i]);
        }

        System.out.println(isimMap);
    }
}
