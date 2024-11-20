package j03_scannerclass_typecasting;

import java.util.Scanner;

public class Hw_05DortIslem {
    public static void main(String[] args) {

        // ************************** Task 05 ***********************************
        // Task-> kullanicidan 2 tam sayinın  dort islem sonucunu print eden code create ediniz.
        // ************************** Task 06 ***********************************
            /* Task->
        Bir dik üçgenin iki dik kenarını alarak hipotenüsünü hesaplayan kod yazınız.
        hipotenus=birinciKenar*birinciKenar+ikinciKenar*ikincikenar karekoku
        Örnek Ekran Çıktısı
        birinci kenar: 12
        ikinci kenar: 5
        hipotenus: 13      */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Birinci tam sayıyı girin: ");
        int sayi1 = scanner.nextInt();

        System.out.print("İkinci tam sayıyı girin: ");
        int sayi2 = scanner.nextInt();

        System.out.println("Toplama: " + (sayi1 + sayi2));
        System.out.println("Çıkarma: " + (sayi1 - sayi2));
        System.out.println("Çarpma: " + (sayi1 * sayi2));
        System.out.println("Bölme: " + (sayi1 / sayi2));











    }
}
