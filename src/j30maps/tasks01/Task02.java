package j30maps.tasks01;

import java.util.HashMap;

public class Task02 {
    public static void main(String[] args) {
        //Task 02 ) // Map de belirli bir anahtarın olup olmadığını kontrol edin ve varsa karşılık gelen değeri yazdırın.

        HashMap<String, Integer> mapYas = new HashMap<>();
        mapYas.put("Ayse", 20);
        mapYas.put("Nuri", 45);
        mapYas.put("Halime", 70);

        System.out.println("Nuri anahtarinin olup olmadigi kontrol edildi                   = "+mapYas.containsKey("Nuri"));

        mapYas.remove("Nuri");
        System.out.println("Remov sonrasi Nuri anahtarinin olup olmadigi kontrol edildi     = "+mapYas.containsKey("Nuri"));

        System.out.println("Salih anahtarinin olup olmadigi kontrol edildi                  = "+mapYas.containsKey("Salih"));



    }
}
