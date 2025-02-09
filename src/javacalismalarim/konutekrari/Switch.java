package javacalismalarim.konutekrari;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Task 1: Kullanıcıdan bir ay numarası alın (1-12) ve bu numaraya karşılık gelen ay ismini "switch" kullanarak
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

        //Task 2: Kullanıcıdan iki sayı ve bir işlem operatörü (+, -, *, /) alın. "switch" kullanarak
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

        //Task 3: Kullanıcıdan bir gün numarası alın(1 - 7).Bu numaraya karşılık gelen gün ismini(1 = Pazartesi, 7 = Pazar)
        //  "switch" kullanarak yazdırın.
        /*
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
        }*/

        /*
          //Task 4: Bir sayının tek mi, çift mi olduğunu belirlemek için "switch" ifadesini kullanarak bir program yazın.
        System.out.println("Bir sayi girin = ");
        int sayi = scan.nextInt();

        switch (sayi%2){
            case 0:
                System.out.println("Girilen sayi CIFT");
                break;
            case 1:
                System.out.println("Girilen sayi TEK");
                break;
            default:
                System.out.println("Girilen sayi GECERSIZ");
                break;
            }*/

        /*
        //Task 5: *Kullanıcıdan bir harf alın ve bu harfin sesli mi, sessiz mi olduğunu "switch" kullanarak kontrol
        //eden bir program yazın.

        System.out.println("Bir harf giriniz = ");
        char harf = scan.next().toLowerCase().charAt(0);

        switch (harf){
            case 'a':
                System.out.println("a harfi sesli bir harftir");
                break;
            case 'e':
                System.out.println("e harfi sesli bir harftir");
                break;
            case 'i':
                System.out.println("i harfi sesli bir harftir");
                break;
            case 'o':
                System.out.println("o harfi sesli bir harftir");
                break;
            case 'ö':
                System.out.println("ö harfi sesli bir harftir");
                break;
            case 'u':
                System.out.println("u harfi sesli bir harftir");
                break;
            case 'ü':
                System.out.println("ü harfi sesli bir harftir");
                break;
            default:
                System.out.println("Girdiginiz harf sessiz bir harftir");
                break;
        }*/

        /*
        //Task 6: Kullanıcıdan bir nota karşılık gelen harf (A, B, C, D, F)alın ve "switch" kullanarak harfin
        //açıklamasını(örneğin, A = Mükemmel, B = İyi) ekrana yazdırın.

        System.out.println("Notunuzu \"A B C D F\" harflerinden biriyle giriniz = ");
        char not = scan.next().toUpperCase().charAt(0);

      switch (not){
          case 'A' :
              System.out.println("Mükemmel");
              break;
          case 'B' :
              System.out.println("Iyi");
              break;
          case 'C' :
              System.out.println("Orta");
              break;
          case 'D' :
              System.out.println("Gecer");
              break;
          case 'F' :
              System.out.println("Kaldi");
              break;
          default:
              System.out.println("Gecersiz not");
              break;
      }*/

        /*
        //Task 7: Bir yılın mevsimlerini belirlemek için kullanıcıdan bir ay numarası alın (1 - 12) ve "switch"
        // kullanarak mevsimi ekrana yazdırın.
        System.out.println("1-12 arasinda bir ay numara giriniz = ");
        int ay = scan.nextInt();

        switch (ay){
            case 12,1,2:
                System.out.println("Bu ay KIS mevsimidir");
                break;
            case 3,4,5:
                System.out.println("Bu ay ILKBAHAR mevsimidir");
                break;
            case 6,7,8:
                System.out.println("Bu ay YAZ mevsimidir");
                break;
            case 9,10,11:
                System.out.println("Bu ay SONBAHAR mevsimidir");
                break;
            default:
                System.out.println("Gecersiz ay numarasi girdiniz");
                break;
        }*/


        /*
        //Task 8: Kullanıcıdan bir sayı alın ve bu sayının 1 ile 5 arasında olup olmadığını "switch" ile kontrol
        // eden bir program yazın.

        System.out.println("Bir sayi giriniz = ");
        int sayi = scan.nextInt();

        switch (sayi){
            case 1,2,3,4,5 :
                System.out.println("Girdiginiz sayi 1-5 araligindadir");
                break;
            default:
                System.out.println("Girdiginiz sayi 1-5 araligi disindadir");
        }*/

        /*
        //Task 9: Kullanıcıdan bir araba markası adı alın (örneğin, BMW, Mercedes, Toyota)ve "switch" kullanarak bu
        //markaya karşılık gelen ülkeyi (örneğin, Almanya, Japonya)ekrana yazdıran bir program yazın.
        System.out.println("\"BMW, MERCEDES, TOYOTA\"' dan bi araba markasi giriniz = ");
        String marka = scan.nextLine().toUpperCase();

        switch (marka){
            case "BMW" :
                System.out.println("Bu marka USA'ya aittir");
                break;
            case "MERCEDES" :
                System.out.println("Bu marka Germany'e aittir");
                break;
            case "TOYOTA" :
                System.out.println("Bu marka Japonya'ya aittir");
                break;
            default:
                System.out.println("Bu araba bilgisi bulunmamaktadir");
                break;
        }*/


        //Task 10: Bir haftanın günlerini hafta içi veya hafta sonu olarak sınıflandıran bir "switch" programı yazın.

        System.out.println("pazartesi\nsali\ncarsamba\npersembe\ncuma\ncumartesi\npazar\ngünlerinden birisini giriniz = ");
        String gun = scan.next().toLowerCase();

        switch (gun){
            case "pazartesi","sali","carsamba","persembe","cuma":
                System.out.println("Girilen gün hafta icidir");
                break;
            case "cumartesi","pazar":
                System.out.println("Girilen gün hafta sonudur");
                break;
            default:
                System.out.println("Gecersiz bir gün girdiniz");
                break;
        }


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
