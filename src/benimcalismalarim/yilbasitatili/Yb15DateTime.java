package benimcalismalarim.yilbasitatili;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class Yb15DateTime {
    public static void main(String[] args) {
        //1- now(); günün tarihi
        LocalDate bugun = LocalDate.now();
        System.out.println("Bugunün tarihini bulmak                 = " + bugun);

        //2- of(2025, 1, 1);
        LocalDate belirliTarih = LocalDate.of(2025,4,23);
        System.out.println("Herhangi bir tarihi belirleme           = " + belirliTarih);

        //3- Period.between(startDate, endDate); iki tarih arasindaki fark
        LocalDate baslangicTarihi = LocalDate.of(2018,7,9);
        LocalDate sonTarih = LocalDate.of(2025,1,2);
        Period tarihFarki = Period.between(baslangicTarihi,sonTarih);
        System.out.println("Geldigim günden bu tarafa gecen süre    = " + tarihFarki.getYears()+" yil "+tarihFarki.getMonths()+" ay "+tarihFarki.getDays()+" gün ");

        System.out.println();

        //LOCAL TIME
        //now(); suan ki süre
        LocalTime suan = LocalTime.now();
        System.out.println("Simdiki zaman                           = " + suan);

        LocalTime belirliZaman = LocalTime.of(17,20,12);
        System.out.println("belirliZaman                            = " + belirliZaman);

        LocalTime gecmisZaman = LocalTime.of(06,13,00);
        LocalTime gelecekZaman = LocalTime.of(16,20,00);
        Duration zamanFarki = Duration.between(gecmisZaman,gelecekZaman);
        System.out.println("zamanFarki                              = " + zamanFarki.toHours()+" Saat "+zamanFarki.toMinutesPart()+" Dakika ");






    }
}
