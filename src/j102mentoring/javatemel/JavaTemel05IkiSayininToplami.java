package j102mentoring.javatemel;

import java.util.Scanner;

public class JavaTemel05IkiSayininToplami {
    public static void main(String[] args) {
      // Kullanicidan aldiginiz iki sayinin toplamini yazdiriniz.
      Scanner scn =new Scanner(System.in);
        System.out.println("Sayi1'i giriniz ");
      int sayi1 = scn.nextInt();
        System.out.println("Sayi2'yi giriniz ");
      int sayi2 = scn.nextInt();

      int toplam =(sayi1+sayi2);
        System.out.println("toplam = " + toplam);






    }
}
