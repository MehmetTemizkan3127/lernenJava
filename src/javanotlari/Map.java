package javanotlari;

import java.util.*;

public class Map {
    public static void main(String[] args) {

        HashMap<String, Integer> map1 = new HashMap<>();
        LinkedHashMap<String, ArrayList<String>> map3 = new LinkedHashMap<>();
        TreeMap<String, Integer> map2 = new TreeMap<>();

        /*
        MAP Metodlari
        put(key, value): Anahtar-değer çiftini ekler veya günceller.
        get(key): Belirli bir anahtarın değerini döner.
        containsKey(key): Belirtilen anahtarın haritada olup olmadığını kontrol eder.
        remove(key): Belirli bir anahtarı ve ona bağlı değeri siler.
        size(): Haritadaki toplam eleman sayısını döner.
        clear(): Haritayı tamamen temizler.
        isEmpty(): Haritanın boş olup olmadığını kontrol eder.
        entrySet (); Degerlerin Set'e cevrilmesi
         */

        map1.put("Ali", 25);
        map1.put("Feyza", 25);
        map1.put("Veli", 60);
        map1.put("Feyza", 30);
        System.out.println("Put ile eklenen map                     = " + map1);

        System.out.println("Feyzanin degerini getiriyor             = " + map1.get("Feyza"));
        System.out.println("Tüm map'lerin yazilimi Set'e ceviriyor  = " + map1.entrySet());

        boolean containsFeyza = map1.containsKey("Feyza");
        System.out.println("Feyza anahtari var mi                   = " + map1.containsKey("Feyza"));
        System.out.println("Salih anahtari var mi                   = " + map1.containsKey("Salih"));

        boolean containsFeyzaValue = map1.containsValue(30);
        System.out.println("30 degeri var mi                        = " + map1.containsValue(30));
        System.out.println("30 degeri var mi                        = " + map1.containsValue(40));

        map2.put("Salih", 7);
        map2.put("Murat", 8);
        map2.put("Kadir", 7);
        map2.put("Feyza", 7);

        map1.putAll(map2);
        System.out.println("Benzesmeyenlerin birlestirilmesi        = " + map1);

        Integer keyRemove = map1.remove("Feyza");
        System.out.println("Remov sonucu                            = " + map1.remove("Feyza"));
        System.out.println("Remove(); sonrasi sonuc                 = " + map1);

        int entrSayisi = map1.size();
        System.out.println("Clear öncesi size                       = " + map1.size());

        boolean bosMu = map1.isEmpty();
        System.out.println("Clear öncesi bos mu                     = " + bosMu);

        map1.clear();
        System.out.println("Map temizlendi                          = " + map1);

        boolean bosMu1 = map1.isEmpty();
        System.out.println("Clear sonrasi bos mu                    = " + bosMu1);
    }
}
