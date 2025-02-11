package j102mentoring.metod;

import java.time.LocalDate;
import java.util.Scanner;

public class Metod01YasHesaplamaMetodu {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Dogum yilinizi giriniz");
        int yil = scan.nextInt();

        yasHesapla(yil);

    }
    // Yas Hesaplama Metodumuz
    public static void yasHesapla(int yil) {
        int sonuc = LocalDate.now().getYear() - yil;
        System.out.println("Yasiniz: " + sonuc);

    }
}

