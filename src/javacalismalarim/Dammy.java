package javacalismalarim;

import java.util.Scanner;

public class Dammy {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Kullanıcıdan bir ay numarası alın (1-12) ve bu numaraya karşılık gelen ay ismini "switch" kullanarak
        //ekrana yazdıran bir program yazın.
        /*
        int ay = 5;

        switch (ay){
            case 1:
                System.out.println("Ocak ayi yazdiriliyor");
                break;
            case 2:
                System.out.println("Subat ayi yazdiriliyor");
                break;
            case 3:
                System.out.println("Mart ayi yazdiriliyor");
                break;
            case 4:
                System.out.println("Nisan ayi yazdiriliyor");
                break;
            case 5:
                System.out.println("Mayis ayi yazdiriliyor");
                break;
            case 6:
                System.out.println("Haziran ayi yazdiriliyor");
                break;
            case 7:
                System.out.println("Temmuz ayi yazdiriliyor");
                break;
            case 8:
                System.out.println("Agustos ayi yazdiriliyor");
                break;
            case 9:
                System.out.println("Eylül ayi yazdiriliyor");
                break;
            case 10:
                System.out.println("Ekim ayi yazdiriliyor");
                break;
            case 11:
                System.out.println("Kasim ayi yazdiriliyor");
                break;
            case 12:
                System.out.println("Aralik ayi yazdiriliyor");
                break;
            default:
                System.out.println("Gecersiz Ay");
        }*/

        //Kullanıcıdan iki sayı ve bir işlem operatörü (+, -, *, /) alın. "switch" kullanarak
        //işlemi gerçekleştiren bir program yazın.
        /*
        System.out.println("Birinci sayiyi giriniz = ");
        int num1 = scan.nextInt();
        System.out.println("Ikinci sayiyi giriniz = ");
        int num2 = scan.nextInt();

        int islem = 4;

        switch (islem) {
            case 1:
                System.out.println("Toplama sonucu = " + sayilariTopla(num1, num2));
                break;
            case 2:
                System.out.println("Cikarma sonucu = " + sayilariCikar(num1, num2));
                break;
            case 3:
                System.out.println("Carpma sonucu = " + sayilariCarp(num1, num2));
                break;
            case 4:
                System.out.println("Bölme sonucu = " + sayilariBöl(num1, num2));
                break;
        }*/

      //Kullanıcıdan bir gün numarası alın(1 - 7).Bu numaraya karşılık gelen gün ismini(1 = Pazartesi, 7 = Pazar)
      //  "switch" kullanarak yazdırın.

        System.out.println("1-7 arasinda bir sayi giriniz = ");
        int gun = scan.nextInt();

        switch (gun){
            case 1:
                System.out.println("Günlerden Pazartesi");
                break;
            case 2:
                System.out.println("Günlerden Sali");
                break;
            case 3:
                System.out.println("Günlerden Carsamba");
                break;
            case 4:
                System.out.println("Günlerden Persembe");
                break;
            case 5:
                System.out.println("Günlerden Cuma");
                break;
            case 6:
                System.out.println("Günlerden Cumartesi");
                break;
            case 7:
                System.out.println("Günlerden Pazar");
                break;
            default:
                System.out.println("Gecersiz bir gün");


        }





          /*Bir sayının tek mi, çift mi olduğunu belirlemek için "switch" ifadesini kullanarak bir program yazın.

                Kullanıcıdan bir harf alın ve bu harfin sesli mi, sessiz mi olduğunu "switch" kullanarak kontrol
        eden bir program yazın.

        Kullanıcıdan bir nota karşılık gelen harf (A, B, C, D, F)alın ve "switch" kullanarak harfin
        açıklamasını(örneğin, A = Mükemmel, B = İyi) ekrana yazdırın.

        Bir yılın mevsimlerini belirlemek için kullanıcıdan bir ay numarası alın (1 - 12) ve "switch" kullanarak mevsimi
        ekrana yazdırın.

        Kullanıcıdan bir sayı alın ve bu sayının 1 ile 5 arasında olup olmadığını "switch" ile kontrol eden bir
        program yazın.

        Kullanıcıdan bir araba markası adı alın (örneğin, BMW, Mercedes, Toyota)ve "switch" kullanarak bu
        markaya karşılık gelen ülkeyi (örneğin, Almanya, Japonya)ekrana yazdıran bir program yazın.

                Bir haftanın günlerini hafta içi veya hafta sonu olarak sınıflandıran bir "switch" programı yazın.
 */


    }

    public static int sayilariTopla(int a, int b) {
        return a + b;
    }

    public static int sayilariCikar(int a, int b) {
        return a - b;
    }

    public static int sayilariCarp(int a, int b) {
        return a * b;
    }

    public static int sayilariBöl(int a, int b) {
        return a / b;


    }

}
