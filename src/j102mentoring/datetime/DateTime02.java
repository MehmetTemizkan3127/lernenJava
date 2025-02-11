package j102mentoring.datetime;

import java.time.LocalTime;

public class DateTime02 {
    public static void main(String[] args) {
        //Örnek 2 : Şu Anki Saat, 2 Saat Önce ve 3 Saat Sonra yazıralım
        LocalTime suan = LocalTime.now();
        System.out.println("Bugün = " + suan);

        LocalTime ikiSaatOnce = suan.minusHours(2);
        System.out.println("Iki saat önce = " + ikiSaatOnce);

        LocalTime ucSaatSonra = suan.plusHours(3);
        System.out.println("Üc saat sonra = " +ucSaatSonra );
    }
}
