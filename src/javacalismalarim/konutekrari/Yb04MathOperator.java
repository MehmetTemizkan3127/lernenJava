package javacalismalarim.konutekrari;

public class Yb04MathOperator {
    public static void main(String[] args) {
        int sayi = 2468;
        System.out.println("sayi    = " + sayi);
        System.out.println("Birler  = " + sayi % 10);
        System.out.println("Onlar   = " + (sayi / 10) % 10);
        System.out.println("Yüzler  = " + (sayi / 100) % 10);
        System.out.println("Binler  = " + (sayi / 1000) % 10);

        //INCREMENT
        int x = 5;
        System.out.println("x = " + (x++)); // Önce x'in mevcut değeri yazdırılır (5), sonra x 1 artırılır.
        System.out.println("x = " + x);


        int a = 5;
        System.out.println("a = " + (++a)); // İlk olarak a 1 artırılır (a = 6), sonra yeni değeri yazdırılır.
        System.out.println("a = " + (a));

        //DECREMENT
        int y = 5;
        System.out.println("y = "+(y--)); // Önce y'in mevcut değeri yazdırılır (5), sonra y 1 azaltılır.
        System.out.println("y = "+(y));   // y şimdi 4 oldu.

        int b = 5;
        System.out.println("b = "+(--b)); // İlk olarak b 1 azaltılır (b = 4), sonra yeni değeri yazdırılır.
        System.out.println("b = " + (b));

        //MathOperator
        System.out.println("Mutlak Deger = " + Math.abs(-2));
        System.out.println("Mutlak Deger = " + Math.abs(2));

        System.out.println("En Büyük Deger = " + Math.max(2, -6));
        System.out.println("En Büyük Deger = " + Math.max(-2, -6));

        System.out.println("En Kücük Deger = " + Math.min(2, 6));
        System.out.println("En Kücük Deger = " + Math.min(-2, -1));

        System.out.println("Yuvarlama asagi Deger = " + Math.round(2.4));
        System.out.println("Yuvarlama yukari Deger = " + Math.round(1.5));

        System.out.println("Asagi en yakin tam sayi Deger = " + Math.floor(2.9));

        System.out.println("Yukari en yakin tam sayi Deger = " + Math.ceil(1.1));

        System.out.println("Kare kök Bulma = " + Math.sqrt(4));

        System.out.println("Üs bulma = " + Math.pow(4, 2));








    }
}
