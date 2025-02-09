package javacalismalarim.konutekrari;

public class Yb14Varargs {
    public static void main(String[] args) {
        System.out.println("Sayilarin toplami       = "+sayiTopla(+5, 3, 4, 6, 9, 5));

        System.out.println("Sayilarin Carpimi       = "+sayiCarp(2, 3, 4, 2));

    }

    public static int sayiTopla(int ... sayilar){
        System.out.println();
        int toplam = 0;
        for (int sayi : sayilar){
            toplam += sayi;
        }return toplam;
    }
    public static int sayiCarp(int ... sayilar){
        System.out.println();
        int toplam = 1;
        for (int sayi : sayilar){
            toplam *= sayi;
        }return toplam;
    }




}
