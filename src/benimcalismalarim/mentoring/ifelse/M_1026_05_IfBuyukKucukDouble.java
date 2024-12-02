package benimcalismalarim.mentoring.ifelse;

import java.util.Scanner;

public class M_1026_05_IfBuyukKucukDouble {
    public static void main(String[] args) {
     /* double1 ve double2 isimli iki tane double oluşturulmuştur.
   Eğer double1, double2'dan büyük ise "double 1 is greater than double 2" yazdırınız.
   Eğer double1, double2'dan küçük ise "double 1 is smaller than double 2" yazdırınız. */

        Scanner input = new Scanner(System.in);

        System.out.println("Double bir sayi giriniz : ");
        double double1 = input.nextDouble();

        System.out.println("Double ikinci sayiyi giriniz : ");
        double double2 = input.nextDouble();

        if(double1 > double2 ){System.out.println("double 1 is greater than double 2");

        } else if(double1 < double2 ){System.out.println("double 1 is smaller than double 2");
        }
    }
}
