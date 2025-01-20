package javacalismalarim.javanotlarim;

public class Varargslar {
    public static void main(String[] args) {
        int asalSayi = sayiTopla(10, 2, 3);
        System.out.println(asalSayi);


        System.out.println(carp(2, 5, 4, 10));

    }

     private static int sayiTopla(int... sayilar) {
        int toplam = 0;
        for (int sayi : sayilar) {
            toplam += sayi;
        }
        return toplam;

    }

   public static int carp(int... sayilar){
        int toplam = 1;
        for (int sayi : sayilar){
            toplam *= sayi;
        }
        return toplam;
    }
}
