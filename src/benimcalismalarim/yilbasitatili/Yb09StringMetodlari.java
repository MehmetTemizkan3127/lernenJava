package benimcalismalarim.yilbasitatili;


public class Yb09StringMetodlari {
    public static void main(String[] args) {
       /* // Soru: Verilen bir string'in uzunluğunu döndüren bir metot yazınız.
        // Örneğin, "merhaba" verildiğinde 7 döndürülmelidir.
        String cumle = "Ben java ögrendikce mutlu oluyorum";
        System.out.println("1- Stringin uzunlugu yazdirildi                 = " + cumle.length());

        //Soru: Verilen bir string'den belirli bir başlangıç ve bitiş indeksine göre alt dizeyi döndüren bir metot yazınız.
        // Örneğin, "merhaba dünya" verildiğinde 3. indeksten 8. indekse kadar olan alt dizenin "haba" olmasını bekleriz.
        System.out.println("2- Stringin 3 ile 8 karekter araligi yazdirildi = " + cumle.substring(4, 8)); //java

        //Soru: Verilen bir string’i tamamen büyük harfe çeviren bir metot yazınız.
        //Örneğin, "merhaba" verildiğinde "MERHABA" döndürülmelidir.
        String buyukHarf = cumle.substring(4, 8);
        System.out.println("3- Stringin JAVA bölümü büyük harfle yazdirildi = " + buyukHarf.toUpperCase());

        //Soru: Verilen bir string’i tamamen küçük harfe çeviren bir metot yazınız.
        //Örneğin, "HELLO" verildiğinde "hello" döndürülmelidir.
        String onceBuyukHarf = cumle.toUpperCase();
        System.out.println("4- Stringin hepsi önce büyük harfe cevrildi     = " + onceBuyukHarf);
        String kucukHarf = onceBuyukHarf.substring(4, 8);
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
        String str1 = "Java güzel Java";
        System.out.println("8- Java yerine yazilim kelimesini kullandim     = " + str1.replace("Java", "Yazilim"));

        //replace ile replaceFirst arasindaki fark ikiside ayni görevi görür ama benzer harf ve kelime degistirilecekse
        //replaceFirst ilk harfi veya kelmiye replace son harfi veya kelimeyi degistirir.

        System.out.println("8- Java yerine yazilim kelimesini kullandim     = " + str1.replaceFirst("Java", "Yazilim"));

        //Soru: Verilen bir string’in başındaki ve sonundaki boşlukları kaldıran bir metot yazınız.
        //Örneğin, " merhaba " verildiğinde "merhaba" döndürülmelidir.
        String str = " Ben java ögrendikce mutlu oluyorum ";
        System.out.println("9- Stringin orjinal hali                        = " + str);
        String duzeltmeStr = str.trim();
        System.out.println("9- Stringin bas ve sondaki bosluklar kaldirildi = " + duzeltmeStr);

        String duzeltmeStrn = str.strip();
        System.out.println("9- Stringin bas ve sondaki bosluklar kaldirildi = " + duzeltmeStrn);

        //Soru: Verilen bir string’i belirli bir ayırıcıya göre bölen bir metot yazınız.
        //Örneğin, "merhaba,dünya,java" verildiğinde virgülle ayırarak bir dizi ["merhaba", "dünya", "java"]
        //döndürmelisiniz.
        StringBuilder kelimeler = new StringBuilder(str);

        // Split işlemi sonrası diziyi düzgün yazdırma
        System.out.println("10- Stringi Array'e cevirme                     =" + Arrays.toString(duzeltmeStr.split(" ")));

        //Soru: Verilen iki string’in birbirine eşit olup olmadığını kontrol eden bir metot yazınız.
        //Örneğin, "merhaba" ve "merhaba" eşittir, ancak "merhaba" ve "dünya" eşit değildir.
        String karsilastir = "Ben java ögrendikce mutlu oluyorum";
        System.out.println("11- Iki Stringin karsilastirmasi                = " + cumle.equals(karsilastir));

        //Soru: Verilen bir string’in boş olup olmadığını kontrol eden bir metot yazınız.
        //Örneğin, "" (boş string) verildiğinde true, "merhaba" verildiğinde false döndürmelidir.
        String bosMu = " ";
        System.out.println("12- IsEmty Bosluk mu                            = " + bosMu.isEmpty());

        System.out.println("12- IsBlank                                     = " + bosMu.isBlank());

        //Soru: Verilen bir string’in belirli bir alt dize ile başlayıp başlamadığını kontrol eden bir metot yazınız.
        //Örneğin, "merhaba dünya" verildiğinde "merhaba" ile başlayıp başlamadığını kontrol edin.
        System.out.println("13- String Ben ile basliyor mu?                 = " + karsilastir.startsWith("Ben"));

        //Soru: Verilen bir string’in belirli bir alt dize ile bitip bitmediğini kontrol eden bir metot yazınız.
        //Örneğin, "merhaba dünya" verildiğinde "dünya" ile bitip bitmediğini kontrol edin.
        System.out.println("14- String oluyorum ile bitiyor mu?             = " + karsilastir.endsWith("Oluyorum"));

        //codePointAt
        System.out.println("15- Stringin ikinci indeksini verir             = " + karsilastir.codePointAt(2));

        //codePointBefore
        System.out.println("15- Ikinci indeksten bir öncekini verir         = " + karsilastir.codePointBefore(2));

        //compareTo yöntemi şu şekilde çalışır:
        //İki String'i karakter karakter karşılaştırır.
        //İlk farklı karakterin Unicode değerleri arasındaki farkı döner.
        //Eğer iki String tamamen aynıysa 0 döner.
        //Eğer meyve1 alfabetik olarak önceyse negatif bir değer döner.
        //Eğer meyve1 alfabetik olarak sonrayla pozitif bir değer döner.
        // Soru: Verilen iki string’in sözlük sırasına göre hangi sırada olduğunu döndüren bir metot yazınız.
        String meyve1 = "armut";
        String meyve2 = "elma";
        System.out.println("16- Str ilk indeksi önce(-) veya sonra(+)       = " + meyve1.compareTo(meyve2));

        //Soru: Verilen bir string’de belirli bir karakterin veya alt dizenin son geçtiği yeri bulan bir metot yazınız.
        //Örneğin, "merhaba dünya" için 'a' karakterinin son geçtiği yer 10 olmalıdır.
        String cumle1 = "sen seni bilmezsen ben seni bilirim ben";
        System.out.println("17- B'nin son gectigi indeks                    = " + cumle1.lastIndexOf("b"));
        System.out.println("17- B'nin ilk gectigi indeks                    = " + cumle1.indexOf("b"));

        System.out.println("18- Iki String'in concat ile birlestirilmesi    = " + meyve1.concat(", " + meyve2));

        String sayilar = "1, 2, 3, 4";
        System.out.println("19- Sayi mi degil mi?                           = " + sayilar.matches("1, 2, 3, 4"));

        //Soru: Belirli bir ayırıcıyla birden fazla string’i birleştiren bir metot yazınız.
        //Örneğin, ["Java", "Python", "C++"] dizisini virgülle birleştirerek "Java,Python,C++" döndürün.
        String[] meyveler = {"Elma", "Armut", "Kiraz"};
        System.out.println("20- Arrayi Stringe cevirme gibi                 = " + String.join(",", meyveler));

        //System.out.println(String.format("%s al",meyveler));
        //System.out.println(String.format("Kirmizi %s",meyveler));

        //double pi = 3.14159;
        //System.out.println("21- Pi sayısı                                   = "+String.format(" %.2f", pi));

        //Soru: Verilen bir string’i belirli bir sayıda tekrar ederek yeni bir string döndüren bir metot yazınız.
        //Örneğin, "Java" ve 3 verildiğinde "JavaJavaJava" döndürün.
        String sayi = "3 ";
        String sayiA = sayi.repeat(5);
        String[] sayiAa = sayiA.split(" ");
        System.out.println("22- Stringin tekrar sayisi                      = " + String.join(",", sayiAa));

        //ReplaceAll
        // replaceAll() methodu replace() methoduna benzer ama 2 fark vardır
        //1-replace() methodu char kabul eder ama replaceAll kabul etmez
        //2-replaceAll() method u regex kullanımına izin verir (Regular Expressions)
        //(Regular Expressions)
        //   \\s bosluk
        //   \\S bosluk disindaki tum karakterler
        //   \\w harfler ve rakamlar (a z A Z, 0 9)
        //   \\W harfler ve rakamlar disindaki tum karakterler
        //   \\d rakamlar 0 9
        //   \\D rakamlar disindaki tum karakterler

        String meyveler1 = "§$1?kayisiportakalincirkarpuz1/*";
        String dMeyveler = meyveler1.replaceAll("[^a-zA-Z]", "");
        System.out.println("23- Stringin yabanci karekterlerden arindirilisi= " + dMeyveler);

        String kelimelereAyirma = dMeyveler.substring(0, 6) + " " +
                dMeyveler.substring(6, 14) + " " +
                dMeyveler.substring(14, 19) + " " +
                dMeyveler.substring(19);
        System.out.println("24- Stringin kelimelere ayrilmasi               =" + kelimelereAyirma);

        String text = "Bu 123 bir,$ test 456 metni.";
        System.out.println(text.replaceAll(" ", ","));

        String temizMetin = text.replaceAll("\\d", "");
        System.out.println("26- Sayilardan arindirilmis metin               = " + temizMetin);

        System.out.println(temizMetin.replaceAll("metni", "sürümü"));
        System.out.println(temizMetin.replaceAll(",", "(1)"));
        System.out.println(temizMetin.replaceAll("\\s+", "/").trim());
        System.out.println(temizMetin.replaceAll("\\,", "").trim());*/

        String metin = "Merhaba123, Java_Dunyasi! 2024";

        String boslukKaldir = metin.replaceAll("\\s", "_");
        System.out.println("Bosluklar kaldirildi                            = "+boslukKaldir);

        String boslukHarici = metin.replaceAll("\\S", "*");
        System.out.println("Bosluk disindaki karekterler kaldirildi         = "+boslukHarici);

        String sayiKaldir = metin.replaceAll("\\d", " ");
        System.out.println("Sayilar kaldirildi                              = "+sayiKaldir);

        String sayiHarici = metin.replaceAll("\\D", " ");
        System.out.println("Sayilar disindaki karekterler kaldirildi        = "+sayiHarici);

        String harfRakam = metin.replaceAll("\\w", "#");
        System.out.println("Harfler ve rakamlar degistirildi                = "+harfRakam);

        String harfRakamHarici = metin.replaceAll("\\W", "+");
        System.out.println("Harf ve rakam disindaki karekterler degisti     = "+harfRakamHarici);
    }
}
