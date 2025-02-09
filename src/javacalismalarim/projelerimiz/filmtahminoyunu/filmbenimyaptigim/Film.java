package javacalismalarim.projelerimiz.filmtahminoyunu.filmbenimyaptigim;

public class Film {
    public static void main(String[] args) {





    }

    // Seçilen filmin ismini ve harf sayisinin 2 katini kullanarak tahmin etmesini sağlayan method
    public static void filmTahminEt(String filmIsmi) {
        int harfSayisi = filmIsmi.length();  // Filmin harf sayisini alma
        int tahminHakki = harfSayisi * 2;    // Harf sayisinin 2 kati kadar tahmin hakki var

        System.out.println("Filmin ismi: " + filmIsmi);
        System.out.println("Tahmin hakkiniz: " + tahminHakki);


    }




}
