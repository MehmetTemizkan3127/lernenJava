package benimcalismalarim.Mentoring.ikincibölüm;

public class M_1027_17_StringIntegerKarsilastirmasi {
    public static void main(String[] args) {
       /*
        // Task ) Aşağıdaki çıktıları alalım. Sonuçları değerlendirelim.
        // String isim = "Hayriye";
        // int  num = 5;

        isim + num  ??          Hayriye5
        num + isim  ??          5Hayriye
        isim + isim ??          HayriyeHayriye
        num + num   ??          10
        isim + num + num ??     Hayriye55
        isim + (num + num) ??   Hayriye10

        */

        String isim = "Hayriye";
        int  num = 5;

        System.out.println(isim + num);  // Hayriye5
        System.out.println(num + isim);  // 5Hayriye
        System.out.println( isim + isim); // HayriyeHayriye
        System.out.println(num + num);  //10
        System.out.println( isim + num + num); // Hayriye55
        System.out.println( isim + (num + num)); // Hayriye10


        /*
        // Task ) String name = "Jane";
        //        String nameFive = "5" ;
        //        int sayi   = 8;
        //        char ch = 's';
        //  Bu işlemleri yazdıralım. Sonuçları inceleyelim
        //  name + nameFive ??  Jane5
        //  nameFive + sayi ??  58
        //  sayi + name ??      8Jane
        //  sayi + sayi ??      16
        //  ch + sayi  ??      123
        //  ch + nameFive ??   s5
        */

        System.out.println();
        System.out.println();
        String name = "Jane";
        String nameFive = "5";
        int sayi   = 8;
        char ch = 's';   // s --> ASCII değeri 115

        System.out.println(name + nameFive);  //    Jane5
        System.out.println( nameFive + sayi); //    58
        System.out.println(sayi + name);   //       8Jane
        System.out.println(sayi + sayi);  //        16
        System.out.println(ch + sayi);   //         123
        System.out.println(ch + nameFive);  //      s5
        System.out.println(ch + ch); //             230
        System.out.println(sayi + sayi + ch);  //   131
        System.out.println(ch + sayi + sayi);  //   131
        System.out.println((ch + sayi) + name);  // 123Jane
        System.out.println(name + (ch + sayi));  // Jane123
        System.out.println(name + ch + sayi);  //   Janes8








    }
}
