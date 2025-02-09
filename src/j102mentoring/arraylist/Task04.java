package j102mentoring.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class Task04 {
    public static void main(String[] args) {
        // Kütüphane Sistemi Oluşturma

        // Görev 1 : Bos bir ArrayList Oluşturalım
        // Görev 2 : Kütüphaneye 10 yeni üye ekleyelim.
        // Görev 3 : Uye listesini alfabetik olarak sıralayıp yazıralım.
        // Görev 4 : 3. uyeyi silelim
        // Görev 5 : Spesifik bir üyenin kaydını kontrol edelim. (kayıtlı mı değil mi )
        // mesela  : sildiğimiz uye ve silmediğimiz bir uye kotrolu olabilir

        //Görev 1 :
        ArrayList<String> uyeler = new ArrayList<>();
        System.out.println("Görev 1  : Bos bir ArrayList = " + uyeler);

        //Görev 2 :
        uyeler.add("Hasan");
        uyeler.add("Ali");
        uyeler.add("Serkan");
        uyeler.add("Ayse");
        uyeler.add("Aydin");
        uyeler.add("Fatma");
        uyeler.add("Sümeyra");
        uyeler.add("Merve");
        uyeler.add("Mustafa");
        uyeler.add("Salih");
        System.out.println("Görev 2  : Kütüphaneye 10 yeni üye eklendi = " + uyeler);

        //Görev 3 :
        Collections.sort(uyeler);
        System.out.println("Görev 3  : Alfabetik sırayla üye listesi = " + uyeler);

        //Görev 4 :
        uyeler.remove(2);
        System.out.println("Görev 4  : 3. uye silindi = ");


        //Görev 5 :
        System.out.println("Görev 5  : Silinen üye kontrolü = " + uyeler.contains("Ayse"));


        // Görev 6 : Listenin ilk sırasına en küçük uye olan "Zeynep Su" yu ekleyelim.
        // Görev 7 : Listenin son sırasında kayıtlı uyeyi "Michael" ile güncelleyelim.
        // Görev 8 : Yöneticinin talebiyle Tüm listeyi buyuk harfe cevirelim
        // Görev 9 : Listenin boş olmadığını kontro edelim
        // Görev 10 : Kütüphane listesi kaç kişilik kontrol edelim yazdıralım


        //Görev 6 :
        uyeler.addFirst("Zeynep Su");
        System.out.println("Görev 6  : Listenin ilk sırasına en küçük uye olan \"Zeynep Su\" yu eklendi. = " + uyeler);

        // Görev 7 :
        uyeler.set(uyeler.size() - 1, "Michael");
        System.out.println("Görev 7  : Listenin son sırasında kayıtlı üyeyi \"Michael\" ile güncellendi. = " + uyeler);

        // Görev 8
        uyeler.replaceAll(String::toUpperCase);
        System.out.println("Görev 8  : Tüm liste buyuk harfe cevrildi = " + uyeler);

        // Görev 9 :
        System.out.println("Görev 9  : Listenin boş olmadığı kontro edildi = " +uyeler.isEmpty());

        // Görev 10 :
        System.out.println("Görev 10 : Kütüphane listesinin kişi sayisi kontrol edildi = "+uyeler.size());
    }
}
