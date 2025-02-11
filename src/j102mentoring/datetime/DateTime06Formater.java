package j102mentoring.datetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateTime06Formater {
    public static void main(String[] args) {
       // Örnek: Haftanın Gününü Belirleme

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen gününü öğrenmek istediğiniz tarihi giriniz (dd-MM-yyyy formatında): ");
        String istenilenTarih = input.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        LocalDate girilenTarih = LocalDate.parse(istenilenTarih, formatter);

        System.out.println("Girdiginiz tarih haftanın "+girilenTarih.getDayOfWeek()+" günüdür.");
    }
}
