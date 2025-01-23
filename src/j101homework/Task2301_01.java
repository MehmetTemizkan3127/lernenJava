package j101homework;

import java.util.HashMap;
import java.util.Map;

public class Task2301_01 {
    public static void main(String[] args) {

        //Task ->  Asagida verilen map'de yazilim dili java olan kisi isimlerini bir liste return eden method create edinizn

        Map<Integer, String> map1 = new HashMap<>();
        map1.put(101, "Ali, Can, java");
        map1.put(102, "Veli, Yan, java");
        map1.put(103, "Ali, Yan, C#");
        map1.put(104, "Veli, Yan, java");

        javaIcerenMap(map1);

    }

    public static void javaIcerenMap(Map<Integer, String> map) {
        for (String value : map.values()) {
            if (value.contains("java")) {
                String isim = value.substring(0, value.indexOf(","));
                System.out.println(isim);
            }
        }
    }
}
