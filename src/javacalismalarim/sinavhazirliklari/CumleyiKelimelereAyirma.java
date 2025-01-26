package javacalismalarim.sinavhazirliklari;

import java.util.Arrays;

public class CumleyiKelimelereAyirma {
    public static void main(String[] args) {
        /*String cumle = "Bugün hava cok güzel ve güneslidir 1500$ buldum.";
        System.out.println("silindi mi = " +cumle.replace("$", " TL"));
        System.out.println(cumle.replace("güneslidir.", "güneslidir!"));
        System.out.println(cumle.substring(0,15).replace("",""));
        String[] arrKelimeler = cumle.split(" ");
        String kelimeler = "";

        for (int i = 0; i < arrKelimeler.length; i++) {
            kelimeler += arrKelimeler[i];


            if (i < arrKelimeler.length - 1) {
                kelimeler += ", ";
            }
        }


        System.out.println("kelimeler = " + kelimeler);
        */
        int sayi = 8;
        int faktöriyel = 1;
        for (int i = 1; i <= sayi; i++){
        faktöriyel *= i;
        }

        System.out.println("faktöriyel = " + faktöriyel);

    }
}
