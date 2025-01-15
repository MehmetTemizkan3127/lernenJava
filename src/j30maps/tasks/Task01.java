package j30maps.tasks;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Task01 {
    public static void main(String[] args) {
        //Task 01) Bir HashMap oluşturun, birkaç anahtar-değer çifti ekleyin ve map i yazdırın.

        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("Murat",60);
        map.put("Salih",80);
        map.put("Ayse",70);
        map.put("Murat",90);
        map.put("Fatma",80);
        map.put("Salih",80);

        System.out.println("Anahtar ve deger benzerleriyle eklendi ve ekrana yazdiliyor     = "+map);

    }
}
