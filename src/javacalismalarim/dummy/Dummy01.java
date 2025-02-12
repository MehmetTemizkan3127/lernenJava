package javacalismalarim.dummy;

public class Dummy01 {

    public static void main(String[] args) {
        int ogrenciNotu = 70;
        notuArtir(ogrenciNotu);
        System.out.println("Ana metottaki öğrenci notu: " + ogrenciNotu); // 70


        int sayi = 10;

        sayiyiArtir(sayi);
        System.out.println("Ana metottaki sayi: " + sayi); // 10


    }

    public static void notuArtir(int not) {
        not = not + 10;  // Kopyalanan değeri artırıyoruz
        System.out.println("Metod içindeki artırılmış not: " + not); // 80
    }


    public static void sayiyiArtir(int numara) {
        numara = numara + 5;
        System.out.println("Metod içindeki numara: " + numara); // 15
    }

}







