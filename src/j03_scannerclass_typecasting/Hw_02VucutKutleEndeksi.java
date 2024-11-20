    package j03_scannerclass_typecasting;

    import java.util.Scanner;

    public class Hw_02VucutKutleEndeksi {
    public static void main(String[] args) {

    // ************************** Task 02 ***********************************
           /*
          TASK ->
          Kullanicidan boyunu cm olarak, kilosunu kilogram olarak alin
          ve vucut kutle endeksini bulun.
          Sonucu tamsayi ve ondalikli sayi olarak yazdirin
          VKE= kilo/(boy*boy) …….. Kilo : kilogram , Boy : metre olmalidir
          Ornek : Input : boy :180 kilo : 80
                  Output : Vucut kutle endeksiniz : 24
                           Vucut kutle endeksiniz : 24.691…
            */

        Scanner scn = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu cm olarak giriniz: ");
        double boyCm = scn.nextDouble();

        System.out.print("Lütfen kilonuzu kg olarak giriniz: ");
        double kilo = scn.nextDouble();


        double boyMetre = boyCm / 100;
        double vke = kilo / (boyMetre * boyMetre);

        System.out.printf("Vücut kütle endeksiniz (tamsayı): %.0f%n", vke);
        System.out.printf("Vücut kütle endeksiniz (ondalık): %.3f%n", vke);












    }
}
