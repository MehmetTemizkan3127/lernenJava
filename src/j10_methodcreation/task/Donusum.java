package j10_methodcreation.task;

import java.util.Scanner;

public class Donusum {

    // Ana metodun dışında bulunan donusturMetodu
    // Bu metod dönüşüm türüne göre işlemi yapacak
    public static void donusturMetodu(double deger, String tur) {
        switch (tur) {
            case "saatten saniyeye":
                // Saatten saniyeye dönüşüm: 1 saat = 3600 saniye
                double saniye = deger * 3600;
                System.out.println(deger + " saat = " + saniye + " saniye.");
                break;

            case "milden kilometreye":
                // Mil'den kilometreye dönüşüm: 1 mil = 1.60934 km
                double kilometre = deger * 1.60934;
                System.out.println(deger + " mil = " + kilometre + " kilometre.");
                break;

            case "kilogramdan grama":
                // Kilogram'dan grama dönüşüm: 1 kg = 1000 gram
                double gram = deger * 1000;
                System.out.println(deger + " kilogram = " + gram + " gram.");
                break;

            default:
                System.out.println("Geçersiz dönüşüm türü.");
                break;
        }
    }

    // Ana metod, programın başlatıldığı yerdir
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan dönüşüm türü ve değerini alıyoruz
        System.out.println("Dönüşüm türünü seçin: ");
        System.out.println("1 - Saatten saniyeye: saatten saniyeye");
        System.out.println("2 - Mil'den kilometreye: milden kilometreye");
        System.out.println("3 - Kilogram'dan grama: kilogramdan grama");
        System.out.print("Seçiminizi yapın (saatten saniyeye / milden kilometreye / kilogramdan grama): ");
        String donusumTuru = scanner.nextLine();

        System.out.print("Dönüştürmek istediğiniz değeri girin: ");
        double deger = scanner.nextDouble();

        // Dönüşüm işlemini çağırıyoruz
        donusturMetodu(deger, donusumTuru);

        scanner.close();
    }
}

