package benimcalismalarim.mentoring.ifelse;

public class M_1031_01_For {
    public static void main(String[] args) {

        // 1 den 10 a kadar olan sayıları alt alta yazdır.
        // 1 den 10 a kadar olan sayıları yan yana yazdır
        // 1 den 10 a kadar olan sayıları aralarında 1 boşluk olacak sekilde yazdır.
        // 1 den 10 a kadar olan sayıların toplamını yazdır .

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







