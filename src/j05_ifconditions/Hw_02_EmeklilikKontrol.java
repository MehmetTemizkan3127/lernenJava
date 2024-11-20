package j05_ifconditions;

import java.util.Scanner;

public class Hw_02_EmeklilikKontrol {

    /*
  TASK -> kullanıcının cinsiyeti KADIN ise 60 yasından buyuk ve prim gunu 6000 den  fazla ise emekliliğini
        kullanıcının cinsiyeti ERKEK ise 65 yasından buyuk ve prim gunu 7000 den  fazla ise emekliliğini
        kontrol edip kalan yıl ve prim gununu print eden code create ediniz...
 */

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.print("Lütfen cinsiyetinizi giriniz (Kadin/Erkek): ");
        String cinsiyet = input.next();

        System.out.print("Lütfen yaşınızı giriniz: ");
        int yas = input.nextInt();

        System.out.print("Prim gününüzü giriniz: ");
        int primGunu = input.nextInt();

        // Cinsiyet KADIN ise
        if (cinsiyet.equalsIgnoreCase("Kadin")) {
            if (yas >= 60 && primGunu >= 6000) {
                System.out.println("Emekliliği hak ettiniz.");
            } else {
                int kalanYas = 60 - yas;
                int kalanPrimGunu = 6000 - primGunu;

                System.out.println("Emekli olmanız için kalan yıl: " + Math.max(0, kalanYas));
                System.out.println("Emekli olmanız için kalan prim günü: " + Math.max(0, kalanPrimGunu));
            }
        }
        // Cinsiyet ERKEK ise
        else if (cinsiyet.equalsIgnoreCase("Erkek")) {
            if (yas >= 65 && primGunu >= 7000) {
                System.out.println("Emekliliği hak ettiniz.");
            } else {
                int kalanYas = 65 - yas;
                int kalanPrimGunu = 7000 - primGunu;

                System.out.println("Emekli olmanız için kalan yıl: " + Math.max(0, kalanYas));
                System.out.println("Emekli olmanız için kalan prim günü: " + Math.max(0, kalanPrimGunu));
            }
        } else {
            System.out.println("Geçersiz cinsiyet girdiniz.");
        }



    }
}
