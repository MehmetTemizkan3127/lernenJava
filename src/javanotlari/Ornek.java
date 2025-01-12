package javanotlari;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Ornek {
    public static void main(String[] args) {

        //String'in StringBuilder'a ve sonra tekrar String'e cevrilmesi
        String meyve = "Kiraz";
        System.out.println("String yazdiriliyor                         = " + meyve);

        StringBuilder sb = new StringBuilder(meyve); //String StringBuilder'a cevrildi
        System.out.println("String StringBuilder'a cevrildi             = " + sb);
        sb.append(", Karpuz"); //append kullanildi
        System.out.println("StringBuilder ekleme sonrasi yazdiriliyor   = " + sb);

        String str = sb.toString(); //StringBuilder Stringe cevrildi
        System.out.println("StringBuilder Stringe cevrildi              = " + str);



        System.out.println();
        //Array'in StringBuilder'a ve sonra tekrar String'e cevrilmesi
        String[] meyveler = new String[3];
        meyveler[0] = "Seftali";
        meyveler[1] = "Incir";
        meyveler[2] = "Portakal";
        System.out.println("Array yazdiriliyor                          = " + Arrays.toString(meyveler));

        String sonuc = String.join(", ", meyveler);
        // StringBuilder'a aktar
        StringBuilder sb1 = new StringBuilder(sonuc);
        System.out.println("Array StringBuilder'a cevrildi              = " + sb1); //Array StringBuilder'a cevrildi

        sb1.append(", Mandalina" + ", Muz");
        System.out.println("StringBuilder ekleme sonrasi yazdiriliyor   = " + sb1);

        String str1 = sb1.toString();
        System.out.println("StringBuilder Stringe cevrildi              = " + str1);



        System.out.println();
        //List'in StringBuilder'a ve sonra tekrar String'e cevrilmesi
        List<String> meyveList = new ArrayList<>();
        meyveList.add("Üzüm");
        meyveList.add("Salatalik");
        meyveList.addAll(Arrays.asList("Yeni Dünya", "Yaban Mersini"));
        System.out.println("List yazdiriliyor                           = " + meyveList);

        String sonuc1 = String.join(", ", meyveList);
        // StringBuilder'a aktar
        StringBuilder sb2 = new StringBuilder(sonuc1);
        System.out.println("List StringBuilder'a cevrildi               = " + sb2); //List StringBuilder'a cevrildi
        sb2.append(", Erik"+", Kayisi");
        System.out.println("StringBuilder ekleme sonrasi yazdiriliyor   = " + sb2);

        String str2 = sb2.toString();
        System.out.println("StringBuilder Stringe cevrildi              = " + str2);

        String[] arrayString = str2.split(" ");  // Elemanları boşlukla ayır
        for (String s : arrayString) {
            System.out.print(s);
        }






    }
}
