package j101homework.forr;

import java.util.Scanner;

public class For02RakamSayisi {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir metin giriniz: ");
        String metin = scanner.nextLine();
        int rakamSayisi = 0;

        for (int i = 0; i < metin.length(); i++) {
            char karakter = metin.charAt(i);
            if (karakter >= '0' && karakter <= '9') {
                rakamSayisi++;
            }
        }
        System.out.println("Metindeki rakam sayisi : " + rakamSayisi);















    }
}
