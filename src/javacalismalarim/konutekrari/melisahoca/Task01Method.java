package javacalismalarim.konutekrari.melisahoca;

import java.util.Scanner;



public class Task01Method {
    public static void main(String[] args) {

        // 150 karakterlik metni yazdırabileceğim bir alanım var.
        // Kullanıcının girdiği bir metni nu alana yazıp yazamayacağımı bulmak istiyorum.
        // Method mantıgı --> Her method 1 iş yapmalı
        // Method mantığı --> Bir method 1 den fazla iş yapmamalı
        // Kullanıcının girdiği metnin uzunluğunu hesaplayan bie method yazalım.
        // (return typlı olsa ne faydamız olur --- Return typsız olsa ne faydamız olur dusunelim)
        // Bu uzunluğun 150 karakterlik alanan sığıp sıgmayacagını bana soyleyen bir method yazalım

        // Kullanıcıdan metin alınır
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen bir metin giriniz: ");
        String metin = scanner.nextLine();
        scanner.close();

        // Metnin uzunluğu hesaplanır
        int uzunluk = uzunlukHesapla(metin);

        // Metnin 150 karakter sınırına sığıp sığmadığı kontrol edilir ve sonuç yazdırılır
        sigarMi(uzunluk);
    }

    // Metnin uzunluğunu hesaplayan metot
    public static int uzunlukHesapla(String metin) {
        return metin.length();  // Metnin uzunluğunu hesaplayıp döndürür
    }

    // Metnin 150 karakterlik alana sığıp sığmadığını kontrol eden metot
    public static void sigarMi(int uzunluk) {
        if (uzunluk <= 150) {
            System.out.println("✅ Metin 150 karakterlik alana sığıyor.");
        } else {
            System.out.println("❌ Metin 150 karakterlik alana sığmıyor.");
        }
    }
}