package j101homework.önceki.j102mentoring.ifelse;

import java.util.Scanner;

public class M_1026_03_IfTrafikLambasi {
    public static void main(String[] args) {
     // 1) Trafik Işığı
       //Bir trafik ışığı uygulaması, ışığın durumuna göre ne yapılacağını söyleyecek. Eğer ışık kırmızıysa duracak,
        //sarıysa hazırlıklı olacak ve yeşilse devam edecek.

        Scanner input = new Scanner(System.in);
        System.out.println("Lamba rengini giriniz");
        String lambaRengi = input.next();

        if (lambaRengi.equals("kirmizi")) {
            System.out.println("duracak");
        } else if (lambaRengi.equals("sari")) {
            System.out.println("hazirlikli ol");
        }else {
            System.out.println("devam et");
        }
    }
}
