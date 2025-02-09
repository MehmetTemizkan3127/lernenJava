package j102mentoring.datetime;

import java.time.LocalDate;

public class M_1129_05_DateTimeFormatter {
    public static void main(String[] args) {
        //Bir Tarihin Yılın Kaçıncı Günü Olduğunu Bulma
        LocalDate tarih = LocalDate.now(); // Bugünün tarihini al
        int yilKacinciGun = tarih.getDayOfYear();

        System.out.println("Tarih: " + tarih);
        System.out.println("Yilin " + yilKacinciGun + ". günü.");
    }
}
