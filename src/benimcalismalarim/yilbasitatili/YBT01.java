package benimcalismalarim.yilbasitatili;

import java.util.Scanner;


public class YBT01 {
    public static void main(String[] args) {
    /*

1. AUTOBOXING (PRIMITIVE → WRAPPER)
Primitive türlerden Wrapper sınıflarına otomatik dönüşüm.

Örnek 1:
int yas = 12;
Integer yasWrapper = yas; // Autoboxing


Alternatif: valueOf() ile
Integer yasWrapper2 = Integer.valueOf(12); // valueOf() ile dönüşüm

2. UNBOXING (WRAPPER → PRIMITIVE)
Wrapper sınıfından primitive türüne dönüşüm.

Örnek 1:

Integer yasWrapper = 15;
int yas = yasWrapper; // Unboxing

Alternatif: intValue() ile
int yas2 = yasWrapper.intValue(); // intValue() ile dönüşüm

3. WIDENING (KÜÇÜK TÜRLER → BÜYÜK TÜRLER)
Küçük türden büyük türe otomatik dönüşüm, veri kaybı olmaz.

Örnek:

byte yasByte = 10;
double yasDouble = yasByte; // Widening

4. NARROWING (BÜYÜK TÜRLER → KÜÇÜK TÜRLER)
Büyük türden küçük türe dönüşüm, veri kaybı olabilir, explicit cast gereklidir.

Örnek:

double yasDouble = 10.5;
byte yasByte = (byte) yasDouble; // Narrowing

ÖZET:
Autoboxing (Primitive → Wrapper): Primitive tür → Wrapper
-->(Örnek: int yas = 12; Integer yasWrapper = yas;)
Unboxing (Wrapper → Primitive): Wrapper → Primitive
-->(Örnek: Integer yasWrapper = 15; int yas = yasWrapper;)
Widening (Küçük Tür → Büyük Tür): Küçük tür → Büyük tür
-->(Örnek: byte yasByte = 10; double yasDouble = yasByte;)
Narrowing (Büyük Tür → Küçük Tür): Büyük tür → Küçük tür, explicit cast ile
-->(Örnek: double yasDouble = 10.5; byte yasByte = (byte) yasDouble;)

 */
        //Task 01: int türündeki bir değeri Integer türüne dönüştürün ve ardından geri int türüne çevirin.
        int yas1 = 40;
        Integer sayi1Wrapper = Integer.valueOf(yas1); //Autoboxing
        System.out.println("1. Yol = " + sayi1Wrapper);

        Integer sayi1Wrapper1 = yas1; //Autoboxing
        System.out.println("2. Yol = " + sayi1Wrapper1);

        int yas1Primitiv = sayi1Wrapper1;
        System.out.println("1. Yol = " + yas1Primitiv); //Unboxing

        int yas1Primitiv1 = sayi1Wrapper1.intValue(); //Unboxing
        System.out.println("2. Yol = " + yas1Primitiv1);

       //Task 02: double türündeki bir değeri int türüne dönüştürün, ardından byte türüne çevirin.
        double not1 = 3.5;
        int not1Int = (int)not1; //Narrowing
        System.out.println("Narrowing Double-Int = " + not1Int);

        byte not1Byte = (byte) not1Int; //Narrowing
        System.out.println("Narrowing Int-Byte = " + not1Byte);

        //Task 03: float türündeki bir değeri double türüne dönüştürün ve ardından float türüne geri dönüştürün.
        float id1 = 12345678;
        double id1Double = (double) id1; //Widening
        System.out.println("Widening Float/Double = " + id1Double);

        float id1Float = (float) id1Double; //Narrowing
        System.out.println("Narrowing Double/Float = " + id1Float);

        //Task 04: long türündeki bir değeri short türüne dönüştürün.
        long numara = 24681;
        short numaraShort = (short)numara; //Narrowing
        System.out.println("Narrowing Long/Short = " + numaraShort);

        //Task 05: byte türündeki bir değeri double türüne dönüştürün ve sonra byte türüne geri çevirin.
        byte yas2 = 30;
        double yas2Double = (double)yas2; //Widening
        System.out.println("Widening Byte/Double = " + yas2Double);

        byte yas2Byte = (byte) yas2Double; //Narrowing
        System.out.println("Narrowing Double/Byte = " + yas2Byte);

        //Task 06: Integer türündeki bir değeri double türüne dönüştürün, ardından tekrar int türüne çevirin.
        Integer fiyat = 8;
        double fiyatDouble = fiyat.doubleValue(); //Unboxing
        System.out.println("Unboxing Integer/Double  = " + fiyatDouble);

        int fiyatInt = (int) fiyatDouble; //Narrowing
        System.out.println("Narrowing Double/Int = " + fiyatInt);

        //Task 07: short türündeki bir değeri long türüne dönüştürün.
        short age = 12;
        long ageLong = (long) age;
        System.out.println("Widening Short/Long = " + ageLong); //Widening

       //Task 08: float türündeki bir değeri önce Integer türüne, sonra double türüne dönüştürün.
        float id2 = 135791F;
        Integer id2Integer = Integer.valueOf((int) id2); //Autoboxing;
        System.out.println("Autoboxing  = " + id2Integer);

        double id2double = id2Integer.doubleValue(); //Unboxing
        double id2double1 = id2Integer;
        System.out.println("id2double1 = " + id2double1);
        System.out.println("Unboxing = " + id2double);

        //Task 09: char türündeki bir değeri int türüne dönüştürün.
        char ilkHarf = 'A';
        int ilkHarfInt = (int) ilkHarf; //Widening
        System.out.println("Char integer'a dönüstü = " + ilkHarfInt);

        //Task 10: int türündeki bir değeri önce Byte türüne, sonra short türüne dönüştürün.
        int sayi3 = 8;
        Byte sayi3Byte = Byte.valueOf((byte) sayi3); //Autoboxing
        System.out.println("sayi3Byte = " + sayi3Byte);

        short sayi3Short = sayi3Byte.shortValue(); //Unboxing
        System.out.println("sayi3Short = " + sayi3Short);

        //Task 11: double türündeki bir değeri önce long türüne, sonra int türüne çevirin.
        double fiyat4 = 120.35;
        long fiyat4Long = (long) fiyat4; //Narrowing
        System.out.println("Long türünde = " + fiyat4Long);

        int fiyat4Int = (int) fiyat4Long; //Narrowing
        System.out.println("Integer'a cevrildi = " + fiyat4Int);

          //Task 12: long türündeki bir değeri double türüne dönüştürün, ardından long türüne geri çevirin.

                //Task 13: char türündeki bir değeri önce int türüne, sonra byte türüne dönüştürün.

                //Task 14: Integer türündeki bir değeri önce float türüne, sonra short türüne çevirin.

                //Task 15: double türündeki bir değeri önce byte türüne, sonra long türüne dönüştürün.

        // soru 1) iki float sayıyı birbirine bölünüz sonucu yazdırınız.
        float domatesFiyati = 2.59F;
        float salatalikFiyati = 0.89F;
        float sonuc = domatesFiyati/salatalikFiyati;
        System.out.println("Float sonucu =" +sonuc);

        // soru 2) kenar uzunluğu 5 olan bir karenin cevresini ve alanını hesaplayınız
        double uzunKenar = 6;
        double kisaKenar = 3;
        double sonuc1 = uzunKenar*kisaKenar;
        System.out.println("Alan = "+sonuc1);

        // soru 3) Ahmet ve Mehmet isimlerini birleşik olarak yazdırınız
        String isim1 = "Ahmet";
        String isim2 = "Mehmet";
        System.out.println(isim1+"\n"+isim2);










    }
}