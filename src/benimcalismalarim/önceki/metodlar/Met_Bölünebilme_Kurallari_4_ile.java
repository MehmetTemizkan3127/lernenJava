package benimcalismalarim.önceki.metodlar;

public class Met_Bölünebilme_Kurallari_4_ile {
    public static void main(String[] args) {
        System.out.println("Üç basamaklı 4 ile tam bölünebilen sayılar:");

        int sayi = 100; // Üç basamaklı sayılar 100'den başlar
        while (sayi <= 999) { // 999'a kadar devam et
            if (sayi % 4 == 0) { // Sayı 4 ile tam bölünebiliyorsa
                System.out.print(sayi + " "); // Sayıyı yazdır
            }
            sayi++; // Sayıyı bir artır
        }
    }
}
