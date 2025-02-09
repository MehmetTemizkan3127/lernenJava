package javacalismalarim.konutekrari;

public class Yb16PassByValue {
    public static void main(String[] args) {
        // task -> verilen fiyat için %24 artırılmış fiyatı print eden METHOD create ediniz.

        double fiyat = 100;

        //DÜZELTME
        fiyat = fiyatArttir(fiyat); // Dönen değeri orijinal değişkene atıyoruz

        //BU YANLIS CAGIRMA
        //fiyatArttir(fiyat);
        System.out.println("Main metodda fiyat      = " + fiyat);

    }
    public static double fiyatArttir(double fiyat){
        fiyat = fiyat*(1.24);
        System.out.println("Cagrılan Metodda fiyat  = " + fiyat);

        System.out.println("Fiyatın %24 fazlası     = " + fiyat);
        return fiyat;
    }
}
