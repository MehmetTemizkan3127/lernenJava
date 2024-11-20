package benimcalismalarim.Metodlar;

public class Met_Sayilari_Altalta_Yazdirma {
    public static void main(String[] args) {

        System.out.println("s1'den 10'a kadar olan sayilar (alt alta) : ");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.print("\s1'den 10'a kadar olan sayilar (yan yana) : ");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i);
        }
        System.out.println();

        System.out.print("\s1'den 10'a kadar olan sayilar (aralarında boşluk) : ");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        int toplam = 0;
        for (int i = 1; i <= 10; i++) {
            toplam += i;
        }
        System.out.println("\s1'den 10'a kadar olan sayilarin toplami : " + toplam);
    }
}
