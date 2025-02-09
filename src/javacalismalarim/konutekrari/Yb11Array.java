package javacalismalarim.konutekrari;

import java.util.Arrays;
import java.util.List;

public class Yb11Array {
    public static void main(String[] args) {

        int [] sayilar = new int[]{20,80,20,60,20};

        System.out.println("Sayilar Arrayi = " +Arrays.toString(sayilar));
        System.out.println(sayilar [1]);

        int enBuyuk = sayilar[0];
        int enKucuk = sayilar[0];

        for (int sayi : sayilar) {
            if (sayi > enBuyuk) enBuyuk = sayi;
            if (sayi < enKucuk) enKucuk = sayi;
        }

        System.out.println("En Büyük: " + enBuyuk);
        System.out.println("En Küçük: " + enKucuk);

        int hedef = 20;
        int i =0;
        for (int sayi : sayilar){
            if ( sayi==hedef){

                i++;
            }
        }
        System.out.println("Hedef " + hedef + " sayısı " + i + " kez tekrar ediyor.");

        String [] hayvanlar = new String[5];
        hayvanlar[0] = "Kedi";
        hayvanlar[2] = "Keci";
        hayvanlar[4] = "Kaplan";

        System.out.println("Sayilar Arrayi = " +Arrays.toString(hayvanlar));

        String [] hayvanlar1 = new String []{"Kedi", "Köpek", "Kaplan", "Fil", "Zebra", "Yilan", "Fare"};
        System.out.println("Hayvanlar Arrayi = " +Arrays.toString(hayvanlar1));

        //Array Metodlari
        //1- sort
       Arrays.sort(hayvanlar1);
        System.out.println(Arrays.toString(hayvanlar1));

        int indeks = Arrays.binarySearch(hayvanlar1, "Yilan");
        System.out.println("Aranan kelimenin indeksi: " + indeks);

        String [] yeniHayvalarList = Arrays.copyOf(hayvanlar1, 8);
        System.out.println(Arrays.toString(yeniHayvalarList));

        String [] yeniHayvalarListOls = Arrays.copyOfRange(hayvanlar1, 2,6);
        System.out.println(Arrays.toString(yeniHayvalarListOls));

        String [] evcil = new String[]{"Köpek", "Tavsan", "Kedi", "Kus" };
        String [] yabani = new String[]{"Köpek", "Tavsan", "Kaplan", "Kus" };
        System.out.println(Arrays.equals(evcil, yabani));

        Arrays.fill(hayvanlar1, "Kedi");
        System.out.println(Arrays.toString(hayvanlar1));

        List<String> hayvanlarliste = Arrays.asList(hayvanlar);
        System.out.println("hayvanlarliste = " + hayvanlarliste);


    }
}
