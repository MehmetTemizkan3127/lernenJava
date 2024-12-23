package benimcalismalarim.önceki.sablonlar;

public class StringKonusu_MetinKarekterSayisiniVeBastakiOrtadakiSondakiHarf {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Merhaba Dünya!");
        int uzunluk = sb.length();

        System.out.println("Metnin uzunluğu: " + uzunluk);


        char sonHarf = sb.charAt(uzunluk-1);
        char ortaHarf = sb.charAt(uzunluk/2);
        char orta1Harf = sb.charAt(uzunluk/2-1);

        System.out.println("Son harf : " + sonHarf + "\nOrta ilk harf : " + orta1Harf + "\nOrta ikinci harf : " + ortaHarf);

    }
}
