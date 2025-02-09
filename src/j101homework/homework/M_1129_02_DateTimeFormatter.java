package j101homework.homework;

import java.time.LocalDate;

public class M_1129_02_DateTimeFormatter {
    public static void main(String[] args) {
       // Örnek 1 : Bugünün Tarihi, 10 Gün Önce ve 10 Gün Sonranın tarihini yazdıralım
        LocalDate bugun = LocalDate.now();
        System.out.println("Bugün = " + bugun);

        LocalDate onGunOnce = bugun.minusDays(10);
        System.out.println("On gün önce = " + onGunOnce);

        LocalDate onGunSonra = bugun.plusDays(10);
        System.out.println("On gün sonra = " + onGunSonra);







    }
}
