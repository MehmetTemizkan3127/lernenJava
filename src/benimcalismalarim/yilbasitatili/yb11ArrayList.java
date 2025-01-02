package benimcalismalarim.yilbasitatili;

import java.util.ArrayList;
import java.util.Arrays;

public class yb11ArrayList {
    public static void main(String[] args) {

        ArrayList<String> hayvanlar = new ArrayList<>(6);
        hayvanlar.add("Sincap");
        ArrayList <String> yeniHayvanlar= new ArrayList <> (Arrays.asList("Sincap", "Tilki", "Ayi", "Porsuk", "Balina"));

        // Yazdırma
        System.out.println("hayvanlar = " + hayvanlar);
        System.out.println("yeniHayvanlar = " + yeniHayvanlar);
        yeniHayvanlar.remove(2);
        yeniHayvanlar.remove("Balina");
        System.out.println("yeniHayvanlar = " + yeniHayvanlar);



    }
}
