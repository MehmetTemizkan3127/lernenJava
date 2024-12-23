package benimcalismalarim.önceki.metodlar;

import java.util.Scanner;

public class Met_Pozitif_Negatif_Sayi_If {
    public static void main(String[] args) {
    //Sayı Kontrolü:
    //Kullanıcıdan bir sayı girmesini isteyin. Girilen sayı pozitifse "Pozitif",
    // negatifse "Negatif", eğer sıfırsa "Sıfır" yazdırın.

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen herhangi bir sayi giriniz : ");
        int sayi = input.nextInt();
        if(sayi>0){
            System.out.println("Girdiginiz sayi pozitiftir");
        }else if(sayi<0){
            System.out.println("Girdiginiz sayi negatiftir");
        }else {
            System.out.println("Girdiginiz sayi Sifir");
        }
    }
}
