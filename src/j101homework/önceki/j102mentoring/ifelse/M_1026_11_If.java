package j101homework.önceki.j102mentoring.ifelse;

import java.util.Scanner;

public class M_1026_11_If {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Notunuzu giriniz");
        double not1 = scan.nextDouble();
        int sonuc = (int) not1 / 10;

        switch (sonuc) {
            case 10:
            case 9:
                if (not1 <= 100) {
                    System.out.println("Notunuz A - Mükemmel");
                } else System.out.println("Yanlis veri girdiniz");
                break;
            case 8:
                System.out.println("Notunuz B - Iyi");
                break;
            case 7:
                System.out.println("Notunuz C - Orta");
                break;
            case 6:
                System.out.println("Notunuz D - Gecer");
                break;
            case 5:
                System.out.println("Notunuz E - Sartli gecer");
                break;
            case 4:
            case 3:
            case 2:
            case 1:
            case 0:
                if (not1 >=0) {
                    System.out.println("Notunuz F - Kalir");
                } else System.out.println("Yanlis veri girdiniz");
                break;
            default:
                System.out.println("Yanlis veri girdiniz");



        }


    }
}
