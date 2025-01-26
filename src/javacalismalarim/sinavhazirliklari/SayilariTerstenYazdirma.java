package javacalismalarim.sinavhazirliklari;

import java.util.Arrays;
import java.util.Collections;

public class SayilariTerstenYazdirma {
    public static void main(String[] args) {
        int[] rakamlar = new int[]{60, 30, 10, 50, 40, 20};
        rakamlar [5] = 40;
        System.out.println(Arrays.toString(rakamlar));
        System.out.println(rakamlar[5]);
        System.out.println(Arrays.toString(Arrays.copyOf(rakamlar, 8)));

        Arrays.sort(rakamlar);
        System.out.println("rakamlar = " + Arrays.toString(rakamlar));

        System.out.println("rakamlar = " + Arrays.toString(Arrays.copyOfRange(rakamlar,2,4)));

        int index = Arrays.binarySearch(rakamlar,40);
        System.out.println("rakamlar = " + index);

        //Arrays.fill(rakamlar,7);
        //System.out.println(Arrays.toString(rakamlar));

        Collections.reverse(Arrays.asList(rakamlar));
        System.out.println(Arrays.toString(rakamlar));

        //if (rakam != 0) rakam.append(",");

        System.out.print("Rakamlar terse cevrildi = ");
        for (int rakam : rakamlar){
            System.out.print(rakam+ " ");
        }

    }
}
