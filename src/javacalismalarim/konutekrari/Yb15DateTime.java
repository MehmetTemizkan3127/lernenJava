package javacalismalarim.konutekrari;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Yb15DateTime {
    public static void main(String[] args) {
        //LOCALDATE
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
        System.out.println("Zaman Farki                             = " + zamanFarki.toHours()+" Saat "+zamanFarki.toMinutesPart()+" Dakika ");

        //LocalDateTime
        LocalDateTime simdikiZaman = LocalDateTime.now();
        System.out.println("Suan Tarih ve Saat                      = " + simdikiZaman);

        LocalDateTime saatTarihBelirleme = LocalDateTime.of(2020,3,17,20,55);
        System.out.println("Herhangi bir Tarih ve Saat              = " + saatTarihBelirleme);

        LocalDateTime yeniTarihSaat = LocalDateTime.now().plusDays(1).minusHours(24);
        System.out.println("Yeni Tarih ve Saat                      = " + yeniTarihSaat);

        //DateTimeFormatter
        //ofPattern
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String tarihBicimlendirici = LocalDate.now().format(format);
        System.out.println("Yeni tarih formati                      = "+tarihBicimlendirici); // Örneğin: 02/01/2025

        LocalDate dogumTarihi = LocalDate.of(0,9,3);
        LocalDate suanZ = LocalDate.of(0,1,3);
        Period kalanGun = Period.between(suanZ,dogumTarihi);
        System.out.println("Dogum Gününe Kalan Süre                 = " + kalanGun.getMonths()+" Ay "+kalanGun.getDays()+" gün ");

        ZonedDateTime bölgeselSaatTarih = ZonedDateTime.now();
        System.out.println("Bulundugun bölgede Tarih ve Saat        = " + bölgeselSaatTarih);

        ZoneId bolge = ZoneId.of("Europe/Istanbul");
        ZonedDateTime tarihSaatBerlin = ZonedDateTime.now(bolge);
        System.out.println("Istanbul Saati                          = "+tarihSaatBerlin);

        Instant instant = Instant.now();
        System.out.println("Uluslararasi gecerli Tarih ve Saat      = "+instant);

        //LOCAL TIME
        //Gecerli zamanı nanosaniye ile almak:
        LocalTime simdi = LocalTime.now();
        System.out.println("Su anki zaman                           = " + simdi);
        System.out.println("Nanosaniyeler                           = " + simdi.getNano());

        //Belirli bir nanosaniyeyle zaman oluşturmak:
        LocalTime nanoSaat = LocalTime.of(10, 30, 45, 123456789);
        System.out.println("Nano ile belirli Saat                   = " + nanoSaat);

        //LOCAL DATETIME
        LocalDateTime simdix = LocalDateTime.now();
        System.out.println("Su anki tarih ve zaman                  = " + simdix);
        System.out.println("Nano ile zaman                          = " + simdix.getNano());

        //Gecerli tarih ve saati nanosaniye ile almak:
        LocalDateTime nanoTarihSaat = LocalDateTime.of(2025,1,3,10, 30, 45, 123456789);
        System.out.println("Nano ile belirli Tarih ve Saat          = " + nanoTarihSaat);

        //Belirli bir tarih ve saati nanosaniye ile olusturmak:
        LocalDateTime specificDateTime = LocalDateTime.of(2025, 1, 1, 10, 30, 45, 987654321);
        System.out.println("Belirli tarih ve zaman: " + specificDateTime);

    }
}
