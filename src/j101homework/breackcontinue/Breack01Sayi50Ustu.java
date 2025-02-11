package j101homework.breackcontinue;

import java.util.Scanner;

public class Breack01Sayi50Ustu {
    public static void main(String[] args) {
        /*
    Task 01:  Kullanıcıdan bir sayı alarak 1’den bu sayıya kadar olan sayıları kontrol et.
    Eğer sayı 50’ye ulaşırsa döngüyü sonlandır (break kullan). Çift sayılarda ekrana
    "Çift sayı bulundu" mesajı yaz ve sonraki sayıya geç (continue kullan).
 */
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen pozitif bir sayi giriniz : ");
        int sayi = input.nextInt();
        int i = 1;
        while (i <= sayi) {
            if (i == 50) {
                System.out.println("50'ye ulasildi ve döngü sonlaniyor.");
                break;
            }
            if (i % 2 != 0) {
                i++;
                continue;
            }
            System.out.println("Cift sayi bulundu: " + i);
            i++;
        }
    }
}
