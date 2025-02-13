package javacalismalarim.dummy;

class Ogrenci {
    String isim;

    Ogrenci(String isim) {
        this.isim = isim;
    }
}

public class Main {
    public static void main(String[] args) {
        Ogrenci ogr = new Ogrenci("Ali");  // Ogrenci nesnesi oluşturuluyor
        ismiDegistir(ogr);  // Pass by Value, nesne referansının kopyası geçiyor
        System.out.println("ogr = " + ogr);  // Nesnenin referansını yazdırıyoruz
        System.out.println("Ana metottaki isim: " + ogr.isim); // Mehmet
    }

    public static void ismiDegistir(Ogrenci ogrenci) {
        ogrenci.isim = "Mehmet";  // Nesnenin içindeki veri değişiyor
        System.out.println("ogrenci = " + ogrenci);  // Nesnenin referansını yazdırıyoruz
    }
}
