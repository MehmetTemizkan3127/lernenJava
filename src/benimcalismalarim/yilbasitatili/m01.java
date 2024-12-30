package benimcalismalarim.yilbasitatili;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class m01 {
    public static void main(String[] args) {
        String cumle = "Ali bugün hastaydi";

        String [] kelime = cumle.split(" ");

        ArrayList <String> kelimeList = new ArrayList<>(Arrays.asList(kelime));
        System.out.println("String ArrayList'e cevrildi = " + kelimeList);

        System.out.println(kelimeList.reversed());


        String ters = new StringBuilder(Arrays.toString(kelime)).reverse().toString();
        System.out.println("ters = " + ters);



    }
}
