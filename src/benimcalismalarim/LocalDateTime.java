package benimcalismalarim;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class LocalDateTime {
    public static void main(String[] args) {
        LocalDate bugun = LocalDate.now();
        LocalDate bugun1 = LocalDate.now(ZoneId.of("Europe/Istanbul"));

        DateTimeFormatter f1 = DateTimeFormatter.ofPattern("dd.MMMM.yyyy");
        String yerelFormatliTarih = bugun.format(f1);
        String lokasyonFormatliTarih = bugun1.format(f1);
        System.out.println("Yerel Tarih = "+yerelFormatliTarih);
        System.out.println("Lokasyon Tarihi = " + lokasyonFormatliTarih);

        DateTimeFormatter f2 = DateTimeFormatter.ofPattern("dd MMMM EEEE yyyy");
        String yereFormatliTarih1 = bugun.format(f2);
        String lokasyonFormatliTarih1 = bugun1.format(f2);
        System.out.println("Yerel Tarih = " +yereFormatliTarih1);
        System.out.println("Lokasyon Tarihi = " + lokasyonFormatliTarih1);



    }
}
