package benimcalismalarim.yilbasitatili;

import java.util.ArrayList;
import java.util.Arrays;

public class StrinTumMetodlari {
    public static void main(String[] args) {
        // Soru: Verilen bir string'in uzunluğunu döndüren bir metot yazınız.
        // Örneğin, "merhaba" verildiğinde 7 döndürülmelidir.
        String cumle = "Ben java ögrendikce mutlu oluyorum";
        System.out.println("1- Stringin uzunlugu yazdirildi                 = " + cumle.length());

        //Soru: Verilen bir string'den belirli bir başlangıç ve bitiş indeksine göre alt dizeyi döndüren bir metot yazınız.
        // Örneğin, "merhaba dünya" verildiğinde 3. indeksten 8. indekse kadar olan alt dizenin "haba" olmasını bekleriz.
        System.out.println("2- Stringin 3 ile 8 karekter araligi yazdirildi = " + cumle.substring(4,8)); //java

        //Soru: Verilen bir string’i tamamen büyük harfe çeviren bir metot yazınız.
        //Örneğin, "merhaba" verildiğinde "MERHABA" döndürülmelidir.
        String buyukHarf = cumle.substring(4,8);
        System.out.println("3- Stringin JAVA bölümü büyük harfle yazdirildi = " + buyukHarf.toUpperCase());

        //Soru: Verilen bir string’i tamamen küçük harfe çeviren bir metot yazınız.
        //Örneğin, "HELLO" verildiğinde "hello" döndürülmelidir.
        String onceBuyukHarf = cumle.toUpperCase();
        System.out.println("4- Stringin hepsi önce büyük harfe cevrildi     = " + onceBuyukHarf);
        String kucukHarf = onceBuyukHarf.substring(4,8);
        System.out.println("4- Sonra JAVA kismi kücük harfe cevrildi        = " + kucukHarf);

        //Soru: Verilen bir string’in belirli bir indeksindeki karakteri döndüren bir metot yazınız.
        //Örneğin, "merhaba" verildiğinde 2. indeksteki karakteri (0 tabanlı indeksleme) 'r' olarak döndürmelidir.
        System.out.println("5- Stringin 4. karekteri j'yi döndürdü          = " + cumle.charAt(4));

        //Soru: Verilen bir string içinde belirli bir karakterin veya alt dizenin ilk geçtiği indeksi döndüren bir metot
        //yazınız. Örneğin, "merhaba dünya" verildiğinde "dünya" alt dizisinin başladığı indeksi 8 döndürmelidir.
        System.out.println("6- Java'nin başladığı indeksi döndürüyor        = " + cumle.indexOf("java"));

        //Soru: Verilen bir string içinde belirli bir alt dize bulunup bulunmadığını kontrol eden bir metot yazınız.
        //Örneğin, "merhaba dünya" verildiğinde "dünya" alt dizisinin var olup olmadığını kontrol edin.
        System.out.println("7- Stringte mutlu kelimesi bulunmaktadir        = " + cumle.contains("mutlu"));

        //Soru: Verilen bir string'deki belirli bir karakteri veya alt diziyi başka bir karakter
        //veya alt dize ile değiştiren bir metot yazınız. Örneğin, "merhaba" ve 'a' karakterini 'o' ile değiştirerek
        //"merhobo" döndürmelisiniz.
        System.out.println("8- Java yerine fyazilim kelimesini kullandim    = " + cumle.replace("java", "yazilim"));

        //Soru: Verilen bir string’in başındaki ve sonundaki boşlukları kaldıran bir metot yazınız.
        //Örneğin, " merhaba " verildiğinde "merhaba" döndürülmelidir.
        String str = " Ben java ögrendikce mutlu oluyorum ";
        System.out.println("9- Stringin orjinal hali                        = " + str);
        String duzeltmeStr = str.trim();
        System.out.println("9- Stringin bas ve sondaki bosluklar kaldirildi = " + duzeltmeStr);

        //Soru: Verilen bir string’i belirli bir ayırıcıya göre bölen bir metot yazınız.
        //Örneğin, "merhaba,dünya,java" verildiğinde virgülle ayırarak bir dizi ["merhaba", "dünya", "java"]
        //döndürmelisiniz.
        StringBuilder kelimeler = new StringBuilder(str);

        // Split işlemi sonrası diziyi düzgün yazdırma
        System.out.println("10- Stringi Array'e cevirme                     =" +Arrays.toString(duzeltmeStr.split(" ")));








    }
}
