package j102mentoring.datetime;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime01Formater {
    public static void main(String[] args) {

        ZoneId zoneId = ZoneId.of("Asia/Bishkek");
        ZonedDateTime zaman = ZonedDateTime.now(zoneId);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println("Saat (Asia/Bishkek): " + zaman.format(formatter));

    }
}
