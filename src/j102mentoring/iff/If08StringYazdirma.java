package j102mentoring.iff;

import java.util.Scanner;

public class If08StringYazdirma {
    public static void main(String[] args) {

    /*  Altta int number klavyeden girilerek oluşturulmuştur.
     Eğer, int number ikiye bölündüğünde geri kalanı 0'a eşit ise "number is a EVEN number" yazdırın.
     Eğer, int number ikiye bölündüğünde geri kalanı 0'a eşit değil ise "number is a ODD number" yazdırın.
*/

Scanner input = new Scanner(System.in);

System.out.println("Bir sayi giriniz : ");
int num = input.nextInt();

if (num % 2 == 0) {
    System.out.println("number is a EVEN number");

}else {
    System.out.println("number is a ODD number" );
}
    }
}
