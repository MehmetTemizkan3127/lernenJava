package javacalismalarim.konutekrari;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Yb13List {
    public static void main(String[] args) {

        List<String> kanatlilar = new ArrayList<>(5);
        //1- add(); , addAll();
        kanatlilar.add("Kus");
        Collections.addAll(kanatlilar, "Ari", "Kelebek", "Sinek");

        System.out.println("kanatlilar          = " + kanatlilar);
        System.out.println("Kanatli hayvanlar   :");
        int i = 0;
        for (String kanatli : kanatlilar) {
            i++;
            System.out.println(i + "." + kanatli);
        }

        //2- remove();
        kanatlilar.remove(2);
        System.out.println("Kanatli Hayvanlar   =" + kanatlilar);

        //3- get();
        System.out.println("Get                 = " + kanatlilar.get(2));

        //4- set();
        System.out.println("Set                 = " + kanatlilar.set(1, "Kartal"));

        Collections.addAll(kanatlilar, "Sahin", "Keklik", "Bülbül", "Papagan");
        System.out.println("Güncel durum        = " + kanatlilar);

        //5- size();
        System.out.println("List eleman sayisi  = " + kanatlilar.size());

        //6- contains();
        System.out.println("Contains sonucu     = " + kanatlilar.contains("Keklik"));

        //7- isEmty();
        List<Integer> tekliSayilar = new ArrayList<>();
        if (tekliSayilar.isEmpty()) {
            System.out.println("Liste su anda bos   = " + tekliSayilar);
            Collections.addAll(tekliSayilar, 17, 21, 47, 87, 59,17,63,35);
        }
        int y = 0;
        System.out.println("Liste dolu Elemanlar= ");
        if (!tekliSayilar.isEmpty()) {
            for (Integer sayi : tekliSayilar) {
                y++;
                System.out.println(y + ". sayi = " + sayi);
            }
        }

        //7- indexOf();
        String kırmızı = "\u001B[31m"; // Kırmızı renk kodu
        String sıfırla = "\u001B[0m";   // Renk sıfırlama kodu
        int indeks = tekliSayilar.indexOf(87);

        System.out.println("Belirtilen eleman " + kırmızı + indeks + sıfırla + " nolu indekstedir.");
        System.out.println("Belirtilen eleman " + tekliSayilar.indexOf(87) + " nolu indekstedir" );
        System.out.println("Belirtilen indeksin elemanı  = " + tekliSayilar.get(3));

        //8- lastIndexOf();
        System.out.println("Belirtilen elemanin indeksi  = "+tekliSayilar.lastIndexOf(17));

        List <Integer> yeniTekliSayilar = tekliSayilar.subList(1, 6);
        System.out.println("Yeni liste atama ile olustur = "+yeniTekliSayilar);

        //9- clear();
        yeniTekliSayilar.clear();
        System.out.println("Clear sonrasi                = " + yeniTekliSayilar);

        Collections.addAll(yeniTekliSayilar, 17, 99,21,113,163,69);
        System.out.println("Eleman ekleme sonrasi liste  ="+yeniTekliSayilar);

        System.out.println("List'in güncel hali          =" + tekliSayilar);
    }
}
