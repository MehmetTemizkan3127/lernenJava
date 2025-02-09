package javacalismalarim.konutekrari.sinavhazirliklari;

public class TypCastingWrapperClass {
    public static void main(String[] args) {

        int sayi = 5;
        double widSayi = sayi;
        System.out.println("Typ Casting Widening yazdiriliyor                   = " + widSayi);

        double not = 3.75;
        int narrNot = (int)not;
        System.out.println("Typ Casting Narrowing yazdiriliyor                  = " + narrNot);

        int sayi1 = 5;
        Integer wrappSayi = sayi1;
        System.out.println("Wrapper Class Autoboxing yazdiriliyor               = " + wrappSayi);

        Double not1 = 3.75;
        double wrappNot = not1;
        System.out.println("Wrapper Class Unboxing yazdiriliyor                 = " + wrappNot);

        String numara = "274";
        Integer wrappNumara = Integer.valueOf(numara);
        System.out.println("String ile Wrapper Class Autoboxing yazdiriliyor    = " + wrappNumara);

        String yil = "2025";
        int wrappYil = Integer.parseInt(yil);
        System.out.println("String ile Wrapper Class Unboxing yazdiriliyor      = " + wrappNumara);
    }
}
