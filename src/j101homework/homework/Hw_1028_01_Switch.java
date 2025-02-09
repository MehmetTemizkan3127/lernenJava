package j101homework.homework;

import java.util.Scanner;

public class Hw_1028_01_Switch {
    public static void main(String[] args) {
        // Task-> Girilen güne  göre 100 gün sonraki hangi günü print eden code create ediniz.
        //  hafta başlangıcı:pazartesi alınız

        // ipucu: Günleri sayılara atayarak mod 7 de iişem yapmayı deneyebilirsiniz
        // Mesela pazartesi = 1 olsun 10 gün sonra mod 7 de 3 olur. Yani 3 dün sonrasını yazdırmalıyız

        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan gün sayısını alalım
        System.out.print("Kaçıncı gün olduğunu giriniz (örneğin 98): ");
        int gunSayisi = scanner.nextInt();

        // Gün sayısını 7'ye mod alarak haftalık döngüyü bulalım
        int kalanGun = gunSayisi % 7;

        // 0 ise haftanın son günü olan Pazar'ı temsil eder
        if (kalanGun == 0) kalanGun = 7;

        // Kalan güne göre haftanın gününü switch ile belirle
        String gun = "";
        switch (kalanGun) {
            case 1: gun = "Pazartesi"; break;
            case 2: gun = "Salı"; break;
            case 3: gun = "Çarşamba"; break;
            case 4: gun = "Perşembe"; break;
            case 5: gun = "Cuma"; break;
            case 6: gun = "Cumartesi"; break;
            case 7: gun = "Pazar"; break;
        }

        System.out.println(gunSayisi + ". gün: " + gun);





    }
}
