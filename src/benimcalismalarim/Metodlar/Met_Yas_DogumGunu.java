package benimcalismalarim.Metodlar;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Met_Yas_DogumGunu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Tarih formatını belirtiyoruz
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        System.out.print("Doğum tarihinizi girin (YYYY-MM-DD): ");
        String dogumTarihiInput = scanner.nextLine();

        try {
            // Doğum tarihini belirlenen formata göre LocalDate'e dönüştürüyoruz
            LocalDate dogumTarihi = LocalDate.parse(dogumTarihiInput, formatter);
            LocalDate bugun = LocalDate.now();

            // Yaş hesaplama
            Period yas = Period.between(dogumTarihi, bugun);
            System.out.println("Yaşınız: " + yas.getYears() + " yıl, " + yas.getMonths() + " ay, " + yas.getDays() + " gün.");

            // Bu yılki doğum günü
            LocalDate buYilDogumGunu = LocalDate.of(bugun.getYear(), dogumTarihi.getMonth(), dogumTarihi.getDayOfMonth());

            // Eğer bu yılki doğum günü geçtiyse, bir sonraki yılın doğum gününü al
            if (buYilDogumGunu.isBefore(bugun) || buYilDogumGunu.isEqual(bugun)) {
                buYilDogumGunu = buYilDogumGunu.plusYears(1);
            }

            // Doğum gününe kalan gün sayısını hesapla
            long kalanGun = ChronoUnit.DAYS.between(bugun, buYilDogumGunu);
            System.out.println("Doğum gününüze " + kalanGun + " gün kaldı.");

        } catch (DateTimeParseException e) {
            System.out.println("Geçersiz tarih formatı! Lütfen tarihi YYYY-MM-DD formatında giriniz.");
        }

    }
}
