package benimcalismalarim.önceki.mentoring.casting;

public class M_1025_02_Casting {
    public static void main(String[] args) {
   double sayi = 5.5;
   byte sayiKutu = (byte) sayi;
   System.out.println("sayiKutu = " + sayiKutu);

// double --> byte
// float --> double
        float num = 2.3F;
        double numKutu = num;
        System.out.println("numKutu = " + numKutu);

// char --> int
        char karekter = 'a';
        int karKutu = karekter;
        System.out.println("karKutu = " + karKutu);

// int --> double

// float --> int
float num1 = 3.8F;
int num1Kutu = (int)num1;
        System.out.println("num1Kutu = " + num1Kutu);

        /*Bir mağazada indirim gününde yapılan satışlarla ilgili bilgi almak istiyorsunuz. Fiyat bilgisi ondalıklı olarak tutulurken,
                müşteriye sade bir bilgilendirme amacıyla fiyatları tam sayı olarak göstermek istiyorsunuz. Mağazadaki bir ürüne ait fiyat bilgisi var ve bu fiyat,
        indirim sonrası hesaplanmış. Bu fiyatı ondalıklı olarak gösteren bir veriyi alıp tam sayı olarak gösterin.
        Soru:
        Bir ürünün indirimsiz fiyatı 120.75 TL. Ürüne %25 indirim yapıldıktan sonra müşteriye tam sayı olarak indirimli fiyat gösterilecektir.
        Bu fiyatı double tipinden int tipine dönüştürerek gösteren bir program yazın.
         */

        double fiyat = 120.75;
        double indirimOrani = 0.25;
        double indFiyat = fiyat-(fiyat*indirimOrani);
        int guncFiyat = (int) indFiyat;
        System.out.println("guncFiyat = " + guncFiyat);

String name = "mehmet";
int sayi1 = 0;
Integer sayi2 = sayi1;







    }
}
