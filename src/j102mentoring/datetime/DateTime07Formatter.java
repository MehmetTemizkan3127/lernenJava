package j102mentoring.datetime;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateTime07Formatter {
    public static void main(String[] args) {
        //Örnek: Bir Saat Dilimine Göre Saat Belirleme

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen bir saat dilimi giriniz (örnek: Europe/Berlin): ");
        String saatDilimi = input.nextLine();

        ZoneId zoneId = ZoneId.of(saatDilimi);
        ZonedDateTime saatDilimiZamani = ZonedDateTime.now(zoneId);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");
        System.out.println("Girdiginiz saat dilimindeki zaman: " + saatDilimiZamani.format(formatter));
    }
}
