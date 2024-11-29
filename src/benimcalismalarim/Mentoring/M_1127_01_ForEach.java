package benimcalismalarim.Mentoring;

public class M_1127_01_ForEach {
    public static void main(String[] args) {
        // Bir veya birden fazla  method yazarak,  istediğiniz kadar array gönderin ve
        // gönderilen arraylerin toplamı en büyük olanını bulun
        // Diziler
        int[] arr = {12, 34, 56, 33, 45, 67, 88, 65, 55, 67, 55};
        int[] arr1 = {34, 56, 33, 45, 34, 56};
        int[] arr2 = {67, 88, 65, 55};


        int[][] arrays = {arr, arr1, arr2};
        int[] sonuc = enBuyukToplamiBul(arrays);


        System.out.println("En büyük toplam: " + sonuc[0]);
        System.out.println("En büyük toplamın indeks: " + sonuc[1]);
    }


    public static int arrayToplam(int[] array) {
        int toplam = 0;
        for (int sayi : array) {
            toplam += sayi;
        }
        return toplam;
    }

    public static int[] enBuyukToplamiBul(int[][] arrays) {
        int enBuyukToplam = arrayToplam(arrays[0]);
        int enBuyukIndex = 0;


        for (int i = 1; i < arrays.length; i++) {
            int toplam = arrayToplam(arrays[i]);
            if (toplam > enBuyukToplam) {
                enBuyukToplam = toplam;
                enBuyukIndex = i;
            }
        }

        return new int[]{enBuyukToplam, enBuyukIndex};
    }
}