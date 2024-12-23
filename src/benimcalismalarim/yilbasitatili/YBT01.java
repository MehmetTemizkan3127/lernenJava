package benimcalismalarim.yilbasitatili;

import java.util.Scanner;


public class YBT01 {
    public static void main(String[] args) {
    /*1- WRAPPER CLASS

    Scanner scan = new Scanner(System.in);
        /*System.out.println("**************Autobox**************");
        // 1- Bir int değeri tanımlayın ve bu değeri bir Integer nesnesine autobox edin.
        int num1 = 5;
        Integer sayi1Integer = Integer.valueOf(num1);
        System.out.println("Integer Autobox = " + sayi1Integer);

        //2- Bir float değeri tanımlayın ve bu değeri bir Float nesnesine autobox edin.
        float num2 = 100000000F;
        Float num2Float = Float.valueOf(num2);
        System.out.println("Float Autobox   = " + num2Float);

        //3- Bir boolean değeri tanımlayın ve bu değeri bir Boolean nesnesine autobox edin.
        boolean cinsiyetErkek = true;
        Boolean cinsiyetErkekBoolean = Boolean.valueOf(cinsiyetErkek);
        System.out.println("Boolean Autobox = " + cinsiyetErkekBoolean);

        //4- Bir short değeri tanımlayın ve bu değeri bir Short nesnesine autobox edin.
        short age = 20;
        Short yasShort = Short.valueOf(age);
        System.out.println("Short Autobox   = " + yasShort);

        //5- Bir double değeri tanımlayın ve bu değeri bir Double nesnesine autobox edin.
        double grade = 3.5;
        Double gradeDouble = Double.valueOf(grade);
        System.out.println("Double Autobox  = " + gradeDouble);

        System.out.println();
        System.out.println("**************Unbox**************");

        //1- Bir Integer nesnesi tanımlayın ve bu nesneyi bir int primitive değişkene unbox edin.
        Integer num3 = 8;
        int num3Int = num3.intValue();
        System.out.println("Int Unbox       = " + num3Int);

        //2- Bir Character nesnesi tanımlayın ve bu nesneyi bir char primitive değişkene unbox edin.
        Character ilkHarf = 65;
        char ilkHarfChar = ilkHarf.charValue();
        System.out.println("Char Unbox      = " + ilkHarfChar);

        //3- Bir Double nesnesi tanımlayın ve bu nesneyi bir double primitive değişkene unbox edin.
        Double grade1 = 2.5;
        double grade1Double = grade1.doubleValue();
        System.out.println("Double Unbox    = " + grade1Double);

        //4- Bir Boolean nesnesi tanımlayın ve bu nesneyi bir boolean primitive değişkene unbox edin.
        Boolean evliMi = true;
        boolean evliMiBoolean = evliMi.booleanValue();
        System.out.println("Boolean Unbox   = " + evliMiBoolean);

        //5- Bir Long nesnesi tanımlayın ve bu nesneyi bir long primitive değişkene unbox edin.
        Long id = 10000L;
        long idLong =id.longValue();
        System.out.println("Long Unbox      = " + idLong);
        */

        //02- CASTING

        //01- int türündeki bir değeri long türüne nasıl dönüştürürsünüz?
        int yas = 15;
        long longYasWiCa = (long)yas;
        System.out.println("longYasWiCa = " + longYasWiCa);

        //02- double türündeki bir değeri int türüne nasıl dönüştürürsünüz?
        double not = 3.5;
        int intNotNaCa = (int)not;
        System.out.println("intNotNaCa = " + intNotNaCa);

        //03- short türündeki bir değeri float türüne nasıl dönüştürürsünüz?
        short num1 = 3;
        float floatNum1WiCa = (float)num1;
        System.out.println("floatNum1WiCa = " + floatNum1WiCa);

        //04- float türündeki bir değeri byte türüne nasıl dönüştürürsünüz?
        float idNo = -180;
        byte byteIdNoNaCa = (byte)idNo; // --> Cok sacma bir sayi yazdirdi
        System.out.println("byteIdNoNaCa = " + byteIdNoNaCa);

        //05- byte türündeki bir değeri double türüne nasıl dönüştürürsünüz?
        byte preis = 3;
        double doublePreisWiCa = (double)preis;
        System.out.println("doublePreisWiCa = " + doublePreisWiCa);

        //06- long türündeki bir değeri short türüne nasıl dönüştürürsünüz?
        long sayac = 2468;
        short shortSayacNaCa = (short)sayac;
        System.out.println("shortSayacNaCa = " + shortSayacNaCa);

        //07- char türündeki bir değeri int türüne nasıl dönüştürürsünüz?
        char ilkHarf = 65;
        int intIlkHarf = (int)ilkHarf;
        System.out.println("intIlkHarf = " + intIlkHarf);

        //08- double türündeki bir değeri float türüne nasıl dönüştürürsünüz?
        double fiyat = 4.5;
        float floatFiyat = (float)fiyat;
        System.out.println("floatFiyat = " + floatFiyat);

        //09- int türündeki bir değeri double türüne nasıl dönüştürürsünüz?
        int not2 = 6;
        double doubleNot2 = (double)not2;
        System.out.println("doubleNot2 = " + doubleNot2);

        //10- double türündeki bir değeri byte türüne nasıl dönüştürürsünüz?
        double not3 = 5.5;
        byte byteNot3 = (byte)not3;
        System.out.println("byteNot3 = " + byteNot3);

        //1. Double → byte (Narrowing + Unboxing)
        //Soru: Double türündeki bir değeri önce primitive double türüne, ardından byte türüne nasıl dönüştürürsünüz?

        //2. int → Float (Widening + Autoboxing)
        //Soru: int türündeki bir değeri önce primitive float türüne, ardından Float nesnesine nasıl dönüştürürsünüz?

        //3. Byte → long (Widening + Unboxing)
        //Soru: Byte türündeki bir nesneyi önce primitive byte türüne, ardından long türüne nasıl dönüştürürsünüz?

        //4. float → Integer (Narrowing + Autoboxing)
        //Soru: float türündeki bir değeri önce int türüne, ardından Integer nesnesine nasıl dönüştürürsünüz?

        //5. short → Double (Widening)
        //Soru: short türündeki bir değeri doğrudan double türüne nasıl dönüştürürsünüz?

        //6. Long → int (Narrowing + Unboxing)
        //Soru: Long türündeki bir nesneyi önce primitive long türüne, ardından int türüne nasıl dönüştürürsünüz?

        //7. char → Integer (Widening + Autoboxing)
        //Soru: char türündeki bir değeri önce primitive int türüne, ardından Integer nesnesine nasıl dönüştürürsünüz?

        //8. double → Float (Narrowing + Autoboxing)
        //Soru: double türündeki bir değeri önce float türüne, ardından Float nesnesine nasıl dönüştürürsünüz?

        //9. Integer → float (Unboxing + Widening)
        //Soru: Integer türündeki bir nesneyi önce primitive int türüne, ardından float türüne nasıl dönüştürürsünüz?

        //10. long → Short (Narrowing + Autoboxing)
        //Soru: long türündeki bir değeri önce short türüne, ardından Short nesnesine nasıl dönüştürürsünüz?








    }
}