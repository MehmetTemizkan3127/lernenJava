package benimcalismalarim.Sablonlar;

import java.util.Scanner;

public class StringKonusu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//CONCAT
        //String firstname = "Mehmet";
        //String lastname = "Temizkan";

        //System.out.println("fullname :" + firstname + " " + lastname);
        //System.out.println("fullname :" + firstname.concat(lastname) );

//LENGTH
        //System.out.println("Please enter a statement : ");
        //String text = input.nextLine();
        //int length = text.length();
        //System.out.println("Text'in uzunlugu " + length + " karekterdir.");

//CHARAT(INT)
        /*System.out.println("Please enter text :");
        String text = "Seviyordum";
        //String text = input.nextLine();
        int length = text.length();

        if (length % 2 == 0) {
            int ortadakiKarekter1 = (length / 2) - 1; // Birinci orta indeks
            int ortadakiKarekter2 = length / 2;       // İkinci orta indeks
            char ortadakiChar1 = text.charAt(ortadakiKarekter1); // Birinci orta harf
            char ortadakiChar2 = text.charAt(ortadakiKarekter2); // İkinci orta harf
            System.out.println("Ortadaki iki harf: " + ortadakiChar1 + ortadakiChar2);

        } else if (length % 2 == 1) {
            int middleIndex = length / 2; // Orta indeks
            char middleChar = text.charAt(middleIndex); // Orta harfi al
            System.out.println("String'in uzunluğu tek, ortadaki harf: " + middleChar);
        }*/

        /*//CONTAINS
        System.out.println("Please enter text :");
        String text = input.nextLine();

        System.out.println("Sorgulatmak istediginiz kelimeyi giriniz");
        String kelime = input.nextLine();

        String result =text.contains(kelime) ? " Bu metinde " + kelime + " kelimesi bulunur" : " Bu metinde " + kelime + " kelimesi bulunmaz";
        System.out.println("Sonuc = " + result);
        */

        /*//STARTSWITH ve ENDSWITH
        String metin = "JavaCandir";

        System.out.println("str.startsWith(\"Java\") = " + metin.startsWith("Java"));

        //ENDSWITH
        System.out.println("metin.endsWith(metin) = " + metin.endsWith(metin));
        System.out.println("metin.endsWith(\"r\") = " + metin.endsWith("r"));
        System.out.println("metin.endsWith(\"Candir\") = " + metin.endsWith("Candir"));


        //Task-> girilen e-mail hesabının  @gmail.com ile bitmiyorsa "lütfen gmail hesabı giriniz"

        System.out.println("Google mail adresinizi giriniz...");
        String mail = input.next();

        String mesaj = mail.endsWith("@gmail.com") ? "Basarili giris. Tesekkürler" : "Lütfen mail hesabinizi \"gmail.com\" olarak giriniz";
        System.out.println("mesaj = " + mesaj);
        */

        /*//SUBSTRING
        //String metin = input.nextLine();
        String metin = "Java programini ögreniyorum";
        System.out.println("Metinden alintilamak istediginiz bölüm = \"" + metin.substring(0) + "\" kismidir");

        for (int i = 0; i < metin.length(); i++) {
            System.out.print(metin.charAt(i));
        }
        System.out.println();
        char metinChar = metin.charAt(8);
        System.out.println("firstChar = " + metinChar);
        */

        /*//ISEMTY //BLANKEMTY
        String bosMetin = "";
        String boslukMetin = "   ";
        String doluMetin = "Merhaba Dünya";

        // isEmpty() kontrolü
        System.out.println("bosMetin.isEmpty(): " + bosMetin.isEmpty());
        System.out.println("boslukMetin.isEmpty(): " + boslukMetin.isEmpty());
        System.out.println("doluMetin.isEmpty(): " + doluMetin.isEmpty());

        // isBlank() kontrolü
        System.out.println("bosMetin.isBlank(): " + bosMetin.isBlank());
        System.out.println("boslukMetin.isBlank(): " + boslukMetin.isBlank());
        System.out.println("doluMetin.isBlank(): " + doluMetin.isBlank());
         */
        
        /*//UPPERCASE    //LOWERCASE
        String adSoyad = "Mehmet Temizkan";
        System.out.println("adSoyad.toUpperCase() = " + adSoyad.toUpperCase());
        System.out.println("adSoyad.toLowerCase() = " + adSoyad.toLowerCase());
        System.out.println("adSoyad.equalsIgnoreCase(\"Mehmet TEMIZKAN\") = " + adSoyad.equalsIgnoreCase("Mehmet TEMIZKAN"));
        */

        /*//TRIM    //STRIP
        String metin = "\u2003  Java öğreniyorum \u200B   ";
        String trimliMetin = metin.trim();
        String stripliMetin = metin.strip();

        System.out.println("Orijinal metin: " + metin + "");

        System.out.println("trim() sonrası: " + trimliMetin + "");
        System.out.println("strip() sonrası :" + metin.strip() + "");
        */

        /*//INDEXOF && LASTINDEXOF
        String metin = "Java ögrenmek basarmak demektir, öyle degilmi?";
        int ilkA = metin.indexOf("a");
        System.out.println("msj.indexOf(\"a\",ilkA + 1) = " + metin.indexOf("a", ilkA + 1));
        System.out.println("msj.lastIndexOf(\"i\") = " + metin.lastIndexOf("g"));
        System.out.println(metin.length()-2);
        System.out.println(metin.indexOf("öyle"));
        //System.out.println("İlk 'ö' harfinin konumu: " + index);
        //int index = metin.indexOf("z") != -1 ? metin.indexOf("z") : -1;
        //System.out.println("index = " + index);
        */

        /*//REPEAT
        String metin = "Seni Seviyorum";
        System.out.println((metin + "\n").repeat(4).strip());
        System.out.println((metin.substring(5) + "\n").repeat(4).strip());
        */

        /*//REPLACE  &&  REPLACEFIRST
        String metin = "Java programlama dilini 03.09.2024'ten itibaren ögreniyorum.";

        // "a" harflerini "o" harfi ile değiştirme

        //System.out.println("Yeni Metin: " + metin.replace('i', 'a'));
        //System.out.println("Yeni Metin: " + metin.replaceFirst("a", "o"));

        //REPLACEALL
        System.out.println("Yeni Metin: " + metin.replaceAll("\\s", "/"));
        System.out.println("Yeni Metin: " + metin.replaceAll("\\S", "_"));
        System.out.println("Yeni Metin: " + metin.replaceAll("\\w", "_"));
        System.out.println("Yeni Metin: " + metin.replaceAll("\\W", "_"));
        System.out.println("Yeni Metin: " + metin.replaceAll("\\d", "_"));
        System.out.println("Yeni Metin: " + metin.replaceAll("\\D", "_"));
        System.out.println("Yeni Metin: " + metin.replaceAll("a", "o"));
        System.out.println("Yeni Metin: " + metin.replaceAll("03.09.2024", "*".repeat("03.09.2024".length())));
        System.out.println(metin.replaceAll("[03.09.2024]", "*") );
        System.out.println(metin.replaceAll("03\\.09\\.2024'ten", "cuma'dan"));
        System.out.println("str.replaceAll(\"[a-zA-Z0-9]\",\"?\") = " + metin.replaceAll("[a-zA-Z0-9]", ""));
        System.out.println("Yeni Metin: " + metin.replaceAll(".", ""));
        */

        /*//VALUEOF
        String strA = "$13.99";
        String strB = "$17.55";
        strA = strA.replace("$", " ");
        strB = strA.replace("$", " ");
        System.out.println("Preis A " + strA.replaceAll("[$]", "") + ("\nPreis B " + strB.replaceAll("[$]", "")));
        double priceA = Double.parseDouble(strA);
        double priceB = Double.parseDouble(strB);
        double toplam = priceA + priceB;
        int toplamInt = (int) toplam;
        System.out.println("Price A = " + priceA + "\nPrice B = " + priceB);
        System.out.println("toplamInt = " + toplamInt);
        System.out.println("toplamInt = $" + toplamInt);

        String bagis1 = "10000";
        String bagis2 = "12000";

        int intbagis1 = Integer.valueOf(bagis1);
        int intbagis2 = Integer.valueOf(bagis2);
        System.out.println("Bagis toplami = $" + (intbagis1 + intbagis2));
        */
    }
}
