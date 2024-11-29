package benimcalismalarim.Mentoring;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.WeekFields;

public class M_1129_04_DateTimeFormatter {
    public static void main(String[] args) {
     //Örnek : Kullanıcı, bugünkü tarihin bulunduğu haftanın başlangıç ve bitiş tarihlerini görmek istiyor.
        LocalDate bugununTarihi = LocalDate.now();
        LocalDate haftaninBaslangisTarihi = bugununTarihi.with(DayOfWeek.MONDAY);
        LocalDate haftaninBitisTarihi = bugununTarihi.with(DayOfWeek.SUNDAY);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        System.out.println("Bugünkü tarih = " + bugununTarihi);
        System.out.println("Haftanin baslangic tarihi = " + haftaninBaslangisTarihi);
        System.out.println("Haftanin bitis tarihi = " + haftaninBitisTarihi);






    }
}
