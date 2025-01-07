package homework.abstract02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*6 class oluştur. Calculator, Sum, Divide, Multiply , Substract , Main
        Calculator'ı a super class yap.
        super class'ın içinde;
        calculating adında bir abstract method oluturunuz.
        Burada iki tane int parametresi vardır.
        return tipi int'dir.
        Sum class'ın içinde;
        Calculator class'ına extend et.. (uzat, bağla)
        super class'ın içindeki calculating methodunu Override et.
        iki parametreyi topla ve sonucu return et.
                Divide class'ının içinde,
        Calculator class'ına extend et.. (uzat, bağla)
        super class'ın içindeki calculating methodunu Override et.
        iki parametreyi böl ve sonucu return et.
                Multiply class'ının içinde,
        Calculator class'ına extend et.. (uzat, bağla)
        super class'ın içindeki calculating methodunu Override et.
        iki parametreyi çarp ve sonucu return et.
                Substract class'ının içinde,
        Calculator class'ına extend et.. (uzat, bağla)
        super class'ın içindeki calculating methodunu Override et.
        iki parametreyi birbirinden çıkart ve sonucu return et.
                Main class'ın içinde
        scanner object oluşturunuz.
                iki int oluştur ve bu iki int değişkenine scanner ata.
        Sum methodu çağır ve sonucu yazdır.
        Divide methodu çağır ve sonucu yazdır.
        Multiply methodu çağır ve sonucu yazdır.
        Substract methodu çağır ve sonucu yazdır.*/

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen sayi1'i giriniz  = ");
        int sayi1 = scan.nextInt();

        System.out.println("Lütfen sayi2'yi giriniz = ");
        int sayi2;

        while (true) {
            System.out.print("İkinci sayıyı girin: ");
            sayi2 = scan.nextInt();


            if (sayi2 == 0) {
                System.out.println("Bölme ve Carpma islemi icin sayi2 sifir olamaz! Lütfen yeniden sayi2'yi giriniz.");
            } else {
                break;
            }
        }

        Calculator sum = new Sum();
        System.out.println("Toplama Sonucu          = " + sum.calculating(sayi1, sayi2));

        Calculator divide = new Divide();
        System.out.println("Bölme Sonucu            = " + divide.calculating(sayi1, sayi2));

        Calculator multiply = new Multiply();
        System.out.println("Carpma Sonucu           = " + multiply.calculating(sayi1, sayi2));

        Calculator subsract = new Substract();
        System.out.println("Cikarma Sonucu          = " + subsract.calculating(sayi1, sayi2));

    }
}
