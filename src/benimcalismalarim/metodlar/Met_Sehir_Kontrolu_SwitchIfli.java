package benimcalismalarim.metodlar;

import java.util.Scanner;

public class Met_Sehir_Kontrolu_SwitchIfli {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir şehir girin (örneğin: Şanlıurfa, İstanbul, Ankara):");
        String sehir = scanner.nextLine().toLowerCase(); // Kullanıcı girişi küçük harfe dönüştürülüyor.

        // Şehir kontrolü
        switch (sehir) {
            case "şanlıurfa":
                System.out.println("Girdiğiniz şehir: Şanlıurfa.");
                System.out.println("Şanlıurfa, tarihi ve kültürel zenginlikleriyle bilinir.");
                break;
            case "istanbul":
                System.out.println("Girdiğiniz şehir: İstanbul.");
                System.out.println("İstanbul, Türkiye'nin en kalabalık şehridir ve tarihi yapılarıyla ünlüdür.");
                break;
            case "ankara":
                System.out.println("Girdiğiniz şehir: Ankara.");
                System.out.println("Ankara, Türkiye'nin başkentidir.");
                break;
            case "izmir":
                System.out.println("Girdiğiniz şehir: İzmir.");
                System.out.println("İzmir, Ege Bölgesi'nde yer alır ve sahil şehri olarak bilinir.");
                break;
            default:
                System.out.println("Geçersiz şehir seçimi.");
                break;
        }
    }
}