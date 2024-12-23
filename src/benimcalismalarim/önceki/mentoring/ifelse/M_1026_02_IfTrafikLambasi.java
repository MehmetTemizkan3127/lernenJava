package benimcalismalarim.önceki.mentoring.ifelse;

import java.util.Scanner;

public class M_1026_02_IfTrafikLambasi {
    public static void main(String[] args) {
       /*  1) Trafik Işığı
        Bir trafik ışığı uygulaması, ışığın durumuna göre ne yapılacağını söyleyecek. Eğer ışık kırmızıysa duracak,
        sarıysa hazırlıklı olacak ve yeşilse devam edecek .....
        */

        Scanner input = new Scanner(System.in);
        System.out.println(" Lütfen trafik lambasinin rengini giriniz ; ");
        String lambaRengi = input.nextLine().toLowerCase();

       if(lambaRengi.equals("kirmizi")) {
           System.out.println("Dur!");
       }else if(lambaRengi.equals("sari")){
           System.out.println("Hazirlan!");
       }else if(lambaRengi.equals("yesil")){
           System.out.println("Devam et!");
       }else{
           System.out.println("Gecersiz renk girdiniz lütfen kirmizi sari ve yesil renklerinden birini giriniz : ");
       }
    }
}