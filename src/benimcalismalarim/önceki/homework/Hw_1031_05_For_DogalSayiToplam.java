package benimcalismalarim.önceki.homework;

public class Hw_1031_05_For_DogalSayiToplam {
    public static void main(String[] args) {
        /* task -> İlk 10 doğal sayının toplamını print eden code create ediniz.
         */
        int toplam = 0;

        for (int i = 0; i < 10; i++) {
            toplam += i;
        }
        System.out.println("İlk 10 doğal sayının toplamı: " + toplam);
    }
}
