package benimcalismalarim.önceki.mentoring.ifelse;

import java.util.Scanner;

public class M_1026_10_IfElseGectiKaldi {
    public static void main(String[] args) {
    //Bir öğrencinin notuna göre hangi başarı seviyesinde olduğunu belirleyen bir program yazın. Eğer öğrenci 60'tan yüksek aldıysa,
        // önce "Geçti" mesajı verilsin, ardından 85'ten yüksek bir not aldıysa "Başarılı" olarak belirtilsin.
        // Eğer öğrenci 60'tan düşük aldıysa, "Kaldı" mesajı verilsin ve 30'dan küçük bir notsa "Yetersiz" olarak gösterilsin.

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen notunuzu giriniz : ");
        int puan = input.nextInt();

        if (puan >= 60) {
            System.out.println("Gecti");
            if (puan >= 85){
                System.out.println("Basarili");
            }
        }else if (puan<60) {
            System.out.println("Kaldi");
            if (puan < 30){
                System.out.println("Yetersiz");
            }
        }
    }}
