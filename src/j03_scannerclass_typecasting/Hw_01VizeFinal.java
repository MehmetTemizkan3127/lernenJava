        package j03_scannerclass_typecasting;

        import java.util.Scanner;

        public class Hw_01VizeFinal {
         public static void main(String[] args) {

        // ************************** Task 01 ***********************************
        /* TASK->
         Ask user to enter mid-term grade, final grade, and project grade
         Calculate the general grade (mid-term : 30% , project : 20%, final : 50%)
          Example:
              INPUT: mid-term grade=78
                     final grade = 66
                     project grade = 90
              OUTPUT: "Your grade is : 81,6"
         */

        Scanner scn = new Scanner(System.in);

        System.out.print("Lütfen mid-term notunu girin: ");
        double midTerm = scn.nextDouble();

        System.out.print("Lütfen final notunu girin: ");
        double finalGrade = scn.nextDouble();

        System.out.print("Lütfen proje notunu girin: ");
        double projectGrade = scn.nextDouble();

        double generalGrade = (midTerm * 0.30) + (finalGrade * 0.50) + (projectGrade * 0.20);

        System.out.printf("Your grade is: %.1f%n", generalGrade);
    }
}