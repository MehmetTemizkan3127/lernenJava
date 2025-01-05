package benimcalismalarim.yilbasitatili.homework;

public class SHw50_StringManipulationlari {
    public static void main(String[] args) {
        /*Soru 1:
        Aşağıdaki string üzerinde belirtilen metodları kullanarak işlemleri gerçekleştirin:
        String text = "  Java String Manipulation Exercise  ";
        1. Boşlukları baştan ve sondan temizleyin.
        2. Tüm harfleri küçük harfe çevirin.
        3. Tüm harfleri büyük harfe çevirin.
        4. "Manipulation" kelimesini "Processing" ile değiştirin.
        5. String’in uzunluğunu ekrana yazdırın.*/

        String text = "  Java String Manipulation Exercise  ";
        System.out.println("0- Orjinal String                   = "+text);

        String boslukKaldir = text.trim();
        System.out.println("1- Bosluklari kaldirilmis String    = " + boslukKaldir);

        String kucukHarf = boslukKaldir.toLowerCase();
        System.out.println("2- Kücük harfe cevrilmis String     = "+kucukHarf);

        String buyukHarf = kucukHarf.toUpperCase();
        System.out.println("3- Büyük harfe cevrilmis String     = "+buyukHarf);

        String kelimeDegisimi = boslukKaldir.replace("Manipulation","Processing");
        System.out.println("4- Bir kelime degistirilmis String  = "+kelimeDegisimi);

        int stringUzunluk = boslukKaldir.length();
        System.out.println("5- String'in uzunlugu               = "+stringUzunluk);


        /*Soru 2:
        Aşağıdaki string'i kullanarak belirtilen işlemleri gerçekleştirin:
        String sentence = "Java is fun, and Java is powerful!";
        1. İlk geçen "Java" kelimesini "Python" ile değiştirin.
        2. Tüm "Java" kelimelerini "Python" ile değiştirin.
        3. String’in "powerful" kelimesiyle bitip bitmediğini kontrol edin.
        4. String’in içinde "fun" kelimesinin kaçıncı index'te başladığını bulun.*/

        String sentence = "Java is fun, and Java is powerful!";
        System.out.println("1- Ilk Java kelimesi Pytthon ile degistirildi   = " + sentence.replaceFirst("Java", "Python"));
        System.out.println("2- Tüm Java kelimeler Pytthon ile degistirildi  = " + sentence.replace("Java", "Python"));
        System.out.println("3- Stringin powerful ile bitiyor mu?            = " + sentence.endsWith("powerful"));
        System.out.println("4- Stringin'te fun kacinci indekste basliyor    = " + sentence.indexOf("fun"));

        /*Soru 3:
        Aşağıdaki string üzerinde substring kullanarak istenilen bölümleri elde edin:
        String code = "WelcomeToJavaProgramming";
        1. "Welcome" kelimesini ayırın.
        2. "Java" kelimesini ayırın.
        3. "Programming" kelimesini ayırın.
        4. String'in son 5 karakterini yazdırın.*/
        String code = "WelcomeToJavaProgramming";
        System.out.println("1- Welcome kelimesinden itibaren ayrildi    = "+code.replace("Welcome","Welcome "));
        System.out.println("2- Java kelimesi ayrildi                    = "+code.replace("Java"," Java "));
        System.out.println("3- Programming kelimesi ayrildi             = "+code.replace("Programming"," Programming"));
        System.out.println("4- String'in son 5 karakterini yazdırildi   = "+code.replace("WelcomeToJavaProgramming","mming"));
        System.out.println("4- String'in son 5 karakterini yazdırildi   = "+code.substring(19));


        /*Soru 4:
        Aşağıdaki string üzerinde belirtilen kontrolleri gerçekleştirin:
        String password = "Secure@123";
        1. String boş mu?
                2. String "@" sembolünü içeriyor mu?
                3. String sadece sayılardan mı oluşuyor?
                4. String’in uzunluğu 8 karakterden fazla mı?
### **Soru 5:**
        Aşağıdaki string’i boşluk karakterlerine göre ayırarak bir dizi oluşturun ve ardından kelimeleri virgülle birleştirerek ekrana yazdırın:
```
        String data = "Apple Banana Cherry Date";
```
**Beklenen Çıktı:** `Apple,Banana,Cherry,Date`
### **Soru 6:**
        Bir kullanıcının girdiği e-posta adresini kontrol eden bir program yazın. Program aşağıdaki kuralları kontrol etmelidir:
        - E-posta "@" sembolü içermelidir.
        - E-posta ".com" uzantısı ile bitmelidir.
                - Boşluk karakteri içermemelidir.
**Örnek Çıktı:**
```
        Geçerli e-posta adresi!
```
### **Soru 7:**
        Bir cümledeki tüm kelimeleri ters çeviren bir Java programı yazın.
**Girdi:**
```
        Java is fun
```
**Çıktı:**
```
        avaJ si nuf*/
    }
}
