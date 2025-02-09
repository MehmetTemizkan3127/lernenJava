package javacalismalarim.interviewler;

import java.util.ArrayList;

public class Interview01 {
    public static void main(String[] args) {

        int sayi = 10;
        double fiyat = 3.7;
        short not = 5;


        Integer yas = 28;
        String name = "Mehmet";
        Double fiyat1 = 4.5;

        ArrayList <String> ogrenciler = new ArrayList<>();
        ogrenciler.add("Mehmet");
        ogrenciler.add("Salih");
        ogrenciler.add("Ayse");
        ogrenciler.add("Fatma");

        System.out.print("Ogrenci Listesi = ");
        for (String ogrenci : ogrenciler){
            System.out.print(ogrenci+ " ");
        }

    }
}
