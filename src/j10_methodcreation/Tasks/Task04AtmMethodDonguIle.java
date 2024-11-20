package j10_methodcreation.Tasks;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task04AtmMethodDonguIle {

    static Scanner input = new Scanner(System.in);
    static int bakiye = 1000;

    public static void main(String[] args) {
        atmBasla();
    }

    public static void atmBasla() {
        System.out.println("***************** Java Bank Uygulamasına Hoş Geldiniz: *****************");
        anaMenu();
    }

    public static void anaMenu() {
        while (true) {
            anaEkranMenusuAc();
            int secim = kullaniciSecimAl();
            switch (secim) {
                case 1 -> bakiyeSorgulama();
                case 2 -> paraYatirma();
                case 3 -> paraCekme();
                case 0 -> {
                    cikis();
                    break;
                }
                default -> System.out.println("Geçersiz seçim, lütfen tekrar deneyin.");
            }
        }
    }

    public static void anaEkranMenusuAc() {
        System.out.println("""
                ***************** Ana Menü *****************
                1: Bakiye sorgulama
                2: Para yatırma
                3: Para çekme
                0: Çıkış
                *******************************************
                """);
        System.out.print("Lütfen seçiminizi yapınız: ");
    }

    public static int kullaniciSecimAl() {
        int secim = -1;
        try {
            secim = input.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Hatalı giriş! Lütfen bir sayı giriniz.");
            input.nextLine(); // Scanner hatasını temizlemek için
        }
        return secim;
    }

    public static void bakiyeSorgulama() {
        System.out.println("-------------------- Bakiye Sorgulama --------------------");
        System.out.println("Bakiyeniz: " + bakiye + " TL");
        System.out.println("---------------------------------------------------------");
    }

    public static void paraYatirma() {
        System.out.println("-------------------- Para Yatırma ------------------------");
        System.out.print("Yatırmak istediğiniz miktarı giriniz: ");
        int miktar = kullaniciMiktarAl();
        if (miktar > 0) {
            bakiye += miktar;
            System.out.println("Para yatırıldı. Mevcut bakiyeniz: " + bakiye + " TL");
        } else {
            System.out.println("Geçersiz miktar.");
        }
        System.out.println("---------------------------------------------------------");
    }

    public static void paraCekme() {
        System.out.println("-------------------- Para Çekme -------------------------");
        System.out.print("Çekmek istediğiniz miktarı giriniz: ");
        int miktar = kullaniciMiktarAl();
        if (miktar > 0 && miktar <= bakiye) {
            bakiye -= miktar;
            System.out.println("Para çekildi. Mevcut bakiyeniz: " + bakiye + " TL");
        } else if (miktar > bakiye) {
            System.out.println("Yetersiz bakiye!");
        } else {
            System.out.println("Geçersiz miktar.");
        }
        System.out.println("---------------------------------------------------------");
    }

    public static int kullaniciMiktarAl() {
        int miktar = 0;
        try {
            miktar = input.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Hatalı giriş! Lütfen bir sayı giriniz.");
            input.nextLine(); // Scanner hatasını temizlemek için
        }
        return miktar;
    }

    public static void cikis() {
        System.out.println("Bizi tercih ettiğiniz için teşekkür ederiz.");
    }
}
