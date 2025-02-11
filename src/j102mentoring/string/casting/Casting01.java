package j102mentoring.string.casting;

public class Casting01 {
    public static void main(String[] args) {

    /*Bir mağazada indirim gününde yapılan satışlarla ilgili bilgi almak istiyorsunuz. Fiyat bilgisi ondalıklı olarak tutulurken,
    müşteriye sade bir bilgilendirme amacıyla fiyatları tam sayı olarak göstermek istiyorsunuz.
    Mağazadaki bir ürüne ait fiyat bilgisi var ve bu fiyat, indirim sonrası hesaplanmış.
    Bu fiyatı ondalıklı olarak gösteren bir veriyi alıp tam sayı olarak gösterin.
    Soru:
    Bir ürünün indirimsiz fiyatı 120.75 TL. Ürüne %25 indirim yapıldıktan sonra müşteriye tam sayı olarak indirimli fiyat
    gösterilecektir. Bu fiyatı double tipinden int tipine dönüştürerek gösteren bir program yazın.
    */
        double ilkFiyat = 120.75;
        double indirimliFiyat = ilkFiyat - (ilkFiyat * 0.25);
        int indirimliGuncelFiyat = (int) indirimliFiyat;
        System.out.println("indirimliGuncelFiyat = " + indirimliGuncelFiyat);
    }
}
