package benimcalismalarim.önceki.mentoring.ikincibölüm;

import java.util.Scanner;

public class M_1027_08_ClaruswaySporSlanu {
    public static void main(String[] args) {

      /* TASK ->
        Clarusway spor salonu için kullanıcıdan isim soyisim, yaş, kilo, boy, salona devam edeceği ay süresini
        bilgilerini alıp aylık $20 olarak toplam ücretini hesplayıp print eden code create ediniz.
         */

        Scanner scn = new Scanner(System.in);
        int aylikUcret = 20;

        System.out.println("Lütfen adinizi giriniz : ");
        String ad = scn.nextLine();

        System.out.println("Lütfen soyadinizi giriniz : ");
        String soyad = scn.nextLine();

        System.out.println("Lütfen yasinizi giriniz : ");
        int yas = scn.nextInt();

        System.out.println("Lütfen kilonuzu kg olarak giriniz : ");
        int kilo = scn.nextInt();

        System.out.println("Lütfen boyunuzu cm olarak giriniz : ");
        int boy = scn.nextInt();

        System.out.println("Lütfen salona gideceginiz ay süresini giriniz : ");
        int ay = scn.nextInt();

        System.out.println("Toplam ücret = " +(ay*20));

    }
}
