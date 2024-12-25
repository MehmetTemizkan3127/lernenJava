package benimcalismalarim.yilbasitatili;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*System.out.println("Lütfen 1'den 12'ye kadar bir ay seciniz = ");
        if (scan.hasNextInt()){
            int ay = scan.nextInt();
            scan.nextLine();

            switch (ay) {
                case 1:
                    System.out.println("Ocak 31 gün ceker ");
                    break;
                case 2:
                    System.out.println("Subat 28 gün ceker ");
                    break;
                case 3:
                    System.out.println("Mart 31 gün ceker ");
                    break;
                case 4:
                    System.out.println("Nisan 30 gün ceker ");
                    break;
                case 5:
                    System.out.println("Mayis 31 gün ceker ");
                    break;
                case 6:
                    System.out.println("Haziran 30 gün ceker ");
                    break;
                case 7:
                    System.out.println("Temmuz 30 gün ceker ");
                    break;
                case 8:
                    System.out.println("Agustos 31 gün ceker ");
                    break;
                case 9:
                    System.out.println("Eylul 30 gün ceker ");
                    break;
                case 10:
                    System.out.println("Ekim 31 gün ceker ");
                    break;
                case 11:
                    System.out.println("Kasim 30 gün ceker ");
                    break;
                case 12:
                    System.out.println("Aralik 31 gün ceker ");
                    break;
                default:
                    System.out.println("Geçersiz bir ay numarası girdiniz!");
                    break;
            }

        }else {
            System.out.println("Hata; Lütfen 12 aydan bir ayi sayisal giriniz(1-12) giriniz ");
        }*/

        System.out.println("Lütfen haftanin 7 gününden b ir günü rakam olarak giriniz = ");
        if (scan.hasNextInt()) {
            int gun = scan.nextInt();
            scan.nextLine();

            switch (gun) {
                case 1:
                    System.out.println("Pazartesi");
                    break;
                case 2:
                    System.out.println("Sali");
                    break;
                case 3:
                    System.out.println("Carsamba");
                    break;
                case 4:
                    System.out.println("Persembe");
                    break;
                case 5:
                    System.out.println("Cuma");
                    break;
                case 6:
                    System.out.println("Cumartesi");
                    break;
                case 7:
                    System.out.println("Pazar");
                    break;
                default:
                    System.out.println("Gecersiz bir gün girdiniz");
                    break;
            }
        } else {
            System.out.println("Hatat: Lütfen 1-7 araliginda sayisal bir rakam giriniz! ");
        }
    }
}
