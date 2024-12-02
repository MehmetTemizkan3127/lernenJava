package benimcalismalarim.mentoring.datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class M_1129_03_DateTimeFormatter {
    public static void main(String[] args) {
        //Örnek 3 : Bir kullanıcı hem tarih hem de saat olarak bugünü , 5 gün ve 4 saat sonrasını görmek istiyor.
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime simdikiZaman = LocalDateTime.now();
        System.out.println("Simdiki zaman = " + simdikiZaman);

        LocalDateTime gelecekZaman = simdikiZaman.plusDays(5).plusHours(4);
        System.out.println("Bes gün dört saat sonrasi = " + gelecekZaman);
    }
}
