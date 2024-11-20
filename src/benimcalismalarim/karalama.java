package benimcalismalarim;

import java.util.Arrays;

public class karalama {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};


        System.out.print("Tek Sayılar: ");
        for (int num : array) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }
        }

        System.out.println(); // Satır sonu

        System.out.print("Çift Sayılar: ");
        for (int num : array) {
            if (num % 2 == 0) {
                System.out.print(num + " "); 
            }
        }
    }
}
