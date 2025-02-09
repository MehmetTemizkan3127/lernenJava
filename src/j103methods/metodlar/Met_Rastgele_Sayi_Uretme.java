package j103methods.metodlar;

public class Met_Rastgele_Sayi_Uretme {
    public static void main(String[] args) {


        for (int i = 0; i < 3; i++) {          // Dış döngü 3 kez çalışır (i = 0, 1, 2)

            for (int j = 0; j < 2; j++) {      // İç döngü 2 kez çalışır (j = 0, 1)

                int sayı = (int) (Math.random() * 10); // 0 ile 9 arasında rastgele tam sayı üretir
                System.out.println(sayı);              // Üretilen sayıyı ekrana yazdırır
            }

        }

    }
}
