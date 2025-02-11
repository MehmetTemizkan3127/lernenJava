package j101homework.map;

import java.util.HashMap;

public class Map01HashMap {
    /* task->

  Parametreleri , Integer -String HashMap,  int ve String olan (3ayrı parametre)
  Eğer HashMap, int olan parametreyi içeriyorsa,
  int değerinde var olan String'i güncelleyip Integer - String HashMap return eden
  update() isminde METHOD create ediniz.
  Örnek :
   Hash map:
  1, "New jersey"
  2, "New York"
  3, "London"
  4, "Paris"

  input :
  int = 3
  String = Miami
  output :
  1, "New jersey"
  2, "New York"
  3, "Miami"
  4, "Paris"
   */

    public static void main(String[] args) {


        HashMap<Integer, String> orginalMap = new HashMap<>();
        orginalMap.put(1, "New Jersey");
        orginalMap.put(2, "New York");
        orginalMap.put(3, "London");
        orginalMap.put(4, "Paris");


        System.out.println("Orjinal HashMap     = " + orginalMap);


        int key = 3;
        String newValue = "Miami";
        orginalMap = update(orginalMap, key, newValue);


        System.out.println("Güncel HashMap      = " + orginalMap);
    }

    public static HashMap<Integer, String> update(HashMap<Integer, String> map, int key, String value) {

        if (map.containsKey(key)) {

            map.put(key, value);
        }
        return map;
    }

}
