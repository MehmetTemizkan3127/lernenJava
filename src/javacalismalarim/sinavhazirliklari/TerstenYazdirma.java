package javacalismalarim.sinavhazirliklari;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TerstenYazdirma {
    public static void main(String[] args) {
        /*
        //1.Yol Stringi tersten yazdirma
        String isim = "Saadettin";
        String tersIsim = "";

        for (int i = isim.length()-1; i >= 0; i--){
            tersIsim += isim.charAt(i);
        }
        System.out.println("tersIsim = " + tersIsim);

        StringBuilder sb = new StringBuilder(isim);
        System.out.println("sb.reverse() = " + sb.reverse());

        //1.Yol String sayiyi tersten yazdirma
        String sayi = "654321";
        String tersSayi = "";
        for (int i = sayi.length()-1; i >= 0; i--){
            tersSayi += sayi.charAt(i);
        }
        System.out.println("tersSayi = " + tersSayi);

        StringBuilder sb1 = new StringBuilder(sayi);
        System.out.println("sb.reverse() = " + sb1.reverse());
*/
        String sayilar = "60, 50, 40, 30, 20, 10";
        System.out.println("String sayilar = " + sayilar);
        String [] sayiArray = sayilar.split(", ");

        for (int i = sayiArray.length -1; i >= 0; i--){

        }
        System.out.println(Arrays.toString(sayiArray));

        List<String> sayiList = Arrays.asList(sayiArray);
       List<String> numbers = sayiList.reversed();

        System.out.print("Sayilar tersten yazildi = ");
        for (String sayi : numbers){
            System.out.print(sayi+" ");
        }

    }
}
