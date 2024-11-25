package benimcalismalarim.Mentoring.arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class Task02 {
    public static void main(String[] args) {
        /*ArrayList'i Doğrudan Başlatma (Arrays.asList)*/
        // Soru 2 : "Ali , Veli ,Hasan " isimli öğrencilerden oluşan ogrenciler2 isimli bir ArrayList oluşturunuz.
        // Ve bu listeyi yazdırınız
        ArrayList<String> ogrenciler2 = new ArrayList<>(Arrays.asList("Ali, Veli, Hasan"));
        System.out.println("ogrenciler2 = " + ogrenciler2);



    }
}
