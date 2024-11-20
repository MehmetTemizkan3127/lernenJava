package j03_scannerclass_typecasting;

import java.util.Scanner;

public class Hw_12KdvliTutar {
    public static void main(String[] args) {

      /*
    Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.
    (Not : KDV tutarını 18% olarak alın)
    KDV'siz Fiyat = 10;
    KDV'li Fiyat = 11.8;
    KDV tutarı = 1.8;
    Ödev
    Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı print eden code create ediniz
     */

        Scanner scn = new Scanner(System.in);

        System.out.print("Lütfen tutarı girin: ");
        double tutar = scn.nextDouble();

        double kdvOrani = 0.18 - (tutar > 1000 ? 0.10 : 0);
        double kdvTutari = tutar * kdvOrani;
        double kdvliFiyat = tutar + kdvTutari;

        System.out.println("KDV'siz Fiyat: " + tutar);
        System.out.println("KDV Oranı: %" + (kdvOrani * 100));
        System.out.printf("KDV Tutarı: %.2f\n", kdvTutari);
        System.out.println("KDV'li Fiyat: " + kdvliFiyat);







    }
}
