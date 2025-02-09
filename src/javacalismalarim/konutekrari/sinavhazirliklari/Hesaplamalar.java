package javacalismalarim.konutekrari.sinavhazirliklari;

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



        int num = 5;
        int faktöriyel1 = 1;
        for (int i = 1; i <= num; i++){
            faktöriyel1 *= i;

        }
        System.out.println("faktöriyel = " + faktöriyel1);

        int not = 5;
        double widNot = not;
        System.out.println("weidining = " + widNot);
        float ogr = 3.75F;
        int narrOgr = (int) ogr;
        System.out.println("Narrowing = " + narrOgr);

        int kizSayisi = 8;
        Integer autKizSayisi = kizSayisi;
        System.out.println("Autoboxing = " + autKizSayisi);

        Double fiyat = 15.27;
        double unboxFiyat = fiyat;
        System.out.println("Unboxing = " + unboxFiyat);

        String kelimeSayisi = "10";
        Integer autKelimeSayisi = Integer.valueOf(kelimeSayisi);
        System.out.println("autKelimeSayisi = " + autKelimeSayisi);

        String evSayisi = "5";
        int unboxEvSayisi = Integer.parseInt(evSayisi);
        System.out.println("autKelimeSayisi = " + unboxEvSayisi);
        int toplam = autKelimeSayisi+unboxEvSayisi;
        System.out.println("toplam = " + toplam);


















    }

    public static double ortalamaHesapla(double... sayilar) {

        double toplam = 0;

        for (double sayi : sayilar){
            toplam += sayi;

        } return (sayilar.length > 0) ? toplam / sayilar.length : 0;
    }
}
