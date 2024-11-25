package benimcalismalarim.Mentoring.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task01 {
    public static void main(String[] args) {

        /* Boş Bir ArrayList Oluşturup Eleman Eklemek (add() Metodu ile) */
        // Soru 1 : ogrenciler adında bir ArrayList oluşturnuz.
        // Ve bu listeye add() methodunu kullnarak 3 öğrenci ekleyiniz
        // Listeyi yazdırınız

        ArrayList<String > ogrenciler =  new ArrayList<>();
        ogrenciler.add("Hakan");
        ogrenciler.add("Beyza");
        ogrenciler.add("Ali");

        System.out.println("ogrenciler = " + ogrenciler);

        System.out.println(ogrenciler.size());

    }


}
