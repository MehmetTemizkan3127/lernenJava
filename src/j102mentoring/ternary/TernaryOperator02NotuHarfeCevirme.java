package j102mentoring.ternary;

import java.util.Scanner;

public class TernaryOperator02NotuHarfeCevirme {
    public static void main(String[] args) {

        // Bir öğrencinin aldığı notu harf notuna çeviren sistem.
        // 90 ve üstü "A", 80-89 arası "B", 70-79 arası "C", 60-69 arası "D", geri kalanı "F".

        Scanner input = new Scanner(System.in);
        System.out.println("Notunuzu giriniz : ");
        int not = input.nextInt();

        String harfNotu = (not >= 90) ? "A" :  (not >= 80) ? "B" : (not >= 70) ? "C" :   (not >= 60) ? "D" : "F";

        System.out.println("harfNotu = " + harfNotu);
    }}
