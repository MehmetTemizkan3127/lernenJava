package j101homework.homework;

import java.util.Scanner;

public class BreackContinue04BirKelimeyiAtlama {
    public static void main(String[] args) {
        /*
        Task:  Bir cümledeki kelimeleri sırayla yazdır, ancak belirli bir kelimeyi
        gördüğünde (örneğin "Java") o kelimeyi atla (continue kullan).
        Eğer cümlede "son" kelimesi geçerse döngüyü sonlandır (break kullan).
        */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen bir metin giriniz : ");
        String metin = scanner.nextLine();

        String word = "";

        for (int i = 0; i < metin.length(); i++) {
            char ch = metin.charAt(i);

            if (ch != ' ') {
                word += ch;
            } else {

                if (word.equalsIgnoreCase("Java")) {
                    word = "";
                    continue;
                }
                if (word.equalsIgnoreCase("son")) {
                    break;
                }
                System.out.println(word);
                word = "";
            }
        }
    }
}
