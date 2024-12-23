package benimcalismalarim.önceki.mentoring.replace;

public class M_1030_06_ReplaceAll {
    public static void main(String[] args) {

        //Tarih biçimindeki yyyy-MM-dd formatındaki tarihleri, sadece yyyy kısmını koruyarak kısaltın.
        //Senaryo: Kullanıcının girilen tam tarih bilgisinden yalnızca yıl bilgisi almak istiyorsunuz.
        // Örneğin, "Bugün tarih 2023-10-18." ifadesini "Bugün tarih 2023." olarak düzenleyin.

        String cumle = "Bugün tarih 2023-10-18.";

        String kisaCumle = cumle.replaceAll("(\\d{4})-\\d{2}-\\d{2}", "$1");
        System.out.println(kisaCumle);


        String kisaCumle1 = cumle.substring(0, 14) + cumle.substring(5, 9) + ".";
        System.out.println(kisaCumle);
    }
}
