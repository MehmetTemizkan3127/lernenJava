package j102mentoring.ikincibölüm;

import java.util.Scanner;

public class M_1027_02_FinalOrtalamasi {
    public static void main(String[] args) {

        /* TASK->
		 Ask user to enter mid-term grade, final grade, and project grade
		 Calculate the general grade (mid-term : 30% , project : 20%, final : 50%)
		 */
        Scanner scn = new Scanner(System.in);

        System.out.println("Vize notunuzu girin (100 üzerinden): ");
        double vizeNotu = scn.nextDouble();

        System.out.println("Proje notunuzu girin (100 üzerinden): ");
        double projeNotu = scn.nextDouble();

        System.out.println("Final notunuzu girin (100 üzerinden): ");
        double finalNotu = scn.nextDouble();

        double ortalama = (vizeNotu * 0.3) + (projeNotu * 0.2) + (finalNotu * 0.5);
        System.out.println("ortalama = " + ortalama);


    }
}
