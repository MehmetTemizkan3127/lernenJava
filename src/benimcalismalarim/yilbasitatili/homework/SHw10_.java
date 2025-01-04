package benimcalismalarim.yilbasitatili.homework;

import java.util.Scanner;

public class SHw10_ {
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
              Kullanıcıdan ara sınav notunu, final notunu ve proje notunu girmesini isteyin.
              Genel notu hesaplayın (ara sınav: %30, proje: %20, final: %50).*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen vize notunuzu giriniz = ");
        double vizeNotu = scanner.nextDouble();

        System.out.println("Lütfen final notunuzu giriniz = ");
        double finalNotu = scanner.nextDouble();

        System.out.println("Lütfen final notunuzu giriniz = ");
        double projeNotu = scanner.nextDouble();

        double genelNot = vizeNotu*0.3 + projeNotu*0.2+finalNotu*0.5;
        System.out.println("genelNot = " + genelNot);

        // ************************** Task 02 ***********************************
           /*
          TASK ->
          Kullanicidan boyunu cm olarak, kilosunu kilogram olarak alin
          ve vucut kutle endeksini bulun.
          Sonucu tamsayi ve ondalikli sayi olarak yazdirin
          VKE= kilo/(boy*boy) …….. Kilo : kilogram , Boy : metre olmalidir
          Ornek : Input : boy :180 kilo : 80
                  Output : Vucut kutle endeksiniz : 24
                           Vucut kutle endeksiniz : 24.691…
            */
        // ************************** Task 03 ***********************************
            /*
         TASK->
         Kullaniciya gunde kac saat uyudugunu alıp ayda yilda ve 40 yilda kac gununun uykuda gectigini print eden code create ediniz
         Ornek : Input : 8
                 Output : Ayda 10, yilda 121, 40 yilda 4866 gununuz uykuda geciyor
            */
        // ************************** Task 04 ***********************************
          /* TASK ->
        Clarusway spor salonu için kullanıcıdan isim soyisim, yaş, kilo, boy, salona devam edeceği ay süresini
        bilgilerini alıp aylık $20 olarak toplam ücretini hesplayıp print eden code create ediniz.
         */
        // ************************** Task 05 ***********************************
        // Task-> kullanicidan 2 tam sayinın  dort islem sonucunu print eden code create ediniz.
        // ************************** Task 06 ***********************************
            /* Task->
        Bir dik üçgenin iki dik kenarını alarak hipotenüsünü hesaplayan kod yazınız.
hipotenus=birinciKenar*birinciKenar+ikinciKenar*ikincikenar karekoku
        Örnek Ekran Çıktısı
        birinci kenar: 12
        ikinci kenar: 5
        hipotenus: 13      */
        // ************************** Task 07 ***********************************
            /*  Task->
        Mesafeyi ve hızı alıp süreyi hesaplayan bir kod yazınız.
        Örneğin:İstanbul ile Ankara arası 400km olarak ölçülmektedir. Bu yolu ortalama
        120 km/saat hızla giden bir araç ne kadar sürede hedefe varır?
        Örnek Ekran Çıktısı
        Mesafeyi giriniz: 400
        Hızı giriniz: 100
        Süre 4 saattir.
     */
        // ************************** Task 08 ***********************************
        /*Task->
         * Kullanicidan alacaginiz vize1 vize2 ve final notlarini
         * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
         */
        // ************************** Task 09 ***********************************
            /*  Task->
        Kullanıcıdan a,b ve c sayılarını okuyarak aşağıdaki işlemi yapan kodu yazınız
        a'nın karesinden b'nin karesini cikarip c nin 3 katina bolunuz
        Örnek Ekran Çıktısı
        a sayısını giriniz: 5
        b sayısını giriniz: 3
        c sayısını giriniz: 1
        sonuç : 5.333333333333333
        */
        // ************************** Task 10 ***********************************
            /*
    Task->
    Write a Java program to convert temperature from Fahrenheit to Celsius degree.
    formula :  c = (f-32)*5/9
     */
        // ************************** Task 11 ***********************************
        /* Task->
         * Kullanicidan bir character girmesini isteyin ve
         * girilen karakteri ve ascii degerini yazin
         *
         * Ornek : Input  : a
         *         Output : Girdiginiz ‘a’ karakterinin ascii degeri : 95
         *
         *
         */
        // ************************** Task 12 ***********************************
            /*
    Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.
    (Not : KDV tutarını 18% olarak alın)
    KDV'siz Fiyat = 10;
    KDV'li Fiyat = 11.8;
    KDV tutarı = 1.8;
    Ödev
    Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı print eden code create ediniz
     */
    }
}
