package javacalismalarim.konutekrari.interviewquestions;

public class Task04 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4,7,5,6};
        System.out.println("Eksik Sayı: " + findMissingNumber(nums, 8));
    }

    public static int findMissingNumber(int[] nums, int n) {

        int beklenenToplam = n * (n + 1) / 2;

        int mevcutToplam = 0;
        for (int sayi : nums) {
            mevcutToplam += sayi;
        }

        return beklenenToplam - mevcutToplam;
    }
}


