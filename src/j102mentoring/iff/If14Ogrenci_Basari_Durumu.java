package j102mentoring.iff;

import java.util.Scanner;

public class If14Ogrenci_Basari_Durumu {
    public static void main(String[] args) {
        /*Soru:
        Bir öğrencinin notuna göre hangi başarı seviyesinde olduğunu belirleyen bir program yazın.
        Eğer öğrenci 60'tan yüksek aldıysa, önce "Geçti" mesajı verilsin, ardından 85'ten yüksek bir not aldıysa
        "Başarılı" olarak belirtilsin. Eğer öğrenci 60'tan düşük aldıysa, "Kaldı" mesajı verilsin
        ve 30'dan küçük bir notsa "Yetersiz" olarak gösterilsin.
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen notunuzu giriniz : ");
        int not = input.nextInt();

        if (not>=85&&not<=100){
            System.out.println("Basarili");
        } else if (not>=60&&not<85) {
            System.out.println("Geçti");
        }else if (not>=0&&not<60){
            System.out.println("Kaldı");
        }else {
            System.out.println("Gecersiz bir deger girdiniz. Lütfen 0 ile 100 arasinda bir deger giriniz");
        }
    }
}
