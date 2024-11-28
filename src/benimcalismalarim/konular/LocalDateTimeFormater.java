package benimcalismalarim.konular;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class LocalDateTimeFormater {
    public static void main(String[] args) {
        // 1. LocalDate (Tarih Nesnesi)
// Kod	Ne İşe Yarar
// LocalDate bugun = LocalDate.now();  // Bugünün tarihini alır.
// LocalDate belirliTarih = LocalDate.of(2023, 11, 28);  // Belirli bir tarih oluşturur. (2023-11-28)
// LocalDate yeniTarih = bugun.plusDays(5);  // Bugünden 5 gün sonrası olan tarihi hesaplar.
// LocalDate gecmisTarih = bugun.minusDays(5);  // Bugünden 5 gün öncesi olan tarihi hesaplar.
// int yil = bugun.getYear();  // Bugünün yıl bilgisini alır.
// int ay = bugun.getMonthValue();  // Bugünün ay bilgisini alır.
// int gun = bugun.getDayOfMonth();  // Bugünün gün bilgisini alır.
// boolean oncedenMi = belirliTarih.isBefore(LocalDate.now());  // Belirli tarihin, bugünden önce olup olmadığını kontrol eder.
// boolean sonradanMi = belirliTarih.isAfter(LocalDate.now());  // Belirli tarihin, bugünden sonra olup olmadığını kontrol eder.
// int karsilastirmaSonucu = belirliTarih.compareTo(LocalDate.now());  // İki tarihi karşılaştırır ve sıralama yapar.

// 2. LocalTime (Zaman Nesnesi)
// Kod	Ne İşe Yarar
// LocalTime suankiSaat = LocalTime.now();  // Şu anki saati alır.
// LocalTime belirliSaat = LocalTime.of(14, 30);  // Saat 14:30 olan bir zamanı oluşturur.
// LocalTime yeniSaat = suankiSaat.plusMinutes(30);  // Şu anki saate 30 dakika ekler.
// LocalTime gecmisSaat = suankiSaat.minusMinutes(45);  // Şu anki saatten 45 dakika çıkarır.
// LocalTime yeniSaat2 = suankiSaat.plusHours(2);  // Şu anki saate 2 saat ekler.
// LocalTime gecmisSaat2 = suankiSaat.minusHours(1);  // Şu anki saatten 1 saat çıkarır.
// int dakika = suankiSaat.getMinute();  // Şu anki dakikayı alır.
// int saniye = suankiSaat.getSecond();  // Şu anki saniyeyi alır.

// 3. LocalDateTime (Tarih ve Zaman Nesnesi)
// Kod	Ne İşe Yarar
// LocalDateTime suankiTarihSaat = LocalDateTime.now();  // Şu anki tarih ve saati alır.
// LocalDateTime belirliTarihSaat = LocalDateTime.of(2023, 11, 28, 14, 30);  // 28 Kasım 2023, 14:30 tarih ve saatini oluşturur.
// LocalDateTime yeniTarihSaat = suankiTarihSaat.plusDays(1);  // Şu anki tarihe 1 gün ekler.
// LocalDateTime gecmisTarihSaat = suankiTarihSaat.minusHours(2);  // Şu anki tarih ve saatten 2 saat çıkarır.
// LocalDateTime yeniTarihSaat2 = suankiTarihSaat.plusDays(5).plusHours(3).plusMinutes(20);  // 5 gün, 3 saat ve 20 dakika ekler.
// LocalDateTime gecmisTarihSaat2 = suankiTarihSaat.minusDays(5).minusHours(2).minusMinutes(15);  // 5 gün, 2 saat ve 15 dakika çıkarır.
// int yil = suankiTarihSaat.getYear();  // Şu anki yıl bilgisini alır.
// int saat = suankiTarihSaat.getHour();  // Şu anki saati alır.
// int dakika = suankiTarihSaat.getMinute();  // Şu anki dakikayı alır.

// 4. DateTimeFormatter (Tarih ve Zaman Biçimlendirme)
// Kod	Ne İşe Yarar
// DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");  // Tarih ve zaman objelerini "yyyy-MM-dd HH:mm:ss" formatında biçimlendirir.
// String tarihSaatString = "2023-11-28 14:30:00";  // "2023-11-28 14:30:00" formatında bir string oluşturur.
// LocalDateTime tarihSaat = LocalDateTime.parse(tarihSaatString, formatter);  // Biçimlendirilmiş string'i LocalDateTime objesine dönüştürür.
// String tarihSaatString2 = suankiTarihSaat.format(formatter);  // suankiTarihSaat objesini belirtilen formatta string'e dönüştürür.

// Ekstra Tarih ve Zaman Manipülasyonları:
// Kod	Ne İşe Yarar
// boolean oncedenMi = belirliTarih.isBefore(LocalDate.now());  // Bir tarihin, bugünden önce olup olmadığını kontrol eder.
// boolean sonradanMi = belirliTarih.isAfter(LocalDate.now());  // Bir tarihin, bugünden sonra olup olmadığını kontrol eder.
// int karsilastirmaSonucu = belirliTarih.compareTo(LocalDate.now());  // İki tarih arasında sıralama karşılaştırması yapar.


// Sorular:
// 1. Bugünden 10 gün sonra hangi tarihi elde edersiniz?
        LocalDate bugun = LocalDate.now();
        System.out.println("bugun = " + bugun);
        LocalDate onGunSonra = bugun.plusDays(10);
        System.out.println("onGunSonra = " + onGunSonra);

// 2. 2023 yılına ait Kasım ayının 15. günü hangi gündür?
        LocalDate tarih = LocalDate.of(2023, 11, 15);
        DayOfWeek gun = tarih.getDayOfWeek();
        System.out.println("gun = " + gun);


// 3. Hangi tarih, '2024-02-15' tarihinden daha önce?
        LocalDate gelecekTarih = LocalDate.of(2024, 10, 25);

        boolean onceMi = bugun.isBefore(gelecekTarih);
        boolean sonraMi = bugun.isAfter(gelecekTarih);

        //System.out.println("onceMi = " + onceMi);
        System.out.println("sonraMi = " + sonraMi);


// 4. Şu anki saatten 2 saat önce hangi saat olur?
// 5. Tarih ve saat üzerinde nasıl daha fazla manipülasyon yapabilirsiniz?
// 6. Bugünün tarihi ile belirli bir tarihin karşılaştırmasını yapın.
// 7. '2023-11-28' tarihinden 10 gün önce hangi tarihe ulaşılır?
// 8. Saat 18:00'dan 45 dakika önce hangi saat olur?
// 9. '2023-11-28 14:30:00' formatındaki bir tarihi nasıl yerel tarihe dönüştürürsünüz?
// 10. Şu anki tarih ve saati 'yyyy-MM-dd HH:mm:ss' formatında nasıl yazdırırsınız?
// 11. Bugünden 5 gün önce hangi tarihi elde edersiniz?
// 12. Şu anki saatin 30 dakika sonrası hangi saattir?
// 13. Belirli bir tarihin, şu anki tarihten önce olup olmadığını nasıl kontrol edersiniz?
// 14. Belirli bir saatten 1 saat sonra hangi saati elde edersiniz?
// 15. 5 gün, 2 saat ve 15 dakika sonrası olan tarih ve saati nasıl elde edersiniz?
// 16. '2023-11-28' tarihinin ay bilgisini nasıl alırsınız?
// 17. Şu anki tarihi 'yyyy/MM/dd' formatında nasıl yazdırırsınız?
// 18. '2023-11-28 14:30:00' tarihini 'dd-MM-yyyy HH:mm' formatına nasıl dönüştürürsünüz?
// 19. Bugünün tarihinden 5 gün sonrasını hesaplayın ve bu tarihi yazdırın.
// 20. '2023-11-28' tarihinden 5 gün önce hangi tarihe ulaşılır?
// 21. Saat 09:00'dan 45 dakika sonrası hangi saattir?
// 22. Belirli bir tarih ve saat ile şu anki tarih ve saati karşılaştırın. Hangi tarih önce gelir?
// 23. '2023-11-28' tarihinden 10 gün önce hangi tarihi elde edersiniz?
// 24. Şu anki saatin 1 saat sonrasını hesaplayın.
// 25. '2023-11-28 14:30:00' tarihini nasıl sadece tarih (gün, ay, yıl) olarak yazdırabilirsiniz?
// 26. '2023-11-28 14:30:00' tarih ve saatini nasıl 'yyyy-MM-dd' formatında yazdırırsınız?
// 27. '2023-11-28' tarihinin hangi gün olduğunu nasıl öğrenirsiniz?
// 28. Şu anki saatin 15 dakika sonrası hangi saattir?
// 29. 1 hafta sonra hangi tarihi elde edersiniz?
// 30. 2 saat önce hangi saat olur?
// 31. Şu anki tarih ve saati nasıl 'dd-MM-yyyy HH:mm:ss' formatında yazdırırsınız?
// 32. Belirli bir saati 'HH:mm' formatında yazdırın.
// 33. Bugün hangi gündür?
// 34. '2023-11-28' tarihini nasıl 'yyyy/MM/dd' formatında yazdırırsınız?
// 35. '2024-01-01' tarihinin hafta numarasını nasıl alırsınız?
// 36. Saat 12:00'dan 30 dakika öncesini nasıl hesaplar ve yazdırırsınız?
// 37. '2023-11-28 14:30' tarihini 'dd/MM/yyyy HH:mm' formatına nasıl dönüştürürsünüz?
// 38. '2023-12-31' tarihini bir hafta sonrası ile karşılaştırın.
// 39. '2023-11-28' tarihini '2024-01-01' ile karşılaştırın.
// 40. '2023-11-28' tarihi ile şu anki tarihi karşılaştırın.
// 41. Bugünden 3 hafta önce hangi tarihi elde edersiniz?
// 42. '2023-11-28 14:30:00' tarihini 'dd/MM/yyyy HH:mm:ss' formatında yazdırın.
// 43. Saat 17:00'dan 3 saat sonrası hangi saattir?
// 44. 1 saat 30 dakika sonrası hangi saattir?
// 45. '2023-11-28' tarihi ile '2023-11-30' tarihini karşılaştırın.

    }
}
