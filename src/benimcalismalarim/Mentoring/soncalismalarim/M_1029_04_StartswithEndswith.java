package benimcalismalarim.Mentoring.soncalismalarim;

import java.util.Scanner;

public class M_1029_04_StartswithEndswith {
    public static void main(String[] args) {
        // Senaryo 4 :
//  Kullanıcıdan iki kelime alın.
//  Eğer ilk kelimenin son karakteri ile ikinci kelimenin ilk karakteri aynıysa,
//  iki kelimeyi birbirine ekleyin. (harf aynı ise harfi 1 kez yazdırın)
//  Aksi halde ayrı ayrı yazdırın.

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen birinci kelimeyi giriniz : ");
        String ilkKelime = input.nextLine().toLowerCase();

        System.out.println("Lütfen ikinci kelimeyi giriniz : ");
        String ikincikelime = input.nextLine().toLowerCase();


        String sonKarakterIlkKelime = ilkKelime.substring(ilkKelime.length() - 1);
        String ilkKarakterIkinciKelime = ikincikelime.substring(0, 1);

        if (sonKarakterIlkKelime.equals(ilkKarakterIkinciKelime)) {

            System.out.println("Ilgili karekterler ayni : " + ilkKelime + ikincikelime.substring(1));
        } else {
            System.out.println("Ilgili karekterler birbirinden farkli : " + ilkKelime + " " + ikincikelime);
        }
    }
}
