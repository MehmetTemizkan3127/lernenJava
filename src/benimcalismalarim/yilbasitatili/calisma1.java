package benimcalismalarim.yilbasitatili;

import java.util.Arrays;

public class calisma1 {
    public static void main(String[] args) {
       /* String str = "Salih java ögreniyor";
        System.out.println("Orjinal Metin   = " + str);

        StringBuilder sb = new StringBuilder(str);
        System.out.println("Metin ters yazildi  = " + sb.reverse());
*/
        int i = 0;
       /* for (String kelime : str.split(" ")){
            i++;
            System.out.println(i+". kelime      = " + new StringBuilder(kelime).reverse().toString());
        }*/
        System.out.println();
        String cumle = "Java seni sevmek istiyorum";
        String[] kelimeler = cumle.split(" ");


        // Dizideki her kelimeyi tek tek yazdırmak için for-each döngüsü
        for (String kelime : kelimeler) {
            i++;  // Her kelimeyi geçtikçe i'yi artır
            System.out.println(i + ". kelime = " + kelime);  // Kelimeyi yazdır
        }

        System.out.println("kelimeler = " + new StringBuilder(cumle).reverse().toString());


    }
}