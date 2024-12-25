package benimcalismalarim.yilbasitatili;


public class WrapperClassTypeCasting {
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
      /*  //Task 01: int türündeki bir değeri Integer türüne dönüştürün ve ardından geri int türüne çevirin.
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
        int not1Int = (int) not1; //Narrowing
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
        short numaraShort = (short) numara; //Narrowing
        System.out.println("Narrowing Long/Short = " + numaraShort);

        //Task 05: byte türündeki bir değeri double türüne dönüştürün ve sonra byte türüne geri çevirin.
        byte yas2 = 30;
        double yas2Double = (double) yas2; //Widening
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
        long etiketNo = 9876543;
        double etiketNoDouble = (double) etiketNo; //Widening
        System.out.println("Double türüne cevrildi = " + etiketNoDouble);

        long etiketNoLong = (long) etiketNoDouble; //Narrowing
        System.out.println("Long türüne cevrildi = " + etiketNoLong);

        //Task 13: char türündeki bir değeri önce int türüne, sonra byte türüne dönüştürün.
        char ikinciHarf = 'B';
        int ikinciHarfInt = (int) ikinciHarf; //Widening
        System.out.println("Int degerine cevrildi = " + ikinciHarfInt);

        byte ikinciHarfByte = (byte) ikinciHarfInt; //Narrowing
        System.out.println("Byte türüne cevrildi = " + ikinciHarfByte);

        //Task 14: Integer türündeki bir değeri önce float türüne, sonra short türüne çevirin.
        Integer studentNo = 85;
        float studentNoFloat = studentNo.floatValue(); //Unboxing ve Widening
        System.out.println("Float'a Unboxing ve weidining yapilarak cevrildi = " + studentNoFloat);

        short studentNoShort = (short) studentNoFloat; //Narrowing
        System.out.println("Float'tan short türüne cevrildi = " + studentNoShort);

        // Task 15: double türündeki bir değeri önce byte türüne, sonra long türüne dönüştürün.
        double fiyat5 = 6.556;
        byte fiyat5Byte = (byte) fiyat5; //Narrowing
        System.out.println("Double'den byte türüne narrowing yapilarak cevrildi = " + fiyat5Byte);

        long fiyat5Long = (long) fiyat5Byte; //Widening
        System.out.println("Byte'tan long türüne widening yapildi = " + fiyat5Long);

        // soru 1) iki float sayıyı birbirine bölünüz sonucu yazdırınız.
        float domatesFiyati = 2.59F;
        float salatalikFiyati = 0.89F;
        float sonuc = domatesFiyati / salatalikFiyati;
        System.out.println("Float sonucu =" + sonuc);

        // soru 2) kenar uzunluğu 5 olan bir karenin cevresini ve alanını hesaplayınız
        double uzunKenar = 6;
        double kisaKenar = 3;
        double sonuc1 = uzunKenar * kisaKenar;
        System.out.println("Alan = " + sonuc1);

        // soru 3) Ahmet ve Mehmet isimlerini birleşik olarak yazdırınız
        String isim1 = "Ahmet";
        String isim2 = "Mehmet";
        System.out.println(isim1 + "\n" + isim2);

        double1 ve double2 isimli iki tane double oluşturulmuştur.
        Eğer double1, double2'dan büyük ise "double 1 is greater than double 2" yazdırınız.
        Eğer double1, double2'dan küçük ise "double 1 is smaller than double 2" yazdırınız.
        double kenar1 = 7.3;
        double kenar2 = 4.5;
        if (kenar1 > kenar2) {
            System.out.println("double 1 is greater than double 2");
        } else System.out.println("double 1 is smaller than double 2");
        */

        /*Senaryo:
        Bir mağazada indirim gününde yapılan satışlarla ilgili bilgi almak istiyorsunuz.
        Fiyat bilgisi ondalıklı olarak tutulurken, müşteriye sade bir bilgilendirme amacıyla fiyatları
        tam sayı olarak göstermek istiyorsunuz. Mağazadaki bir ürüne ait fiyat bilgisi var ve
        bu fiyat, indirim sonrası hesaplanmış. Bu fiyatı ondalıklı olarak gösteren bir veriyi alıp tam sayı olarak gösterin.
        Soru:
        Bir ürünün indirimsiz fiyatı 120.75 TL. Ürüne %25 indirim yapıldıktan sonra
        müşteriye tam sayı olarak indirimli fiyat gösterilecektir.
        Bu fiyatı double tipinden int tipine dönüştürerek gösteren bir program yazın.
        */

        double indirimsizFiyat = 120.75;
        int indirimOrani = 25;
        double indirimliFiyat = indirimsizFiyat - (indirimsizFiyat * 0.25);
        int güncelFiyat = (int) indirimliFiyat;
        System.out.println("Indirimli Fiyat = " + güncelFiyat + " TL");

        /*  Task->
        Kullanıcıdan a,b ve c sayılarını okuyarak aşağıdaki işlemi yapan kodu yazınız
        a'nın karesinden b'nin karesini cikarip c nin 3 katina bolunuz. Cıkan sonucu
        tam sayı olarak yazdırınız

        Örnek Ekran Çıktısı
        a sayısını giriniz: 5
        b sayısını giriniz: 3
        c sayısını giriniz: 1
        sonuç : 5.333333333333333
        */
        int a = 5;
        int b = 3;
        int c = 1;

        double sonuc = (double) (a * a - b * b) / (c * 3);
        System.out.println("sonuc = " + sonuc);

        int sonucTamsayi = (int) sonuc;
        System.out.println("sonucTamsayi = " + sonucTamsayi);

        /* Task 2)
        90.25 ve 90.25 değerinde iki double oluşturun.
        Eğer ilk double, ikinci double'dan büyükse  "Hello World" yazdırın.
        Eğer ilk double, ikinci double'dan küçükse "Not Hello World" yazdırın.
        Aksi halde (else) "I love java" yazdırın. */

        double sayi1 = 90.25;
        double sayi2 = 90.25;
        if (sayi1 > sayi2) {
            System.out.println("Hello World");
        } else if (sayi1 < sayi2) {
            System.out.println("Not Hello World");
        } else {
            System.out.println("I love java");
        }

        /*Task 3)
        Altta int number klavyeden girilerek oluşturulmuştur.
        Eğer, int number ikiye bölündüğünde geri kalanı 0'a eşit ise "number is a EVEN number" yazdırın.
        Eğer, int number ikiye bölündüğünde geri kalanı 0'a eşit değil ise "number is a ODD number" yazdırın.
        */
        int num1 = 8;
        if (num1 % 2 == 0) {
            System.out.println("number is a EVEN number");
        } else {
            System.out.println("number is a ODD number");
        }

        /* Task 4)
        33 değerinde bir int oluşturun.
        Eğer, 33'ü 4'e böldüğünüzde kalan 3'e eşit ise "Remainder is 3" yazdırınız.
        Eğer, 33'ü 4'e böldüğünüzde kalan 2'e eşit ise "Remainder is 2" yazdırınız.
        Eğer, 33'ü 4'e böldüğünüzde kalan 1'e eşit ise "Remainder is 1" yazdırınız.
        Aksi halde (else) "Reminder is 0" yazdırınız.  */

        int num = 33;
        if (num % 4 == 3) {
            System.out.println("Remainder is 3");
        } else if (num % 4 == 2) {
            System.out.println("Remainder is 2");
        } else if (num % 4 == 1) {
            System.out.println("Remainder is 1");
        } else {
            System.out.println("Reminder is 0");
        }


    }
}