package javacalismalarim.konutekrari.sinavhazirliklari;

import java.util.Arrays;
import java.util.Collections;

public class SayilariTerstenYazdirma {
    public static void main(String[] args) {
        int[] rakamlar = new int[]{60, 30, 10, 50, 40, 20};
       // rakamlar [5] = 40;
        System.out.println("Sort öncesi rakamlar = " +Arrays.toString(rakamlar));
       // System.out.println(rakamlar[5]);
       // System.out.println(Arrays.toString(Arrays.copyOf(rakamlar, 8)));

        Arrays.sort(rakamlar);
        System.out.println("Sort sonrasi rakamlar = " + Arrays.toString(rakamlar));

        //System.out.println("rakamlar = " + Arrays.toString(Arrays.copyOfRange(rakamlar,2,4)));

        //int index = Arrays.binarySearch(rakamlar,40);
        //System.out.println("rakamlar = " + index);

        //Arrays.fill(rakamlar,7);
        //System.out.println(Arrays.toString(rakamlar));

        Collections.reverse(Arrays.asList(rakamlar));
        System.out.println("Sayilar ters cevrildi arr icine = " +Arrays.toString(rakamlar));

        //if (rakam != 0) rakam.append(",");

        System.out.print("Sayilar ters cevrildi arr disina   = " );
        for (int rakam : rakamlar){
            System.out.print(rakam+ " ");
        }
        System.out.println();
        for (int i = 0; i < rakamlar.length; i++){
            System.out.print(rakamlar[i]);
            if (i < rakamlar.length-1){
                System.out.print(",");
            }
        }




    }
}
