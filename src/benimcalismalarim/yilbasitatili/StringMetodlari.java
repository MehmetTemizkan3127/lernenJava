package benimcalismalarim.yilbasitatili;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

import static java.util.Arrays.*;

public class StringMetodlari {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Soru 1: length() Metodu
        //Kullanıcıdan bir kelime alın ve kelimenin kaç karakterden oluştuğunu ekrana yazdırın.
        //System.out.println("Lütfen bir cümle giriniz = ");
        //String cumle = scan.nextLine();
        //System.out.println("Lütfen ikinci kelimeyi giriniz = ");
        //String kelime2 = scan.nextLine();
         /*System.out.println("kelime = " + kelime.length());


        //Soru 2: charAt() Metodu
        //Kullanıcıdan bir kelime alın ve bu kelimenin 3. indeksindeki (4. karakter) harfi ekrana yazdırın.
        System.out.println("kelime = " + kelime.substring(4,5));
        System.out.println("kelime = " + kelime.charAt(4));*/

        //Soru 3: substring() Metodu
        //Bir cümle içinden "Java" kelimesini çıkarıp ekrana yazdıran bir program yazın.
        // Örnek cümle: "Ben Java öğreniyorum."
        //String cumle = "Ben Java öğreniyorum.";
        //System.out.println("cumle = " + cumle.substring(4,8));

        //Soru 4: indexOf() ve lastIndexOf() Metodları
        //Kullanıcıdan bir cümle alın ve bu cümledeki ilk ve son 'a' harfinin indeksini ekrana yazdırın.
        //System.out.println("A harfinin ilk indeksi  = " + kelime.indexOf("a"));
        //System.out.println("A harfinin son indeksi  = " + kelime.lastIndexOf("a"));

        //Soru 5: toUpperCase() ve toLowerCase() Metodları
        //Kullanıcıdan bir kelime alın. Kelimenin önce tamamen büyük harfli,
        // ardından tamamen küçük harfli halini ekrana yazdırın.
        //System.out.println(kelime.toUpperCase());
        //System.out.println(kelime.toLowerCase());
        //Soru 6: replace() Metodu
        //Kullanıcıdan bir cümle alın. Cümlede geçen tüm boşlukları (' ') tire ('-') ile değiştirerek
        // yeni halini ekrana yazdırın.
        //System.out.println(kelime.replace(' ', '/'));

        //Soru 7: equals() ve equalsIgnoreCase() Metodları
        //Kullanıcıdan iki kelime alın. Bu iki kelimenin tamamen aynı olup olmadığını ve
        // büyük/küçük harf duyarsız bir şekilde aynı olup olmadığını kontrol edin.
        //System.out.println(kelime1.equals(kelime2));
        //System.out.println(kelime1.equalsIgnoreCase(kelime2));

        //Soru 8: split() Metodu
        //Kullanıcıdan bir cümle alın. Bu cümleyi boşluklara göre ayırarak kelimelerini ekrana alt alta yazdırın.
        // String[] kelimeler = cumle.split(" ");
        //System.out.println("Kelimeler: " + Arrays.toString(kelimeler));

        //Soru 9: trim() Metodu
        //Kullanıcıdan bir kelime alın. Bu kelimenin başında ve sonunda boşluklar varsa,
        // bunları silip temizlenmiş halini ekrana yazdırın.
        /*String cumle = "   Java can ve canandır.   ";
        String bosluksuzMetin = cumle.trim();
        System.out.println("bosluksuzMetin  = " + bosluksuzMetin);
        System.out.println("cumle           = " + cumle);
        String bosluksuz = cumle.trim().replaceAll(" ","");
        System.out.println("bosluksuz       = " + bosluksuz);*/

        /*//Soru 10: contains() Metodu
        //Kullanıcıdan bir cümle alın. Bu cümlenin "Java" kelimesini içerip içermediğini kontrol eden bir program yazın.
        System.out.println("Lütfen bir cümle giriniz = ");
        String cumle = scan.nextLine();
        System.out.println(cumle.toLowerCase().contains("java"));*/

        // Kullanıcıdan bir cümle alın.
        // Bu cümleyi kelimelere ayırıp ters sırada yazdırın.
        // Kullanıcıdan bir cümle alır.
        //System.out.println("Lütfen bir cümle giriniz: ");
        //String cumle = scan.nextLine();

       /* // Cümleyi boşluklara göre kelimelere ayırır.
        String[] kelimeler = cumle.split(" ");
        System.out.println("Cümledeki Kelimeler: " + Arrays.toString(kelimeler));

        // Kelimeleri bir listeye ekler ve listeyi ters çevirir.
        List<String> kelimeListesi = new ArrayList<>(Arrays.asList(kelimeler));
        Collections.reverse(kelimeListesi);

        // Ters çevrilmiş kelimeler listesini ekrana yazdırır.
        System.out.println("Ters Çevrilmiş Kelime Listesi: " + kelimeListesi);

        // Ters sıradaki kelimeleri ekrana tek bir satırda yazdırır.
        System.out.println("Ters Sırada Kelimeler:");
        for (String kelime : kelimeListesi) {
            System.out.print(kelime + " ");
        }
        System.out.println();

        // Her kelimenin ters çevrilmiş halini oluşturur ve birleştirir.
        StringBuilder tersCumle = new StringBuilder();
        for (String kelime : kelimeler) {
            String tersKelime = new StringBuilder(kelime).reverse().toString();
            tersCumle.append(tersKelime).append(" ");
        }

        // Ters çevrilmiş kelimeleri ekrana yazdırır.
        System.out.println("Her Kelimenin Ters Çevrilmiş Hali:");
        System.out.println(tersCumle.toString().trim());*/


        /*// Kullanıcıdan bir cümle alın.
        // Cümledeki kelimeleri ayırın ve içinde 'a' harfi geçenleri yazdırın.
        String [] kelimeler = cumle.split(" ");

        // 'a' harfi geçen kelimeleri yazdırır.
        System.out.println("'a' harfi geçen kelimeler:");
        for (String kelime : kelimeler) {
            if (kelime.toLowerCase().contains("a")) { // Büyük/küçük harf duyarlılığı kaldırıldı.
                System.out.println(kelime);
            }
        }*/

        // Kullanıcıdan bir cümle alın.
        // Cümledeki kelimeleri ayırın ve her kelimenin uzunluğunu ekrana yazdırın.
        String [] kelimeler =  {"Canim", "seni", "kar", "tanesi", "gibi", "seviyorum" };
        for (String kelime : kelimeler) {
            System.out.println(kelime + " uzunluğu: " + kelime.length());
        }
        // Kelimeleri alfabetik sıraya göre sıralayın
        Arrays.sort(kelimeler);

        // Alfabetik sırayla kelimeleri ekrana yazdırın
        System.out.println("Kelimeler alfabetik sırayla:");
        for (String kelime : kelimeler) {
            System.out.println(kelime);
        }

    }
    }

