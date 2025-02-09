package javacalismalarim.konutekrari;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Yb12ArrayList {
    public static void main(String[] args) {

        ArrayList<String> hayvanlar = new ArrayList<>(6);

        hayvanlar.add("Sincap");
        Collections.addAll(hayvanlar, "Akrep", "Yilan", "Ari");
        ArrayList <String> yeniHayvanlar = new ArrayList <> (Arrays.asList("Sincap", "Tilki", "Ayi", "Porsuk", "Balina"));
        ArrayList <String> yeniHayvanlar1 = new ArrayList <> (List.of("Sincap", "Tilki", "Ayi", "Porsuk", "Balina"));

        System.out.println("Hayvanlar add. ile eklendi          = " + hayvanlar);
        System.out.println("Hayvanlar addAll ile eklendi        = " + hayvanlar);
        System.out.println("Yeni Hayvanlar asList ile eklendi   = " + yeniHayvanlar);
        System.out.println("Yeni Hayvanlar List.of ile eklendi  = " + yeniHayvanlar1);


        yeniHayvanlar.remove(2);
        yeniHayvanlar.remove("Balina");
        System.out.println("Güncel Hayvanlar Listesi remove     = " + yeniHayvanlar);

        yeniHayvanlar1.set(0,"Kelebek");
        System.out.println("Hayvanlar set sonucu                = " + yeniHayvanlar1);

        String kanatlilar = yeniHayvanlar1.get(0);
        System.out.println("Kanatlilar degiskeni get ile        = " + kanatlilar);

        int size = yeniHayvanlar1.size();
        System.out.println("Array'in eleman uzunlugu size ile   = " + size);

        hayvanlar.clear();
        System.out.println("Hayvanlar clear sonrasi             = " + hayvanlar);

        System.out.println("Arrayde secilen eleman bulunuyor mu = "+ yeniHayvanlar.contains("Porsuk"));
        System.out.println("Array'in bos mu degil mi            = " +hayvanlar.isEmpty());

        System.out.println("Array'in elemanlari                 = ");
        int i =0;
        String[] hayvanlarx = yeniHayvanlar1.toArray(new String[8]); // String türünde dizi
        for (String hayvan : hayvanlarx){
            i++;
            System.out.println(i+"."+hayvan);
        }
    }
}
