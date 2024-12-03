package benimcalismalarim.konular;

public class J15DateAndTime {
    /*
    15- Date and Time (Tarih ve Zaman İşlemleri)
Tanım:
Java, tarih ve zaman işlemleri için java.time paketini sunar. Bu paket, tarih ve saat üzerinde çeşitli işlemler yapabilmenizi sağlar.

Zaman ve Tarih Kullanımı:
LocalDate: Sadece tarihi (yıl, ay, gün) tutar.
LocalTime: Sadece saati (saat, dakika, saniye) tutar.
LocalDateTime: Hem tarih hem de saati tutar.
Instant: Zaman damgasını temsil eder (milisaniye hassasiyetinde).
Örnek Kullanım:
java
Kodu kopyala
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeExample {
    public static void main(String[] args) {
        // Bugünün tarihi
        LocalDate date = LocalDate.now();
        System.out.println("Bugünün Tarihi: " + date);

        // Şu anki saat
        LocalTime time = LocalTime.now();
        System.out.println("Şu anki Saat: " + time);

        // Tarih ve saat
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Tarih ve Saat: " + dateTime);

        // Formatlı tarih
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate = date.format(formatter);
        System.out.println("Formatlı Tarih: " + formattedDate);
    }
}
Önemli Not:
LocalDate ve LocalTime, zaman dilimi ile ilgili bilgi içermez. Zaman dilimi kullanmak için ZonedDateTime kullanmalısınız.
Tarih ve saatlerin formatlanmasında DateTimeFormatter sınıfı kullanılır.
Konu Özeti:
java.time paketindeki sınıflar, tarih ve saat işlemleri için geniş bir API sunar.
Formatlama ve zaman dilimi kullanımı için ilgili sınıflara dikkat edilmelidir.
     */
}
