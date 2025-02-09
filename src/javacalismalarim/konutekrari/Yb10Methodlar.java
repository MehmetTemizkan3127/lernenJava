package javacalismalarim.konutekrari;

public class Yb10Methodlar {
    public static void main(String[] args) {

int sonuc = toplamAl(8,9);
        System.out.println("sonuc = " + sonuc);

        String isim = "Mehmet";
        Yb10Methodlar.selamVer(isim);
        int a =8;
        int sonuc1 = kareAl(a);
        System.out.println(a+" sayinin karesi  = " + sonuc1);






    }
    //Görev: İki sayıyı toplayan bir metot yazın.
    public static int toplamAl(int a, int b){
        int toplam = a+b;
        System.out.println("toplam = " + toplam);
        return toplam ;
    }
    //Görev: Verilen bir isme selam veren bir metot yazın.
    public static void selamVer(String isim) {
        System.out.println("Merhaba " + isim+ "!");

    }
    //Görev: Verilen bir sayının karesini hesaplayan bir metot yazın.
    public static int kareAl (int a){
        int kare = a*a;
        return kare;
    }
    //Görev: Bir sayının asal olup olmadığını kontrol eden bir metot yazın.
    //Parametreler: int sayi
    //Dönüş Tipi: boolean


}
