package j102mentoring.iff;

import java.util.Scanner;

public class If04PositivNegativ {
    public static void main(String[] args) {
/*      Altta int number klavyeden girilerek oluşturulmuştur.
        Eğer int number 0 yazdırılırsa "Im neutral",
        Eğer int number 0'dan büyükse "I m positive",
        Eğer int number 0'dan küçükse "I am negative" yazdırılsın.   */
//Kodu aşağıya yazınız.

        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        if(number==0) {
            System.out.println("Im neutral");
        }else if(number > 0){
            System.out.println("I m positive");
        }else {
            System.out.println("I am negative");
        }
    }
}
