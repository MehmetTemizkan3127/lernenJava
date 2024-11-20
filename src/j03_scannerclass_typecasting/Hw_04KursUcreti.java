package j03_scannerclass_typecasting;

import java.util.Scanner;

public class Hw_04KursUcreti {
    public static void main(String[] args) {

        // ************************** Task 04 ***********************************
          /* TASK ->
        Clarusway spor salonu için kullanıcıdan isim soyisim, yaş, kilo, boy, salona devam edeceği ay süresini
        bilgilerini alıp aylık $20 olarak toplam ücretini hesplayıp print eden code create ediniz.
         */

        Scanner scanner = new Scanner(System.in);

        System.out.print("İsminiz ve soyisminiz: ");
        String isimSoyisim = scanner.nextLine();

        System.out.print("Yaşınızı girin: ");
        int yas = scanner.nextInt();

        System.out.print("Kilonuzu girin (kg): ");
        double kilo = scanner.nextDouble();

        System.out.print("Boyunuzu girin (cm): ");
        double boy = scanner.nextDouble();

        System.out.print("Salona devam edeceğiniz süreyi girin (ay olarak): ");
        int aySuresi = scanner.nextInt();

        int aylikUcret = 20;
        int toplamUcret = aylikUcret * aySuresi;

        System.out.println("\nClarusway Spor Salonu Üyelik Bilgileriniz:");
        System.out.println("İsim Soyisim: " + isimSoyisim);
        System.out.println("Yaş: " + yas);
        System.out.println("Kilo: " + kilo + " kg");
        System.out.println("Boy: " + boy + " cm");
        System.out.println("Salona devam edeceğiniz süre: " + aySuresi + " ay");
        System.out.println("Toplam Ücret: $" + toplamUcret);















    }
}
