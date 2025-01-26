package javacalismalarim.sinavhazirliklari;

public class Hesaplamalar {
    public static void main(String[] args) {

       double not1 = 80.50;
       double not2 = 40.80;
       double not3 = 60.50;

        System.out.println("Ortalama = "+ ortalamaHesapla(not1, not2, not3));

        int sayi = 4;
        int faktöriyel = 1;

        for (int i = 1; i <= sayi; i++){
            faktöriyel *= i;
        }
        System.out.println("faktöriyel = " + faktöriyel);



    }

    public static double ortalamaHesapla(double... sayilar) {

        double toplam = 0;

        for (double sayi : sayilar){
            toplam += sayi;

        } return (sayilar.length > 0) ? toplam / sayilar.length : 0;
    }
}
