package benimcalismalarim.mentoring.ternary;

import java.util.Scanner;

public class M_1029_03_TernaryOperatorSicaklikSogukSicakIliman {
    public static void main(String[] args) {

        // Bir sıcaklık değerine göre "Soğuk", "Ilıman" veya "Sıcak" olup olmadığını kontrol edin.
        // 0'ın altı "Soğuk", 1 ile 30 arası "Ilıman", 30 ve üzeri ise "Sıcak".

        Scanner input = new Scanner(System.in);

        System.out.print("Sicaklik değerini giriniz: ");
        int sicaklik = input.nextInt();

        String sonuc = (sicaklik < 0) ? "Soğuk" : (sicaklik >= 1 && sicaklik < 30) ? "Iliman" : "Sicak";
        System.out.println("Hava durumu: " + sonuc);
    }
}
