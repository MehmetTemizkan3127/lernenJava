package j10_methodcreation.task;

import java.util.Scanner;

public class Task04ATMproject {
    /*
        Bakıye (başlangıç bakıyesi 1000 tl) öğrenme, para yatırma ve cekme, çıkış işlemlerinin yapıldıgı bir
         ATM app. code create ediniz
    */

    // Global bakiye değişkeni
    private static double bakiye = 1000;

    public static void main(String[] args) {
        Scanner tarayici = new Scanner(System.in);
        boolean cikis = false;

        System.out.println("Hoşgeldiniz! ATM'ye eriştiniz.");

        while (!cikis) {
            anaMenuGoster();

            int secim = tarayici.nextInt(); // Kullanıcı seçimi alınıyor

            switch (secim) {
                case 1:
                    bakiyeGoster(); // Bakiye gösterme metodu
                    break;
                case 2:
                    paraYatir(tarayici); // Para yatırma metodu
                    break;
                case 3:
                    paraCek(tarayici); // Para çekme metodu
                    break;
                case 4:
                    cikis = cikisYap(); // Çıkış metodu
                    break;
                default:
                    System.out.println("Geçersiz seçim. Lütfen 1-4 arasında bir seçim yapınız.");
            }
        }

        tarayici.close(); // Kaynak serbest bırakılıyor
    }

    // -------------------- METODLAR --------------------

    // Ana menüyü ekrana yazdıran metot
    public static void anaMenuGoster() {
        System.out.println("\nAna Menü:");
        System.out.println("1. Bakiye Öğrenme");
        System.out.println("2. Para Yatırma");
        System.out.println("3. Para Çekme");
        System.out.println("4. Çıkış");
        System.out.print("Lütfen yapmak istediğiniz işlemi seçin: ");
    }

    // Bakiye gösteren metot
    public static void bakiyeGoster() {
        System.out.println("Mevcut bakiyeniz: " + bakiye + " TL");
    }

    // Para yatırma işlemini gerçekleştiren metot
    public static void paraYatir(Scanner tarayici) {
        System.out.print("Yatırmak istediğiniz tutarı giriniz: ");
        double yatirilacakTutar = tarayici.nextDouble();
        if (yatirilacakTutar > 0) {
            bakiye += yatirilacakTutar;
            System.out.println(yatirilacakTutar + " TL yatırıldı. Güncel bakiyeniz: " + bakiye + " TL");
        } else {
            System.out.println("Geçersiz tutar. Lütfen pozitif bir değer giriniz.");
        }
    }

    // Para çekme işlemini gerçekleştiren metot
    public static void paraCek(Scanner tarayici) {
        System.out.print("Çekmek istediğiniz tutarı giriniz: ");
        double cekilecekTutar = tarayici.nextDouble();
        if (cekilecekTutar > 0 && cekilecekTutar <= bakiye) {
            bakiye -= cekilecekTutar;
            System.out.println(cekilecekTutar + " TL çekildi. Güncel bakiyeniz: " + bakiye + " TL");
        } else if (cekilecekTutar > bakiye) {
            System.out.println("Yetersiz bakiye. Çekmek istediğiniz tutar bakiyenizi aşmaktadır.");
        } else {
            System.out.println("Geçersiz tutar. Lütfen pozitif bir değer giriniz.");
        }
    }

    // Çıkış işlemini gerçekleştiren metot
    public static boolean cikisYap() {
        System.out.println("Çıkış yapılıyor. İyi günler dileriz!");
        return true;
    }
}
