package j102mentoring.switchh;

import java.util.Locale;
import java.util.Scanner;

public class M_1028_02_SwitchNotDüzenlemesi {
    public static void main(String[] args) {
        // 100 - 90 "A - Mükemmel"
        //  89 - 80 "B - Iyi"
        //  79 - 70 "C - Orta"
        //  69 - 60 "D - Geçer"
        //  59 - 50 "E - Sartli Gecer"
        //  49 - 0  "F - Kalir"
        // Bu yapıyı switch-case ile yazalım.

        Scanner input = new Scanner(System.in).useLocale(Locale.US);;

        System.out.println("Lütfen 0-100 arası notunuzu giriniz (ondalıklı sayıyı '.' ile ayırın): ");

        String inputString = input.nextLine();
        double not;

        try {
            not = Double.parseDouble(inputString);
            String derece;
            int yuvarlanmisNot = (int) Math.round(not);

            if (not < 0 || not > 100) {
                System.out.println("Geçersiz not, lütfen 0 ile 100 arası bir not giriniz.");
                return;
            }

            switch (yuvarlanmisNot / 10) {
                case 10:
                case 9:
                    derece = "A - Mükemmel";
                    break;
                case 8:
                    derece = "B - İyi";
                    break;
                case 7:
                    derece = "C - Orta";
                    break;
                case 6:
                    derece = "D - Geçer";
                    break;
                case 5:
                    derece = "E - Şartlı Geçer";
                    break;
                default:
                    derece = "F - Kalır";
                    break;
            }

            System.out.println("Notunuz: " + not + " - " + derece);
        } catch (NumberFormatException e) {
            System.out.println("Lütfen geçerli bir sayı giriniz (ondalıklı sayıyı '.' ile ayırın).");
        }
    }

}
