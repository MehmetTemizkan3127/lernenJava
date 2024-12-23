package benimcalismalarim.önceki.mentoring.ifelse;

import java.util.Scanner;

public class M_1026_01_If {
    public static void main(String[] args) {
  /*      Altta int number klavyeden girilerek oluşturulmuştur.
        Eğer int number 0 yazdırılırsa "Im neutral",
        Eğer int number 0'dan büyükse "I m positive",
        Eğer int number 0'dan küçükse "I am negative" yazdırılsın.   */

        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");

        String userInput = scan.nextLine(); // Girişi önce String olarak al

        // Girişin sadece sayılardan oluştuğunu kontrol et
        if (userInput.matches("-?\\d+")) { // Negatif sayılar için "-" işaretini de kabul eder
            int number = Integer.parseInt(userInput); // Sayıya çevir

            if (number > 0) {
                System.out.println("I'm positive");
            } else if (number < 0) {
                System.out.println("I'm negative");
            } else {
                System.out.println("I'm neutral");
            }
        } else {
            System.out.println("Geçersiz giriş. Lütfen bir sayı girin.");
        }
    }
}
