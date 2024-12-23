package benimcalismalarim.önceki.dummy;

public class LocalDateTime {
    public static void main(String[] args) {
       /* LocalDate bugun = LocalDate.now();
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

        LocalDate ongunOnce = bugun.minusDays(10);
        LocalDate ongunSonra = bugun.plusDays(10);
        String formatliTarih = ongunOnce.format(f1);
        String formatliTarih1 = ongunSonra.format(f1);
        System.out.println("On gün önce = " + formatliTarih);
        System.out.println("On gün sonra = " + formatliTarih1);

        String dogumGunuString = "03.09.1978";

        // DateTimeFormatter ile tarih formatı
        DateTimeFormatter tarihFormati = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        // String'ten LocalDate'e dönüşüm
        LocalDate dogumGunu = LocalDate.parse(dogumGunuString, tarihFormati);

        // Bugünün tarihi
        LocalDate bugun2 = LocalDate.now();

        // Bu yılki doğum günü tarihi
        LocalDate dogumGunuBuYil = LocalDate.of(bugun2.getYear(), dogumGunu.getMonth(), dogumGunu.getDayOfMonth());

        // Eğer bu yılki doğum günü geçmişse, bir sonraki yılın doğum gününü hesapla
        if (bugun2.isAfter(dogumGunuBuYil)) {
            dogumGunuBuYil = dogumGunuBuYil.plusYears(1);  // Sonraki yılın doğum günü
        }

        // Doğum günü ile bugünün arasındaki gün farkını hesapla
        long gunFarki = ChronoUnit.DAYS.between(bugun2, dogumGunuBuYil);

        Period period = Period.between(dogumGunu, bugun2);
        // Sonucu yazdır

        System.out.println("Yaş: " + period.getYears() + " yıl, " + period.getMonths() + " ay, " + period.getDays() + " gün");
        System.out.println("Doğum gününe " + gunFarki + " gün kaldı.");
*/
        StringBuilder sb = new StringBuilder();
        sb.append("salih"+" Mehmet");
        System.out.println("sb = " + sb);
        System.out.println("sb.length() = " + sb.length());
        System.out.println(sb.capacity());  // 16 (varsayılan kapasite)
    }
}
