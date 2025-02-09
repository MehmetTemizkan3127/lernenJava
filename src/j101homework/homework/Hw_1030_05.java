package j101homework.homework;

public class Hw_1030_05 {
    public static void main(String[] args) {
         /*  TASK :
   Asagidaki String degiskenini kullanarak  konsolda isminizi print eden code create ediniz.
   String  harfDepo = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    */
        String harfDepo = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        String isim = harfDepo.replace(harfDepo, "MEHMET");
        String soyisim = harfDepo.replace(harfDepo, "TEMIZKAN");

        String isimSoyisim = isim + " " + soyisim;

        System.out.println("Adiniz ve Soyadiniz : " + isimSoyisim);

        //ikinci Yol

        String harfDepo1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";


        String isim1 = "" + harfDepo.charAt(12)
                + harfDepo.charAt(4)
                + harfDepo.charAt(7)
                + harfDepo.charAt(12)
                + harfDepo.charAt(4)
                + harfDepo.charAt(19);

        String soyisim1 = "" + harfDepo.charAt(19)
                + harfDepo.charAt(4)
                + harfDepo.charAt(12)
                + harfDepo.charAt(8)
                + harfDepo.charAt(25)
                + harfDepo.charAt(10)
                + harfDepo.charAt(0)
                + harfDepo.charAt(13);

        String isimSoyisim1 = isim + " " + soyisim;
        System.out.println("Adiniz ve Soyadiniz : " + isimSoyisim1);
    }
}
