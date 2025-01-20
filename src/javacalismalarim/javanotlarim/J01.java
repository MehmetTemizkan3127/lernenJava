package javacalismalarim.javanotlarim;

public class J01 {
    public static void main(String[] args) {
        /*
        JAVA NOTLARI
        --> break: sonsuz döngüyü kirar.
        --> append sona eleman ekleme
        --> Surround with try-catch


        ACCES MODIFIER
        Erişim Belirleyici	Aynı Sınıf	Aynı Paket	Alt Sınıf (Farklı Paket)	Başka Paket
        public	                ✔	        ✔	            ✔	                    ✔
        protected	            ✔	        ✔	            ✔	                    ❌
        default	                ✔	        ✔	            ❌	                    ❌
        private	                ✔	        ❌	            ❌	                    ❌











*/

       /* Scanner giris = new Scanner(System.in);

        try {
            System.out.print("Bir sayı giriniz: ");
            int sayi = giris.nextInt();

            if (sayi < 0) {
                throw new IllegalArgumentException("Eksi bir sayı girdiniz!"); // Hata fırlatma
            }

            System.out.println("Girilen sayı: " + sayi);
        } catch (Exception hata) {
            System.out.println("Bir hata oluştu: " + hata.getMessage()); // Hata mesajını yazdırma
        }*/

        int sonuc = toplaVeYazdir(5, 10); // Çıktı: Toplam: 15
        System.out.println("Sonuç başka yerde kullanılıyor: " + sonuc); // Çıktı: Sonuç başka yerde kullanılıyor: 15
    }

    public static int toplaVeYazdir(int a, int b) {
        int toplam = a + b;
        System.out.println("Toplam: " + toplam); // Toplamı ekrana yazdırır
        return toplam; // Toplamı döndürür
}}
