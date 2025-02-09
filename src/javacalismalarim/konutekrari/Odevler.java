package javacalismalarim.konutekrari;

import java.util.Scanner;

public class Odevler {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
        task-> girilen iki tamsayı arasındaki tamsayıları print eden code create ediniz.
        for loop & while lopp
         */
        /*
        Scanner scan = new Scanner(System.in);
        System.out.println("Sayi1'i giriniz = ");
        int sayi1 = scan.nextInt();
        System.out.println("Sayi2'yi giriniz = ");
        int sayi2 = scan.nextInt();

        int kucuk = Math.min(sayi1,sayi2);
        int buyuk = Math.max(sayi1,sayi2);

        System.out.println("Girilen iki tam sayi araligindaki sayilar = ");
        for (int i = kucuk+1; i < buyuk; i++){
        System.out.print( i+" ");
        }*/

          /*
         task-> girilen şifrenin asagidaki sartlari kontrol edin
         ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
         eger tum sartlari saglarsa, "sifre basariyla kaydedildi" print edin
         - ilk harf kucuk harf olmali
         - son karakter rakam olmali
         - sifre bosluk icermemeli
         - uzunlugu en az 10 karakter olmali

        Scanner scan = new Scanner(System.in);
        System.out.println("- ilk harfi kucuk\n " + "-son karakteri rakam\n" + "- sifre bosluk icermemeli\n" + "- uzunlugu en az 10 karakter\n " + " olan bir sifre giriniz =");
        String sifre = scan.nextLine();
        boolean basarili = true;
        if (!Character.isLowerCase(sifre.charAt(0))){
            System.out.println("Ilk karekter kücük olmali");
            basarili = false;
        }
        if (!Character.isDigit(sifre.charAt(sifre.length()-1))){
            System.out.println("Son karekter rakam olmali");
            basarili = false;
        }
        if (sifre.contains(" ")){
            System.out.println("Bosluk icermemeli");
            basarili = false;
        }
        if (sifre.length() < 10){
            System.out.println("Sifre en az 10 karekter icermelidir");
            basarili = false;
        }
        if (basarili){
            System.out.println("Sifreniz basariyla girilmistir");
        }*/


        /*
        // task-> Girilen sayıların toplamı 333'ü geçtiğinde girilen sayı adetini ve toplamını print eden
        // code create ediniz
        ArrayList<Integer> sayilar = new ArrayList<>();
        int toplam = 0;
        int counter = 0;

        while (toplam <= 333) {
            System.out.println("Sayıları girin = ");
            int sayi = scan.nextInt();
            sayilar.add (sayi);
            toplam += sayi;
            counter ++;
        }

        System.out.println("Sayilar = "+sayilar);
        System.out.println("Toplam 333'ü gecti");
        System.out.println("counter = " + counter);
        System.out.println("toplam = " + toplam);
        */

        //task->girilen bir ondalik sayinin ondalik kismindaki rakamlarinin toplamini bulunuz.
        //             24.5673 ==>    5+6+7+3 = 21

        System.out.print("Ondalıklı bir sayı girin: ");
        double dSayi = scan.nextDouble();

        dSayi = dSayi - (int) dSayi;

        int sum = 0;
        dSayi = Math.round(dSayi * 1_000_000);

        while (dSayi > 0) {
            int digit = (int) dSayi % 10;
            sum += digit;
            dSayi /= 10;
        }

        System.out.println("Ondalık kısmındaki rakamların toplamı: " + sum);

        //7.Nowember
        //task-> Girilen ismin ilk harfinin buyuk olmasını kontrol eden code create ediniz.


        //task-> kullanıcıdan alınan bir cümlenin büyük harfle başlayıp nokta ile bittiğini
        // kontrol eden code create ediniz.


        // Senaryo 3 : Cümledeki Kelime Sayısını Bulma
// Soru : Verilen bir cümledeki kelime sayısını bulan bir metot yazın.
// Senaryo 4 : Üçgenin Alanı
// Soru : Üçgenin kullanıcıdan alınan taban uzunluğu ve yüksekliğini kullanarak alanını hesaplayın.
// Senaryo 5 : Verilen Bir Sayının Faktöriyelini Hesaplama
// Soru : Kullanıcıdan bir sayı alın ve bu sayının faktöriyelini hesaplayın.
// Senaryo 6 : Kullanıcıdan bir sayı alarak bu sayının kaç basamaklı olduğunu bulun.
// parametreli + return Type
// Senaryo 7 : Bir Sayının Karesini Hesaplama
// parametreli
    }
}
