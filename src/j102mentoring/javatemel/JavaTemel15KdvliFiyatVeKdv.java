package j102mentoring.javatemel;

import java.util.Scanner;

public class JavaTemel15KdvliFiyatVeKdv {
    public static void main(String[] args) {

      /*
    Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.
    (Not : KDV tutarını 18% olarak alın)
    KDV'siz Fiyat = 10;
    KDV'li Fiyat = 11.8;
    KDV tutarı = 1.8;
    Ödev
    Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.
     */
        Scanner scn = new Scanner(System.in);
        System.out.println("Bir tutar giriniz : ");
        double tutar = scn.nextDouble();

        double kdvOrani = 0.18;
        double kdvTutari = tutar*kdvOrani;
        double kdvliFiyat = tutar + kdvTutari;

        System.out.printf("kdvTutari = %.3f\n", kdvTutari);
        System.out.println("kdvliFiyat = " + kdvliFiyat);

    }
}
