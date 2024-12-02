package benimcalismalarim.metodlar;

import java.util.Scanner;

public class Met_Karisik {
    public static void main(String[] args) {
        // soru 8)Aşağıdaki kodda, a ve b değişkenlerini kullanarak a'nın değerini b'nin değerine
        // 3 ekleyerek nasıl güncelleyebilirsiniz? int a = 4; int b = 2;
        int a = 4; int b = 2;
        a = b + 3;
        System.out.println("a'nın güncellenmis degeri: " + a);




        // soru 9)Soru: Aşağıdaki kodda, counter değişkenini başlangıçta 0 olarak tanımlayın ve
        // ardından counter'ı bir artırarak ve bir azaltarak sonuçları ekrana yazdırın.
        int counter = 0;
        counter++;
        System.out.println("Counter bir artırıldı: " + counter);

        counter--;
        System.out.println("Counter bir azaltildi: " + counter);

// KUllanicidan adini soyadini ayri ayri  alip yanyana yazdiriniz.

        Scanner scn = new Scanner(System.in);
        System.out.println("Adinizi giriniz : ");
        String ad = scn.nextLine();
        System.out.println("Soyadinizi giriniz : " );
        String soyad = scn.nextLine();
        System.out.print("Adiniz ve soyadiniz : " + ad + " " + soyad);



        // Task 1) Kullanıcıdan doğum yılını alarak yaşını hesaplayın.
        System.out.println("\nDogum tarihinizi giriniz");
        int dogumT = scn.nextInt();

        int yil = 2024;
        int yas = 2024-dogumT;
        System.out.println("Yasiniz = " + yas);

        //********************************************** Task1 **********************************************

        // Task 01) // İki sayının en büyüğünü bulma.
        System.out.println("Birinci sayiyi giriniz");
        int sayi1 = scn.nextInt();
        System.out.println("Ikinci sayiyi giriniz");
        int sayi2 = scn.nextInt();
        String sonuc = (sayi1 > sayi2) ? "Sayi1 büyüktür" : "Sayi2 büyüktür";
        System.out.println("sonuc = " + sonuc);





    }
}
