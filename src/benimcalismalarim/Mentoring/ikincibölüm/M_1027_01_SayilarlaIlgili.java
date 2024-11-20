package benimcalismalarim.Mentoring.ikincibölüm;

public class M_1027_01_SayilarlaIlgili {
    public static void main(String[] args) {

        // Task1) Iki sayinin toplamini yazdiran sayiyi yazdiriniz.
        int num1 = 6;
        int num2 = 8;
        int toplam = (num1 + num2);
        System.out.println("Toplam =" + toplam);

        //Task2) Iki sayinin carpimini herhangi bir degiskene atamadan yazdiriniz.

        int num3 = 12;
        int num4 = 4;
        System.out.println("carpim : " + (num3 * num4));


        // Task3) Üc doble sayinin carpimini yazdiriniz.

        double a = 2.5;
        double b = 7.1;
        double c = 5.8;
        System.out.println("carpim : " + (a * b * c));


        // Task4) iki float sayıyı birbirine bölünüz sonucu yazdırınız.
        float sayi1 = 10.5f;
        float sayi2 = 2.5f;
        float sonuc = sayi1 / sayi2;
        System.out.println("Sonuc : " + sonuc);


        // Task5) kenar uzunluğu 5 olan bir karenin cevresini ve alanını hesaplayınız.
        int kenar = 5;
        int cevre = kenar * 4;
        int alan = kenar * kenar;
        System.out.println("cevre = " + cevre);
        System.out.println("alan = " + alan);


        // Task6) Ahmet ve Mehmet isimlerini birleşik olarak yazdırınız.
        String name1 = "Ahmet";
        String name2 = "Mehmet";
        System.out.println(name1 + name2);


        // Task7) pi= 3.14 ve yarıçapı 5 olan dairenin alanını ve cevresini hesaplayınız.
        double pi = 3.14;
        int yariCap = 5;
        System.out.println("cevre : " + (2 * pi * yariCap));
        System.out.println("alan : " + (pi * yariCap * yariCap));


        // Task8)  15 ve 19 yaşlarındaki 2 kardesin yaş farkını hesaplayınız.
        int yas1 = 15;
        int yas2 = 19;
        int yasFarki = yas2 - yas1;
        System.out.println("Iki kardes arasindaki yas farki : " + yasFarki);


        // Task9)  x=10 ve y=15 sayılarını boolean olarak karşılaştırınız . x, y den buyuk mü yazdırınız.
        int x = 10;
        int y = 15;
        boolean xysonuc = x > y;
        System.out.println("x y'den büyük mü? " + xysonuc);


        // Task10) 3 tam sayının ortalamasını bulunuz.
        System.out.println("number1 ve number2 ve number3'ü giriniz");
        int number1 = 25;
        int number2 = 41;
        int number3 = 50;
        double ortalama = (num1+num2+ number3)/3;
        System.out.println("Ortalama =" + ortalama);

    }
}

