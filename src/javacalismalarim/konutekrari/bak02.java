package javacalismalarim.konutekrari;

import java.text.Collator;
import java.util.*;

public class bak02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*//Task 1:Cümledeki kelimeleri alfabetik sıraya göre yazdırın.
        String cumle = "Kafa bir ayricaliktir";
        String[] kelimeler = cumle.split(" ");
        Arrays.sort(kelimeler,String::compareToIgnoreCase);
        System.out.println(Arrays.toString(kelimeler));


        // Task 2: Kullanıcıdan bir cümle alın.
        // Bu cümledeki kelimeleri ayırın ve alfabetik sırayla yazdırın.
        // Cümledeki en uzun kelimeyi bulun.
        System.out.println("Lütfen bir cümle giriniz = ");
        String cumle = scan.nextLine();
        String[] kelimeler = cumle.split(" ");
        Arrays.sort(kelimeler, String::compareToIgnoreCase);
        System.out.println("Kelimeler alfabetik siralamayla yazdirildi = " + Arrays.toString(kelimeler));
        String enUzunKelime = "";


        for (String kelime : kelimeler) {
            System.out.println(kelime + " = " + kelime.length());
            if (kelime.length() > enUzunKelime.length()) {
                enUzunKelime = kelime;
            }
        }
        System.out.println("Cümlenin en uzun kelimesi " + enUzunKelime.length() + " karekter ile = " + enUzunKelime);
        */


        // Kullanıcıdan bir cümle alın.
        // Bu cümledeki kelimeleri ayırın ve her kelimenin kaç kez tekrar ettiğini yazdırın.
        // Kelime bazında cümleyi ters çevirin.
        // Her kelimenin ilk harfini büyük yaparak yazdırın.
        // Cümledeki kelimelerin sadece ilk harflerini yazdırın.
        String cumle = "Java ögrenmek ayricalik ve gelecektir";
        System.out.println("1- Orjinal Cümle                        = " + cumle);

        List<String> kelimeList = Arrays.asList(cumle.split(" "));
        System.out.println("2- Kelime listesi olusturuldu           = " + kelimeList);

        Collections.reverse(kelimeList);
        System.out.println("3- Kelime listesi tersten yazdirildi    = " + kelimeList);

        String tersCumle = String.join(" ", kelimeList);
        System.out.println("4- Kelime listesi kullanici icin özel   = " + tersCumle);

        Collator trCollator = Collator.getInstance(new Locale("tr", "TR"));
        trCollator.setStrength(Collator.PRIMARY);

        kelimeList.sort(trCollator);
        System.out.println("5- A'dan Z'ye kelimelerin yazilimi      = " + kelimeList);

        kelimeList.sort(trCollator.reversed());
        System.out.println("6- Z'den A'ya kelimelerin tersten yazilimi = " + kelimeList);

        String tersCumlem = new StringBuilder(String.valueOf(tersCumle)).reverse().toString();

        System.out.println("7- Ters Çevrilmiş Cümle                  = " + tersCumlem);


        System.out.println("\nHer kelimenin ilk harfi büyük:");
        for (String kelime : kelimeList) {
            String kelimeBüyük = kelime.substring(0, 1).toUpperCase() + kelime.substring(1);
            System.out.print(kelimeBüyük + " ");
        }

        // 4. Cümledeki kelimelerin sadece ilk harflerini yazdırma
        System.out.println("\n\nCümledeki kelimelerin ilk harfleri:");
        for (String kelime : kelimeList) {
            System.out.print(kelime.charAt(0) + " ");
        }









        /*

/*



// Kullanıcıdan bir cümle alın.
// Cümledeki kelimelerin ilk harflerini ayırıp yazdırın.


Task 1:
Verilen bir cümleyi tamamen büyük harfe dönüştürün.

Task 2:
Verilen bir cümledeki boşlukları kaldırın. (Baş ve son boşlukları da dahil edin)

Task 3:
Bir string'in "apple" kelimesiyle başlayıp başlamadığını kontrol edin.

Task 4:
Bir cümlede "world" kelimesinin konumunu (indeksini) bulun.

Task 5:
"hello world" cümlesindeki 'o' harfini 'a' ile değiştirin.

Task 6:
Verilen bir string'in "java" kelimesiyle bitip bitmediğini kontrol edin.

Task 7:
Bir cümlede 'a' harfini kaç kez içerdiğini bulun.

Task 8:
"hello" kelimesini "hi" kelimesiyle birleştirerek yeni bir cümle oluşturun.

Task 9:
Bir string'in "orange" olup olmadığını kontrol edin.

Task 10:
Bir cümledeki tüm karakterleri küçük harfe dönüştürün.

Task 11:
Bir string'in sadece sayılardan oluşup oluşmadığını kontrol edin.

Task 12:
"apple pie" cümlesini virgülle ayırın.

Task 13:
Verilen bir cümlenin son 3 karakterini alın.

Task 14:
Bir string'in içindeki 'e' harfini 'i' ile değiştirin.

Task 15:
Bir cümledeki 'x' harfini sayısını bulun.

Task 16:
Bir string'in uzunluğunu bulun.

Task 17:
Bir string'i tersten yazdırın.

Task 18:
Verilen bir string'in boş olup olmadığını kontrol edin.

Task 19:
Bir string'in yalnızca ilk harfini büyük yapın.

Task 20:
Bir string'i, bir başka string ile birleştirin.

Bu sorular Java'daki en yaygın ve önemli string metodlarının çoğunu içeriyor. Bu metodlar arasında şunlar yer alır:

toUpperCase(), toLowerCase()
trim()
startsWith(), endsWith()
indexOf(), lastIndexOf()
replace(), replaceAll()
split()
length()
substring()
isEmpty()
Bu metodlarla ilgili bu tür sorular, temel string manipülasyonlarını öğrenmek ve uygulamak için harika fırsatlar sunar.

*/


    }
}
