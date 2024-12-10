package benimcalismalarim;

public class VarargsKaralamalari {
    public static int topla(int... sayilar) {
        int toplam = 0;
        for (int sayi : sayilar) {
            toplam += sayi;

        }
        return toplam;

    }

    public static double ortalamaBul(double... sayilar) {
        if (sayilar.length == 0) {
            return 0.0;
        }

        double toplam = 0;
        for (double sayi : sayilar) {
            toplam += sayi;
        }
        return toplam / sayilar.length;
    }

    public static int carpimiBul(int... sayilar) {
        if (sayilar.length == 0) {

            return 1;
        }
        int carpim = 1;
        for (int sayi : sayilar) {
            carpim *= sayi;
        }
        return carpim;
    }

    public static double sayiyiBol(double... sayilar) {
        if (sayilar.length < 2) {
            return 0.0;
        }
        double bolum = sayilar[0];
        for (int i = 1; i < sayilar.length; i++) {
            bolum /= sayilar[i];

        }
        return bolum;
    }

    public static void main(String[] args) {
        System.out.println(topla(10, 20, 40, 30));
        System.out.println(topla(8, 2));
        System.out.println(topla());

        System.out.println(ortalamaBul(10, 20, 40, 8, 2));
        System.out.println(ortalamaBul());

        System.out.println(carpimiBul(2, 8, 5));
        System.out.println(carpimiBul());

        System.out.println(sayiyiBol(100, 2));
        System.out.println(sayiyiBol());


    }
}
