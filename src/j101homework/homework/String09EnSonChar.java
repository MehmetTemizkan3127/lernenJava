package j101homework.homework;

import java.util.Scanner;

public class String09EnSonChar {
    public static void main(String[] args) {
        //Task 11
        //Kullanıcıdan bir cümle alın ve bu cümlede ilk geçen "b" harfinden sonra en son geçen "c" harfinin indeksini bulun.
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir cümle giriniz: ");
        String sentence = input.nextLine();

        // İlk "b" harfinin indeksini bul
        int firstBIndex = sentence.indexOf('b');

        if (firstBIndex == -1) {
            System.out.println("Cümlede 'b' harfi bulunamadı.");
        } else {
            // "b" harfinden sonraki kısmı al
            String substringAfterB = sentence.substring(firstBIndex + 1);

            // Bu kısımda en son "c" harfinin indeksini bul
            int lastCIndexInSubstring = substringAfterB.lastIndexOf('c');

            if (lastCIndexInSubstring == -1) {
                System.out.println("'b' harfinden sonra bir 'c' harfi bulunamadı.");
            } else {
                // Orijinal cümledeki "c" harfinin gerçek indeksini bul
                int lastCIndex = firstBIndex + 1 + lastCIndexInSubstring;
                System.out.println("'b' harfinden sonra en son geçen 'c' harfinin indeksi: " + lastCIndex);
            }
        }
    }}